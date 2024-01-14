public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vector1;
        int[] vector2 = new int[3];
        int[] vector3 = {1,2,3};
        vector3[1] = 10; // {10, 2, 3}


        int [] vector = {2, 4, 6};
        vector[2] = 10;

        int add = 0;
        // loop through all indices of the array
        for (int i = 0; i < vector.length; i++){ // i++ 3x
            // accessing current position
            add += vector[i];
        }
        System.out.println(add);

        // loop for-each
        int[] vector4 = {100, 200, 300, 400};
        int i = 0;
        for (int item : vector4){
            i += item; // i = 0 + 100 --> 100 + 300 ...
            System.out.println(i); 
        }

        System.out.println("\n");
        // break and continue
        for (int b = 0; b < 10; b++){
            if(b == 7){
                break;
            }
            System.out.format("%d, ", b); // output -> 1, 2, 3, 4, 5, 6
        }

        System.out.println("\n");
        for (int c = 0; c < 10; c++){
            if(c == 7){ // next iteration (not counting the condition value)
                continue; // output -> 1, 2, 3, 4, 5, 6, 8, 9
            }
            System.out.format("%d, ", c);

        }
    }
}
