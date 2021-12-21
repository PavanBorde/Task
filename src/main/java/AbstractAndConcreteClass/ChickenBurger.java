package AbstractAndConcreteClass;

public class ChickenBurger extends Burger {

	   @Override
	   public float price() {
	      return 88.0f;
	   }

	   @Override
	   public String name() {
	      return "Chicken Burger";
	   }
	}