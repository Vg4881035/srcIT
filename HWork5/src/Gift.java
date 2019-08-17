import java.util.ArrayList;

public class Gift {
	ArrayList<Candy> arrayList;

	public Gift() {
		arrayList = new ArrayList<Candy>();
	}

	public void addCandy(Candy candy) {
		arrayList.add(candy);
	}

	public int getCandyAmount() {
		return arrayList.size();
	}

	public void showCandyList() {
		System.out.println("Candies: ");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(i + "." + arrayList.get(i).toString());
		}
	}

	public void showCandyByCarbAmount(double min, double max) {
		boolean exist = false;
		for (Candy candy : arrayList) {
			if (candy.getCarbohydrates() < max & candy.getCarbohydrates() > min) {
				exist = true;
				System.out.println(candy.toString());
			}
		}
		if (!exist) {
			System.out.println("No such candy");
		}
	}

	public double getWeight() {
		double result = 0;
		for (Candy candy : arrayList) {
			result += candy.getWeight();
		}
		return result;
	}

}