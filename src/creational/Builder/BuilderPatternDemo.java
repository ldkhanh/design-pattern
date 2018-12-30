package creational.Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuider mealBuider = new MealBuider();

        Meal vegMeal = mealBuider.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println(" Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuider.prepareNonVegMeal();
        System.out.println("\n\n Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println(" Total Cost: " + nonVegMeal.getCost());
    }
}
