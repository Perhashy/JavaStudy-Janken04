package Janken04;

import java.util.Scanner;

public class Hand {
  private int hand;

  public void setPlayerHand() {
    Scanner sc = new Scanner(System.in);

    System.out.println("手を数字で入力してください");
    System.out.print("(1：グー、2：チョキ、3：パー)：");
    int playerHand = sc.nextInt();
    this.hand = playerHand;
    System.out.println("--------じゃんけんぽん！--------");
    System.out.println(this.hand);
  }
}