package AbstractAndConcreteClass;

import Items.Item;
import Packings.Packing;
import ServiceClass.Wrapper;

public abstract class Burger implements Item {

	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
	}