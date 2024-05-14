package AnudipLab1;
/*1.Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive".
Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk".
Create an object of the Car class and call both the "drive" and "honk" methods. 
*/

 class Vehicle
{
		 String brand="Automobili Lamborghini S.p.A",model="Lamborghini Revuelto";
		 int year=2024;
		 public void drive()
		 {
			 System.out.println("----Drive Method----");
			 System.out.println("Brand: "+brand);
			 System.out.println("Model: "+model);
			 System.out.println("year: "+year);
		 }
}

class Car extends Vehicle
{
	public void honk()
	{
	    String color="Black";
		System.out.println("----Honk Method----");
		System.out.println("colour: "+color);
	}

	public static void main(String[] args) 
	{
		Car c=new Car();
		c.drive();//Called method parent class
		c.honk();//called methos subclass
	}

	
	
}
