//Loop through Enum
package ex_22_ENUM;

 enum Color1 {
     RED,BLUE,GREEN;

     public static void main(String[] args)
     {
         for(Color1 c1: Color1.values())
         {
             System.out.println(c1);
         }
     }
}
