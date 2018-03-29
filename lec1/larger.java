public class larger{
    /* the equivalent of def in java is public static

    * Functions need declared types as well,
    * It determines what type the function returns.
    * Functions can only lsdjfajdfal return one thing.
    * must declare types of the parameters.
    */
    public static int larger(int x, int y){
        if (x>y){
            return x;
        }
        return y;

    }

    public static void main(String[] args){
        System.out.println(larger(5,10));

    }

}