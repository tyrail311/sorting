import java.util.Random;
public class Sorting {
    public void selectionSort(int[] array)
    {
        int length = array.length;
        for (int i = 0; i < length-1; i++)
        {
            int min = i;
            for (int j = i+1; j < length; j++)
                if (array[j] < array[min])
                    min = j;
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public void insertionSort(int[] array)
    {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int marker = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > marker) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = marker;
        }
    }

    void merge(int[] array, int l, int m, int r)
    {
        int leftSize = m - l + 1, rightSize = r - m;
        int[] left= new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < leftSize; i++)
            left[i] = array[l + i];
        for (int j = 0; j < rightSize ; j++)
            right[j] = array[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            }
            else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
    public void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void quickSwap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                quickSwap(arr, i, j);
            }
        }
        quickSwap(arr, i + 1, high);
        return (i + 1);
    }

    public void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    public void printArray(int[] array)
    {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    public void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < 1100; i++) {
            int number = rand.nextInt(1000);
            array[i] = number;
        }
    }
    public void almostSortedArray(int[] array)
    {
        Random rand = new Random();
        int random = rand.nextInt(1000);

        for (int i = 0; i<1100; i++)
        {
            int number = i;
            array[i] = number;
        }
        int temp = array[random];
        array[random] = array[random-1];
        array[random-1] = temp;
    }
}

