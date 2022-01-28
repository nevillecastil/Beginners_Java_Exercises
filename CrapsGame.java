public class CrapsGame {
  public static void main(String[] args) {
    int dice1 = (int) (Math.random() * 10);
    int dice2 = (int) (Math.random() * 10);

    if (dice1 == 1) {
      dice1++;
    }

    if (dice2 == 1) {
      dice2++;
    }

    if (dice1 >= 7) {
      dice1 -= 3;
    }

    if (dice2 >= 7) {
      dice2 -= 3;
    }

    int ComeOut = dice1 + dice2;

    if (ComeOut == 7) {
      System.out.println("You rolled a 7. You Win!");
    } else if (ComeOut == 11) {
      System.out.println("You rolled a 11. You Win!");
    } else if (ComeOut == 2) {
      System.out.println("You rolled a 2. You lose");
    } else if (ComeOut == 3) {
      System.out.println("You rolled a 3. You lose");
    } else if (ComeOut == 12) {
      System.out.println("You rolled a 12. You lose");
    } else {
      int Point = 0;
      System.out.println("You rolled " + ComeOut + ". Point is " + ComeOut);
      while (Point != ComeOut) {
        int draw1 = (int) (Math.random() * 10);
        int draw2 = (int) (Math.random() * 10);

        if (draw1 == 1) {
          draw1++;
        }

        if (draw2 == 1) {
          draw2++;
        }

        if (draw1 >= 7) {
          draw1 -= 3;
        }

        if (draw2 >= 7) {
          draw2 -= 3;
        }

        Point = draw1 + draw2;

        if (Point == ComeOut) {
          System.out.println("You rolled a " + Point + ". You win!");
          ComeOut = Point;
        } else if (Point == 7) {
          System.out.println("You rolled a 7. Craps. You lose");
          ComeOut = Point;
        } else {
          System.out.println("You rolled a " + Point + ".");
        }
      }
    }
  }
}
