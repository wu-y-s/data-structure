package sort.searchsort;


//选择排序
public class SearchSort {

    public static void searchSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-2; i++) {
            int x = i;
            temp = arr[i];
            for (int j = i+1;j<arr.length;j++){
             if(temp>arr[j]){
                 temp = arr[j];
                 x=j;
             }
            }
            arr[x]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 5, 2, 7, 9, 8, 1};
        searchSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
