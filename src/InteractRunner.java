import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter frst arg");
                String frst = reader.next();
                System.out.println("Enter scnd arg");
                String scnd = reader.next();
                calc.add(Integer.valueOf(frst), Integer.valueOf(scnd));
                System.out.println("Result: " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit: yes/no");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}
