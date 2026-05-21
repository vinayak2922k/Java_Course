import java.lang.String;
public class StringMethods {
    public static void main(String[] args) {
        String quote = "To be or not to be";
        System.out.println(quote.length());
        System.out.println(quote.toLowerCase());
        System.out.println(quote.toUpperCase());
        System.out.println(quote.trim());
        System.out.println(quote.substring(3,8));
        System.out.println(quote.replace('T','y'));
        System.out.println(quote.startsWith("You"));
        System.out.println(quote.endsWith("WE"));
        System.out.println(quote.charAt(12));
        System.out.println(quote.indexOf("t"));
        System.out.println(quote.equals("To be or not to be"));
        System.out.println(quote.equalsIgnoreCase("To be or not to BE"));
    }
}

//The methods shown above are of string...