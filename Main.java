import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    printNTimes("code", 3);
    printNums();
    System.out.println("Input a number: ");
    int num = sc.nextInt();
    uprightNumberTriangle(num);
    starTree();
    multTable();
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
    for (int current = 10; current > 0; current--){
      for (int repeat = 0; repeat < current; repeat++){
        System.out.print(current + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int row = 0; row <= N; row++){
      for (int currentNum = 1; currentNum <= row; currentNum++){
        System.out.print(currentNum + " ");
      }
      System.out.println();
    }
  }

  public static void starTree() 
  {
    for (int rowTree = 0; rowTree < 9; rowTree++){
      for (int spaces = 0; spaces < rowTree; spaces++){
        System.out.print(" ");
      }
      for (int stars = rowTree; stars < 9; stars++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void multTable()
  {
    for (int numWidth = 1; numWidth <= 12; numWidth++){
      for (int numLength = 1; numLength <= 12; numLength++){
        System.out.print( numWidth * numLength + "\t");
      }
    System.out.println();
    }
  }
}
