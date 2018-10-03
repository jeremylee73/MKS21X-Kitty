public class Driver{
	public static void main(String[]args){
		Kitty a = new Kitty("Matcha", 3);
		//constructor that takes the name and age of the Kitty.

		System.out.println(a.getName() + " is "+a.getAge() + " years old.");
		//should print "Matcha is 3 years old."

		a.makeOlder();
		System.out.println(a.getName() + " is "+a.getAge() + " years old.");
		//should print "Matcha is 4 years old."

		a.makeOlder();
		a.changeName("Katya");
		System.out.println(a.getName() + " is "+a.getAge() + " years old.");
		//should print "Katya is 5 years old."

		System.out.println(a);
		//should print The amazing Katya. This is an implied call to toString()

		Kitty  b =  new Kitty();
		//2nd constructor makes a Kitty named mittens that is 2 years old
		//this constructor takes no parameters.

		System.out.println(b);
		//should print The amazing Mittens. This is an implied call to toString()

		System.out.println(b.getName() + " is " + b.getAge() + " years old.");
		//should print "Mittens is 2 years old."
	}
}
