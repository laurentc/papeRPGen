package com.darkrain.app.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DisplayManager{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    public static final String SEPARATOR        = "------------------------------------------------------------------------------------------------------------";
    public static final String SEPARATOR_TITLE  = "##############################################################################################################";

    public static void message(Object message){
        System.out.println(message);
    }
    public static void error(Object error){
        System.out.println(sdf.format(new Date()) + " ERROR : " + error);
    }
    public static void debug(Object debug){
        System.out.println(sdf.format(new Date()) + " DEBUG : " + debug);
    }
    public static String prompt(ArrayList<String> choices, String message){
        for(String choice:choices){
            DisplayManager.message(choice);
        }
        DisplayManager.message("");
        DisplayManager.message("c| fiche personnage    s| sauvegarder");
        DisplayManager.message("i| inventaire          q| sortir");
        DisplayManager.message(SEPARATOR);
        message(message);
        System.out.print("> ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String output = null;
        try {
            output = br.readLine();
        } catch (IOException e) {
            error(e);
        }

        return output;

    }
}
