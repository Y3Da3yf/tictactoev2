
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String XorO = "x";
        String humanOrPc = "Human";


        boolean HorizontalOrVertical = false;   // false is horizontal true is vertical


        while(true){
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("-------| This project created by Yusuf Aslan from zero to end! |-------");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("1-|  Play Classic TicTacToe |");
            System.out.println("2-| Play 4x4x4 3D TicTacToe |");
            System.out.println("3-|         Settings        |");
            System.out.println("4-|           Quit          |");
            System.out.println("");
            System.out.println("");
            System.out.print("Please Sellect which One you want to play by typing number of row: ");


            int sellect = scanner.nextInt();
            if(sellect == 1){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-----| Sellect X or O to Begin With! |-----");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");




                XorO = scanner2.nextLine();

                if ("X".equals(XorO) || "x".equals(XorO)) {
                    Classic c1 = new Classic(true);
                    c1.game();
                } else if ("O".equals(XorO) || "o".equals(XorO)) {
                    Classic c1 = new Classic(false);
                    c1.game();
                } else {
                    System.out.println("Invalid input. Please enter X or O.");
                }


                break;
            }
            if(sellect == 2){

                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-----| Sellect X or O to Begin With! |-----");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");




                XorO = scanner2.nextLine();

                if ("X".equals(XorO) || "x".equals(XorO)) {
                    Tictactoe3D4by4 d3 = new Tictactoe3D4by4(true);
                    d3.game(HorizontalOrVertical);
                } else if ("O".equals(XorO) || "o".equals(XorO)) {
                    Tictactoe3D4by4 d3 = new Tictactoe3D4by4(false);
                    d3.game(HorizontalOrVertical);
                } else {
                    System.out.println("Invalid input. Please enter X or O.");
                }


                break;
            }
            if(sellect == 3){
                String horizontalcheck;
                
                System.out.println("-----| Set 3D gameplay |-----");
                System.out.print("Type 1 for Horizontal 3D gameplay, Type 2 for Vertical 3D gameplay: ");
                horizontalcheck = scanner2.nextLine();

                if("1".equals(horizontalcheck)){HorizontalOrVertical = false;}
                else{HorizontalOrVertical = true;}
            }
            if(sellect == 4){break;}
        }


    }
}
