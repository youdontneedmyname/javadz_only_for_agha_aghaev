package dz4;
import java.util.Random;

public class Main {
   public static void main(String[] args) {
     int min = 20;
      int max = 150;
    int randomNumber = (int) (Math.random() * (max - min + 1)) + min;

      System.out.println("sluchaynoye chislo " + randomNumber);
    }
}

