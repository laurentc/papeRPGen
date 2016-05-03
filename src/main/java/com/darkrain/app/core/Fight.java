package com.darkrain.app.core;

import com.darkrain.app.character.Avatar;
import com.darkrain.app.character.CharacterDeadException;
import com.darkrain.app.character.Enemy;
import com.darkrain.app.helper.Dice;
import com.darkrain.app.helper.DisplayManager;

import java.util.HashMap;

public class Fight{
    private Avatar _avatar;
    private Enemy _enemy;
    private int _attackQuotient;
    public static HashMap<Integer, HashMap<Integer, HashMap<Integer, Integer>>> damageTable;
    private int round;
    
    
    public Fight(Avatar avatar, Enemy enemy){
        _avatar = avatar;
        _enemy = enemy;
        _init();
    }
    private void _init(){
        _calculateAttackQuotient();
    }
    
    private void _calculateAttackQuotient(){
        _attackQuotient = _avatar.getFitness() - _enemy.getFitness();
        if(_attackQuotient > 11){
            _attackQuotient = 11;
        }else if(_attackQuotient < -11){
            _attackQuotient = -11;
        }
        DisplayManager.message("Quotient d'attaque : " + _attackQuotient);
    }
    
    private void assault() throws CharacterDeadException {
        int dice = Dice.roll();
        DisplayManager.message("### Round " + (round + 1));
        DisplayManager.message("Avatar" + "(" + _avatar.getStamina() + " EP - " + _avatar.getFitness() + " HP) vs " + _enemy.getName() + "(" + _enemy.getStamina() + " EP - " + _enemy.getFitness() + " HP)");
        HashMap<Integer, HashMap<Integer, Integer>> avatarTable = Rule.getInstance().getDamageTable().get(Rule.AVATAR_INDEX);
        HashMap<Integer, HashMap<Integer, Integer>> enemyTable = Rule.getInstance().getDamageTable().get(Rule.ENEMY_INDEX);
        
        int avatarDamage = avatarTable.get(dice).get(_attackQuotient);
        int enemyDamage = enemyTable.get(dice).get(_attackQuotient);
        _avatar.decreaseStamina(avatarDamage);
        _enemy.decreaseStamina(enemyDamage);
        DisplayManager.message("Vous recevez " + avatarDamage + " dégâts");
        DisplayManager.message("Vous infligez " + enemyDamage + " dégâts à votre adversaire");
    }
    
    public void execute() throws CharacterDeadException {
    	round = 0;
    	do{
    		assault();
    		try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				DisplayManager.error(e);
			}
    		++round;
    	}while(!_enemy.isDead());
    }
}