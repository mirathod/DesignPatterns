package creational.factorypattern;

public abstract class AnimalFactory {
	
	public abstract Animal getAnimal(String animalType);

	public static AnimalFactory getAnimalFactory(String animalFactoryType){
		AnimalFactory animalFactory=null;
		if("sea".equals(animalFactoryType)){
			animalFactory=new SeaAnimalFactory();
		}
		else if("land".equals(animalFactoryType)){
			animalFactory=new LandAnimalFactory();
		}
		return animalFactory;
	}
	
}