import java.util.Scanner;

public class Classic {
    
    private String[][] map = new String[3][3];

    private boolean XorO;       //Who will start first      true == X , false == Y
    private boolean humanOrPc;  //Human or Pc will play as second player

    private int round;
    private int score;
    


    public Classic(boolean XorO) {
        this.XorO = XorO;
    }





    private void HumanVsHuman(){
        ClassicHuman human = new ClassicHuman();
        human.game(XorO);

    }

    
    private void HumanVsComputer(){

        ClassicComputer computer = new ClassicComputer();
        computer.game(XorO);


    }
    
    



    public void game(){
        System.out.println("-----| Welcome to Classic TicTacToe game! |-----");
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
        scanner.close();

        if(humanOrPc){HumanVsHuman();}
        else{HumanVsComputer();}



    }







}
