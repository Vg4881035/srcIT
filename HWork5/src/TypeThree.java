
public class TypeThree extends Candy {
	private static double proteins = 1;
	private static double fats = 7;
	private static double sugare = 2;
	private static double weight = 10;

	public TypeThree() {
		super(proteins, fats, sugare, weight);
	}

	@Override
	public String toString() {
		return "Twix";
	}

}