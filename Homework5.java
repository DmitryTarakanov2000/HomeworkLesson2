public class Homework5 {
    public static void main(String[] args){
        int[] arr = new int [10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 6;
        arr[7] = 7;
        arr[8] = 8;
        arr[9] = 9;
        int maloe = arr[0];
        int bolhoe = arr[0];
        int maloe1= 0;
        int bolhoe1=0;
        for(int i = 0; i < args.length; i++){
            if (arr[i] > bolhoe) {
                bolhoe = arr[i];
                bolhoe1 = i;
            }
            if (arr[i] < maloe) {
                maloe = arr[i];
                maloe1 = i;
            }



            }
        }


    }
}
