public class UserGameController
{
	private User user = new User();
	
	public UserGameController(User user)
	{
		this.user = user;
	}
	public double userBuyGames()
	{
		double endPrice = 0;

		for (Game game: user.getGames())
		{
			endPrice = game.getPrice();
		}
		return endPrice*0.7;


		
	}
}