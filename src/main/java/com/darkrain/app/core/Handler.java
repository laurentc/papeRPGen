package com.darkrain.app.core;

import com.darkrain.app.character.Avatar;
import com.darkrain.app.character.CharacterDeadException;
import com.darkrain.app.dbal.DBHandler;
import com.darkrain.app.frame.MainFrame;
import com.darkrain.app.helper.DisplayManager;

public class Handler {
    private Avatar _avatar;
    private int _page = 1;

    public Handler(){
        _avatar = new Avatar();
    }

    public void execute(){
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
//        validateDataSource();
//        try{
//            do{
//                try {
//                    Section section = new Section(_avatar,_page);
//                    section.doPreAction();
//                    section.doFight();
//                    _page = section.selectSection(_page);
//                } catch (UnfindableSectionException e) {
//                    DisplayManager.error(e);
//                }
//            }while(_page != 400);
//        }catch(CharacterDeadException e){
//
//        }
    }

    public void validateDataSource(){
        DBHandler.getInstance().checkDatabase();
    }
}
