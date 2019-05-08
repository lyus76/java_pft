package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");

    Square s = new Square(5);
    System.out.println("Area of a square with the side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Area of a rectangle with the sides " + r.a + " and " + r.b + " = " + r.area());
  }

  public static void  hello(String somedody) {
    System.out.println("Hello, " + somedody + "!");
  }

}
