public class Run  {
    public static void main(String[] args) {
        Dog dog=Dog.thatDog();
        dog.voice();
        dog.eat("Govno");
        Rabbit rabbit = new Rabbit();
        rabbit.eat("Grass");
        rabbit.voice();
        Tiger tiger = new Tiger();
        tiger.eat("Rabbit");
        tiger.voice();
    }
}