package Sorting;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args)
    {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble (int[] arr){
        boolean swapped;
        for(int k=0;k<arr.length;k++){

        swapped = false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr.length-i-1;j++){
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
            }
          if(!swapped){
            break;
          }
        }
      }
    }
}
