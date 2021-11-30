import java.util.Arrays;

public class RadixSort {

    public int[] arr;

    public RadixSort(int[] arr){
        this.arr = arr;
    }
    public void countingSort(int exponent){

        int[] countArray = new int[10];

        for(int value : arr){
            countArray[(value / exponent) % 10]++;
        }

        for(int i = 1; i < 10; i++){

            countArray[i] += countArray[i - 1];
        }

        int[] sortedArray = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            int current = arr[i];
            int position = countArray[(current / exponent) % 10] - 1;
            sortedArray[position] = current;
            countArray[(current/exponent) % 10]--;
        }

        System.arraycopy(sortedArray, 0, arr, 0, arr.length);

    }

    public void sort(){
        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);

        for(int exponent = 1; max/exponent > 0; exponent *= 10){
            countingSort(exponent);
        }
    }

    public static void main(String[] args){
        int[] arr = {1231, 3242, 6456, 9853, 2347};
        new RadixSort(arr).sort();
        System.out.println(Arrays.toString(arr));
    }


}
