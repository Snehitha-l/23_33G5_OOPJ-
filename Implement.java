
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}

 class Implement {
    public static void main(String[] args)
   {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        System.out.println("Sum: " + sum);

        int difference = calc.subtract(10, 5);
        System.out.println("Difference: " + difference);

        int product = calc.multiply(10, 5);
        System.out.println("Product: " + product);

        double quotient = calc.divide(10, 5);
        System.out.println("Quotient: " + quotient);

        
    }
}


Output:
C:\Users\lakku\OneDrive\Documents\33g5>javac Implement.java

C:\Users\lakku\OneDrive\Documents\33g5>java Implement

Sum: 15
Difference: 5
Product: 50
Quotient: 2.0