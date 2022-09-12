import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {
  // colours in terminal
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static void main (String[] args){
    LocalTime time = LocalTime.now(); // current time
    DateTimeFormatter format_t = DateTimeFormatter.ofPattern("HH:mm"); // format to extract 
    String t = time.format(format_t); 

    System.out.println("The current " + ANSI_RED  + "time " + ANSI_RESET + "is " + t);
    }
}
