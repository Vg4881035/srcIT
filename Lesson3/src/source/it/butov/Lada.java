package source.it.butov;

public class Lada implements Car
{
	@Override
	public void goForward()
	{
		System.out.println("Lada slowly go forward");
	}

	@Override
	public void goBack()
	{
		System.out.println("Lada slowly go back");
	}

	@Override
	public void goLeft()
	{
		System.out.println("Lada go left");
	}

	@Override
	public void goRight()
	{
		System.out.println("Lada go right");
	}
}
