
public class TypeOne extends Candy {
	private static double proteins = 3;
	private static double fats = 4;
	private static double sugar = 1;
	private static double weight = 8;

	public TypeOne() {
		super(proteins, fats, sugar, weight);
	}

	@Override
	public String toString() {
		return "CrazyBee";
	}

}