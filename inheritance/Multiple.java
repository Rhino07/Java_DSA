
public class Multiple {

    public static void main(String[] args) {

        Bear b = new Bear();
        b.eatFish();
        b.eatGrass();
    }
}

interface H {

    void eatGrass();

}

interface C {

    void eatFish();

}

class Bear implements H, C {

    public void eatFish() {
        System.out.println("Eats Fish");
    }

    public void eatGrass() {
        System.out.println("Eats Grass");

    }
}
