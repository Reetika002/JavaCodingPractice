package String;

public class FirstNonRepeatedCharacterInString {

    public static void main(String[] args) {
        String str = "ppqleetcode";
        int count = 0;
        boolean found=false;
        for(int i = 0; i <str.length(); i++) {
            found = true;
            char c = str.charAt(i);
            for (int j =0; j <str.length(); j++)
            {
                if(c == str.charAt(j) && j!=i)
                {
                    found = false;
                    break;
                }
                else {
                    found = true;
                }
            }
            if(found)
            {
                count++;
//                System.out.println("first Non repeated Chracter is " + c);
                if(count == 1) {
                    System.out.println("first Non repeated Chracter is " + c);
                }
            }



        }
        if(!found)
        {

            System.out.println("No single character found");

        }


    }
}
