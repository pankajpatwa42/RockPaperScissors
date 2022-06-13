package Rock_Paper_Scissors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PlayGame extends Game {
	public static File file;
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name ");
		
		
		Properties prop = new Properties();
     	String userHighestScoreInString = null;
     	int userHighestScore = 0;
		
     	
     	String userName = scan.next(); 
		Game game  = new Game();
		String quit="";
		
		while(quit!="n")
		{
			game.play();
			System.out.println("Play Again? Press any key to Continue, or 'n' to quit");
			quit = scan.next().toLowerCase();	
			if(quit.equals("n"))
				break;
		}
		
		

     
		
		
	}

}
