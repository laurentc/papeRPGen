package com.darkrain.app.core;

import com.darkrain.app.character.Avatar;
import com.darkrain.app.character.CharacterDeadException;
import com.darkrain.app.character.Enemy;
import com.darkrain.app.character.UnfindableCharacterException;
import com.darkrain.app.dbal.DBHandler;
import com.darkrain.app.helper.DisplayManager;

import java.util.ArrayList;
import java.util.Hashtable;

public class Section {
	private Avatar _avatar;
	private int _page;
	private ArrayList<String> _redirectionsLabel;
	private ArrayList<String> _redirections;
	private ArrayList<String> _enemies;
	private ArrayList<Hashtable<String, Object>> _preActions;
	private static ArrayList<Integer> donedPreAction;
	private static ArrayList<Integer> donedFight;
	
	public Section(Avatar avatar) throws UnfindableSectionException{
		this(avatar,1);
	}
	public Section(Avatar avatar, int page) throws UnfindableSectionException{
		_avatar = avatar;
		_page = page;
		if(donedFight == null){
			donedFight = new ArrayList();
		}
		if(donedPreAction == null){
			donedPreAction = new ArrayList();
		}
		loadSection(page);
	}
	private void loadSection(Integer page) throws UnfindableSectionException{
    	String query = "select sec_text from section where sec_page=?";
    	ArrayList<Hashtable<String, Object>> rs = DBHandler.getInstance().doQuery(query, new Object[]{page}, new String[]{"sec_text"});
		if(rs != null && !rs.isEmpty()){
			Hashtable<String, Object> row = rs.get(0);
			DisplayManager.message(DisplayManager.SEPARATOR_TITLE);
			DisplayManager.message(row.get("sec_text"));
			DisplayManager.message(DisplayManager.SEPARATOR_TITLE);
		}else{
			throw new UnfindableSectionException();
		}
		_loadPreAction();
		_loadFight();
		_loadRedirection();
	}
	private void _loadRedirection(){
		_redirectionsLabel = new ArrayList();
		_redirections = new ArrayList();
    	String query = "select red_sec_page_to, red_label from redirection where red_sec_page_from=?";
    	ArrayList<Hashtable<String, Object>> rs = DBHandler.getInstance().doQuery(query, new Object[]{_page}, new String[]{"red_sec_page_to", "red_label"});
		if(rs != null && !rs.isEmpty()){
			for(Hashtable<String, Object> row:rs){
				_redirectionsLabel.add(String.valueOf(row.get("red_sec_page_to")) + "| " + row.get("red_label"));
				_redirections.add(String.valueOf(row.get("red_sec_page_to")));
			}
		}	
	}
	private void _loadFight(){
		_enemies = new ArrayList();
    	String query = "select fig_ene_code from fighting where fig_sec_page=?";
    	ArrayList<Hashtable<String, Object>> rs = DBHandler.getInstance().doQuery(query, new Object[]{_page}, new String[]{"fig_ene_code"});
		if(rs != null && !rs.isEmpty()){
			for(Hashtable<String, Object> row:rs){
				_enemies.add((String) row.get("fig_ene_code"));
			}
		}		
	}
	private void _loadPreAction(){
		_preActions = new ArrayList<Hashtable<String, Object>>();
    	String query = "select pac_attribute, pac_method, pac_value from preaction where pac_sec_page=?";
    	ArrayList<Hashtable<String, Object>> rs = DBHandler.getInstance().doQuery(query, new Object[]{_page}, new String[]{"pac_attribute", "pac_method", "pac_value"});
		if(rs != null && !rs.isEmpty()){
			for(Hashtable<String, Object> row:rs){
				Hashtable<String, Object> map = new Hashtable();
				map.put("attribute", row.get("pac_attribute"));
				map.put("method", row.get("pac_method"));
				map.put("value", row.get("pac_value"));
				_preActions.add(map);
			}
		}		
	}
	public void doPreAction() throws CharacterDeadException {
		if(!donedPreAction.contains(_page) && _preActions != null && !_preActions.isEmpty()){
			for(Hashtable<String, Object> effect:_preActions){
				PreAction.execute(_avatar, effect);
			}
			donedPreAction.add(_page);
		}
	}
	public void doFight() throws CharacterDeadException {
		if(!donedFight.contains(_page) && _enemies != null && !_enemies.isEmpty()){
			for(String enemy:_enemies){
				try {
					Fight fight = new Fight(_avatar, new Enemy(enemy));
					fight.execute();
					DisplayManager.message(DisplayManager.SEPARATOR);
				} catch (UnfindableCharacterException e) {
					DisplayManager.error(e);
				}
			}
			donedFight.add(_page);
		}
	}
	public Integer selectSection(Integer from){
		String page = DisplayManager.prompt(_redirectionsLabel,"Votre choix ?").trim();
		try {
			if(page.equals("end") || page.equals("exit") || page.equals("fin") || page.equals("bye")
					|| page.equals("0") || page.equals("q")){
				System.exit(0);
			}else if(page.equals("c") || page.equals("C")) {
				DisplayManager.message(_avatar.toString());
				return from;
			}
			
			return Integer.parseInt(page);
		} catch (NumberFormatException e) {
			DisplayManager.error(e);
		}
		
		return null;
	}
}
