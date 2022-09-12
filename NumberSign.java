import java.util.Random;

public class App {
  public static void main(String[] args) {

    // generate a random num
    Integer minimum = -100;
    int maximum = 100;
    Random rand = new Random();
    int randomNum = minimum + rand.nextInt((maximum - minimum) + 1);

    App app = new App();

    // returning the number sign
    String sign = app.getNumberSign(randomNum);

    System.out.printf("The sign of the number %d is: %s \n", randomNum, sign);
  }

  // checking the number passed in and returning a string to represent the value
  public String getNumberSign(int number) {
    if (number < 0) {
      return "negative";
    } else if (number > 0) {
      return "positive";
    } else {
      return "zero";
    }
  }
}