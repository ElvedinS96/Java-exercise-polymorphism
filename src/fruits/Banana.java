package fruits;

public class Banana extends Fruit {
    public Banana(){
        super(200);
    }
    public void peel (){
        System.out.println("Banana is peeled");
    }
    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made");

    }
}
