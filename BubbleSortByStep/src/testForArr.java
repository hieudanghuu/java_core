import java.util.Arrays;
public class testForArr {
    public static void main(String[] args) {
        int[] arr = {6,7,4,3,8,0,6,4,7,56,4,6,7,8,66,22};
        for (int j = 0 ; j < arr.length- 1;j++){
            for (int i = j + 1 ; i < arr.length - 1; i ++){
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[j] = arr[i] ;
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
