package lab03.prob3;

public class House extends Property{
	private double lotSize;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public House(Address address, double lotSize) {
		super(address);
		this.lotSize = lotSize;
	}

	@Override
	public double computeRent(){
		return 0.1 * lotSize;
	}
}
