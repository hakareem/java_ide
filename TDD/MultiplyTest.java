import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplyTest {
 @Test 
 public void multipleNums(){
  Multiply multiplier = new Multiply();
  int result = multiplier.multiplyNums(10,10);
  assertEquals(result, 100);
 }
}
