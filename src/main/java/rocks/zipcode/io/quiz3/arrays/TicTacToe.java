package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;

    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return this.board[value];
    }

    public String[] getColumn(Integer value) {
    String[] newArray=new String[board.length];
    for(int i=0 ; i <board.length ;i++)
    {
        String temp = board[i][value];
        newArray[i]=temp;
    }
        return newArray;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
