package com.darkrain.app.character;

/**
 *
 * @author laurentc
 */
public class AbstractCharacter implements Character{
    protected int stamina;
    protected int fitness;

    /**
     * Return String value of character object
     * @return String
     */
    public String toString(){
    	return "endurance:"+stamina;
    }

    /**
     * Return if character is dead
     * @return boolean
     */
    public boolean isDead(){
        return stamina <= 0;
    }

    /**
     * Return stamina of character
     * @return int
     */
    public int getStamina(){
        return stamina;
    }

    /**
     * Return fitness of character
     * @return int
     */
    public int getFitness(){
        return fitness;
    }

    /**
     * Set fitness on character
     * @param fitness int
     */
    public void setFitness(int fitness){
        this.fitness = fitness;
    }

    /**
     * Set stamina on character
     * @param stamina int
     */
    public void setStamina(int stamina) throws CharacterDeadException {
        this.stamina = stamina;
    }
}