import java.util.ArrayList;

//creation of public class for Greeting
public class Greeting{
    public static void main(String[] args) {
        //new array of default value and possible arg value
        //preferred solution. Left commented for length at present. Future features will likely use this implementation.
        //ArrayList<String> greetingTargets = new ArrayList<String>();

        //greetingTargets.add("World"); // [0]
        //if (args.length > 0){
            //greetingTargets.add(args[0]);
        //}
        
        //System.out.println("Hello, " + greetingTargets.get(greetingTargets.size()-1) + "!");
        
        //not a scaleable solution. will become hard to read with multiple arguments and difficult to test. 
        String Target = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + Target + "!");
    }
}




