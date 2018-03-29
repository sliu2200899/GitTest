public class ClassNameHere {
   public static int max(int[] m) {
        int maxNum = 0;
        //int i = 0;
        for (int i=0; i<m.length; i++){
            while (maxNum < m[i]){
                maxNum = m[i];
            }
        }
       return maxNum;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.println(max(numbers));
   }
}