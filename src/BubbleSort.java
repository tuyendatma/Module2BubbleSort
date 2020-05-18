import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        boolean isSort =true;
        for (int i = 0; i <arr.length-1 && isSort ; i++) {
            isSort =false;
            for (int j =0; j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                    isSort =true;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {5,9,7,-2,6};
        bubbleSort(arr);
    }

}
