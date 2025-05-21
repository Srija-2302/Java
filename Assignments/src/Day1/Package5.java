package Day1;

interface Edible {
    void eat();
}

interface Juicy {
    void juice();
}

class Peelable {
    void peel() {
        System.out.println("Peeling the fruit");
    }
}

class Fruit extends Peelable implements Edible, Juicy {
    public void eat() {
        System.out.println("Eating the fruit");
    }

    public void juice() {
        System.out.println("Extracting juice from the fruit");
    }
}

class TropicalFruit extends Fruit {
    void coolEffect() {
        System.out.println("This fruit cools your body!");
    }
}

public class Package5 {
    public static void main(String[] args) {
        TropicalFruit tf = new TropicalFruit();
        tf.eat();
        tf.juice();
        tf.peel();
        tf.coolEffect();
    }
}
