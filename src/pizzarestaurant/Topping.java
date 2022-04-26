package pizzarestaurant;
import java.util.*; 

public class Topping {
	
	private List<String> Ingredients; 
	private double price; 
	
	public List<String> getIngredients() { 
		return Ingredients; 
	}
	
	public Topping () { 
		List<String> ingredients = new ArrayList<>();
		ingredients.add("Fior Di Latte");		
		this.Ingredients = ingredients; 
		this.price = 1.5;
	}
	
	public Topping(List<String> Ingredients, double price) {
		this.Ingredients = Ingredients;
		this.price = price; 
	}
	
	public void addToppingPizza(Pizza pizza) { 
		for (String s : Ingredients) { 
			pizza.addIngredient(s);
		}
		pizza.setPrice(pizza.getPrice() + this.price);
	} 
	
	public void setIngredients(List <String> Ingredients) { 
		this.Ingredients = Ingredients; 
	}
	
	public double getPrice () { 
		return price; 
	}
	
	public void setPrice (double price) { 
		this.price = price; 
	}

}
