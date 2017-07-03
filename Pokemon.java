public class Pokemon{

	public String name;
	public float hp;
	public float attack;
	public int speed;
	public String type;
	
	// Constructor
	
	public Pokemon(String nameIn, float hpIn, float attackIn, int speedIn, String typeIn){
		name = nameIn;
		hp = hpIn;
		attack = attackIn;
		speed = speedIn;
		type = typeIn;
		
	}
	
	public void faint(){
	
		System.out.println("Your " + name + " has fainted");
		
		
	}
	
	public float getHp(){
	
		return hp;
	}
	
	public int getSpeed(){
	
		return speed;
	}


}