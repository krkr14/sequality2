/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Calculate calc = new Calculate();
        System.out.printf("Sum of %d and %d is %d. Average is %.1f\n", 2, 3, calc.sum(2,3), calc.ave(2,3));
        System.out.printf("Sum of %d and %d is %d. Average is %.1f\n", 1, 10, calc.sumArray(10,1), calc.aveArray(10,1));
        System.out.printf("Sum of odd of %d to %d is %d. Sum of even is %d\n", 1, 10, calc.sumOdd(1,10), calc.sumEven(1,10));
    }
}
