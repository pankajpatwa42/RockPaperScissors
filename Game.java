package Rock_Paper_Scissors;

public class Game extends GameItem {
	private Player player;
	private Computer computer;
	private CHOICES playerChoice;
	private CHOICES computerChoice;
	private RESULT result;
	public static int score=0;
	
	public Game()
	{
		super();
		player = new Player();
		computer = new Computer();

	}
	
	public void play()
	{
		playerChoice = player.getChoice();
		computerChoice = computer.getChoice();
		result = getResults();
		displayResults();
	}
	
	public void  displayResults()
	{
		switch(result)
		{
		case WIN:
			System.out.println(playerChoice + " beats "+computerChoice+". Players Wins");
			score++;
			break;
		case LOSE:
			System.out.println(playerChoice + " lose to  "+computerChoice+". Computer Wins");
			break;
		case TIE:
			System.out.println(playerChoice + " equals to  "+computerChoice+". It's a TIE");
			break;
	
		}
	}
	
	public RESULT getResults()
	{
		if(playerChoice==computerChoice)
			return RESULT.TIE;
		
		switch(playerChoice) {
		case ROCK:
			return (computerChoice==CHOICES.SCISSORS ? RESULT.WIN:RESULT.LOSE);
		case PAPER:
			return (computerChoice==CHOICES.ROCK ? RESULT.WIN:RESULT.LOSE);
		case SCISSORS:
			return (computerChoice==CHOICES.PAPER ? RESULT.WIN:RESULT.LOSE);
	
		}
		return RESULT.LOSE;
	}

}
