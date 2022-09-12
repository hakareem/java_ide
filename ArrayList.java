import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<String>();

    names.add("Kyle");
    names.add("Sophie");
    names.add("Graeme");

    String nameToFind = "Who?";

    App app = new App();
    
    // returns a true / false
    boolean result = app.isInArray(names, nameToFind);

    if (result) {
      System.out.println("The name is in the array. Yay!");
    } else {
      System.out.println("The name couldn't be found in the array — sorry...");
    }
  }

    // helper method to check contents in an array
    public boolean isInArray(ArrayList<String> names, String nameToFind) {
    for (String name : names) {
      if (name == nameToFind) {
        return true;
      }
    }
    return false;
  } 
}