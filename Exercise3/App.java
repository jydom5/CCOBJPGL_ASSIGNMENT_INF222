public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Mypet Pet = new Mypet();

        Pet.meow();
        System.out.println(Pet.eyeColor);
        System.out.println(Pet.height);
    }
}