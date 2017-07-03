public class Squirtle extends Pokemon{
	
	
	public Squirtle(String nameIn, float hpIn, float attackIn, int speedIn, String typeIn){
		super(nameIn, hpIn, attackIn, speedIn, typeIn);
		 
	}
	public float waterGun(){
		System.out.println(name + " used water gun" );
		return (attack/10) * 20;
	
	}
	public float splash(){
		System.out.println(name + " used splash" );
		return (attack/10) * 0;
	}
}