package AbstractAndConcreteClass;

public class BuilderPatternDemo {
	   public static void main(String[] args) {
	   
	      MealBuilder mealBuilder = new MealBuilder();

	      Meal Meals = mealBuilder.prepareMealPersonA ();
	      System.out.println(" Meal");
	     Meals.showItems();
	      System.out.println("Total Cost: " + Meals.getCost());

	      
	   }
	}