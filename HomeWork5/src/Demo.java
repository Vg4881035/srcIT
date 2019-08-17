
public class Demo {

	public static void main(String[] args) {
		Gift present = new Gift();

		present.addCandy(new TypeOne());
		present.addCandy(new TypeTwo());
		present.addCandy(new TypeThree());

		System.out.println("Candy amount = " + present.getCandyAmount());
		System.out.println("Weight = " + present.getWeight());
		present.showCandyList();

		System.out.print("Candies, which contain more than 2 but less than 5 sugars: ");
		present.showCandyBySugarAmount(2, 5);

	}

}
