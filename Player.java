package Rock_Paper_Scissors;
import java.util.Scanner;


public class Player extends GameItem {
	Scanner scan;
	
	public Player()
	{
		super();
		scan = new Scanner(System.in);
	}
	
	public CHOICES getChoice()
	{
		System.out.println("Please enter your choice :\nRock \nPaper \nScissors");
		String playerChoice = scan.next().toLowerCase();
		
		switch(playerChoice)
		{
			case "rock":
				return CHOICES.ROCK;
			case "paper":
				return CHOICES.PAPER;
			case "scissors":
				return CHOICES.SCISSORS;

		}
		System.out.println("Invalid Input!!!!!!!!");
		
		return getChoice();
				
		
	}

}
