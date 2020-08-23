package Janken04;

import java.util.Scanner;

public class Hand {
  private int hand;

  public void setPlayerHand() {
    Scanner sc = new Scanner(System.in);

    System.out.println("手を数字で入力してください");
    System.out.print("(1：グー、2：チョキ、3：パー)：");
    int playerHand = sc.nextInt();
    if (playerHand > 0 && playerHand <=3) {
      this.hand = playerHand;
    } else {
      this.hand = 0;
    }
    System.out.println(this.hand);
  }
}