package tacos;


//@Data
//@RequiredArgsConstructor
public class Ingredient {

	public Ingredient(String id, String name, Type type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public Ingredient() {
		this.id = "";
		this.name = "";
		this.type = null;
		// TODO Auto-generated constructor stub
	}

	// Ignorer les alertes de non-initialisation
	// Prise en charge par Lombok => Ne finctionne pas
	private final String id;
	private final String name;
	private final Type type;
	
	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
}
