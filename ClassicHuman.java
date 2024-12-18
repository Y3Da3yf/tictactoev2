
import java.util.Scanner;


enum CellState {
    EMPTY, 
    X,     
    O     
};




public class ClassicHuman {
    
    private int round = 0;
    private int Xscore = 0;
    private int Oscore = 0;
    private int Drawscore = 0;


    private boolean XorO;
    private boolean boardFull = false;


    private CellState[][] map;

    public ClassicHuman() {
        map = new CellState[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = CellState.EMPTY;
            }
        }
    }


    private void showMap(){

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-----| MAP |-----");
        System.out.println("Round: " + round);
        System.out.println("   | 1 | 2 | 3 |");
        System.out.println("   -------------");

        for(int i = 0; i < 3; i++){
            System.out.print("|" + (i+1) + "|  ");

            for(int j = 0; j < 3; j++){
                if(map[i][j] == CellState.EMPTY){System.out.print("  | ");}
                else{ System.out.print(map[i][j] + " | ");}
               
            }
            System.out.println("");
            System.out.println("   -------------");
        }
        System.out.println("");
        System.out.println("-----| MAP |-----");

    }

    private void makeChangesOnMap(Scanner scanner){

        while(true){
            System.out.print("Enter row number: ");
            int x = scanner.nextInt() - 1;
            System.out.print("Enter colmn number: ");
            int y = scanner.nextInt() - 1;


            
            if(XorO){
                if(map[y][x] == CellState.EMPTY){
                    map[y][x] = CellState.X;
                    XorO = false;
                    round++;
                    showMap();

                }
                else{
                    System.out.println("X: " + x + y +  " is full");
                }
            }



            else{
                if(map[y][x] == CellState.EMPTY){
                    map[y][x] = CellState.O;
                    XorO = true;
                    round++;
                    showMap();

                }
                else{
                    System.out.println("O: " + x + y +  " is full");
                }
            }
            
            







            int totalFilledElement = 0;             
            for(int a = 0; a < 3 ; a++){
                for(int b = 0; b < 3; b++){                                 //CHECK IF BOARD IS FULL OR NOT
                    if(map[a][b] != CellState.EMPTY){totalFilledElement++;}            //CHECK IF BOARD IS FULL OR NOT
                }                                                           //CHECK IF BOARD IS FULL OR NOT
            }                                                               //CHECK IF BOARD IS FULL OR NOT
            if(totalFilledElement == 9){                                    //CHECK IF BOARD IS FULL OR NOT
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-----| Board is full. Game is Draw! |-----");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                
                Drawscore++;
                boardFull = true;
                break;
            }





            CheckerHuman checker = new CheckerHuman(map);

            if(checker.check(x, y) == 1){
                System.out.println("-----|  X won!!!  |-----");             //CHECKERS FOR   ROW COLM AND CROSS
                Xscore++;                                                     //CHECKERS FOR   ROW COLM AND CROSS
                break;                                                        //CHECKERS FOR   ROW COLM AND CROSS
            }                                                                 //CHECKERS FOR   ROW COLM AND CROSS
            else if(checker.check(x, y) == 2){                                //CHECKERS FOR   ROW COLM AND CROSS
                System.out.println("-----|  O won!!!  |-----");             //CHECKERS FOR   ROW COLM AND CROSS
                Oscore++;
                break;
            }


        }
        
    }








    public void game(boolean XorO) {

        Scanner scanner = new Scanner(System.in);

        this.XorO = XorO;

        showMap();
        makeChangesOnMap(scanner);

        





    }
}

