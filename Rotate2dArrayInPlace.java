// rotate matrix layer by layer - outer loop indicates layer
// for every layer pick each item and place in its new position - inner loop indicates item of current layer
public class Rotate2dArrayInPlace {
  public static void main(String[] args) {
    int[][] matrix = { 
      {1 2 3 4},
      {5 6 7 8},
      {9 10 11 12},
      {13 14 15 16}
    };
    rotateInPlace(matrix);
  }
  
  public static void rotateInPlace(int[][] matrix) {
  int length = matrix.length-1;
  
  // we have to run the outer loop only till half of row length -1. 
    for(int i=0; i<length/2;i++){
      // j goes length -i because last element is already rotated
      for(int j=i; j<length-i;j++){
        int p1 = matrix[i][j];
        int p2 = matrix[j][length-i];
        int p3 = matrix[length-i][length-j];
        int p4 = matrix[length-j][i];
        
        matrix[j][length-i] =p1;
        matrix[length-i][length-j]=p2;
        matrix[length-j][i]=p3;
        matrix[i][j]=p1;
      }
    }
  }
}
