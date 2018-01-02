import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] arg) {
        try (Scanner in = new Scanner(System.in)) {
            String exit = "no";
            String choose = "no";
            Calculator calculator = new Calculator();
            while (!exit.equals("yes")) {
                if (choose.equals("no"))
                    calculator.cleanResult();
                if (choose.equals("yes")) {
                    String first = Integer.toString(calculator.getResult());
                    calculator.cleanResult();
                    System.out.println("Please enter second numb" + first);
                    String second = in.next();
                    calculator.add(Integer.valueOf(first), Integer.valueOf(second));
                    System.out.println("Result - " + calculator.getResult());
                    System.out.println("Exit - yes/no");
                    exit = in.next();
                } else {
                    System.out.println("Please enter first namb");
                    String first = in.next();
                    System.out.println("Please enter second namb");
                    String second = in.next();
                    calculator.add(Integer.valueOf(first), Integer.valueOf(second));
                    System.out.println("Result- " + calculator.getResult());
                    System.out.println("Exit - yes/no");
                    exit = in.next();
                }
                    if (exit.equals("no")) {
                        System.out.println("Do you wanna continue with last number?");
                        choose = in.next();
                    }

            }
        }
    }
}

