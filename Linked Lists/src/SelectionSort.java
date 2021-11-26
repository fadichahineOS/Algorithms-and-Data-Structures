import java.util.Arrays;

public class SelectionSort {

    static int[] sort(int[] unsorted){
        for(int i = 0; i < unsorted.length - 1; i++){
            int minElementIndex = i;
            for(int j = i; j < unsorted.length; j++){
                if (unsorted[minElementIndex] > unsorted[j]){
                    minElementIndex = j;
                }
            }

            int temp = unsorted[minElementIndex];
            unsorted[minElementIndex] = unsorted[i];
            unsorted[i] = temp;
        }

        return unsorted;
    }



    public static void main(String[] args){

        int[] unsorted = {10,1,5,3,6,4,8};

        int[] sorted = sort(unsorted);

        System.out.println(Arrays.toString(sorted));


    }
}
