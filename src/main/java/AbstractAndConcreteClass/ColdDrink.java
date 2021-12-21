package AbstractAndConcreteClass;

import Items.Item;
import Packings.Packing;
import ServiceClass.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}