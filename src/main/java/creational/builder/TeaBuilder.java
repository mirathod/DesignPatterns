package creational.builder;

public class TeaBuilder extends BeverageBuilder {

	@Override
	public Beverage createBeverage() {
		return new Beverage();
	}

	@Override
	void setBeverageType() {
		System.out.println("Tea");
		getBeverage().setBevarageName("Tea");

	}

	@Override
	void setWater() {
		System.out.println("Adding Water");
		getBeverage().setWater(1);
	}

	@Override
	void setSugar() {
		System.out.println("Adding Sugar");
		getBeverage().setSugar(2);
	}

	@Override
	void setMilk() {
		System.out.println("Adding Milk");
		getBeverage().setMilk(3);
	}

}