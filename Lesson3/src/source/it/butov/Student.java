package source.it.butov;

public class Student
{
	private String firstName;
	private String lastName;
	private int birthdayYear;

	public Student(final String firstName, final String lastName, final int birthdayYear)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdayYear = birthdayYear;
	}

	public Student(final String firstName, final String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Student(){
	}

	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}

	public int getBirthdayYear()
	{
		return birthdayYear;
	}

	public void setBirthdayYear(final int birthdayYear)
	{
		this.birthdayYear = birthdayYear;
	}

	public String getFullName(){
		return lastName + " " + firstName;
	}

	public boolean isAdult()
	{
		return 2019 - birthdayYear > 17;
	}
}
