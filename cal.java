import java.util.scanner


public class Cal{
	 public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
	       system.out.println("Enter the two number");
	       System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;

        double sub = num1 - num2;
        System.out.println("The sum is: " + sum);
	system.out.println("The sub is: " + sub);
	double product = num1 * num2;
        
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        
        scanner.close();
    }
}

         
