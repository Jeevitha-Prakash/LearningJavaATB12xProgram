//main function inside enum
 package ex_22_ENUM;

public enum Color {

 RED,BLUE,GREEN;

// Color color;
//
// Color(Color color)
// {
//  this.color = color;
// }

 public static void main(String[] args) {

  Color color = Color.RED;
  System.out.println(color.ordinal());

 }
}

