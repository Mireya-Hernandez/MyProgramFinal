// Mireya Hernandez Cruz (Program) First Java Project
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
  
  private static Scanner scanner;

  /** 
   * This is my first java program.
   * I hope it will run and to be able to create more programs.
   * @param args Any Integer value
   */

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Random dice = new Random();
    int number;

    for (int counter = 1; counter <= 10; counter++) {
      number = 1 + dice.nextInt(6);
      System.out.println(number + "");
      new Scanner(System.in);

    }

    /*
     * Below showSum(12, 45); is a CALL, showSum is a method name, (int num1, int num2) is are
     * PARAMETERS, public static void showSum(int num1, int num2) is a HEADER, The variable you pass
     * is called an ARGUMENT num1 and num2.
     */

    // Create Scanner Object for keyboard input
    @SuppressWarnings("resource")
    Scanner keyboard = new Scanner(System.in);
    // Declare a variable to hold a number.
    int integer;
    // promote the user for a number
    System.out.println("Enter a number and I will display");
    System.out.println("that number double.");
    // Read an integer from keyboard.
    integer = keyboard.nextInt();
    // Call the doubleNumber method passing
    // number as an argument
    doubleNumber1(integer);
  }


  // Definition of the doubleNumber method
  /**
   * Using a value to multiply it by 2 and then displaying results.
   * This is using the Math class to find the square root of 9.
   * @param value Any Integer Value
   */
  public static void doubleNumber1(int value) {
    // Local Variable to hold the result
    int result;
    // multiply the value parameter times 2
    result = value * 2;
    // Display the result.
    System.out.println(result);
    // math method square root
    System.out.println(Math.sqrt(9));
    /*
     * operator precedence : Operators with higher precedence are evaluated before operators with
     * relatively lower precedence. Operators on the same line have equal precedence. When operators
     * of equal precedence appear in the same expression, a rule must govern which is evaluated
     * first. All binary operators except for the assignment operators are evaluated from left to
     * right; assignment operators are evaluated right to left.
     */

    // if and then Also logical operators
    {
      int testscore = 90;
      char grade;
      if (testscore >= 90) {
        grade = 'A';
      } else if (testscore >= 80) {
        grade = 'B';
      } else if (testscore >= 70) {
        grade = 'C';
      } else if (testscore >= 60) {
        grade = 'D';
      } else {
        grade = 'F';
      }

      {
        System.out.println("Grade = " + grade);

      }
      int value1 = 1;
      int value2 = 2;
      if ((value1 == 1) && (value2 == 2)) {
        System.out.println("value1 is 1 AND value2 is 2");
      }
      if ((value1 == 1) || (value2 == 1)) {
        System.out.println("value1 is 1 OR value2 is 1");
      }
    }
    // Switch Statement
    int month = 8;
    String monthString;
    switch (month) {
      case 1:
        monthString = "January";
        break;
      case 2:
        monthString = "February";
        break;
      case 3:
        monthString = "March";
        break;
      case 4:
        monthString = "April";
        break;
      case 5:
        monthString = "May";
        break;
      case 6:
        monthString = "June";
        break;
      case 7:
        monthString = "July";
        break;
      case 8:
        monthString = "August";
        break;
      case 9:
        monthString = "September";
        break;
      case 10:
        monthString = "October";
        break;
      case 11:
        monthString = "November";
        break;
      case 12:
        monthString = "December";
        break;
      default:
        monthString = "Invalid month";
        break;
    }
    /*
     * Comparing using Equal Method this method determines whether the Number object that invokes
     * the method is equal to the object that is passed as an argument. CompareTo is use to compare
     * Strings Rational Operator
     */
    System.out.println(monthString);
    int value1 = 1;
    int value2 = 2;
    if (value1 == value2) {
      System.out.println("value1 == value2");
    }
    if (value1 != value2) {
      System.out.println("value1 != value2");
    }
    if (value1 > value2) {
      System.out.println("value1 > value2");
    }
    if (value1 < value2) {
      System.out.println("value1 < value2");
    }
    if (value1 <= value2) {
      System.out.println("value1 <= value2");
    }
    String str = "Java Programming";
    String str1 = "Java Programming";
    String str2 = "Java";
    String str3 = "Java Programming Language";

    int a = str.compareTo(str1);
    int b = str.compareTo(str2);
    int c = str.compareTo(str3);
    int d = str2.compareTo("Java");
    int e = str2.compareTo("JAVA");

    System.out.println("Comparing the String str and str1 = " + a);
    System.out.println("Comparing the String str and str2 = " + b);
    System.out.println("Comparing the String str and str3 = " + c);
    System.out.println("Comparing the String str2 and Literal = " + d);
    System.out.println("Comparing the String str2 and Literal = " + e);

    // Conditional Operator
    int value3 = 1;
    int value4 = 2;
    if ((value3 == 1) && (value4 == 2)) {
      System.out.println("value3 is 1 AND value4 is 2");
    }
    if ((value3 == 1) || (value4 == 1)) {
      System.out.println("value3 is 1 OR value4 is 1");
    }

    int results = 1 + 2;
    // result is now 3
    System.out.println("1 + 2 = " + results);
    int originalResult = results;

    results = results - 1;
    // result is now 2
    System.out.println(originalResult + " - 1 = " + results);
    originalResult = results;

    results = results * 2;
    // result is now 4
    System.out.println(originalResult + " * 2 = " + results);
    originalResult = results;

    results = results / 2;
    // result is now 2
    System.out.println(originalResult + " / 2 = " + results);
    originalResult = results;

    results = results + 8;
    // result is now 10
    System.out.println(originalResult + " + 8 = " + results);
    originalResult = results;

    results = results % 7;
    // result is now 3
    System.out.println(originalResult + " % 7 = " + results);
    // Increment ++
    int i = 3;
    i++;
    // prints 4
    System.out.println(i);
    ++i;
    // prints 5
    System.out.println(i);
    // prints 6
    System.out.println(++i);
    // prints 6
    System.out.println(i++);
    // prints 7
    System.out.println(i);
    // Decrement --
    int s = 3;
    s--;
    // prints 4
    System.out.println(s);
    --s;
    // prints 5
    System.out.println(s);
    // prints 6
    System.out.println(--s);
    // prints 6
    System.out.println(s--);
    // prints 7
    System.out.println(s);
    // While Loop
    value = 0;
    while (value < 10) {
      System.out.println("Hello" + value);
      value++;
    }

    // for loop
    for (int counter = 6; counter <= 21; counter += 3) {
      System.out.println(counter);
    }

    // do-while loop
    int count = 15;

    do {
      System.out.println(count);
      count++;
    } while (count <= 10);

    double p = 858.48;
    String t = Double.toString(p);

    int dot = t.indexOf('.');

    System.out.println(dot + " digits " + "before decimal point.");
    System.out.println((t.length() - dot - 1) + " digits after decimal point.");
    // Break is a java statement that when executed inside a loop the loop statement is terminated
    // immediately
    int o = 0;
    while (o < 10) {
      System.out.println(o + "\t");
      o++;
      if (o == 4) {
        break;
      }
    }
    // For loop with a continue java statement
    // continue is a java statement that is use to skip the current iteration in a loop
    // When the program reaches the end of the loop, the program jumps back to test the loop
    // continuation condition

    for (int u = 0; u < 10; u++) {
      if (u == 4) {
        continue; // control jumps to update u++
      }
      System.out.print(u + "\t");
    }
    // declares an array of integers
    int[] anArray;

    // allocates memory for 10 integers
    anArray = new int[10];

    // initialize first element
    anArray[0] = 100;
    // initialize second element
    anArray[1] = 200;
    // and so forth
    anArray[2] = 300;
    anArray[3] = 400;
    anArray[4] = 500;
    anArray[5] = 600;
    anArray[6] = 700;
    anArray[7] = 800;
    anArray[8] = 900;
    anArray[9] = 1000;

    System.out.println("Element at index 0: " + anArray[0]);
    System.out.println("Element at index 1: " + anArray[1]);
    System.out.println("Element at index 2: " + anArray[2]);
    System.out.println("Element at index 3: " + anArray[3]);
    System.out.println("Element at index 4: " + anArray[4]);
    System.out.println("Element at index 5: " + anArray[5]);
    System.out.println("Element at index 6: " + anArray[6]);
    System.out.println("Element at index 7: " + anArray[7]);
    System.out.println("Element at index 8: " + anArray[8]);
    System.out.println("Element at index 9: " + anArray[9]);
    // Find the smallest number in an array
    findMinMax1(new int[] {10, 40, 50, 20, 69, 37});
  }

  /**
   * This allows the program to find the smallest and largest number in the array.
   * @param array Any Integer value
   */
  public static void findMinMax1(int[] array) {
    if (array == null || array.length < 1) {
      return;
    }
    int min = array[0];
    int max = array[0];

    for (int i = 1; i <= array.length - 1; i++) {
      if (max < array[i]) {
        max = array[i];
      }

      if (min > array[i]) {
        min = array[i];
      }
    }
    System.out.println("min: " + min + "\nmax: " + max);
    @SuppressWarnings("unused")
    int x = 1;
    // Sum of values in an Array
    int[] bucky = {21, 16, 86, 21, 3};
    int sum = 0;


    for (int counter = 0; counter < bucky.length; counter++) {
      sum += bucky[counter];
    }
    System.out.println("The sum of there numbers is " + sum);
    // multi-deminisional Array
    int[] values = {3, 5, 2343};
    System.out.println(values[2]);

    int[][] grid = {{3, 5, 2343}, {2, 4}, {1, 2, 3, 4}};

    System.out.println(grid[1][1]);
    System.out.println(grid[0][2]);

    String[][] texts = new String[2][3];


    texts[0][1] = "Hello there";

    System.out.println(texts[0][1]);

    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[row].length; col++) {
        System.out.print(grid[row][col] + "\t");
      }
      System.out.println();

      char[] vowels = {'a', 'e', 'i', 'o', 'u'};
      // foreach loop enhanced loop
      for (char item : vowels) {
        System.out.println(item);
      }
      // Arraylist of a given type
      ArrayList<Object> al = new ArrayList<>();
      al.add("OC");
      al.add("JP");
      al.add(1, "A");
      al.add(3, "8");
      al.add(4, "8");
      System.out.println(al);// prints [OC, A, JP, 8, 8]
      al.remove("A");
      al.remove(3);
      System.out.println(al);// prints [OC, JP, 8]
      al.clear();
      System.out.println(al);// prints []
      // Search an array and identify the index 0 where a value was found
      int[] ages = {25, 27, 48};
      System.out.println("My age is " + ages[0]);
      
      try {
        // Not sure what's up with 'try' above
        System.out.println("Enter first num: ");
        scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.print("Enter second num: ");
        int n2 = scanner.nextInt();
        int sum1 = n1 / n2;
        System.out.print(sum1);
      }  catch (Exception e) {
        System.out.println("You cant do that");
      
        /*
       * Inheritance is a mechanism wherein a new class is derived from an existing class. In Java,
       * classes may inherit or acquire the properties and methods of other classes. A class derived
       * from another class is called a subclass, whereas the class from which a subclass is derived
       * is called a superclass.One of the key benefits of inheritance is to minimize the amount of
       * duplicate code in an application by sharing common code amongst several subclasses.*\
       * 
       * // TODO Auto-generated method stub
       * 
       */
        System.out.println("Hello World");
        System.out.println("This is my very first project" + " I hope i will complete it in time");
        System.out.print("True or false will I pass this course?");
        boolean yes = true;
        System.out.println("This is" + yes);
        String g = "With an A ";
        System.out.println(g + " or atleast I'll attept to pass with an A");
        int w = 95;
        System.out.print(w + "or a");
        double n = 89.5;
        System.out.println(n);
        /*
       * Boolean - boolean - True or False integer - int - 1, -10, 20000, 123_456_789 Double -
       * double - 1.0, -10.0005, 3.141 Float - float - 0.758
       * 
       * Variable: is a location in memory. Scope:The scope refers to the section of code where a
       * variable can be accessed
       */



        /*
       * The only difference between a normal variable and a final variable is that we can re-assign
       * value to a normal variable but we cannot change the value of a final variable once
       * assigned. Hence final variables must be used only for the values that we want to remain
       * constant throughout the execution of program.
       */

        // a final variable
        final int MyConstant = 5;
        // try changing
        // MyConstant = 50;
        System.out.println("Value of the constant is " + MyConstant);
        // It will not change

        // dataType variableName = (dataType)variableToConvert;
        double num = 2.2;
        System.out.println(num);
        int num2 = (int) num;
        System.out.println(num2);

        /*
       * String Methods replace() replace all occurances of matching characters in a string
       * indexof() you can retrive the index value of a character in a string charAt returns the
       * character of a sting
       */
        String ste = "Using String replace to replace character";
        String newString = ste.replace("r", "R");
        System.out.println(newString);

        String phoneNum = "123-456-7890";
        int idx1 = phoneNum.indexOf('-');
        System.out.println("index of first dash: " + idx1);
        // 3
        int idx2 = phoneNum.indexOf('-', 2);
        System.out.println("second dash idx: " + idx2); // 3

        String sst = "Mireya";
        System.out.println(sst.charAt(0)); // M
        System.out.println(sst.charAt(5)); // a

        // Escape sequences \t: insert a tab, \n insert a new line, \b insert back space
        System.out.println(
            "Inesert new tab \t here then insert new line start \n here  after insert"
                + " a back space in the "
                + "text" + " \b at this point");

        double length = 5.0;
        double width = 2.5;
        System.out.println(calculateArea(length, width));
      }
    }
  }

  @SuppressWarnings("unused")
  private static void method(boolean b) {
    // TODO Auto-generated method stub

  }

  // Method with argument and return value
  /**
   * This is calculating the area of a rectangle.
   * @param side1 Is a double integer value of side1 length.
   * @param side2 Is a double integer value of side2 width.
   * @return the integer value of the area.
   */
  public static double calculateArea(double side1, double side2) {
    double area;
    area = side1 * side2;
    return area;
  }
  // try {
  // File testFile = new File("//testFile.txt");
  // testFile.createNewFile();
  // System.out.println("testFile exists:"
  // + testFile.exists());
  // }
  // catch (IOException e) {
  // System.out.println(e);
  // }
  // }
  // ArrayIndexOut of BoundException
  // int[] intArray = new int[5]
  // intArray[5] = 27;

  // NullPointerException
  // String name = null;
  // System.out.print("Length of the string"+ name.length());



}


