package pizzarestaurant;

import java.util.*;

public class Margherita extends Pizza {
	
	public Margherita() {
		this.setName("Margherita");
		this.setPrice(7.5);
		List<String> ingredients = new ArrayList <> () ; 
		ingredients.add("Pomodoro");
		ingredients.add("Bufala");
		ingredients.add("Basilico");
		this.setIngredients(ingredients);
		
	}
	

}
