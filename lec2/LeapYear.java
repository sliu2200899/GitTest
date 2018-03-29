import java.util.*;

public class LeapYear{
    public static void main(String[] args){
        int year = 2000;
        Scanner in = new Scanner(System.in);
        System.out.println("please input a int number");
        int a=in.nextInt(); //接收int型数据
        //System.out.println(a);

       /* this is the process of judging whether a year is a leap year
        *  a % 400 == 0 or ((a % 4 == 0) && (a % 100 != 0))  -> leap year
        *  otherwise, it is not a leap year!  */
        if (a % 400 == 0){
            System.out.println(a + " is a leap year!");
        } else if ((a % 4 == 0) && (a % 100 != 0)){
            System.out.println(a + " is a leap year!");
        } else {
            System.out.println(a + " is not a leap year!");
        }
    }
}