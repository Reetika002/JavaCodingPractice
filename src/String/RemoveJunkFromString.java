package String;

public class RemoveJunkFromString {

    public static void main(String[] args) {

        String str = "#$#%$^^%$^bgvfjbgfd46576A())()AAADFDGFGUH%^&%^&";

        // use regular expression

        str = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
