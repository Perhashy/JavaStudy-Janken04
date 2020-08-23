package Janken04;

public class GameController {
  protected static int gameCount = 1;
  public static void game(Hand player) {
    System.out.println("================================");
    System.out.println(gameCount + "回目のゲーム！");

    player.setPlayerHand();
  }
}