import java.util.Scanner;
public class DIceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Dice = 1 + (int)(Math.random()*(6));
int Player;
int Computer;
int x = 0;
while( x < 100 ) {
    System.out.printf("You have played : %d times" ,x);
    x++;
    System.out.print("\n");
for(int i=1; i<100; i++){
	Scanner OddOrEven = new Scanner(System.in);
System.out.println("Guess 1.Odd Or 2.Even ");
Player = OddOrEven.nextInt();
System.out.printf("The computer will roll \n");
Computer = Dice;
System.out.print("\n");
	if(Player == 1 && Computer == 1){
		System.out.println("You have guessed correctly");
		break;
		}
	if(Player == 1 && Computer == 3){
		System.out.println("You have guessed correctly");
		break;
		}
	if(Player == 1 && Computer == 5){
		System.out.println("You have guessed correctly");
		break;
		}
	if(Player == 2 && Computer == 2){
		System.out.println("You have guessed correctly");
		break;
		}
	if(Player == 2 && Computer == 4){
		System.out.println("You have guessed correctly");
		break;
		}
	if(Player == 2 && Computer == 6){
		System.out.println("You have guessed correctly");
		break;
		}
	if(Player != Computer){
	System.out.println("You guessed wrong");
	}
	}
	System.out.println("Computer Rolled " +Dice);
	
		
	}
}
}