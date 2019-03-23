package model.heroes;

public class Hero {
	protected int dostepnepkt;
	public int getDostepnepkt(){
		return dostepnepkt;
	}
	public void lvlup(){
		dostepnepkt+=10;
	}
private String name;
	
	protected int strength;
	protected int defence;
	protected int intelligence;
	protected int dexterity;
	protected int agility;
	protected int speed;
	
	
	public int getStrength(){
		return strength;	
	}
	public int getDefence(){
		return defence;
	}
	public int getIntelligence(){
		return intelligence;
	}
	public int getDexterity(){
		return dexterity;
	}
	public int getAgility(){
		return agility;
	}
	public int getSpeed(){
		return speed;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setIntelligence(int intelligence){
		this.intelligence=intelligence;
	}
	public void setStrength(int strength){
		this.strength=strength;
	}
}
