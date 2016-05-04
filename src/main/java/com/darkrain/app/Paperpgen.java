package com.darkrain.app;

import com.darkrain.app.core.Handler;
import com.darkrain.app.dbal.DBHandler;

/**
 * Created by laurentc on 22/04/15.
 */
public class Paperpgen {

    public static void main(String[] args) {
        DBHandler.getInstance().checkDatabase();
        Handler handler = new Handler();
        handler.execute();
    }
}
