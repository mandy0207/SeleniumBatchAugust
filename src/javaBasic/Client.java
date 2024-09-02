package javaBasic;

public class Client {

	public static void main(String[] args) {
		
		Person person1 = new Person("Sneha", "Kerela");
		Person person2 = new Person("Anisa", "Canada");
		
		System.out.println(person1.getName()+ " "+ person1.getAddress());
		System.out.println(person2.getName()+ " "+ person2.getAddress());

	}

}
