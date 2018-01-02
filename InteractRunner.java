import java.util.Scanner;

public class InteractRunner {
    public static void main (String [] arg) {
       try (Scanner in = new Scanner(System.in)) {
        String exit = "no";
        while (!exit.equals("yes")) {
            Calculator calculator = new Calculator();
            System.out.println("Please enter first namb");
            String first = in.next();
            System.out.println("Please enter secon namb");
            String second = in.next();
            calculator.add(Integer.valueOf(first), Integer.valueOf(second));
            System.out.println("Result- " + calculator.getResult());
            calculator.cleanResult();
            System.out.println("Exit - yes/no");
            exit = in.next();
        }
    }
    }
}

