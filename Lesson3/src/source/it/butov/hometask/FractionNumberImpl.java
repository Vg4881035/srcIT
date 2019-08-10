package source.it.butov.hometask;

public class FractionNumberImpl extends Object implements FractionNumber  {

	private int divident;
	private int divisor;
	
	public FractionNumberImpl (int divident, int divisor) {
		this.divident = divident;
		setDivisor(divisor);

	}

	@Override
	public int getDivident() {
		return divident;
	}

	@Override
	public int getDivisor() {
		return divisor;
	}

	@Override
	public void setDivident(int divident) {
		this.divident = divident;
	}

	@Override
	public void setDivisor(int divisor) {
		if (divisor == 0) {
			this.divisor = DEFAULT_DIVISOR_VALUE;
		} else {
			this.divisor = divisor;
		}
	}

	@Override
	public String toString() {
		return divident + "/" + divisor;
	}

	@Override
	public double value() {
		return (double) divident / divisor;
	}

}
