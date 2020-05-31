package fruits;

public class Apple extends Fruit {
    public Apple (){
        setCalories(134);
    }
    public void removeSeeds(){
        System.out.println("Apple seeds are removed");

    }
    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");

    }

}
