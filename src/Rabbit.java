public class Rabbit extends Animal {
    @Override
    void voice() {
        System.out.println("Hz chto on govorit");
    }

    @Override
    void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Vnature,muzik");
        } else {
            System.out.println("Vo debil ");

        }
    }
}