import java.util.*;

public class ArrayMethods {
 public static void main(String[] args) {

  // loop over an arr and return each val
  String[] arr = {"Run", "Walk", "Crawl", "Jump"};

  for(String x : arr){
   System.out.println(x);
  }

  // return a list of nums
  Number[] nums = {5,10,15,20};
  System.out.println(Arrays.asList(nums));
  
  // adding to a list of nums
  ArrayList<Number> list = new ArrayList<>(Arrays.asList(20,40,60));
  list.add(80);
  list.add(100);
  System.out.println(list);
 }
}
