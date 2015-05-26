//creation of public class for Greeting
public class Greeting {
    //main to print to console
    public static void main(String[] args) {
	if (args.length > 0) {
            //print out the user's name
            System.out.println("Hello, " + args[0] + "!");
	} else {
            //prints out the default statement.
            System.out.println("Hello, World!");
        }
    }
}
