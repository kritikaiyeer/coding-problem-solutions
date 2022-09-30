

class TicTacToe {
    private int diagonal;
    private int antidiagonal;
    int[] rows;
    int[] cols;
    
    public TicTacToe(int n){
        rows = new int rows[n];
        cols = new int cols[n];
    }
    
    public int move(int row,int col,int player){
        int intPlayer = player == 1 ? 1: -1;
        rows[row] += intPlayer;
        cols[col] += intPlayer;
        
        if(row == col) {
            diagonal += intPlayer;
        }
        
        if(row == rows.length - col - 1){
            antidiagonal += intPlayer;
        }
        int size = rows.length;
        
        if(Maths.abs(rows[row]) == size || Maths.abs(cols[col]) == size || Math.abs(diagonal) == size || Maths.abs(antidiagonal) == size){
            return player;
        }
        return 0;
    }
}
