import java.util.*;

public class TranposeNotInplace {

// In place is not possible in this ->  test(Dry Run) for 2 * 4 matrix , resultant matrix would be 4 * 2
  public static int[][] transpose(int[][] matrix) {
      int n = matrix.length , m = matrix[0].length;
        int [][] resultantMatrix = new int[m][n];
        
        for(int i = 0  ; i < n ; i++){
            for(int j = 0; j < m ; j++){
                resultantMatrix [j][i] = matrix[i][j];            }
        }
        
        return resultantMatrix;
  }


  // ~~~~~~~~~~~Input Management~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

    int[][] matrix = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = scn.nextInt();
      }
    }

    int[][] res = transpose(matrix);

    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res[0].length; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
    }
  }
}