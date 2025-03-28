package Java.Java_Basics;
import java.util.Scanner;
class Java_Basics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // System.out.println("Hello");

    /* --Data Types in Java --

    // 8 bits
    byte num = 100;
    System.out.println(num);

    // 2 bytes
    short num1 = 100;
    System.out.println(num1);

    // 4 bytes
    int num2 = 100;
    System.out.println(num2);

    // 8 bytes
    long num3 = 100;
    System.out.println(num3);

    // 4 bytes (6-7 decimal points)
    float fl = 5.625f;
    System.out.println(fl);

    // 8 bytes (15 decimal points)
    double dl = 5.625787;
    System.out.println(dl);

    // 8 bytes
    char ch = 'a';
    System.out.println(ch);

    // 1 bytes
    boolean b = true;
    System.out.println(b);
    */

    /* --
       Strings
       -- 
    String name = "Aman";
    System.err.println(name);
    System.out.println(name.length());
    System.out.println(name.charAt(2));
    System.out.println(name.substring(0, 3));

    String str1 = "Aman";
    String str2 = "Mittal";
    String fullName = str1 + " " + str2;
    System.out.println(fullName);
    boolean result = str1.equals(str2);
    System.out.println(result);
    */

    /*
       * Input/Output
    
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = sc.nextInt();
    double d = sc.nextDouble();
    String firstName = sc.next();
    String lastName = sc.next();
    System.out.println(n);
    System.out.println(d);
    System.out.println(s);
    System.out.println(firstName + " " + lastName);
    sc.close();

    */
    
    /*
     * Implicit Type Casting
     
    int x = 10;
    double y = x;
    System.out.println(y);
    
    // Explicit Type Casting

    double a = 10.7;
    int b = (int)a;
    System.out.println(b);

    */

    /* 
      Final Keyword 
      
      final int n = 20;
      n =  15; // It will gives you error because you can not change this value due to final keyword
      System.out.println(n);
    */

    
    
    /*
     * Array
     
    int[] arr = new int[5];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    System.out.println(arr[0]);

    int[][] twoDArray = {{1,2},{3,4},{5,6},{7,8}};
    System.out.println(twoDArray[0][1]);
    sc.close();
    */

    /*
     * If Else Else if
    int age = sc.nextInt();
    if(age >= 18){
      System.out.println("Adult");
    }
    else{
      System.out.println("Teen");
    }
    int marks = sc.nextInt();
    if(marks >= 90){
      System.out.println("Grade A");
    }
    else if(marks >= 70){
      System.out.println("Grade B");
    }
    else if(marks >= 50){
      System.out.println("Grade C");
    }
    else if(marks >= 35){
      System.out.println("Grade D");
    }
    else{
      System.out.println("Fail");
    }
    sc.close();
    */

    /*
     * Switch
     
    int day = sc.nextInt();
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break; 
      case 3:
        System.out.println("Wednesday");
        break;  
      case 4:
        System.out.println("Thursday");
        break;  
      case 5:
        System.out.println("Friday");
        break;  
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;  
    
      default:
        System.out.println("Invalid Day");
        break;
    }
        */
    
    /* 
     * Loops
     
    int num = sc.nextInt();
    for(int i = 1; i <= num; i++){
      System.out.println(i);
    }

    int size = sc.nextInt();
    int[] arr= new int[size];
    int sum = 0;
    for(int i = 0; i < size; i++){
      arr[i] = sc.nextInt();
      sum +=arr[i];
    }
    System.out.println(sum);

    for(int a:arr){
      System.out.println(a);
    }
    */
    try{
      int n1 = 10;
      int n2 =  0;
      int n3 = n1/n2;
      System.out.println(n3);
    }
    catch(Exception  e){
      System.out.println(e);
    }
  }
}