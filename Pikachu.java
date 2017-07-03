public class Pikachu extends Pokemon{
	
	
	public Pikachu(String nameIn, float hpIn, float attackIn, int speedIn, String typeIn){
		super(nameIn, hpIn, attackIn, speedIn, typeIn);
		 
	}
	public float thunderbolt(){
		System.out.println(name + " used thunderbolt" );
		return (attack/10) * 50;
	
	}
	
	public float thundershock(){
		System.out.println(name + " used thundershock" );
		return (attack/10) * 20;
	}
}