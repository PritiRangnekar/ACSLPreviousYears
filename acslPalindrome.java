//Priti Rangnekar
//ACSL Palindrome Junior (2001-2002)

import java.util.Scanner;

public class acslPalindrome{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextInt()){
      int num = sc.nextInt();
      int count = 0;
      if (isPalindrome(num)){
        System.out.println(num);
      }
      while (!(isPalindrome(num)) && count<10){
        num = num + getPal(num);
        count++;
        if (isPalindrome(num)){
          System.out.println(num);
        } 
      }
      
      if (!(isPalindrome(num))){
        System.out.println("NONE, " + num);
      }    
    }
  }
  
  public static boolean isPalindrome(int num){
    String numberAsString = Integer.toString(num);
    String comp = "";
    for (int i = numberAsString.length(); i>0; i--){
      comp = comp + numberAsString.substring(i-1, i);
    }
    return (comp.equals(numberAsString));
  }
  
  public static int getPal(int num){
    String numberAsString = Integer.toString(num);
    String comp = "";
    for (int i = numberAsString.length(); i>0; i--){
      comp = comp + numberAsString.substring(i-1, i);
    }
    return Integer.parseInt(comp);
  }
}


/*Input and Output
1. 87   1. 4884
2. 196  2. NONE, 18211171
3. 1689 3. 56265

1. 95    1. 1111
2. 770   2. 44044
3. 678   3. 23232
4. 46785 4. 1552551
5. 46894 5. NONE, 1317544822 
*/