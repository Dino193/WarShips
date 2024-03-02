package domaci;

public class CommandShip extends BattleShip {

	String NameShipa="CommandShip";
	
    int health = 1000;
	
	int damage=150;
	
	int shield=20;
	
	
	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		System.out.println("Ime broda je "+NameShipa+" koji poseduje Stit za brod vrednosti "+shield);
	}
	
	
	public CommandShip() {
		
	}
		
	public CommandShip(int health,int speed,int damage,String NameShipa,int shooting,int CrvenoDugme,String shootingButton,int shield) {
		
		super(health, speed, damage, NameShipa, shooting, CrvenoDugme, shootingButton);
		
		this.shield=shield;
		
		
		
	}
	
	@Override
	void getDamage(int damage) {
		// TODO Auto-generated method stub
		
		//super izbacujem iz override da ne bi duplo odradio metodu
		
	 while(health>0)
		
	health=health-damage+shield;//štit koji se kod svakog udarca na CommandShip dodaje na health
				   
	 if(health==0) {
						
			System.out.println("Command Ship je unisten");	
				
		
	}  
	 
		
    }
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return NameShipa;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		CommandShip c1=(CommandShip)(obj);
		   
		   
	    if(c1==null) {
			
			
			return false;
	    }
		
	   else if(this.NameShipa==c1.NameShipa) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	

	

	
	
	void EndofGame(int health) {
		
		super.EndofGame(health);
		
	}
}	
	    
	
	
	

