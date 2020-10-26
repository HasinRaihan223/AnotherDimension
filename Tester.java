import java.util.Arrays;

public class Tester{
  public static void main(String[]args){
    //Sum (1D array) method
    int[] a1 = {2,5,9};
    System.out.println(ArrayOps.sum(a1));

    //largest method
    int[] a2 = {4,-3,123};
    System.out.println(ArrayOps.largest(a2));

    //SumRows method
    int[][]  a3 = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
              };
    System.out.println(Arrays.toString(ArrayOps.sumRows(a3)));

    //largestInRows method
    System.out.println(Arrays.toString(ArrayOps.largestInRows(a3)));

    //Overloaded Sum (2D array) method
    System.out.println(ArrayOps.sum(a3));

    //sumCols method
    System.out.println(Arrays.toString(ArrayOps.sumCols(a3)));

    //isRowMagic Methods
    int[][] b= { { 1, 2, 3, 4 },
                 { 2, 3, 4, 1 },
                 { 3, 4, 1, 2 } };
    System.out.println(ArrayOps.isRowMagic(b));


  }
}
