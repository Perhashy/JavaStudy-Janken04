package Janken04;

import java.util.Scanner;
import java.util.InputMismatchException;

public class GameController {
  protected static int gameCount = 1;
  protected static int drawCount = 0;
  protected static int winCount = 0;
  protected static int loseCount = 0;
  protected static int nextGame;

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

    System.out.println("--------------戦績--------------");
    System.out.println("勝ち：" + winCount + "回");
    System.out.println("負け：" + loseCount + "回");
    System.out.println("引き分け：" + drawCount + "回");
  }

  public static void nextGame() {
    Scanner sc = new Scanner(System.in);
    System.out.println("--------------------------------");
    System.out.println("もう一度遊びますか？");
    System.out.print("(1：はい、2：いいえ)：");
    try {
      nextGame = sc.nextInt();
    } catch(InputMismatchException e) {
      gameExit();
    }
  }

  public static boolean checkNext() {
    if (nextGame == 1) {
      gameCount++;
      return true;
    } else {
      return false;
    }
  }

  public static void gameExit() {
    System.out.println("--------------------------------");
    System.out.println("ゲームを終了します");
    System.out.println("また遊んでね！");
    System.exit(0);
  }
}