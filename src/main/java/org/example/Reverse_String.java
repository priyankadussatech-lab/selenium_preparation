package org.example;

public class Reverse_String {


    public static void main(String args[]) {
        String input = "Hello World";

        /*using for loop
        for( int i=input.length()-1;i>=0 ;  i--)
        {
            System.out.print(input.charAt(i));
        }*/
      /*  StringBuilder builderstring=new StringBuilder(input);
        builderstring.reverse();
        System.out.println(builderstring);
        */
//dublicate string
        for (int i = input.length() - 1; i >= 0; i--) {
            for (int j = i; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j))
                {
                    System.out.print(input.charAt(i));
                }
            }

        }
    }
}





