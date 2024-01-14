public class App {
    public static void main(String[] args) throws Exception {
        // relacional operators
        // > >= < <= == !=

        // conditional operator
        int v1 = 10;
        int v2 = 0;
        int r = v2 > 0 ? v1 / v2 : 0;
        System.out.format("The result is: %d%n%n", r);

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int t = 3;

        if (t == a) {
            System.out.println(a + " + " + a + " + " + a + " = " + (a+a+a)); 
        } else if (t == b) {
            System.out.println(b + " + " + b + " + " + b + " = " + (b+b+b)); 
        } else if (t == c) {
            String cVerification = c > 1 ? c + " + " + c + " + " + c + " = " + (c+c+c) : "Your value is incorrect.";  
            System.out.println(cVerification);
        } else if (t == d) {
            if (t > 1) {
            System.out.println(d + " + " + d + " + " + d + " = " + (d+d+d)); 
            } else {
                System.out.println("Invalid expression.");
            }
        } else {
            System.out.println("Incorrect value.");
        }

        // boolean examples
        // & (and)
        // | (or) 
        // ^ (just once correct value)
        //  ! (negation)

        boolean b1 = true;
        boolean b2 = false;

        System.out.printf("b1 & b2 --> %b & %b = %b%n", b1, b2, b1 & b2);
        System.out.printf("b1 | b2 --> %b | %b = %b%n", b1, b2, b1 | b2);
        System.out.printf("b1 ^ b2 --> %b ^ %b = %b%n", b1, b2, b1 ^ b2);
        System.out.printf("!b1 --> %b = %b%n", b1, !b1);

    }
}
