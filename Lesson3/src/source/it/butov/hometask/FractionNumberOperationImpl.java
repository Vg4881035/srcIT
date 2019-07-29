package source.it.butov.hometask;

public class FractionNumberOperationImpl implements FractionNumberOperation {

	@Override
	public FractionNumber add(FractionNumber a, FractionNumber b) {
		
		FractionNumber result = new FractionNumberImpl();
		result.setDivident(a.getDivident() * b.getDivisor() + b.getDivident() * a.getDivisor());
		result.setDivisor(a.getDivisor() * b.getDivisor());
		return null;
	}

	@Override
	public FractionNumber div(FractionNumber a, FractionNumber b) {
		return mul(a, new FractionNumberImpl(b.getDivisor(), b.getDivident()));
	}

	@Override
	public FractionNumber mul(FractionNumber a, FractionNumber b) {
		FractionNumber result = new FractionNumberImpl();
		result.setDivident(a.getDivident() * b.getDivident());
		result.setDivisor(a.getDivisor() * b.getDivisor());
		return result;
	}

	@Override
	public FractionNumber sub(FractionNumber a, FractionNumber b) {
		FractionNumber result = new FractionNumberImpl();
		
		result.setDivident(a.getDivident() * b.getDivisor() - b.getDivident() * a.getDivisor());
		result.setDivisor(a.getDivisor() * b.getDivisor());
		return result;
	}
}
