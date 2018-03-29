/** Defines a recursive list of integers.
 *  @author Josh Hug
 */

public class intList {
    public int head;
    public intList tail;

    public intList(int h, intList t) {
        head = h;
        tail = t;
    }

    /** Retuns the size of this intList */
    public int size() {
        if (tail == null) {
            return 1;
        }
        return 1 + tail.size();
    }

    /** Returns the size of this intList. */
    public int iterativeSize() {
        intList p = this;
        int size = 0;
        while (p != null) {
            size += 1;
            p = p.tail;
        }
        return size;
    }

    /** In class exercise 1:
      * Returns ith item of this intList. For
      * simplicity, assume the item exists. */
    public int get(int i) {
        return 0;
        /** your code here */
    }

    public String toString() {
        if (tail == null)
            return Integer.toString(head);
        return Integer.toString(head) + " " + tail.toString();
    }

    /** Returns an intList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static intList incrList(intList L, int x) {
        /* Your code here. */
        if (L == null) {
            return null;
        }

        /* you can do the two lines on one line, but I've opted for two lines
        for maximum pegagogical clarity*/
        intList incrementedList = new intList(L.head + x, null);
        incrementedList.tail = incrList(L.tail, x);

        return incrementedList;
    }

    /** Returns an intList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static intList dincrList(intList L, int x) {
        /* Your code here. */
        if (L == null) {
            return null;
        }

        L.head += x;
        dincrList(L.tail, x);
        return L;
    }

    public static void main(String[] args) {
        intList L = new intList(5, null);
        L.tail = new intList(7, null);
        L.tail.tail = new intList(9, null);

        //System.out.println(L.size());
        //System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or use the Visualizer.
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));
        intList q = dincrList(L, 2);
        while(q != null) {
            System.out.println(q.head);
            q = q.tail;
        }
    }
}