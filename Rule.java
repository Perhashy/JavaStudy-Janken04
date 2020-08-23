package Janken04;

public class Rule {
  public static boolean draw(int player, int computer) {
    if (player == computer) {
      System.out.println("あいこです");
      GameController.drawCount++;
      return true;
    } else {
      return false;
    }
  }
}