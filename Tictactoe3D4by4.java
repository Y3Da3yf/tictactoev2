import java.util.Scanner;

public class Tictactoe3D4by4 {
    enum CellState {
        EMPTY, 
        X,     
        O      
    };


    private boolean XorO;       //Who will start first      true == X , false == Y
    private boolean humanOrPc;  //Human or Pc will play as second player

    private int round;
    private int score;



    CellState[][][] map = new CellState [4][4][4];

    public Tictactoe3D4by4(boolean XorO) {
        this.XorO = XorO;

       

    }


    




    private CellState[][][] EmptyMap(){
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    map[x][y][z] = CellState.EMPTY;
                }
            }
        }
        return map;
    }







    public void HumanVsHuman(boolean HorizontalOrVertical){
        Tictactoe3D4by4Human humanvshuman = new Tictactoe3D4by4Human(HorizontalOrVertical);

        humanvshuman.game(XorO);
    }

    public void HumanVsComputer(boolean HorizontalOrVertical){
        Tictactoe3D4by4Computer humanvsComputer = new Tictactoe3D4by4Computer(HorizontalOrVertical);

        humanvsComputer.game(XorO);
    }




    public void game(boolean HorizontalOrVertical){

        System.out.println("-----| Welcome to 4x4x4 3D TicTacToe Game!! |-----");
        System.out.println("");
        System.out.println("");
        if(XorO){System.out.println("     You are starting with 'X' ");}
        else{System.out.println("     You are starting With 'O' ");}
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-----| Plase choose your gamemode |-----");
        System.out.println("     1-| Human vs Human ");
        System.out.println("     2-| Human vs Computer ");

        Scanner scanner = new Scanner(System.in);

        if(scanner.nextInt() == 1){humanOrPc = true;}
        else{humanOrPc = false;}

        if(humanOrPc){HumanVsHuman(HorizontalOrVertical);}
        else{HumanVsComputer(HorizontalOrVertical);}



    }




}
