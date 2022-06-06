package Test;

public class NonRepeatedCharacter {

    public static void main(String[] args) {
        String str = "aabbccddee";
        int count = 0;
        int i, j;
        boolean found = false;

        for(i=0; i <str.length(); i++)
        {
            found = false;
            char c = str.charAt(i);
            for(j=0;j<str.length();j++)
            {
                if(c==str.charAt(j) && j!=i)
                {
                    found = true;
                    break;
                }
                else {

                    found = false;
                }
            }

            if(found) {
                count++;
                if (count > 1)
                    System.out.println("first non -repeated character in string :" + c);

            }

        }





    }
}
