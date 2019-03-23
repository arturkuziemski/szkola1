package model.heroes;

public class Main {

	public static void main(String[] args) {
		Mage mage = new Mage();
		mage.setName("Gandalf");
		mage.setStrength(1);
		mage.setIntelligence(2);
		
		Knight knight = new Knight();
		knight.setName("Marek");
		
		Archer archer = new Archer();
		archer.setName("Anka");
		
		for (int i=0; i<100;i++){
			mage.lvlup();
			mage.raiseInt();
			mage.raiseAgi();
			mage.raiseDex();
			mage.raiseStr();
			mage.raiseSpe();
			mage.raiseDef();
			
			knight.lvlup();
			knight.raiseInt();
			knight.raiseAgi();
			knight.raiseDex();
			knight.raiseStr();
			knight.raiseSpd();
			knight.raiseDef();
			
			archer.lvlup();
			archer.raiseInt();
			archer.raiseAgi();
			archer.raiseDex();
			archer.raiseStr();
			archer.raiseSpd();
			archer.raiseDef();
		}
		printoutHero(mage);
		printoutHero(knight);
		printoutHero(archer);
	}
static void printoutHero(Mage hero){
	System.out.println("=================================================================================================================");
	System.out.println(hero.getName()+"\t|"
			+ "Siła: " + hero.getStrength()+"\t|"
			+ "Obrona: " + hero.getDefence()+"\t|"
			+ "Inteligencja: " + hero.getIntelligence()+"\t|"
			+ "Celność: " + hero.getDexterity()+"\t|"
			+ "Zręczność: " + hero.getAgility() + "\t|"
			+ "Szybkość: " + hero.getSpeed() + "\t|");
	System.out.println("=================================================================================================================");
}
static void printoutHero(Knight hero){
	System.out.println("=================================================================================================================");
	System.out.println(hero.getName()+"\t|"
			+ "Siła: " + hero.getStrength()+"\t|"
			+ "Obrona: " + hero.getDefence()+"\t|"
			+ "Inteligencja: " + hero.getIntelligence()+"\t|"
			+ "Celność: " + hero.getDexterity()+"\t|"
			+ "Zręczność: " + hero.getAgility() + "\t|"
			+ "Szybkość: " + hero.getSpeed() + "\t|");
	System.out.println("=================================================================================================================");
}
static void printoutHero(Archer hero){
	System.out.println("=================================================================================================================");
	System.out.println(hero.getName()+"\t|"
			+ "Siła: " + hero.getStrength()+"\t|"
			+ "Obrona: " + hero.getDefence()+"\t|"
			+ "Inteligencja: " + hero.getIntelligence()+"\t|"
			+ "Celność: " + hero.getDexterity()+"\t|"
			+ "Zręczność: " + hero.getAgility() + "\t|"
			+ "Szybkość: " + hero.getSpeed() + "\t|");
	System.out.println("=================================================================================================================");
}

}
