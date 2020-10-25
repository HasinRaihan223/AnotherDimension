public class ArrayOps{

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
    for (int j = 0; j < matrix[i].length; j++) {
        newarr[i] += matrix[i][j];
      }
    }
  return newarr;
  }

}
