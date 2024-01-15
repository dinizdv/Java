public class App {
    public static void main(String[] args) throws Exception {
        // mean
        int[] list1 = {10, 20, 30, 40, 50};
        int total = 0;
        for (int c = 0; c < list1.length; c++){
            total += list1[c];
        }
        int mean = total / list1.length;
        System.out.println("The mean is: " + mean);

        // mode
        int maximumFrequency = 0;
        int mostFrequenteValue = 0;
        int[] list = {10, 20, 20, 30, 40, 40, 40, 50};
        for (int c = 0; c < list.length; c++){
            int currentValue = list[c]; 
            int currentFrequency = 1; // number of times it appears
            // n = c + i -> loop through the array starting from the next element
            for (int n = c + 1; n < list.length; n++){
                if(list[n] == currentValue){ // if the next index is the same as the previous one  [0] == [1] ... [1] == [2]
                    currentFrequency++; // increase frequency by 1
                }
            }
            if (currentFrequency > maximumFrequency){
                maximumFrequency = currentFrequency;
                mostFrequenteValue = currentValue; // ex: if maximumFrequency is number 10 [4 times], it becomes the current number
            }
        }

        System.out.println("The mode is: " + mostFrequenteValue);


        // median
        // if (par) == length (two central numbers)
        // if (impar) == length (central number)
        
        int[] numbers = {10, 20, 30 , 60, 40, 50, 80, 100, 120};
        int middleIndex = numbers.length / 2; // central index
        System.out.println("Numbers: ");

        for (int p = 0; p < numbers.length; p++){
            int currentIndex = numbers[p]; // current index
            System.out.print(currentIndex + " ");
        }   
        System.out.println("\n");

            if (numbers.length % 2 == 0){ // if it is even
                // index - 1 + index
                int previousIndex = numbers[middleIndex - 1];
                int medianOdd = (previousIndex + numbers[middleIndex]) / 2;
                System.out.format("Odd list.\nCentral numbers: %d + %d = %d\nMedian = %d", previousIndex, numbers[middleIndex], (previousIndex + numbers[middleIndex]), medianOdd);
            } else {
                System.out.format("Even list.\nCentral number: %d\nMedian: %d", numbers[middleIndex], numbers[middleIndex]);
            }
        
    }

}
