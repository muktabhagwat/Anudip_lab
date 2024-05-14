package AnudipLab1;

/*Q5)Create a parent class called "Person" with attributes such as name, age, and a method called "speak". 
Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study". 
Create an object of the Student class and call both the "speak" and "study" methods.*/

 class Person 
{
	void speak()
	{
		String name="Mukta";
		int age=20;
		System.out.println("Name of person="+name+"\nAge of Person="+age);
		
	}
}

 class Student extends Person
{
	void study()
	{
		char grade='A';
		System.out.println("Grade of person ="+grade);
	}

	public static void main(String[] args)
	{
		Student s=new Student();
		s.speak();
		s.study();
		
	}

}
