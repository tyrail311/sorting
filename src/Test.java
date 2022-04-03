import java.util.Scanner;
public class Test {
    public static void main(String args[]) {

        Sorting test = new Sorting();
        int[] randomSorted = new int[1100];
        int[] almostSorted = new int[1100];
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        while (ans <= 4)
        {
            System.out.println("Please enter 1 to select the randomized array and 2 to choose the almost sorted array to sort");
            ans = scan.nextInt();
            if(ans == 1)
            {
                test.shuffleArray(randomSorted);
                test.printArray(randomSorted);
                System.out.println("Please enter the sorting algorithm you would like to use with the random array: \n" + "1. Selection Sort\n" + "2. Insertion Sort\n" + "3. Merge Sort\n" + "4. Quick Sort");
                ans = scan.nextInt();
                if(ans == 1) {
                    long startTime = System.nanoTime();
                    test.selectionSort(randomSorted);
                    long endTime = System.nanoTime();
                    long duration = (endTime-startTime);
                    System.out.println("Selection Sort took " + duration + " nanoseconds");
                    test.printArray(randomSorted);
                }
                else if(ans == 2) {
                    long startTime = System.nanoTime();
                    test.insertionSort(randomSorted);
                    long endTime = System.nanoTime();
                    long duration = (endTime-startTime);
                    System.out.println("Insertion Sort took " + duration + " nanoseconds");
                    test.printArray(randomSorted);
                }
                else if(ans == 3) {
                    long startTime = System.nanoTime();
                    test.mergeSort(randomSorted, 0, randomSorted.length-1);
                    long endTime = System.nanoTime();
                    long duration = (endTime-startTime);
                    System.out.println("Merge Sort took " + duration + " nanoseconds");
                    test.printArray(randomSorted);
                }
                else if(ans == 4) {
                    long startTime = System.nanoTime();
                    test.quickSort(randomSorted, 0, randomSorted.length-1);
                    long endTime = System.nanoTime();
                    long duration = (endTime-startTime);
                    System.out.println("Quick Sort took " + duration + " nanoseconds");
                    test.printArray(randomSorted);
            }
                else{
                    System.out.println("You are exiting the program, please run it again");

                }

            }
            else if(ans == 2)
            {
                test.almostSortedArray(almostSorted);
                test.printArray(almostSorted);
                System.out.println("Please enter the sorting algorithm you would like to use with the almost sorted array: \n" + "1. Selection Sort\n" + "2. Insertion Sort\n" + "3. Merge Sort\n" + "4. Quick Sort");
                ans = scan.nextInt();
                if(ans == 1) {
                    long startTime = System.nanoTime();
                    test.selectionSort(almostSorted);
                    long endTime = System.nanoTime();
                    long duration = (endTime-startTime);
                    System.out.println("Selection Sort took " + duration + " nanoseconds");
                    test.printArray(almostSorted);
                }
                else if(ans == 2) {
                    long startTime = System.nanoTime();
                    test.insertionSort(almostSorted);
                    long endTime = System.nanoTime();
                    long duration = (endTime-startTime);
                    System.out.println("Insertion Sort took " + duration + " nanoseconds");
                    test.printArray(almostSorted);
                }
                else if(ans == 3) {
                    long startTime = System.nanoTime();
                    test.mergeSort(almostSorted, 0, almostSorted.length - 1);
                    long endTime = System.nanoTime();
                    long duration = (endTime-startTime);
                    System.out.println("Merge Sort took " + duration + " nanoseconds");
                    test.printArray(almostSorted);
                }
                else if(ans == 4) {
                    long startTime = System.nanoTime();
                    test.quickSort(almostSorted, 0, almostSorted.length - 1);
                    long endTime = System.nanoTime();
                    long duration = (endTime-startTime);
                    System.out.println("Quick Sort took " + duration + " nanoseconds");
                    test.printArray(almostSorted);
                }
                else {
                System.out.println("You are exiting the program, please run it again");
                }
            }
            else
            {
                System.out.println("You are exiting the program, please run it again");
            }

        }
    }
}
