package pizzarestaurant;
import java.util.*;

public class Pizza {
	

	private String name; 
	private double price; 
	private List<String> Ingredients; 
	
	public Pizza () { 
		
	}
	
	public Pizza (String name, double price, List<String> Ingredients) { 
		super (); 
		this.name = name;
		this.price = price; 
		this.Ingredients = Ingredients; 
	}
	
	public void addIngredient (String ingredient) { 
		this.Ingredients.add(ingredient); 
	}
	
	public void addIngredient (String ingredient, double price) { 
		this.Ingredients.add(ingredient);
		this.price = price; 
	}
	
	public void removeIngredient(String ingredient) {
		this.Ingredients.remove(ingredient);
	}

	public void removeIngredient(String ingredient, double price) {
		this.Ingredients.remove(ingredient);
		this.price = price; 
	}
	
	public void printDescription () { 
		System.out.println("Plain Pizza"); 
	}
	
	@Override
	public String toString() {
		String line = "";
		line += "Pizza " + this.name + ". Ingredients: ";
		for (String s : Ingredients) {
			line += s + " ";
		}
		return line;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public List<String> getIngredients() {
		return Ingredients;
	}

	public void setIngredients(List<String> Ingredients) {
		this.Ingredients = Ingredients;
	}

}
