import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyMap<String, Integer> myMap = new MyMap<>();

        System.out.println("========================================");
        System.out.println("Enter two numbers");
        System.out.println("========================================");
        System.out.print("First: ");
        double num1 = scan.nextDouble();
        System.out.print("Second: ");
        double num2 = scan.nextDouble();
        Arithmetic<Double, Double> arithmetic = new Arithmetic<>(num1, num2);

        while (true) {
            System.out.println("========================================");
            System.out.println("Menu:");
            System.out.println("========================================");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Get Minimum");
            System.out.println("6. Get Maximum");
            System.out.println("========================================");
            System.out.println("7. Add to MyMap");
            System.out.println("8. Get from MyMap");
            System.out.println("9. Remove from MyMap");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            int op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Sum: " + arithmetic.add());
                    System.out.println("========================================");
                    break;
                case 2:
                    System.out.println("Difference: " + arithmetic.subtract());
                    System.out.println("========================================");
                    break;
                case 3:
                    System.out.println("Product: " + arithmetic.multiply());
                    System.out.println("========================================");
                    break;
                case 4:
                    try {
                        System.out.println("Quotient: " + arithmetic.divide());
                        System.out.println("========================================");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Minimum: " + arithmetic.getMin());
                    System.out.println("========================================");
                    break;
                case 6:
                    System.out.println("Maximum: " + arithmetic.getMax());
                    System.out.println("========================================");
                    break;
                case 7:
                    System.out.print("Enter key: ");
                    String key = scan.next();
                    System.out.print("Enter value: ");
                    int value = scan.nextInt();
                    myMap.put(key, value);
                    System.out.println("========================================");
                    break;
                case 8:
                    System.out.print("Enter key to get value: ");
                    String getKey = scan.next();
                    System.out.println("Value: " + myMap.get(getKey));
                    System.out.println("========================================");
                    break;
                case 9:
                    System.out.print("Enter key to remove: ");
                    String removeKey = scan.next();
                    System.out.println("Removed value: " + myMap.remove(removeKey));
                    System.out.println("========================================");
                    break;
                case 0:
                    System.out.println("Exit success");
                    System.out.println("========================================");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid");
                    System.out.println("========================================");
                    break;
            }
        }
    }
}
