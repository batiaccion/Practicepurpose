package Javademo;
public class uppercaseandlowercase {
    public static void main(String[] args) {
    	String str = "BaHWan CybERTeK";
        
        System.out.println("Upper case characters: ");
        for (int i = 0; i< str.length(); i++ )
        {
             if (Character.isUpperCase(str.charAt(i)))
             {
                  System.out.print(str.charAt(i)+", ");
             }
        }
        System.out.println("\nLower case characters: ");
        for (int i = 0; i< str.length(); i++ )
        {
             if (Character.isLowerCase(str.charAt(i)))
             {
                  System.out.print(str.charAt(i)+", ");
             }
        }
   }

}