package lab03.prob3;

public class Trailer extends Property{
	private static final double RENT = 500;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public Trailer(Address address) {
		super(address);
	}

	@Override
	public double computeRent(){
		return RENT;
	}
}
