
public class Demo {

	public static void main(String[] args) {
		Gift present = new Gift();

		present.addCandy(new TypeOne());
		present.addCandy(new TypeTwo());
		present.addCandy(new TypeThree());

		System.out.println("Candy amount = " + present.getCandyAmount());
		System.out.println("Weight = " + present.getWeight());
		present.showCandyList();

		System.out.println("Candies, which contain more than 40 but less than 60 carbs");
		present.showCandyByCarbAmount(40, 60);

	}

}
