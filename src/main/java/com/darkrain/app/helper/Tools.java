package com.darkrain.app.helper;

import java.util.HashMap;

/**
 *
 * @author laurentc
 */
public class Tools{
    public HashMap<Integer, HashMap<Integer, HashMap<Integer, Integer>>> damageTable;
    private static Tools instance = null;

    public static void message(String message){
        message(message, false);
    }
    public static void message(String message, boolean title){
        if(title){
            System.out.println("######################################");
        }
        System.out.println(message);
        if(title){
            System.out.println("######################################");
        }
    }

    public static Tools getInstance(){
        if(instance == null){
            instance = new Tools();
        }

        return instance;
    }
}