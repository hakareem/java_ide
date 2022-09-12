import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Higher {
  public static void main(String[] args){
    int a = 25;
    int b = -25;
    int c = higher(a,b);
    
    System.out.println("The higher of 25 and -25 is " + c);
  }

  private static int higher(int x, int y) {
    if (x > y) {
      return x;
    } else {
      return y;
    }
  }
}

