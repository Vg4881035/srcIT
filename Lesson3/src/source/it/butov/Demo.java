package source.it.butov;

import source.it.butov.hometask.FractionNumber;
import source.it.butov.hometask.FractionNumberImpl;


public class Demo
{
	public static void main(String[] args)
	{
		Student first = new Student("Sasha", "Ivanov", 1990);
		Student second = new Student("Vasya", "Vasiliev", 2011);

		System.out.println(first.isAdult());
		System.out.println(second.isAdult());

		first.setBirthdayYear(1999);
		second.setBirthdayYear(2007);


		System.out.println(first.getFullName() + " " + first.getBirthdayYear());
		//System.out.println(second.getFirstName() + " " + second.getLastName() + " " + second.getBirthdayYear());
		/*System.out.println(second.firstName + " " + second.lastName);
		System.out.println(third.firstName + " " + third.lastName + " " + third.birthdayYear);
      */

		Car lada = new Lada();
		Car audi = new Audi();
		any(lada);
		any(audi);

		FractionNumber fractionNumber = new FractionNumberImpl(1,2);
		System.out.println(fractionNumber.toString());
		System.out.println(fractionNumber.value());
	}

	public static void any(Car car){
		car.goForward();
	}

}
