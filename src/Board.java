public class Board {
    private int size = 8;
    String[][] grid = new String[size][size];


    public void makeBoard(){
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {

                grid[row][col] = "-";

            }
        }
    }

    public void displayBoard() {
        System.out.println("Updated board:");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                System.out.print(grid[row][col] + " ");

            }
            System.out.print("\n");
        }
    }

    public boolean makeMove(int col, String token){
        for(int i = 7; i >= 0; i--){
            if(grid[i][col].equals("-")){
                grid[i][col] = token;
                return true;
            }
        }
        return false;
    }

    public void determineWin(){
        if(grid[i][i].equals(token)){
            if(grid[i][i+1].equals[i+2]){
        }
    }

}
