public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int number = 50;
        number = 50;

        // equals 'const' in JS 
        final int numbers = 500;

        // data types: byte, short, int, long
        // -128 <--> 127
        System.out.println("Byte: " + Byte.MIN_VALUE + " <--> " + Byte.MAX_VALUE);

        // -32768 <--> 32767
        System.out.println("Short: " + Short.MIN_VALUE + " <--> " + Short.MAX_VALUE);
        // -2147483648 <--> 2147483647
        System.out.println("Interger: " + Integer.MIN_VALUE + " <--> " + Integer.MAX_VALUE); 
        
        // -9223372036854775808 <--> 9223372036854775807
        System.out.println("Long: " + Long.MIN_VALUE + " <--> " + Long.MAX_VALUE); 

        // when a number is greater than type 'int'
        long population = 6000000000L;
        System.out.println(population);

        // floating point
        float f1 = 75.38f; // 'f' in final 
        double d1 = 89.24;
        char letter = 'B';
        char letterAccent = '\u00DA'; // output -> ú
        System.out.println(letterAccent);
        boolean discount = true; // two values -> true or false

        // prefix and postfix operators
        int v1 = 10;
        // postfix
        System.out.println(v1++); // output -> 10
        // prefix
        System.out.println(++v1); // output - 12

        int v2 = 30;
        // prefix
        System.out.println(++v2); // output -> 31
        // postfix
        System.out.println(v2++); // output -> 31
        System.out.println(v2); // output -> 32

        // compound operators
        int v3 = 15;
        v3 += v3; // output -> 30 (15 + 15)

        // order = postfix, prefix, multiplication(* / %), subtraction

        float A = 12;
        float B = 9;
        float C = 6;
        float D = 3;

        float q1 = A + B / C;
        float q2 = (A + B) / C;
        float q3 = A / C * D + B;
        float q4 = A / (C * (D + B));

        System.out.println("q1: " + q1); // output -> 13.5
        System.out.println("q2: " + q2); // output -> 3.5
        System.out.println("q3: " + q3); // output -> 15.0
        System.out.println("q4: " + q4); // output -> 0.16666667
    }
}
