package Janken04;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Hand {
  private int hand;

  public void setPlayerHand() {
    Scanner sc = new Scanner(System.in);

    System.out.println("手を数字で入力してください");
    System.out.print("(1：グー、2：チョキ、3：パー)：");
    try{
      int playerHand = sc.nextInt();
      if (playerHand > 0 && playerHand <=3) {
        this.hand = playerHand;
      } else {
        this.hand = 0;
      }
    } catch(InputMismatchException e) {
      this.hand = 0;
    }
    System.out.println(this.hand);
  }

  public void setComputerHand() {
    Random random = new Random();
    this.hand = random.nextInt(3) + 1;
    System.out.println(this.hand);
  }
}