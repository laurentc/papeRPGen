package com.darkrain.app;

import com.darkrain.app.core.Handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by laurentc on 22/04/15.
 */
public class Paperpgen {

    public static void main (String[] args)
    {
        Handler handler = new Handler();
        handler.execute();
    }
}
