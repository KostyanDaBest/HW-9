public  class Dog extends Animal {
    private Dog(){}
    public static Dog thatDog () {
        return  new Dog();
    }

    @Override
     void voice() {
        System.out.println("Gav");
    }

    @Override
     void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Vnature,muzik");
        } else {
            System.out.println("Vo debil ");

        }
    }
}