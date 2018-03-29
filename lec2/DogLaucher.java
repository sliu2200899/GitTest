public class DogLaucher{
    public static void main(String[] args)
    {
        Dog maya = new Dog(30);
        Dog tiny = new Dog(5);

        Dog larger = Dog.maxDog(maya, tiny);
        larger.makeNoise();
    }
}