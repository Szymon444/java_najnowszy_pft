package pl.stqa.pft.sandbox;

public class Cwiczenie {

  public static void main(String[] args) {

   double x = 3;
   double y = 4;

    System.out.println(hypno(x, y));


  }


  public static double hypno(double a, double b) {

    a = Math.pow(a, 2);
    b = Math.pow(b, 2);
    double c = a + b;
    c = Math.sqrt(c);

    return c;

  }

}
