public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series up to 100:");
        
        int num1 = 0, num2 = 1;
        
        if (num1 <= 100) {
            System.out.print(num1 + " ");
        }
        
        while (num2 <= 100) {
            System.out.print(num2 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
        
        System.out.println();

    }
}