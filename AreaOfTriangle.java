public class AreaOfTriangle {
 public static void main(String[] args) {
  double area = extracted(55, 12);
  System.out.println(area);

  // casting to truncate result
  int value = (int) futureValueCalc(10000, 0.08, 20);
  System.out.println(value);
 }

 private static double extracted(int base, int height) {
  double area = (base / 2) * height;
  return area;
 }


 private static double futureValueCalc(double pmt, double i, int n) {
  double fv = pmt * (1 + i) * ((Math.pow(1 + i, n) - 1) / i);

  return fv;
 }
}
