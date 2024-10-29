import java.util.Random;
import java.util.Scanner;

enum CellState {
    EMPTY, // Cell is empty
    X,     // Cell has an X
    O      // Cell has an O
};

public class ClassicComputer {

    

    private int round = 0;
    private int Drawscore = 0;
    private int Xscore = 0;
    private int Oscore = 0;

    private boolean XorO;
    private boolean boardFull = false;
    private boolean gameOver = false;

    private CellState[][] map;

    public ClassicComputer() {
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

        while(!gameOver){
            System.out.print("Enter row number: ");
            int x = scanner.nextInt() - 1;
            System.out.print("Enter row number: ");
            int y = scanner.nextInt() - 1;


            while(true){
                if(XorO){
                    if(map[y][x] == CellState.EMPTY){
                        map[y][x] = CellState.X;
                        round++;
                        showMap();
                        break;

                    }
                    else{
                        System.out.println("X: " + x + y +  " is full");
                        System.out.print("Enter row number: ");
                        x = scanner.nextInt() - 1;
                        System.out.print("Enter row number: ");
                        y = scanner.nextInt() - 1;
                        
                    }
                }



                else{
                    if(map[y][x] == CellState.EMPTY){
                        map[y][x] = CellState.O;
                        round++;
                        showMap();
                        break;
                    }
                    else{
                        System.out.println("O: " + x + y +  " is full");
                        System.out.print("Enter row number: ");
                        x = scanner.nextInt() - 1;
                        System.out.print("Enter row number: ");
                        y = scanner.nextInt() - 1;
                    }
                }
            }











            int totalFilledElement = 0;


            

            for(int a = 0; a < 3 ; a++){
                for(int b = 0; b < 3; b++){                                 //CHECK IF BOARD IS FULL OR NOT
                    if(map[a][b] != CellState.EMPTY){
                        totalFilledElement++;
                    
                        

                    }                                                       //CHECK IF BOARD IS FULL OR NOT
                }                                                           //CHECK IF BOARD IS FULL OR NOT
            }                                                               //CHECK IF BOARD IS FULL OR NOT
            if(totalFilledElement == 9){                                    //CHECK IF BOARD IS FULL OR NOT

                
                Drawscore++;
                boardFull = true;
                // break;                                       //IMPORTANT BREAK 
            }

            






            CheckerHuman checker = new CheckerHuman(map);

            if(checker.check(x, y) == 1){
                System.out.println("-----|  X won!!!  |-----");             //CHECKERS FOR   ROW COLM AND CROSS
                Xscore++;                                                     //CHECKERS FOR   ROW COLM AND CROSS
                break;                                                        //CHECKERS FOR   ROW COLM AND CROSS
            }                                                                 //CHECKERS FOR   ROW COLM AND CROSS
            else if(checker.check(x, y) == 2){
                System.out.println("-----|  O won!!!  |-----");             //CHECKERS FOR   ROW COLM AND CROSS
                Oscore++;                                                     //CHECKERS FOR   ROW COLM AND CROSS
                break;                                                        //CHECKERS FOR   ROW COLM AND CROSS
            } 









            //ADD COMPUTER CHOICE HERE I GUESS
            //ADD COMPUTER CHOICE HERE I GUESS
            //ADD COMPUTER CHOICE HERE I GUESS
            //ADD COMPUTER CHOICE HERE I GUESS
            //ADD COMPUTER CHOICE HERE I GUESS
            //ADD COMPUTER CHOICE HERE I GUESS
            //ADD COMPUTER CHOICE HERE I GUESS
            //ADD COMPUTER CHOICE HERE I GUESS
            //ADD COMPUTER CHOICE HERE I GUESS
            //ADD COMPUTER CHOICE HERE I GUESS


            // TOTAL FILLED ELEMENT

            int emptySpaces = 9 - totalFilledElement;




            Random rand = new Random();

            System.out.println("Empty spaces: " + emptySpaces);

            int randomChoice = rand.nextInt(emptySpaces);

            System.out.println("Random choice: " + randomChoice);

            int findInt = 0;

            for(int a = 0; a < 3; a++){
                for(int b = 0; b < 3; b++){

                    // System.out.println("Find Int: " + findInt);

                    // System.out.println(map[a][b]);

                    if(map[a][b] == CellState.EMPTY){

                        // System.out.println("equal to empty ? " + map[a][b]);


                        if(findInt == randomChoice){

                            System.out.println("Cellstate.o working on "  + findInt);
                            if(!XorO){
                                map[a][b] = CellState.X;
                            }
                            else{
                                map[a][b] = CellState.O;

                            }


                            if(checker.check(b, a) == 1){
                                System.out.println("-----|  X won!!!  |-----");             //CHECKERS FOR   ROW COLM AND CROSS
                                Xscore++;                                                     //CHECKERS FOR   ROW COLM AND CROSS
                                gameOver = true;
                                break;                                                        //CHECKERS FOR   ROW COLM AND CROSS
                            }                                                                 //CHECKERS FOR   ROW COLM AND CROSS
                            else if(checker.check(b, a) == 2){
                                System.out.println("-----|  O won!!!  |-----");             //CHECKERS FOR   ROW COLM AND CROSS
                                Oscore++;                                                     //CHECKERS FOR   ROW COLM AND CROSS
                                gameOver = true;
                                break;                                                        //CHECKERS FOR   ROW COLM AND CROSS
                            }             
                            
                            

                        }
                        findInt++;

                    }

                }
            }
            showMap();
            
            if(boardFull == true && gameOver != true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-----| Board is full. Game is Draw! |-----");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
        }

        



    }

































    public void game(boolean XorO) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("game inside ClassicComputer");
        System.out.println("boolean XorO: " + XorO);

        this.XorO = XorO;

        showMap();
        makeChangesOnMap(scanner);
        





    }
}
