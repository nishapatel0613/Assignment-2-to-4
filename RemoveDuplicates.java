import java.util.Arrays;

/*
public class RemoveDuplicates {
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int j = 0;
        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }

    public static void main (String[] args) {
        int arr[] = {2,2,3,3,4,4,4,11,11,11,11};

        int length = arr.length;
        length = removeDuplicateElements(arr, length);

        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
}
*/
