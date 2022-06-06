package Testing;

import java.util.HashSet;

public class test {

        public static void main(String[] args) {
          String str = "reetikaaa";
          boolean found = false;
          int count = 0;
          for(int i = 0; i <str.length();i++)
          {
              found = false;
              char c = str.charAt(i);

              for(int j =0; j <str.length(); j++)
              {
                  if(c == str.charAt(j) && j!=i)
                  {
                      found = true;
                      break;
                  }
              }
              if(found)
              {
                  count++;
                  if(count > 1) {
                      System.out.println(c);
                  }
              }
          }
        }
    }
