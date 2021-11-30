import java.util.Arrays;

public class CountingSort {
    public int[] arr;

    public CountingSort(int[] arr){
        this.arr = arr;
    }

    public void sort(){
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);

        int[] countArray = new int[max - min + 1];

        for(int value : arr){
            countArray[value - min] ++;
        }

        int arrayIndex = 0;
        for(int i = 0; i < max - min + 1; i++){
            while(countArray[i] > 0){
                arr[arrayIndex] = i + min;
                countArray[i]--;
                arrayIndex++;
            }
        }

    }

    public static void main(String[] args){
        int[] arr = {9,-4,3,6,2,7,3,9,0,1,-7,9,1,4};
        new CountingSort(arr).sort();
        System.out.println(Arrays.toString(arr));
    }
}
