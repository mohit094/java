package L14;

public class Car implements compare<Car>{
	int price;

	public boolean isGreater(Car s) {
		if(this.price > s.price)
			return true;
		else
			return false;
	}
}
