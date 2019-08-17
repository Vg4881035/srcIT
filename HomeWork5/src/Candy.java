
public class Candy {
	private double proteins;
	private double fats;
	private double sugar;
	private double weight;

	public Candy() {

	}

	public Candy(double proteins, double fats, double sugar, double weight) {
		this.proteins = proteins;
		this.fats = fats;
		this.sugar = sugar;
		this.weight = weight;
	}

	public double getProteins() {
		return proteins;
	}

	public void setProteins(double proteins) {
		this.proteins = proteins;
	}

	public double getFats() {
		return fats;
	}

	public void setFats(double fats) {
		this.fats = fats;
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
