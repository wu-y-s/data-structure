package sort.insertsort;


//插入排序
public class InsertSort {

    public static void insertSort(int[] arr) {
        int temp;
        //将arr[]按升序排列
        for (int i = 1; i < arr.length; i++) {
            //将arr[i]插入到a[i-1]，a[i-2]，a[i-3]……之中
            for (int j = i; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 5, 2, 7, 9, 8, 1};
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
