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
                        System.out.println("           Z=" + (y+1));
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

    private boolean putRandom(Scanner scanner, boolean XorO){
        boolean returner = false;

        int size = 4 * 4 * 4;

        Random random = new Random();


        while (true) { 

            int randomInt = random.nextInt(size);

            //position of random element will be calculate as       (z-1)*16 + (y-1)*4 + (x-1)
            //so we can devide randomInt to 16 and we will devide remained part to 4 then we can find x,y,z axis
            System.out.println(randomInt);
            
            int remain16 = randomInt%16;
            int z  = (randomInt - remain16)/16;
            int remain4 = remain16 % 4 ;
            int y = (remain16 - remain4)/4;
            int x = remain4;


            if(map[z][y][x] == CellState.EMPTY){
                if(!XorO){           //if user is X computer will put O
                    map[z][y][x] = CellState.O;
                    break;

                }
                else{
                    map[z][y][x] = CellState.X;
                    break;
                }
            }

            checker.setXYZ(y, z, x);


        }



        return returner;
    }



    public void game(boolean XorO){

        Scanner scanner = new Scanner(System.in);


        if(!HorizontalOrVertical){showMapHorizontal();}                                                    //SET HORIZONTAL OR VERTICAL
        if(HorizontalOrVertical){showMapVertical();}                                                       //SET HORIZONTAL OR VERTICAL


        if(!XorO){
            putRandom(scanner, !XorO);
            if(!HorizontalOrVertical){showMapHorizontal();}                                                    //SET HORIZONTAL OR VERTICAL
            if(HorizontalOrVertical){showMapVertical();}                                                       //SET HORIZONTAL OR VERTICAL
        }



        while (true) {
            





            if(!XorO){                                                                                       //IF PLAYER CHOOSE X
                putO(scanner);                  //THIS LINE WILL PUT o 
                if(!HorizontalOrVertical){showMapHorizontal();}                                                    //SET HORIZONTAL OR VERTICAL
                if(HorizontalOrVertical){showMapVertical();}                                                       //SET HORIZONTAL OR VERTICAL

                putRandom(scanner, !XorO);         //THIS LINE WILL PUT X OR O TO RANDOM PLACE IN ARRAY

                if(!HorizontalOrVertical){showMapHorizontal();}                                                    
                if(HorizontalOrVertical){showMapVertical();}   


                if(checker.check(map) != 0){break;}
            }

            if(XorO){                                                                                       //IF PLAYER CHOOSE X
                putX(scanner);                    //THIS LINE WILL PUT X 
                if(!HorizontalOrVertical){showMapHorizontal();}                                                    //SET HORIZONTAL OR VERTICAL
                if(HorizontalOrVertical){showMapVertical();}                                                       //SET HORIZONTAL OR VERTICAL

                
                putRandom(scanner, !XorO);          //THIS LINE WILL PUT X OR O TO RANDOM PLACE IN ARRAY

                if(!HorizontalOrVertical){showMapHorizontal();}                                                        //SET HORIZONTAL OR VERTICAL                                                   
                if(HorizontalOrVertical){showMapVertical();}                                                       //SET HORIZONTAL OR VERTICAL

                if(checker.check(map) != 0){break;}
            }

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
