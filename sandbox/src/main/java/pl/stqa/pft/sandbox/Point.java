package pl.stqa.pft.sandbox;

public class Point {

  public double a;
  public double b;

public Point (double a, double b){

  this.a = a;
  this.b = b;

}

  public double hypotenuse(){

    double c =  (this.a* this.a) + (this.b* this.b);
    c = Math.sqrt(c);
    return c;
  }

}
