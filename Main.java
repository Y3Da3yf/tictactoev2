
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String XorO = "x";
        String humanOrPc = "Human";




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

                break;
            }
            if(sellect == 3){}
            if(sellect == 4){break;}
        }


    }
}
