public class Dog{
    public int size;
    /* this is a constructor. It explains how to
     * construct dogs.
     * in this case, each dog must be created with an integer,
     * and it is used as the size
     *
     */

     public Dog(int startSize){
        size = startSize;
     }
     /* why did static go away? */

     public static Dog maxDog(Dog d1, Dog d2){
        if (d1.size > d2.size)
            return d1;
        return d2;
     }

     public Dog maxDogComparedToMe(Dog otherDog) {
        if (size > otherDog.size) {
            return this;
        }
        return otherDog;
     }


     public void makeNoise(){
        if (size < 10){
            System.out.println("horrific yappi");
        } else if(size < 30){
            System.out.println("bark.");
        } else {
            System.out.println("woof woofity");
        }
     }

}