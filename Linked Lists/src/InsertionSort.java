import java.util.Arrays;

public class InsertionSort {


    static int[] sort(int[] unsorted){

        for(int i = 1; i < unsorted.length; i++){
            int current = unsorted[i];
            int j = i -1;
            while(j >= 0 && unsorted[j] > current){
                unsorted[j+1] = unsorted[j];
                j--;
            }
            unsorted[j + 1] = current;
        }

        return unsorted;
    }

    public static void main(String[] args){

        int[] unsorted = {8,4,9,5,10,6};

        int[] sorted = sort(unsorted);

        System.out.println(Arrays.toString(sorted));




    }
}
