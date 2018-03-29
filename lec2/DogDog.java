public class DogDog{
    String name;

    public static void main(String[] args){
        // create Dog
        DogDog dog1 = new DogDog();
        dog1.bark();
        dog1.name = "Bart";

        // create the Dog[]
         DogDog[] myDogs = new DogDog[3];

         myDogs[0] = new DogDog();
         myDogs[1] = new DogDog();
         myDogs[2] = dog1;

         myDogs[0].name = "Fred";
         myDogs[1].name = "Marge";

         System.out.println("last dog's name is ");
         System.out.println(myDogs[2].name);

         int x = 0;
         while(x < myDogs.length) {
            myDogs[x].bark();
            x =x+1;
         }

    }
    public void bark(){
        System.out.println(name + " Says Ruff!");
    }
}