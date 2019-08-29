
public class TypeTwo extends Candy {
	private static double proteins = 5;
	private static double fats = 12;
	private static double sugar = 3;
	private static double weight = 20;

	public TypeTwo() {
		super(proteins, fats, sugar, weight);
	}

	@Override
	public String toString() {
		return "Snickers";
	}

}