public class dog{
    /* size of the dog in standard size units */
    public int size;

    /* this is a constructor */
    public dog(int s){
        size = s;
    }

    public void makeNoise(){
        if (size < 20) {
            System.out.println("hideous yapping");
        } else if (size < 50){
            System.out.println("bark!");
        } else {
            System.out.println("Bark!");
        }
    }
}