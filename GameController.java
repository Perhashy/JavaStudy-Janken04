package Janken04;

public class GameController {
  protected static int gameCount = 1;
  public static void game(Hand player, Hand computer) {
    System.out.println("================================");
    System.out.println(gameCount + "回目のゲーム！");

    player.setPlayerHand();
    computer.setComputerHand();

    System.out.println("--------じゃんけんぽん！--------");
    System.out.println("あなた：" + player.strHand());
    System.out.println("あいて：" + computer.strHand());
  }
}