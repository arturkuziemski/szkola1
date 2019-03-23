package model.heroes;

public class Archer extends Hero{
	public void raiseStr(){
		if (dostepnepkt<=0)return;
		else{
			strength=(int)((strength+1)/1.05);
			strength++;
			strength*=1.05;
			dostepnepkt--;	
		}
	}
	public void raiseDef(){
		if (dostepnepkt<=0)return;
		else{
			defence=(int)((defence+1)/1.05);
			defence++;
			defence*=1.05;
			dostepnepkt--;	
		}
	}
	public void raiseInt(){
		if (dostepnepkt<=0)return;
		else{
			intelligence++;
			dostepnepkt--;	
		}
	}
	public void raiseDex(){
		if (dostepnepkt<=0)return;
		else{
			dexterity=(int)((dexterity+1)/1.2);
			dexterity++;
			dexterity*=1.2;
			dostepnepkt--;	
		}
	}
	public void raiseAgi(){
		if (dostepnepkt<=0)return;
		else{
			agility=(int)((agility+1)/1.1);
			agility++;
			agility*=1.1;
			dostepnepkt--;	
		}
	}
	public void raiseSpd(){
		if (dostepnepkt<=0)return;
		else{
			speed=(int)((speed+1)/1.05);
			speed++;
			speed*=1.05;
			dostepnepkt--;	
		}
	}
}
