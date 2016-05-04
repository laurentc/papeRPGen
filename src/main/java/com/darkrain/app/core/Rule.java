package com.darkrain.app.core;

import java.util.HashMap;

public class Rule {
    public static final int AVATAR_INDEX = 0;
    public static final int ENEMY_INDEX = 1;

    private static Rule instance = null;
    private HashMap damageTable;

    public static Rule getInstance()
    {
        if(instance == null){
            instance = new Rule();
        }

        return instance;
    }

    public Rule(){
        init();
    }

    public HashMap<Integer, HashMap<Integer, HashMap<Integer, Integer>>> getDamageTable()
    {
        return damageTable;
    }

    private void init()
    {
        damageTable = new HashMap<Integer, HashMap<Integer, HashMap<Integer, Integer>>>();
        HashMap<Integer, HashMap<Integer, Integer>> dices = new HashMap();

        HashMap<Integer, Integer> damages = new HashMap();

        damages.put(-11, 0);
        damages.put(-10, 0);
        damages.put(-9, 0);
        damages.put(-8, 0);
        damages.put(-7, 0);
        damages.put(-6, 0);
        damages.put(-5, 0);
        damages.put(-4, 0);
        damages.put(-3, 0);
        damages.put(-2, 0);
        damages.put(-1, 0);
        damages.put(0, 0);
        damages.put(1, 0);
        damages.put(2, 0);
        damages.put(3, 0);
        damages.put(4, 0);
        damages.put(5, 0);
        damages.put(6, 0);
        damages.put(7, 0);
        damages.put(8, 0);
        damages.put(9, 0);
        damages.put(10, 0);
        damages.put(11, 0);
        dices.put(0, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, -1);
        damages.put(-10, -1);
        damages.put(-9, -1);
        damages.put(-8, 8);
        damages.put(-7, 8);
        damages.put(-6, 6);
        damages.put(-5, 6);
        damages.put(-4, 6);
        damages.put(-3, 6);
        damages.put(-2, 5);
        damages.put(-1, 5);
        damages.put(0, 5);
        damages.put(1, 5);
        damages.put(2, 5);
        damages.put(3, 4);
        damages.put(4, 4);
        damages.put(5, 4);
        damages.put(6, 4);
        damages.put(7, 4);
        damages.put(8, 4);
        damages.put(9, 3);
        damages.put(10, 3);
        damages.put(11, 3);
        dices.put(1, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, -1);
        damages.put(-10, 8);
        damages.put(-9, 8);
        damages.put(-8, 7);
        damages.put(-7, 7);
        damages.put(-6, 6);
        damages.put(-5, 6);
        damages.put(-4, 5);
        damages.put(-3, 5);
        damages.put(-2, 5);
        damages.put(-1, 5);
        damages.put(0, 4);
        damages.put(1, 4);
        damages.put(2, 4);
        damages.put(3, 3);
        damages.put(4, 3);
        damages.put(5, 3);
        damages.put(6, 3);
        damages.put(7, 3);
        damages.put(8, 3);
        damages.put(9, 3);
        damages.put(10, 3);
        damages.put(11, 2);
        dices.put(2, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 8);
        damages.put(-10, 7);
        damages.put(-9, 7);
        damages.put(-8, 6);
        damages.put(-7, 6);
        damages.put(-6, 5);
        damages.put(-5, 5);
        damages.put(-4, 4);
        damages.put(-3, 4);
        damages.put(-2, 4);
        damages.put(-1, 4);
        damages.put(0, 4);
        damages.put(1, 3);
        damages.put(2, 3);
        damages.put(3, 3);
        damages.put(4, 3);
        damages.put(5, 3);
        damages.put(6, 3);
        damages.put(7, 2);
        damages.put(8, 2);
        damages.put(9, 2);
        damages.put(10, 2);
        damages.put(11, 2);
        dices.put(3, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 8);
        damages.put(-10, 7);
        damages.put(-9, 7);
        damages.put(-8, 6);
        damages.put(-7, 6);
        damages.put(-6, 5);
        damages.put(-5, 5);
        damages.put(-4, 4);
        damages.put(-3, 4);
        damages.put(-2, 4);
        damages.put(-1, 4);
        damages.put(0, 3);
        damages.put(1, 3);
        damages.put(2, 3);
        damages.put(3, 2);
        damages.put(4, 2);
        damages.put(5, 2);
        damages.put(6, 2);
        damages.put(7, 2);
        damages.put(8, 2);
        damages.put(9, 2);
        damages.put(10, 2);
        damages.put(11, 2);
        dices.put(4, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 7);
        damages.put(-10, 6);
        damages.put(-9, 6);
        damages.put(-8, 5);
        damages.put(-7, 5);
        damages.put(-6, 4);
        damages.put(-5, 4);
        damages.put(-4, 4);
        damages.put(-3, 4);
        damages.put(-2, 3);
        damages.put(-1, 3);
        damages.put(0, 2);
        damages.put(1, 2);
        damages.put(2, 2);
        damages.put(3, 2);
        damages.put(4, 2);
        damages.put(5, 2);
        damages.put(6, 2);
        damages.put(7, 2);
        damages.put(8, 2);
        damages.put(9, 2);
        damages.put(10, 2);
        damages.put(11, 1);
        dices.put(5, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 6);
        damages.put(-10, 6);
        damages.put(-9, 6);
        damages.put(-8, 5);
        damages.put(-7, 5);
        damages.put(-6, 4);
        damages.put(-5, 4);
        damages.put(-4, 3);
        damages.put(-3, 3);
        damages.put(-2, 2);
        damages.put(-1, 2);
        damages.put(0, 2);
        damages.put(1, 2);
        damages.put(2, 2);
        damages.put(3, 2);
        damages.put(4, 2);
        damages.put(5, 1);
        damages.put(6, 1);
        damages.put(7, 1);
        damages.put(8, 1);
        damages.put(9, 1);
        damages.put(10, 1);
        damages.put(11, 1);
        dices.put(6, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 5);
        damages.put(-10, 5);
        damages.put(-9, 5);
        damages.put(-8, 5);
        damages.put(-7, 5);
        damages.put(-6, 3);
        damages.put(-5, 3);
        damages.put(-4, 2);
        damages.put(-3, 2);
        damages.put(-2, 2);
        damages.put(-1, 2);
        damages.put(0, 1);
        damages.put(1, 1);
        damages.put(2, 1);
        damages.put(3, 1);
        damages.put(4, 1);
        damages.put(5, 0);
        damages.put(6, 0);
        damages.put(7, 0);
        damages.put(8, 0);
        damages.put(9, 0);
        damages.put(10, 0);
        damages.put(11, 0);
        dices.put(7, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 4);
        damages.put(-10, 4);
        damages.put(-9, 4);
        damages.put(-8, 3);
        damages.put(-7, 3);
        damages.put(-6, 2);
        damages.put(-5, 2);
        damages.put(-4, 1);
        damages.put(-3, 1);
        damages.put(-2, 1);
        damages.put(-1, 1);
        damages.put(0, 0);
        damages.put(1, 0);
        damages.put(2, 0);
        damages.put(3, 0);
        damages.put(4, 0);
        damages.put(5, 0);
        damages.put(6, 0);
        damages.put(7, 0);
        damages.put(8, 0);
        damages.put(9, 0);
        damages.put(10, 0);
        damages.put(11, 0);
        dices.put(8, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 3);
        damages.put(-10, 3);
        damages.put(-9, 3);
        damages.put(-8, 2);
        damages.put(-7, 2);
        damages.put(-6, 0);
        damages.put(-5, 0);
        damages.put(-4, 0);
        damages.put(-3, 0);
        damages.put(-2, 0);
        damages.put(-1, 0);
        damages.put(0, 0);
        damages.put(1, 0);
        damages.put(2, 0);
        damages.put(3, 0);
        damages.put(4, 0);
        damages.put(5, 0);
        damages.put(6, 0);
        damages.put(7, 0);
        damages.put(8, 0);
        damages.put(9, 0);
        damages.put(10, 0);
        damages.put(11, 0);
        dices.put(9, damages);

        damageTable.put(AVATAR_INDEX, dices);

        dices = new HashMap<Integer, HashMap<Integer, Integer>>();

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 6);
        damages.put(-10, 7);
        damages.put(-9, 7);
        damages.put(-8, 8);
        damages.put(-7, 8);
        damages.put(-6, 9);
        damages.put(-5, 9);
        damages.put(-4, 10);
        damages.put(-3, 10);
        damages.put(-2, 11);
        damages.put(-1, 11);
        damages.put(0, 12);
        damages.put(1, 14);
        damages.put(2, 14);
        damages.put(3, 16);
        damages.put(4, 16);
        damages.put(5, 18);
        damages.put(6, 18);
        damages.put(7, -1);
        damages.put(8, -1);
        damages.put(9, -1);
        damages.put(10, -1);
        damages.put(11, -1);
        dices.put(0, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 0);
        damages.put(-10, 0);
        damages.put(-9, 0);
        damages.put(-8, 0);
        damages.put(-7, 0);
        damages.put(-6, 0);
        damages.put(-5, 0);
        damages.put(-4, 1);
        damages.put(-3, 1);
        damages.put(-2, 2);
        damages.put(-1, 2);
        damages.put(0, 3);
        damages.put(1, 4);
        damages.put(2, 4);
        damages.put(3, 5);
        damages.put(4, 5);
        damages.put(5, 6);
        damages.put(6, 6);
        damages.put(7, 7);
        damages.put(8, 7);
        damages.put(9, 8);
        damages.put(10, 8);
        damages.put(11, 9);
        dices.put(1, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 0);
        damages.put(-10, 0);
        damages.put(-9, 0);
        damages.put(-8, 0);
        damages.put(-7, 0);
        damages.put(-6, 1);
        damages.put(-5, 1);
        damages.put(-4, 2);
        damages.put(-3, 2);
        damages.put(-2, 3);
        damages.put(-1, 3);
        damages.put(0, 4);
        damages.put(1, 5);
        damages.put(2, 5);
        damages.put(3, 6);
        damages.put(4, 6);
        damages.put(5, 7);
        damages.put(6, 7);
        damages.put(7, 8);
        damages.put(8, 8);
        damages.put(9, 9);
        damages.put(10, 9);
        damages.put(11, 10);
        dices.put(2, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 0);
        damages.put(-10, 0);
        damages.put(-9, 0);
        damages.put(-8, 1);
        damages.put(-7, 1);
        damages.put(-6, 2);
        damages.put(-5, 2);
        damages.put(-4, 3);
        damages.put(-3, 3);
        damages.put(-2, 4);
        damages.put(-1, 4);
        damages.put(0, 5);
        damages.put(1, 6);
        damages.put(2, 6);
        damages.put(3, 7);
        damages.put(4, 7);
        damages.put(5, 8);
        damages.put(6, 8);
        damages.put(7, 9);
        damages.put(8, 9);
        damages.put(9, 10);
        damages.put(10, 10);
        damages.put(11, 11);
        dices.put(3, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 0);
        damages.put(-10, 1);
        damages.put(-9, 1);
        damages.put(-8, 2);
        damages.put(-7, 2);
        damages.put(-6, 3);
        damages.put(-5, 3);
        damages.put(-4, 4);
        damages.put(-3, 4);
        damages.put(-2, 5);
        damages.put(-1, 5);
        damages.put(0, 6);
        damages.put(1, 7);
        damages.put(2, 7);
        damages.put(3, 8);
        damages.put(4, 8);
        damages.put(5, 9);
        damages.put(6, 9);
        damages.put(7, 10);
        damages.put(8, 10);
        damages.put(9, 11);
        damages.put(10, 11);
        damages.put(11, 12);
        dices.put(4, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 1);
        damages.put(-10, 2);
        damages.put(-9, 2);
        damages.put(-8, 3);
        damages.put(-7, 3);
        damages.put(-6, 4);
        damages.put(-5, 4);
        damages.put(-4, 5);
        damages.put(-3, 5);
        damages.put(-2, 6);
        damages.put(-1, 6);
        damages.put(0, 7);
        damages.put(1, 8);
        damages.put(2, 8);
        damages.put(3, 9);
        damages.put(4, 9);
        damages.put(5, 10);
        damages.put(6, 10);
        damages.put(7, 11);
        damages.put(8, 11);
        damages.put(9, 12);
        damages.put(10, 12);
        damages.put(11, 14);
        dices.put(5, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 2);
        damages.put(-10, 3);
        damages.put(-9, 3);
        damages.put(-8, 4);
        damages.put(-7, 4);
        damages.put(-6, 5);
        damages.put(-5, 5);
        damages.put(-4, 6);
        damages.put(-3, 6);
        damages.put(-2, 7);
        damages.put(-1, 7);
        damages.put(0, 8);
        damages.put(1, 9);
        damages.put(2, 9);
        damages.put(3, 10);
        damages.put(4, 10);
        damages.put(5, 11);
        damages.put(6, 11);
        damages.put(7, 12);
        damages.put(8, 12);
        damages.put(9, 14);
        damages.put(10, 14);
        damages.put(11, 16);
        dices.put(6, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 3);
        damages.put(-10, 4);
        damages.put(-9, 4);
        damages.put(-8, 5);
        damages.put(-7, 5);
        damages.put(-6, 6);
        damages.put(-5, 6);
        damages.put(-4, 7);
        damages.put(-3, 7);
        damages.put(-2, 8);
        damages.put(-1, 8);
        damages.put(0, 9);
        damages.put(1, 10);
        damages.put(2, 10);
        damages.put(3, 11);
        damages.put(4, 11);
        damages.put(5, 12);
        damages.put(6, 12);
        damages.put(7, 14);
        damages.put(8, 14);
        damages.put(9, 16);
        damages.put(10, 16);
        damages.put(11, 18);
        dices.put(7, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 4);
        damages.put(-10, 4);
        damages.put(-9, 4);
        damages.put(-8, 6);
        damages.put(-7, 6);
        damages.put(-6, 7);
        damages.put(-5, 7);
        damages.put(-4, 8);
        damages.put(-3, 8);
        damages.put(-2, 9);
        damages.put(-1, 9);
        damages.put(0, 10);
        damages.put(1, 11);
        damages.put(2, 11);
        damages.put(3, 12);
        damages.put(4, 12);
        damages.put(5, 14);
        damages.put(6, 14);
        damages.put(7, 16);
        damages.put(8, 16);
        damages.put(9, 18);
        damages.put(10, 18);
        damages.put(11, -1);
        dices.put(8, damages);

        damages = new HashMap<Integer, Integer>();
        damages.put(-11, 5);
        damages.put(-10, 6);
        damages.put(-9, 6);
        damages.put(-8, 7);
        damages.put(-7, 7);
        damages.put(-6, 8);
        damages.put(-5, 8);
        damages.put(-4, 9);
        damages.put(-3, 9);
        damages.put(-2, 10);
        damages.put(-1, 10);
        damages.put(0, 11);
        damages.put(1, 12);
        damages.put(2, 12);
        damages.put(3, 14);
        damages.put(4, 14);
        damages.put(5, 16);
        damages.put(6, 16);
        damages.put(7, 18);
        damages.put(8, 18);
        damages.put(9, -1);
        damages.put(10, -1);
        damages.put(11, -1);
        dices.put(9, damages);

        damageTable.put(ENEMY_INDEX, dices);
    }
}
