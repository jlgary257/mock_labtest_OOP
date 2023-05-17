public class User
{
	private String email;
	private Subscriber subscriber;
	private Game[] game;
	
	public User()
	{}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public Subscriber getSubscriber()
	{
		return subscriber;
	}
	public void setSubscriber(Subscriber subscriber)
	{
		this.subscriber = subscriber;
	}
	public Game [] getGames()
	{
			return game;
		
	}
	public void setGames(Game game[])
	{
		this.game = game;
		
	}
	

}