public class Main {
	public static void main(String[] args) {
		var user_name = "John Smith";
		var SUB_ROUTINE = new suBroutIne();
		SUB_ROUTINE.Print_hello(user_name);
	}
}

class suBroutIne {
	final static String StringPhrase = "Hello, ";

	public static void Print_hello(String Name) {
		System.out.println(suBroutIne.StringPhrase + Name);
	}
}
