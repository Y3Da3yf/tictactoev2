import java.util.Random;
import java.util.Scanner;

public class Tictactoe3D4by4Computer {

    enum CellState {
        EMPTY, 
        X,     
        O      
    };







    private int round = 0;
    private int Xscore = 0;
    private int Oscore = 0;
    private int Drawscore = 0;

    private boolean HorizontalOrVertical;
    private boolean XorO;
    private boolean boardFull = false;


    private CellState[][][] map = new CellState[4][4][4];



    public Tictactoe3D4by4Computer(boolean HorizontalOrVertical) {

        this.HorizontalOrVertical = HorizontalOrVertical;

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    map[x][y][z] = CellState.EMPTY;
                }
            }
        }

        

    }
    
    CheckerTictactoe3D4by4Computer checker = new CheckerTictactoe3D4by4Computer(map);


    private void showMapHorizontal(){



        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("           Z=1                         Z=2                         Z=3                         Z=4              ");
        System.out.println("   X= 1   2   3   4            X= 1   2   3   4            X= 1   2   3   4            X= 1   2   3   4         ");
        System.out.println("    -----------------           -----------------           -----------------           -----------------       ");


        for(int y = 0; y < 4; y++){

            for(int x = 0; x < 4; x++){

                for(int z = 0; z < 4; z++){
                    

                    if(map[y][x][z] == CellState.EMPTY){
                        if(z == 0){
                            System.out.print("Y= " + (y+1) + "| " + " " + " | ");    //  x + " " +y + " "  + z +
                        }
                        else{
                            System.out.print( " " + " | ");                  // x + " " +y + " "  + z +
                        }
                    }
                    else if(map[y][x][z] != CellState.EMPTY){
                        
                        if(z == 0){
                            System.out.print("Y= "+(y+1) + "| " + map[y][x][z] + " | ");    //  x + " " +y + " "  + z +
                        }
                        else{
                            System.out.print(map[y][x][z] + " | ");                  // x + " " +y + " "  + z +
                        }
                    }
                }

                System.out.print("      ");
            }
            System.out.println("");
            System.out.println("    -----------------           -----------------           -----------------           -----------------       ");

        }
        
        
        System.out.println("");
        
        System.out.println("");
        

    }












    private void showMapVertical(){

        for(int y = 0; y < 4; y++){

            for(int x = 0; x < 4; x++){

                for(int z = 0; z < 4; z++){
                    
                    if(z == 0 && x == 0){
                        System.out.println("           Z=" + y);
                        System.out.println("   X= 1   2   3   4");
                        System.out.println("    -----------------  ");
                    }


                    if(map[y][x][z] == CellState.EMPTY){
                        if(z == 0){
                            System.out.print("Y= " + (y+1) + "| " + " " + " | ");    //  x + " " +y + " "  + z +
                        }
                        else{
                            System.out.print( " " + " | ");                  // x + " " +y + " "  + z +
                        }
                    }
                    else if(map[y][x][z] != CellState.EMPTY){
                        
                        if(z == 0){
                            System.out.print("Y= "+(y+1) + "| " + map[y][x][z] + " | ");    //  x + " " +y + " "  + z +
                        }
                        else{
                            System.out.print(map[y][x][z] + " | ");                  // x + " " +y + " "  + z +
                        }
                    }
                }

                System.out.println("");
                System.out.println("    -----------------  ");

            }
            System.out.println("");
            System.out.println("");

        }



    }





































    private boolean putX(Scanner scanner){
        boolean returner = false;

        int x;
        int y;
        int z;
        System.out.println("-----| X'S TURN |-----");

        while (true) { 
            System.out.print("Coordinate on X: ");
            x = scanner.nextInt();
            System.out.println("");
            System.out.print("Coordinate on Y: ");
            y = scanner.nextInt();
            System.out.println("");
            System.out.print("Coordinate on Z: ");
            z = scanner.nextInt();
            System.out.println("");


            if(map[y -1][z -1][x -1] == CellState.EMPTY){
                map[y -1][z -1][x -1] = CellState.X;
                break;
            }
            else{
                System.out.println("!!Allready filled!!");
            }

        }
 




        checker.setXYZ(y-1, z-1, x-1);

        return returner;
    }

    private boolean putO(Scanner scanner){
        boolean returner = false;

        int x;
        int y;
        int z;

        while (true) { 
            System.out.println("-----| O'S TURN |-----");

            System.out.print("Coordinate on X: ");
            x = scanner.nextInt();
            System.out.println("");
            System.out.print("Coordinate on Y: ");
            y = scanner.nextInt();
            System.out.println("");
            System.out.print("Coordinate on Z: ");
            z = scanner.nextInt();
            System.out.println("");


            if(map[y -1][z -1][x -1] == CellState.EMPTY){
                map[y -1][z -1][x -1] = CellState.O;
                break;
            }
            else{
                System.out.println("!!Allready filled!!");
            }
        }
        

        checker.setXYZ(y-1, z-1, x-1);

        return returner;
    }

    private boolean putRandom(Scanner scanner){
        boolean returner = false;

        int size = 4 * 4 * 4;

        Random random = new Random();


        while (true) { 

            int randomInt = random.nextInt(size);

            



        }




        return returner;
    }



    public void game(boolean XorO){

        Scanner scanner = new Scanner(System.in);


        if(!HorizontalOrVertical){showMapHorizontal();}                                                    //SET HORIZONTAL OR VERTICAL
        if(HorizontalOrVertical){showMapVertical();}                                                       //SET HORIZONTAL OR VERTICAL


        if(XorO){
            putX(scanner);
            if(!HorizontalOrVertical){showMapHorizontal();}                                                    //SET HORIZONTAL OR VERTICAL
            if(HorizontalOrVertical){showMapVertical();}                                                       //SET HORIZONTAL OR VERTICAL
        }



        while (true) {
            






            putO(scanner);
            if(!HorizontalOrVertical){showMapHorizontal();}                                                    //SET HORIZONTAL OR VERTICAL
            if(HorizontalOrVertical){showMapVertical();}                                                       //SET HORIZONTAL OR VERTICAL
            if(checker.check(map) != 0){break;}


            putX(scanner);
            if(!HorizontalOrVertical){showMapHorizontal();}                                                    //SET HORIZONTAL OR VERTICAL
            if(HorizontalOrVertical){showMapVertical();}                                                       //SET HORIZONTAL OR VERTICAL
            if(checker.check(map) != 0){break;}
            

        }


        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        if(checker.check(map) == 1){System.out.println("-------| X WIN |-------");}
        if(checker.check(map) == 2){System.out.println("-------| O WIN |-------");}

        System.out.println(checker.check(map));

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


    }












}
