package Chapter11;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayObject(new Circle(1, "red", false));
		displayObject(new Rectangle(1, 1, "black", false));

	}
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
	}

}
