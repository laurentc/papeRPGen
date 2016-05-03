package com.darkrain.app.core;

import com.darkrain.app.character.Avatar;
import com.darkrain.app.character.CharacterDeadException;

import java.util.Hashtable;

public class PreAction {
	public static void execute(Avatar avatar, Hashtable<String, Object> effect) throws CharacterDeadException {
		switch ((String)effect.get("method")) {
		case "=":
			switch ((String)effect.get("attribute")){
				case "stamina":
					avatar.setStamina((Integer)effect.get("value"));
					break;
				case "fitness":
					avatar.setFitness((Integer)effect.get("value"));
					break;
			}
			break;
		case "+":
			switch ((String)effect.get("attribute")){
			case "stamina":
				avatar.setStamina(avatar.getStamina() + (Integer)effect.get("value"));
				break;
			case "fitness":
				avatar.setFitness(avatar.getFitness() + (Integer)effect.get("value"));
				break;
		}
			break;
		case "-":
			switch ((String)effect.get("attribute")){
			case "stamina":
				avatar.setStamina(avatar.getStamina() - (Integer)effect.get("value"));
				break;
			case "fitness":
				avatar.setFitness(avatar.getFitness() - (Integer)effect.get("value"));
				break;
		}
			break;
		}
	}
}
