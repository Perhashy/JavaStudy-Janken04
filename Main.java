package Janken04;

public class Main {
  public static void main(String[] args) {
    Hand player = new Hand();
    Hand computer = new Hand();

    System.out.println("じゃんけんを始めます！");
    do {
      GameController.game(player, computer);
      GameController.nextGame();
    } while(GameController.checkNext());
    GameController.gameExit();
  }
}