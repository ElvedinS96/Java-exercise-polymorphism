package fruits;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.makeJuice();
        apple=new Banana();
        apple.makeJuice();
        ((Banana) apple).peel();

    }
}
