public class SList {

    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode front;

    public SList(int x) {
        front = new IntNode(x, null);
    }

    public void insertFront(int x) {
        IntNode oldFront = front;
        front = new IntNode(x, oldFront);
    }

    public int getFront() {
        return front.item;
    }

    public void insertBack(int x) {
        IntNode p = front;

        /* Advance p to the end of the list*/
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    /* when working with naked recursive data structure
        we usually create a private helper method that deals
        with them directly*/

   private static int  intNodeSize(IntNode n) {
        if (n.next == null) {
            return 1;
        }
        return 1+ intNodeSize(n.next);
    }

    public int size() {
        return intNodeSize(front);
    }

    public static void main(String[] args) {
        SList s1 = new SList(10);
        s1.insertFront(5);
        s1.insertFront(0);
        s1.insertFront(15);
        //System.out.println(s1.getFront());
    }
}
