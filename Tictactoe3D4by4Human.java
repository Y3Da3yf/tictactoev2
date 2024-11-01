import java.util.Scanner;

public class Tictactoe3D4by4Human {

    enum CellState {
        EMPTY, 
        X,     
        O      
    };







    private int round = 0;
    private int Xscore = 0;
    private int Oscore = 0;
    private int Drawscore = 0;


    private boolean XorO;
    private boolean boardFull = false;


    private CellState[][][] map = new CellState[4][4][4];



    public Tictactoe3D4by4Human() {


        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    map[x][y][z] = CellState.EMPTY;
                }
            }
        }



    }
    
    CheckerTictactoe3D4by4 checker = new CheckerTictactoe3D4by4(map);


    private void showMap(){



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


    private boolean putX(Scanner scanner){
        boolean returner = false;

        int x;
        int y;
        int z;
        System.out.println("-----| X'S TURN |-----");

        System.out.print("Coordinate on X: ");
        x = scanner.nextInt();
        System.out.println("");
        System.out.print("Coordinate on Y: ");
        y = scanner.nextInt();
        System.out.println("");
        System.out.print("Coordinate on Z: ");
        z = scanner.nextInt();
        System.out.println("");


        map[y -1][z -1][x -1] = CellState.X;

        checker.setXYZ(y-1, z-1, x-1);

        return returner;
    }

    private boolean putO(Scanner scanner){
        boolean returner = false;

        int x;
        int y;
        int z;
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


        map[y -1][z -1][x -1] = CellState.O;

        checker.setXYZ(y-1, z-1, x-1);

        return returner;
    }





    public void game(boolean XorO){

        Scanner scanner = new Scanner(System.in);


        showMap();

        while (true) {
            
            putX(scanner);
            showMap();
            checker.check(map);
            

            putO(scanner);
            showMap();
            checker.check(map);


        }



        
    }












}
