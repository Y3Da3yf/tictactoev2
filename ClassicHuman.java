
import java.util.Scanner;


public class ClassicHuman {
    
    private int round = 0;

    private boolean XorO;

    private String[][] map = new String[3][3];





    private void showMap(){

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-----| MAP |-----");
        System.out.println("Round: " + round);
        System.out.println("   | 1 | 2 | 3 |");

        for(int i = 0; i < 3; i++){
            System.out.print("|" + (i+1) + "|  ");

            for(int j = 0; j < 3; j++){
                if(map[i][j] == null){System.out.print("  | ");}
                else{ System.out.print(map[i][j] + "  |  ");}
               
            }
            System.out.println("");
            System.out.println("   -------------");
        }
        System.out.println("");
        System.out.println("-----| MAP |-----");

    }

    private void makeChangesOnMap(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int x = scanner.nextInt() - 1;
        System.out.print("Enter row number: ");
        int y = scanner.nextInt() - 1;


        
        if(XorO){map[x][y] = "X";
                XorO = false;}
        else{map[x][y] = "O";
                XorO = true;}
        round++;
        
        showMap();
        
    }








    public void game(boolean XorO) {
        System.out.println("game inside ClassicHuman");
        System.out.println("boolean XorO: " + XorO);
        this.XorO = XorO;

        showMap();

        





    }
}

