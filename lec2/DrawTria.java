public class DrawTria{
    public static void process(int lineNum){
        int s = 1;

        while (s <= lineNum) {
            for (int i=1; i <= s; i++){
                System.out.print('*');
            }
            System.out.println(' ');
            s += 1;
        }
    }

    public static void main(String[] args){
        process(10);
    }
}