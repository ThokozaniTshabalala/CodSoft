import java.util.Random;
import java.util.Scanner;

public class RandomNumber {


    public static void main(String[] Args){
      Random rand= new Random();
      Scanner sc=new Scanner(System.in);

      int randomInt=rand.nextInt(101);
      int lives=3;
      int round=1;
        int score=0;

      while (lives>0){
      //ask for user input
          System.out.println("-----------------------------------------------------");
          System.out.println("Round: "+round+"     "+"Score: "+score);
        System.out.println("Enter your  guess for the generated number: ");
        int guess=sc.nextInt();

      if (guess>randomInt){
          System.out.println("too high");
          System.out.println("Score: "+score);

      }

      else if (guess<randomInt){
          System.out.println("too low");
          System.out.println("Score: "+score);
      }

      else if (guess==randomInt){
          System.out.println("Correct!!!");
          score++;
          round++;
      }
      lives--;

      }

      System.out.println("OUT OF LIVES, GAME OVER!!!!!");

    }
}
