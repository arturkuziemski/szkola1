package model.heroes;

public class Mage extends Hero{ 
	public void raiseStr(){
		if (dostepnepkt<=0)return;
		else {
			strength++;
			dostepnepkt--;
		}
		}
	public void raiseDef(){
		if (dostepnepkt<=0)return;
		else {
			defence++;
			dostepnepkt--;
			}
	}
	public void raiseInt(){
		if (dostepnepkt<=0)return;
		else{
			intelligence=(int)((intelligence+1)/1.2);
			intelligence++;
			intelligence*=1.2;
			dostepnepkt--;	
		}
	}
	public void raiseDex(){
		if (dostepnepkt<=0)return;
		else{
			dexterity=(int)((dexterity+1)/1.05);
			dexterity++;
			dexterity*=1.05;
			dostepnepkt--;	
		}
	}
	public void raiseAgi(){
		if (dostepnepkt<=0)return;
		else{
			agility=(int)((agility+1)/1.02);
			agility++;
			agility*=1.02;
			dostepnepkt--;	
		}
	}
	public void raiseSpe(){
		if (dostepnepkt<=0)return;
		else{
			speed++;
			dostepnepkt--;	
		}
	}
}
