
public class GCoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GPlayer p1 = new GPlayer("Tim"), 
				p2 = new GPlayer("Cassie");
		GCoin coin = new GCoin(); 
		
		do
		{
			// Player 1 takes a guess
			p1.makeGuess();
		
			// Player 2 take a guess
			p2.makeGuess();
		
			// Toss Coin 
			coin.toss();
		
			// Player 1 verifies and updates score
			p1.verifyGuess(coin.getFace());
		
			// Player 2 verifies and updates score 
			p2.verifyGuess(coin.getFace());
		
		// Loop until we have a winner or the game ends
		} while(p1.getScore() < 5 && p2.getScore() < 5);
		
		// Announce the winner 
		if(p1.getScore() > p2.getScore())
		{
			System.out.println(p1.getName() + " wins!");
		}
		
		else if(p1.getScore() < p2.getScore())
		{
			System.out.println(p2.getName() + " wins!");
		}	
		else
		{
			System.out.println("It's a Tie!");
		}
	}
}
