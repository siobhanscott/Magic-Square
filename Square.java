package magicsquare;


import java.util.Scanner;

public class Square {

    private int[][] square;

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size) {
        square = new int[size][size];

    }
    
    //--------------------------------------
    //create new square using given 2D array
    //--------------------------------------
    public Square(int[][] matrix) {
        square = matrix;

    }

    //--------------------------------------
    //return the square 2D array
    //--------------------------------------
    public int[][] getSquare() {
        return square;
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row) {
        int total = 0;
        for (int i = 0; i<square[row].length; i++){
            
            total = 0;
            for(int j =0; j<square[0].length; j++){
                total += square[row][j];
                
            }
        }

        return total;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumColumn(int col) {
        int total = 0;
        
            
        total = 0;
        for(int j =0; j<square.length; j++){
            total += square[j][col];
        }

        return total;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag() {
        int total = 0;
        
        for(int i = 0; i<square.length;i++){
            for(int j = 0; j<square[0].length; j++){
                if(i ==j){
                    total+=square[i][j];
                }
              
            }
        }

        return total;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag() {
        int total = 0;
        
            for(int i = 0; i<square.length; i++){
                
                    total+=square[i][square.length-1-i];
                }
              
            
        
        
        return total;

    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean isMagic() {
        
       /* boolean stillTrue = false;
        int baseValue = square[0][0];
        
        for(int i = 0; i<square[0].length; i++){
            if(baseValue !=)

        }
       */
       for(int i = 0; i<square.length;i++){
           for(int j = 0; j<square.length; j++){
             if(this.sumRow(i) != this.sumColumn(j)){
                 return false;
             }   
           }
       }
      
        

        return true;
    }

    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.println("Enter an integer number");
                square[row][col] = scan.nextInt();
            }
        }
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare() {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.print(square[row][col] + "  ");
            }
            System.out.println("");
        }

    }
}
