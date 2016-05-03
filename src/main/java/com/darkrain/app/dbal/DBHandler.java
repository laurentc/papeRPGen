package com.darkrain.app.dbal;

import com.darkrain.app.helper.DisplayManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;

public class DBHandler {
    private static DBHandler _instance = null;
    private Connection _connection = null;

    public DBHandler(){
    }

    public static DBHandler getInstance(){
        if(_instance == null){
            _instance = new DBHandler();
        }

        return _instance;
    }

    public ArrayList<Hashtable<String, Object>> doQuery(String query, Object[] binding, String[] mapping){
        _open();
        ArrayList<Hashtable<String, Object>> toReturn = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = _connection.prepareStatement(query);
            int i = 1;
            for(Object bind:binding){
                ps.setObject(i, bind);
                ++i;
            }
            rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    Hashtable<String, Object> map = new Hashtable<>();
                    for(String col:mapping){
                        map.put(col, rs.getObject(col));
                    }
                    toReturn.add(map);
                }
            }
        } catch (SQLException e) {
            DisplayManager.error(e);
        } finally{
            try {
                assert rs != null;
                rs.close();
            } catch (SQLException e) {
                DisplayManager.error(e);
            }
            try {
                ps.close();
            } catch (SQLException e) {
                DisplayManager.error(e);
            }
            _close();
        }
        return toReturn;
    }

    private void _open(){
        try {
            Class.forName("org.h2.Driver");
            _connection = DriverManager.getConnection("jdbc:h2:./resources/papergen", "sa", "");
        } catch (SQLException | ClassNotFoundException e) {
            DisplayManager.error(e);
        }
    }

    private void _close(){
        try {
            _connection.close();
        } catch (SQLException e) {
            DisplayManager.error(e);
        }
    }

    public void checkDatabase(){
        DisplayManager.debug("Vérification des données ...");
        try {
            _open();
            PreparedStatement ps = _connection.prepareStatement("select key,value from information where key='VERSION'");
            ps.execute();
            ps.close();
            _close();
        } catch (SQLException e) {
            String filePath = "resources/definition.sql";
            try{
                try (BufferedReader buff = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    _open();
                    while ((line = buff.readLine()) != null) {
                        try {
                            PreparedStatement ps = _connection.prepareStatement(line);
                            ps.execute();
                            ps.close();
                        } catch (SQLException e1) {
                            DisplayManager.error(e1);
                        }
                    }
                    _close();
                }
            } catch (IOException e2) {
                DisplayManager.error(e2);
            }
        }
    }
}
