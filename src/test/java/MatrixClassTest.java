import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixClassTest {

 @Test
 public void shouldMatrixBeSquare(){

  MatrixClass checkMatrix = new MatrixClass();

  int[][] matrixSquare = {{1, 2, 4, 5}, {1, 2, 4, 5}, {1, 2, 4, 5}, {1, 2, 4, 5}};

  Assertions.assertTrue(checkMatrix.IsMatrixSquare(matrixSquare));

  int[][] matrixNotSquare = new int[3][4];

  Assertions.assertFalse(checkMatrix.IsMatrixSquare(matrixNotSquare));

  int[][] matrixEmpty = new int[0][0];

  Assertions.assertFalse(checkMatrix.IsMatrixSquare(matrixEmpty));

 }
 @Test
 public void test_avg_matrix(){


  MatrixClass checkMatrix = new MatrixClass();

  int[] matrix = {1, 2, 4, 5};

  Assertions.assertEquals(3, checkMatrix.GetAvgArray(matrix));

  int[] matrixEmpty = new int[0];

  Assertions.assertEquals(0, checkMatrix.GetAvgArray(matrixEmpty));

 }

}
