package com.darkrain.app.core;

import com.darkrain.app.character.Avatar;
import com.darkrain.app.character.CharacterDeadException;
import com.darkrain.app.helper.DisplayManager;

public class Game {
    private Avatar avatar;
    private int page = 1;

    public void launch(int aventureId){
        avatar = new Avatar();
        try{
            do{
                try {
                    Section section = new Section(avatar,page);
                    section.doPreAction();
                    section.doFight();
                    page = section.selectSection(page);
                } catch (UnfindableSectionException e) {
                    DisplayManager.error(e);
                    System.exit(0);
                }
            }while(page != 400);
        }catch(CharacterDeadException e){
            DisplayManager.message("vous êtes mort");
        }

    }
}
