package com.darkrain.app.helper;

/**
 * Created by laurentc on 16/04/15.
 */
public class Dice {
    public static final int DICE_MAX_VAL = 9;

    public static int roll (int maxVal){
        return Math.round((float)Math.random() * maxVal);
    }

    public static int roll(){
        return roll(DICE_MAX_VAL);
    }
}
