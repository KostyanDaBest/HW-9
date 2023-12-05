public class Tiger extends Animal {
    @Override
    void voice() {
        System.out.println("HRRRR");
    }

    @Override
    void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Vnature,muzik!");
        } else {
            System.out.println("Vo debil ");

        }
    }
}
