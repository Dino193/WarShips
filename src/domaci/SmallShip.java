package domaci;

public class SmallShip extends BattleShip {


String NameShipa="SmallShip";

int health=300;

int damage=50;



	@Override
		public void introduce() {
			// TODO Auto-generated method stub
		System.out.println("Ime broda je "+NameShipa);
		}


public SmallShip() { 
	
	
}

public SmallShip(int health,int speed,int damage,String NameShipa,int shooting,int CrvenoDugme,String shootingButton) {
	
	super(health, speed, damage, NameShipa, shooting, CrvenoDugme, shootingButton);
	
}



@Override
	public String toString() {
		// TODO Auto-generated method stub
		return NameShipa;
	}


@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
	SmallShip a1=(SmallShip)(obj);
	
	if(a1==null) {
		
		
		return false;
	}
	
	else if(this.NameShipa==a1.NameShipa) {
		
		return true;
		
	}
	
	else {
		
		return false;
		
	}
	
}

@Override
	void getDamage(int damage) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Small Ship je Unisten");
	}




	
	

void EndofGame(int health) {
	
	super.EndofGame(health);
	
	
}

}
		


