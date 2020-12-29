public class test {
    public static void t(String x) {
        x = "b";
    }

    public static void arr(int[] arr) {
        int[] x = {1, 2, 3, 4, 5};
        for (int i = 0; i < x.length; i++) {
            arr[i] = x[i];
        }
    }

    public static void main(String[] args) {
        String x = "a";
        int[] arr = {5, 4, 3, 2, 1};
        t(x);
        System.out.println(x);
        arr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
