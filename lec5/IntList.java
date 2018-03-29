public class IntList{
    public int item;
    public IntList tail;

    public IntList(int input_item, IntList input_tail) {
        item = input_item;
        tail = input_tail;
    }


    /* Destructively squares each element of hte given IntList L.
        Don't use ' new '   modify the original IntList
        should be written iteratively*/
    public static IntList SquareDestructive(IntList L) {
        IntList runner = L;

        while(runner != null) {
            runner.item += 1;
            runner = runner.tail;
        }
        return L;

    }

    /* Non-destructively squares each element of the given IntList L
        Don't modify the given IntList
        should be written recursively*/
    /* my own implementation*/
    /*
    public static IntList SquareNonDestructive(IntList L) {

        if (L.tail != null) {
             IntList Q = new IntList(L.item+2, SquareNonDestructive(L.tail));
        }
        else {
              IntList Q = new IntList(L.item+2, null);
        }
        //System.out.println(L.item);
        return Q;
    }
    */
    /*professor implementation*/

    public static IntList SquareNonDestructive(IntList L) {
        /* check the argument first*/
        if (L == null) {
            return L;
        }
        else {
        /* move the pointer to the end of the list*/
            IntList tail = SquareNonDestructive(L.tail);
            IntList M = new IntList(L.item + 2, tail);
            return M;
        }
}



    public static void main(String[] args) {
        IntList L = new IntList(8, null);
        L = new IntList(9, L);
        L = new IntList(1, L);

        IntList run = L;
        while(run != null) {
           System.out.println(run.item);
           run = run.tail;
        }

        //L = SquareDestructive(L);
        IntList L1= SquareNonDestructive(L);

        run = L1;
        while(run != null) {
           System.out.println(run.item);
           run = run.tail;
        }

    }
}