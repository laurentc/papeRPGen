package com.darkrain.app.core;

import com.darkrain.app.character.Avatar;
import com.darkrain.app.character.CharacterDeadException;
import com.darkrain.app.dbal.DBHandler;
import com.darkrain.app.frame.MainFrame;
import com.darkrain.app.helper.DisplayManager;

public class Handler {

    public void execute(){
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}
