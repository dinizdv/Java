public class App {
    public static void main(String[] args) throws Exception {
        // implicit conversion (compiler does)
        int v1 = 10;
        long v2 = v1;
        System.out.println(v2);

        byte v3 = 5;
        short v4 = 6;
        int v5 = 23999;
        long v6 = 3900000;

        long r1 = v3 + v4 + v5 + v6; // 'int' cannot be used
        System.out.println(r1);

        float f1 = 32.40f;
        double d1 = 52.00;

        float r2 = f1 * f1;
        System.out.println(r2);

        double r3 = f1 * d1;
        System.out.println(r3);

        double r4 = f1 + d1 + v6; // the type must be the one with the highest value in the expression
        System.out.println(r4);

        /* ---------------------------------------------------------------------------------------- */

        // explicit converstion (programmer does)
        long vLong = 5540;
        short explicit = (short)vLong;  // convert vLong in 'short' type
        System.out.println(explicit); // output -> 5540 (normal)

        long v2Long = 78500;
        short explicit2 = (short)v2Long;
        System.out.println(explicit2); // output -> 12964 (loss of value)
    }
}
