package AbstractAndConcreteClass;

import Persons.PersonA;

public class MealBuilder {

	public Meal prepareMealPersonA (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      meal.addItem(new VegBurger());
	      
	      return meal;
	   }   
	   
	}

