import java.util.Scanner;

public class Main{
	
	

    public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int turn;
		float pikaHp;
		float squirtHp;
		
		
        Pikachu pika = new Pikachu("Pikachu",50.0f,8.0f,30,"electric");
		Squirtle squirt = new Squirtle("Squirty",60.0f,9.0f,10,"water");
		
		pikaHp = pika.getHp();
		squirtHp = squirt.getHp();
		
		if (pika.getSpeed() > squirt.getSpeed()){
			turn = 0;
		}else {
			turn = 1;
			
		}
		
		
		while (pikaHp > 0 && squirtHp > 0){
			
			if (turn%2 == 0){
				System.out.println("Player 1's turn: Your hp = " + pikaHp);
				System.out.println("Please choose a move. thunderbolt or thundershock");
				
				
				String n1 = s.nextLine();
				System.out.println(n1);
				
				if (n1.equals("thunderbolt")){
					squirtHp -= pika.thunderbolt();
					turn += 1;
					
					
				} else if (n1.equals("thundershock")){
					squirtHp -= pika.thundershock();
					turn += 1;
				} else {
					System.out.println("Please enter a valid move");
					
				}
			
			
			} else {
				System.out.println("Player 2's turn: Your hp = " + squirtHp);
				System.out.println("Please choose a move. water gun or splash");
				
				String n2 = s.nextLine();
				System.out.println(n2);
				
				if (n2.equals("water gun")){
					pikaHp -= squirt.waterGun();
					turn += 1;
					
				} else if (n2.equals("splash")){
					pikaHp -= squirt.splash();
					turn += 1;
					
				}else {
					System.out.println("Please enter a valid move");
				}
			}
		}
		if (pikaHp <= 0){
			pika.faint();
			
		}else {
			squirt.faint();
		}
    }
}