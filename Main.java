import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("code", 3);
    printNums();
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++){
      for (int a = 0; a < N; a++){
        String s1 = word.substring(i, i + 1);
        System.out.print(s1);
      }
    }
    System.out.print("\n");
  }

  public static void printNums()
  {
    for (int i = 10; i > 0; i--){
      for ( int a = 0; a < i; a++){
        System.out.print(i + " ");
      }
      System.out.println();
    }

  }

  public static void uprightNumberTriangle(int N)
  {
    
  }

  public static void starTree()
  {
    
  }

  public static void multTable()
  {
    
  }
}
