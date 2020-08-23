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

  public static void result(int player, int computer) {
    if ((player == 1 && computer == 2) ||
        (player == 2 && computer == 3) ||
        (player == 3 && computer == 1)) {
          GameController.winCount++;
          System.out.println("おめでとう！あなたの勝ちです！");
    } else {
      GameController.loseCount++;
      if (player != 0) {
        System.out.println("残念！あなたの負けです");
      } else {
        System.out.println("正しくない手を出しました。あなたの負けです");
      }
    }
  }
}