package domaci;

public class SmallCargoShip extends Ship{
	
	String NameShipa="SmallCargoShip";

	int health = 100;
	
    int capacity = 1000; //koliko moze da ponese tereta
    
    
    @Override
    public void introduce() {
    	// TODO Auto-generated method stub
    	System.out.println("Ime brod je teretnjak sa imenom "+NameShipa+" koji moze da podnese teret od "+capacity);
    }
    
    
    public SmallCargoShip() {
    	
    	
    }
    
    public SmallCargoShip(int health,int speed,int damage,String NameShipa,int capacity) {
    	
    	
    	super(health, speed, damage, NameShipa);
    	
    	this.capacity=capacity;
         
}
    
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return NameShipa;
    }
    
    
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	
    	SmallCargoShip d1=(SmallCargoShip)(obj);
		   
		   
	    if(d1==null) {
			
			
			return false;
	    }
		
	   else if(this.NameShipa==d1.NameShipa) {
			
			return true;
			
		}
		
		else {
			
			
		return false;	
    	
		}
    	
    	
    	
    	
    }
    

   @Override
void getDamage(int damage) {
	// TODO Auto-generated method stub
	
	
	System.out.println("Small Cargo Ship je unisten");
	
}
    
  

    
    void EndofGame(int health) {
    	
    	super.EndofGame(health);
    	
    }
}


