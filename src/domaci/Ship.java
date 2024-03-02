package domaci;



public class Ship {
	
	


int health;

int speed;

int damage;

String NameShipa;



public void introduce() {
	
	System.out.println("Ime broda je"+NameShipa+"brzina mu je "+speed);
	
}


public Ship() { //Deafult Konstruktor
	
	
}

public Ship(int health,int speed,int damage,String NameShipa) { //Paramaterizovani konstruktor
	
	this.health=health;
	this.speed=speed;
	this.damage=damage;
	this.NameShipa=NameShipa;
	
}

	


public String toString() {
	
	
	return NameShipa;
	
}


public boolean equals(Object obj) {
	
	
 Ship s1=(Ship)(obj);
	
	 if(s1==null) {
			
			
			return false;
	    }
		
	   else if(this.NameShipa==s1.NameShipa) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}




void getDamage(int damage) {
	
	while(health>0) {
		
	health=health-damage;
	
	}
	 health=health-damage;
	   
	    if(health==0) {
				
				System.out.println("Ship je unisten");	
	   
	    }
	 
	    }
	 

void EndofGame(int health) {
	
	if(health==0) {
		
		
		System.out.println("End Of Game");


}

}

}


