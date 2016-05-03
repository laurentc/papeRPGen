package com.darkrain.app.character;

import java.util.ArrayList;

import com.darkrain.app.helper.Dice;
import com.darkrain.app.useable.*;


public class Avatar extends AbstractCharacter{
    public static final int MAX_LUKATS = 50;
    public static final int MAX_MAGIC_POWERS = 5;
    public static final int MAX_ITEMS = 8;
    public static final int MAX_HERBS = 6;
    public static final int MAX_WEAPONS = 2;
    public static final int STARTstamina_ADD = 20;
    public static final int START_FITNESS_ADD = 10;
    public static final int START_WILL_ADD = 20;
    
    private int will;
    private int luck;
    private int beginLuck;
    private int lukats;
    private ArrayList<AbstractMagicPower> magicPowers;
    private ArrayList<AbstractItem> items;
    private ArrayList<AbstractHerb> herbs;
    private ArrayList<AbstractSpecialObject> specialObjects;
    private int nbRepas;
    private ArrayList<AbstractWeapon> weapons;
    
    public Avatar() {
        fitness = Dice.roll() + START_FITNESS_ADD;
        stamina = Dice.roll() + STARTstamina_ADD;
        will = Dice.roll() + START_WILL_ADD;
    }

   /**
     * 
     * @param decrease int
     * @throws CharacterDeadException
     */
    public void decreaseStamina(int decrease) throws CharacterDeadException {
        setStamina(stamina - decrease);
    }

    /**
     * 
     * @param increase int
     * @throws CharacterDeadException
     */
    public void increaseStamina(int increase) throws CharacterDeadException {
        setStamina(stamina + increase);
    }

    /**
     * 
     * @return int
     */
    public int getWill(){
        return will;
    }

    /**
     * 
     * @param will int
     */
    public void setWill(int will){
        this.will = will;
    }

    /**
     * 
     * @param increase int
     */
    public void increaseWill(int increase){
        setWill(will + increase);
    }

    /**
     * 
     * @param decrease int
     */
    public void decreaseWill(int decrease){
        setWill(will + decrease);
    }

    /**
     * 
     * @return int
     */
    public int getLuck(){
        return luck;
    }

    /**
     * 
     * @param luck int
     */
    public void setLuck(int luck){
        this.luck = luck;
    }

    /**
     * 
     * @return int
     */
    public int getLukats(){
        return lukats;
    }

    /**
     * 
     * @param lukats int
     */
    public void setLukats(int lukats) throws MaxUseableException{
        if(lukats <= MAX_LUKATS){
            this.lukats = lukats;
        }else{
            throw new MaxUseableException();
        }
    }

    /**
     * 
     * @return ArrayList<AbstractMagicPower>
     */
    public ArrayList<AbstractMagicPower> getMagicPowers(){
        return magicPowers;
    }

    /**
     * 
     * @param magicPower int
     * @throws MaxUseableException 
     */
    public void addMagicPowers(AbstractMagicPower magicPower) throws MaxUseableException{
        if(magicPowers.size() < MAX_MAGIC_POWERS){
            magicPowers.add(magicPower);
        }else{
            throw new MaxUseableException();
        }
    }

    /**
     * 
     * @return ArrayList<AbstractItem>
     */
    public ArrayList<AbstractItem> getItems(){
        return items;
    }

    /**
     * 
     * @param item int
     * @throws MaxUseableException
     */
    public void addItem(AbstractItem item) throws MaxUseableException{
        if(items.size() < MAX_ITEMS){
            items.add(item);
        }else{
            throw new MaxUseableException();
        }
    }

    /**
     * 
     * @return ArrayList<AbstractHerb>
     */
    public ArrayList<AbstractHerb> getHerbs(){
        return herbs;
    }

    /**
     * 
     * @param herb int
     * @throws MaxUseableException 
     */
    public void addHerb(AbstractHerb herb) throws MaxUseableException{
        if(herbs.size() <= MAX_HERBS){
            herbs.add(herb);
        }else{
            throw new MaxUseableException();
        }
    }

    /**
     * 
     * @return ArrayList<AbstractSpecialObject>
     */
    public ArrayList<AbstractSpecialObject> getSpecialObjects(){
        return specialObjects;
    }

    /**
     * 
     * @param specialObject int
     */
    public void addSpecialObject(AbstractSpecialObject specialObject){
        specialObjects.add(specialObject);
    }

    /**
     * 
     * @return int
     */
    public int getNbRepas(){
        return nbRepas;
    }

    /**
     * 
     * @param nbRepas int
     */
    public void setNbRepas(int nbRepas){
        this.nbRepas = nbRepas;
    }

    /**
     * 
     * @return ArrayList<AbstractWeapon>
     */
    public ArrayList<AbstractWeapon> getWeapons(){
        return weapons;
    }

    /**
     *
     * @param weapon int
     * @throws MaxUseableException
     */
    public void addWeapons(AbstractWeapon weapon) throws MaxUseableException{
        if(weapons.size() <= MAX_WEAPONS){
            weapons.add(weapon);
        }else{
            throw new MaxUseableException();
        }
    }

    public String toString()
    {

        return "\r\nEndurance " + stamina + "\r\nHabilité " + fitness;
    }
}