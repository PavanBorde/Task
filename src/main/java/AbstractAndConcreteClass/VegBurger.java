package AbstractAndConcreteClass;

public class VegBurger extends Burger {

	   @Override
	   public float price() {
	      return 78.0f;
	   }

	   @Override
	   public String name() {
	      return "Veg Burger";
	   }
	}