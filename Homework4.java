public class Homework4 {
    public static void main(String[] args){
        int [][] arr = new int [4][4];
        for (int i=0;i < args.length; i++){
            for (int j = 0, j2 = arr[i].length; j < arr[i].length; j++, j2--) {
               if (i==j || i ==(j2 - 1)) arr[i][j] = 1;
               System.out.print(arr[i][j] + "");
            }



        }
    }

}
