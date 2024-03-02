package domaci;





public class TestMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" ");
		
		System.out.println("Information about Targets for attack");
		
		System.out.println(" ");
		
		
		SmallShip a1=new SmallShip();
		
		a1.introduce();
		
		
		BigShip b1=new BigShip();
		
		b1.introduce();
		
		CommandShip c1=new CommandShip();
		
		c1.introduce();
		
		SmallCargoShip d1=new SmallCargoShip();
		
		d1.introduce();
		
		BigCargoShip x1=new BigCargoShip();
		
		x1.introduce();
		
		
		
		
		System.out.println(" ");
		
		System.out.println("Informacije o nasem ratnickom brodu koji je spreman za napad");
		
		System.out.println(" ");
		
		BattleShip n1=new BattleShip();
		
		n1.introduce();
		
		System.out.println(" ");
		
		System.out.println("Napadamo Small Ship Brod: ");
		
		n1.attackShip("SmallShip", 50);
		
		System.out.println(" ");
		
		System.out.println("Napadamo Big Ship Brod: ");
		
		BattleShip n2=new BattleShip();
		
		n2.attackShip("BigShip", 100);
		
		System.out.println(" ");
		
		BattleShip n3=new BattleShip();
		
		System.out.println("Napadamo Command Ship Brod: ");
		
		n3.attackShip("CommandShip", 150);
		
		System.out.println(" ");
		
		BattleShip n4=new BattleShip();
		
		System.out.println("Pucamo na SmallCargo Brod");
		
		n4.shootFired("SmallCargoShip", 70);
		
		System.out.println(" ");
		
		
		
		
	
		
		
	}
		
	}
    	
    
    
		
		
	