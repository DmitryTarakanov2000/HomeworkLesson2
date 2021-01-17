public class Homework1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 1;
        arr[8] = 0;
        arr[9] = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + "");
        }
    }




}
