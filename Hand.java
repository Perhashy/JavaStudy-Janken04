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
  }

  public void setComputerHand() {
    Random random = new Random();
    this.hand = random.nextInt(3) + 1;
  }

  public int getHand() {
    return this.hand;
  }

  public String strHand() {
    switch(this.hand) {
      case 0: return "正しくない手を出しました";
      case 1: return "✊";
      case 2: return "✌️";
      case 3: return "✋";
    }
    return "問題が発生しました";
  }
}