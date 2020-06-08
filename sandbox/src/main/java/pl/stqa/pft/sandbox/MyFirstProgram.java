package pl.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("world");
    hello("user");
    hello("Szymon");

    Square s = new Square(5); // dzieki konstruktorowi nie tworzyć atrybutów tylko można je przenieść
    System.out.println("Powieszchnia kwadratu o boku: " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Powieszchnia prostokąta o bokach: " + r.a + " i " + r.b + " = " + r.area());


    Point h = new Point();
    h.a = 4;
    h.b = 8;
    System.out.println("odległość między punktami: " + "a - " + h.a + " oraz " + "b - " + h.b + " = " + h.hypotenuse());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}