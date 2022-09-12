public class JavaBuzz {
 public static void main(String[] args) {
  for (int i = 1; i <= 100; i++){
   if (i % 15 == 0) {
    System.out.println("JavaBuzz");
   } else if (i % 5 == 0) {
    System.out.println("Buzz");
   } else if (i % 3 == 0) {
    System.out.println("Java");
   } else {
    System.out.println(i);
   }
  }
 }
}

// RETURN "Java" if num is divisible by 3
// RETURN "Buzz" if num is divisible by 5
// RETURN "JavaBuzz" if num is divisible by both 5 & 3
