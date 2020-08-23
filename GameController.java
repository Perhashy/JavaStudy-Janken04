package Janken04;

public class GameController {
  protected static int gameCount = 1;
  protected static int drawCount = 0;
  public static void game(Hand player, Hand computer) {
    System.out.println("================================");
    System.out.println(gameCount + "回目のゲーム！");

    do {
      player.setPlayerHand();
      computer.setComputerHand();
  
      System.out.println("--------じゃんけんぽん！--------");
      System.out.println("あなた：" + player.strHand());
      System.out.println("あいて：" + computer.strHand());
    } while (Rule.draw(player.getHand(), computer.getHand()));
    Rule.result(player.getHand(), computer.getHand());
  }
}