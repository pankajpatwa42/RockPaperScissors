package Rock_Paper_Scissors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PlayGame extends Game {
	public static File file;
	private static final String filepath="C://Users//PANKAJ//eclipse-workspace//RockPaperScissorGame//src//Rock_Paper_Scissors//score.properties";
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int highScore = 0;
		String playerName = null;
		try {
			FileInputStream input = new FileInputStream(filepath);
			Properties prop = new Properties();
			prop.load(input);
			for(String name:prop.stringPropertyNames())
			{
				int playerScore = Integer.parseInt(prop.getProperty(name));
				if(playerScore>highScore)
				{
					playerName = name;
					highScore = playerScore;
					
				}
			}
			
		}catch(IOException e) {}
		
		System.out.println("PlayerNames :"+playerName+"Highest Score "+highScore);
		
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
		
		try
        {
    		FileInputStream fileReader = new FileInputStream(filepath);
            prop.load(fileReader);
            userHighestScoreInString=prop.getProperty(userName);
            if(userHighestScoreInString!=null)
            {
               userHighestScore=Integer.parseInt(userHighestScoreInString);
                System.out.println("Welcome back, "+userName);
                System.out.println("Your before score is "+userHighestScore);
            }
            else {
                System.out.println("Welcome, "+userName);
            }
        }
        catch (IOException exception)
        {
            System.out.println("File not found");
        }
        
        if(userHighestScoreInString==null)
        {
            if(score>0)
            {
                System.out.println("Congratulations, your new high score is "+score);
                try {
                	File file = new File(filepath);
                	file.createNewFile();
               	FileOutputStream fileWriter = new FileOutputStream(filepath);
               	 prop.setProperty(userName,String.valueOf(score));
                 prop.store(fileWriter,null);
                }
                catch (IOException exception)
                {
                    System.out.println("Something went wrong! We can't able to save your score");
                }
            }
            else
            {
                System.out.println("Your score "+score);
                
            }
        }
        else
        {
            if(score>userHighestScore)
            {
                System.out.println("Your score "+score);
                System.out.println("Congratulations, your new high score is "+score);
                try
                {
                	FileOutputStream fileWriter=new FileOutputStream(filepath);
                    prop.setProperty(userName,String.valueOf(score));
                    prop.store(fileWriter,null);
                }
                catch (IOException exception)
                {
                    System.out.println("Something went wrong! We can't able to save your score");
                }
             
            }
            else
            {
                System.out.println("Your Current score is "+score);
            }
        }
	
		
	}

}
