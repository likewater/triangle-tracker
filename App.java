import java.io.Console;

public class App {
  public static void main (String[] args) {
    Console myConsole = System.console();

    System.out.println("Create a triangle - enter side one length.");
    int one = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter side two length.");
    int two = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter side three length.");
    int three = Integer.parseInt(myConsole.readLine());
    Triangle firstTriangle = new Triangle(one, two, three);



  }
}
