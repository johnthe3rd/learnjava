import java.util.ArrayList;

//public class Greeting{
//    public static void main(String[] args) {
//	String Target = (args.length > 0) ? args[0] : "World";
//	for (int i = 0; i<Target.length();){
//	    char ch = Target.charAt(i);
//            if (Character.isLetter(ch)){
//                i++;
//            }else{
//                Target = "World";
//                } 
//	    }
//        System.out.println("Hello, " + Target + "!");
//    }
//}



public class Greeting{
    public static void main (String[] args) {
        String Target;
        if (args.length > 0) {
            Target = args[0];
            for (int i = 0; i < Target.length();){
                char ch = Target.charAt(i);
                if (Character.isLetter(ch)){
                    i++;
                }else{
                    Target = "World";
		    break;
                }
            }
        } else {
            Target = "World";
        }
        System.out.println("Hello, " + Target + "!");
    }
}

