package domaci;

public class BigCargoShip extends Ship {

	int health = 200; 
	
    int capacity=5000;//koliko moze tereta da podnese
    
    int shield=10;
    
    String NameShipa="BigCargoShip";
    
    
    @Override
    public void introduce() {
    	// TODO Auto-generated method stub
    	super.introduce();
    	
    	System.out.println("Ime brod je teretnjak sa imenom "+NameShipa+"koji moze da podnese teret od "+capacity);
    }
    
    
	
	
  public BigCargoShip() {
    	
    	
    }
    
    public BigCargoShip(int health,int speed,int damage,String NameShipa,int capacity,int shield) {
    	
    	
    	super(health, speed, damage, NameShipa);
    	
    	this.capacity=capacity;
    	this.shield=shield;
       
    	
    
    
    

}
   @Override
void getDamage(int damage) {
	// TODO Auto-generated method stub
	
	   while(health>0) {
	
	health=health-damage+shield;
	   
    if(health==0) {
			
			System.out.println(" BigCargo Ship je unisten");	
	
}
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
	
	   BigCargoShip x1=(BigCargoShip)(obj);
	   
	   
	    if(x1==null) {
			
			
			return false;
	    }
		
	   else if(this.NameShipa==x1.NameShipa) {
			
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
	
