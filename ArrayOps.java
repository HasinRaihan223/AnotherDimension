public class ArrayOps{
  //Part 4 Methods
  public static int sum(int[] arr){
    int total = 0;
    for (int i = 0; i < arr.length; i++){
      total += arr[i];
    }
    return total;
  }

  public static int largest(int[]arr){
    int Max = arr[0];
    for (int i = 1; i < arr.length; i++){
      if (arr[i] > Max) {
        Max = arr[i];
      }
    }
    return Max;
  }

  public static int[] sumRows(int[][] matrix){
    int[] newarr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        newarr[i] += sum(matrix[i]);
    }
    return newarr;
  }

  public static  int[] largestInRows(int[][] matrix){
    int[] newarr2 = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      newarr2[i] = largest(matrix[i]);
    }
    return newarr2;
  }

  //Overloaded sum
  public static int sum(int[][] array){
    int sum = 0;
    for (int i = 0; i < array.length; i++){
      for(int j = 0; j<array[i].length; j++){
        sum += array[i][j];
      }
    }
    return sum;
  }

  //Part 5 Methods
  public static int[] sumCols(int[][] matrix){
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[] newarr3 = new int[cols];
    for (int i = 0; i < cols; i++){
        for (int j = 0; j < rows; j++)
          newarr3[i] += matrix[j][i];
      }
    return newarr3;
    }

    public static boolean isRowMagic(int[][] matrix){
      int[] a = sumRows(matrix);
      boolean Magic = false;
      for (int i =0; i < a.length-1; i++){
        if (a[i] == a[i+1])
          Magic = true;
        else
          Magic = false;
      }
      return Magic;
    }

    public static boolean isColMagic(int[][] matrix){
      int[] a = sumCols(matrix);
      boolean Magic = false;
      for (int i =0; i < a.length-1; i++){
        if (a[i] == a[i+1])
          Magic = true;
        else
          Magic = false;
      }
      return Magic;
    }

}
