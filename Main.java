class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    double totalQuantity;

    double colorBlue;
    double colorBrown;
    double colorGreen;
    double colorOrange;
    double colorRed;
    double colorYellow;

    double totalSum;

    totalQuantity = 55 * 11;

    colorBlue = totalQuantity * .24;
    colorBrown = totalQuantity * .13;
    colorGreen = totalQuantity * .16;
    colorOrange = totalQuantity * .20;
    colorRed = totalQuantity * .13;
    colorYellow = totalQuantity * .14;

    System.out.println("Blue: " +colorBlue);
    System.out.println("Brown: " +colorBrown);
    System.out.println("Green: " +colorGreen);
    System.out.println("Orange: " +colorOrange);
    System.out.println("Red: " +colorRed);
    System.out.println("Yellow: " +colorYellow);
    
    totalSum = colorBlue + colorBrown + colorGreen + colorOrange + colorRed + colorYellow;

    System.out.println("Sum: " +totalSum);

    if (colorBlue < colorBrown && colorRed > colorOrange)
      System.out.println("Blue under Brown and Red over Orange");
    if (colorBrown >= colorGreen)
      System.out.println("Brown is greater than or equal to Green");
    if (totalSum == totalQuantity)
      System.out.println("Numbers Match");
  }
}