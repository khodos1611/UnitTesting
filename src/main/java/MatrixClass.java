public class MatrixClass {

    public double GetAvgArray(int[] array){
        double sumAll =0;

        for (int i:array) sumAll += i;

        return (array.length==0 ? 0 : sumAll / array.length);
    }

  public boolean IsMatrixSquare(int[][] array){
      boolean matrixIsSquare = true;
      for (int[] line: array) {
          matrixIsSquare =  matrixIsSquare & (array.length == line.length);
      }
      return array.length!=0&&matrixIsSquare;
  }
}
