package fruits;

public class Fruit {
    private double calories;
    public Fruit(double calories){
        this.calories=calories;
    }
    public void makeJuice (){
        System.out.println("Juice is made");
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
