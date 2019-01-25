import java.util.Random;

public class GCoin {
	private GCoinFace face; 
	private Random rand; 
	
	public GCoin()
	{
		rand = new Random();
		// To initialize the coin
		toss();
	}
	
	public GCoinFace getFace()
	{
		return face; 
	}
	
	public void toss()
	{
		// Since boolean has exactly 2 possible outcomes it is a fine choice
		// But we could also use nextInt(2) or nextDouble()
		if(rand.nextBoolean() == false)
		{
			face = GCoinFace.HEADS;
		}
		else 
		{
			face = GCoinFace.TAILS;
		}
	}
}
