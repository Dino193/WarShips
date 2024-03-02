package domaci;

public class BigShip extends BattleShip {

String NameShipa="BigShip";

int health = 500;

int damage = 100;



@Override
	public void introduce() {
		// TODO Auto-generated method stub
	System.out.println("Ime broda je "+NameShipa);
	}

public BigShip() {
	
	
}

public BigShip(int health,int speed,int damage,String NameShipa,int shooting,int CrvenoDugme,String shootingButton) {
	
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
		
   BigShip b1=(BigShip)(obj);
   
   
    if(b1==null) {
		
		
		return false;
    }
	
   else if(this.NameShipa==b1.NameShipa) {
		
		return true;
		
	}
	
	else {
		
		return false;
		
	}
	
}


 @Override
	void getDamage(int damage) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Big Ship je unisten!");
	}


	
      


  void EndofGame(int health) {

    super.EndofGame(health);
}
}

