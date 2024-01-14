public class App {
    public static void main(String[] args) throws Exception {
        int value = 5;
        int factorial = 1;
        while (value > 1){
            factorial *= value; // factorial = factorial * value
            value--;
        }
        System.out.println(factorial); // output -> 120

        int d = 0;
        int t = 8;
        System.out.println("Multiplication table of 8");
        while (d < 10) {
            d++;
            System.out.printf("%d x %d = %d%n%n", t, d, d * t); 
            // output -> 1 x 8 = 8 \n 2 x 8 = 16 ...
        }

        int tFor = 5;
        System.out.println("Multiplication table of 5");
        for (int i = 1; i < 10; i++){
            System.out.printf("%n%d x %d = %d%n", tFor, i, i * tFor);
        }
    }
}
