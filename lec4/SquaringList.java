public class SquaringList{
    public class IntList {
        public int item;
        public IntList tail;
        public IntList(int input_item, IntList input_tail) {
            item = input_item;
            this.tail = input_tail;
        }
    }

    /* Destructively squares each element of hte given IntList L.
        Don't use ' new '   modify the original IntList
        should be written iteratively*/
    public static IntList SquareDestructive(IntList L) {


    }

    public static IntList SquareNonDestructive(IntList L) {

    }


    public static void main(String[] args) {
        IntList L = new IntList(8, null);
        L = new IntList(9, L);
        L = new IntList(1, L);
        L = new IntList(3, L);
        L = new IntList(0, L);

        IntList run = L;
        while(run != null) {
           System.out.println(run.item);
           run = run.tail;
        }

    }
}