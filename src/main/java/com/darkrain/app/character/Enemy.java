package com.darkrain.app.character;

import com.darkrain.app.dbal.DBHandler;

import java.util.ArrayList;
import java.util.Hashtable;

public class Enemy extends AbstractCharacter {
    private String code;
    private String name;
    
    public Enemy(String code) throws UnfindableCharacterException {
    	this.code = code;
    	String query = "select ene_name,ene_stamina,ene_fitness from enemy where ene_code=?";
    	ArrayList<Hashtable<String, Object>> rs = DBHandler.getInstance().doQuery(query, new Object[]{code}, new String[]{"ene_name","ene_stamina","ene_fitness"});
		if(rs != null && !rs.isEmpty()){
			Hashtable<String, Object> row = rs.get(0);
			this.name = (String)row.get("ene_name");
			stamina = (Integer)row.get("ene_stamina");
			fitness = (Integer)row.get("ene_fitness");
		}else{
			throw new UnfindableCharacterException();
		}
    }    

    /**
     * 
     * @param decrease int
     */
    public void decreaseStamina(int decrease) throws CharacterDeadException {
        setStamina(this.stamina - decrease);
    }
    /**
     * 
     * @param increase int
     */
    public void increaseStamina(int increase) throws CharacterDeadException {
        setStamina(this.stamina + increase);
    }
    public String getCode(){
    	return code;
    }
    public String getName(){
    	return name;
    }

}
