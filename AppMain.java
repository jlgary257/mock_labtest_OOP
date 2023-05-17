public class AppMain {
public static void main(String[] args) {
User user = new User();
user.setEmail("abu@hotmail.com");
Game mobileLegendX = new Game();
mobileLegendX.setName("Mobile Legend X");
mobileLegendX.setPrice(200.00);
Game diabloB = new Game();
diabloB.setName("Diablo B");
diabloB.setPrice(100.00);
Game [] games = new Game[2];
games[0] = mobileLegendX;
games[1] = diabloB;
user.setGames(games);
Subscriber subscriber = new Subscriber();
subscriber.setSubscriber(true);
subscriber.setType('S');
user.setSubscriber(subscriber);
UserGameController userGame = new UserGameController(user);
System.out.println("User : "+user.getEmail());
for(Game game : user.getGames())
System.out.println("\tGame : "+game.getName() + "\t\t"+game.getPrice());
System.out.println("Price is :" +userGame.userBuyGames());
}
}