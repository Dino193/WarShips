package domaci;

import java.util.Scanner;

public class BattleShip extends Ship {


	  
	   String NameShipa="BattleShip";
	   int shooting=100;
	   int CrvenoDugme;
	   String shootingButton;
	   
	   Scanner sc=new Scanner(System.in);
	   
	   
	   
	   @Override
	public void introduce() {
		// TODO Auto-generated method stub
		
System.out.println("Ove je  ratni brod sa imenom "+NameShipa+" koji poseduje oruzje  Shooting Buttton za napad i Crveno dugme za totalno unistenje ");
	}
	 
	     
	   public BattleShip() {//Deafult Konstruktor
			
			
		}
	 
	 
		
		public BattleShip(int health,int speed,int damage,String NameShipa,int shooting,int CrvenoDugme,String shootingButton) { //Paramaterizovani Konstruktor
			
			super(health, speed, damage, NameShipa);
			
 		
			this.shooting=shooting;
			this.CrvenoDugme=CrvenoDugme;
			this.shootingButton=shootingButton;
			
			
			}
			
	 
	 
	    void getDamage(int damage) { 
		 	 
		  
			super.getDamage(damage);	
	 
			}	
	    
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return NameShipa;
	    }
	    
	    
	    
	    @Override
	    public boolean equals(Object obj) {
	    	// TODO Auto-generated method stub
	    	return super.equals(obj);
	    }
	    
	    
	    
	   
	    
	   
	   void attackShip(String NameShipa,int damage) {
		   
		    health=health-damage;
		      
		      if(health==0) {
		    	  
		    	  System.out.println("Protivnicki Ship je Unisten");
		    	  
		      }
		      else {
		    	  
		    	  
		    	  
		    	  System.out.println("Nastavi sa napadom");
		    	  
		      }
		      
		    	  
		      }
	   
	   void shootFired(String NameShipa,int shooting)  {
		   
		   System.out.println("Pritisnite dugme za napad");
		   
		   shootingButton=sc.next();
		   
		   if(shootingButton=="R") {
			   
			   shooting--;
			   
			   health=health-shooting;
			   
			 System.out.println("Rafal je ispaljen");
			 
			 
			   
		   }
	   
	   }   
	 
	   
	 
		 void totlnoUnistenje(String NameShipa,int CrvenoDugme) {
			 
			 System.out.println("Ukucaj kod za totalno unistenje");
			 
			 CrvenoDugme=sc.nextInt();
			 
			 if(CrvenoDugme==2500) {
				 
				 health=0;
				 
				 System.out.println("Na snazi je totalno bombardovanje i unistenje protivnickog broda");
				 
			 }
			 
			 else {
				 
				 System.out.println("Uneli ste pogresan code,zahtev je odbijen");
				 
			 }
			 
			 
			 }
		   
		 void obustavaVatre(int CrvenoDugme) {
			 
			 
			 if(health==0) {
				 
				 
				 System.out.println("Obustava vatre i povlacenje.Misija je uspesno zavrsena!");
				 
			 }
			 
			 
		 }
		 
		 
	}

