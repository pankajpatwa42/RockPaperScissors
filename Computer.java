package Rock_Paper_Scissors;
import java.util.Random;

public class Computer extends GameItem {

		private  Random random;
		
		
		public Computer()
		{
			super();
			random=new Random();
		}
		
		public CHOICES getChoice()
		{
			int choice = random.nextInt(3)+1;
			 
			switch(choice)
			{
				case 1:
					return CHOICES.ROCK;
				case 2:
					return CHOICES.PAPER;
			}
			
			return CHOICES.SCISSORS;
		}
		

}
