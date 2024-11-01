


public class CheckerTictactoe3D4by4 {




    private int checked = 0;            //0 IS DEFAULT NUMBER

    private int x;
    private int y;
    private int z;



    private Tictactoe3D4by4Human.CellState[][][] map;

    CheckerTictactoe3D4by4(Tictactoe3D4by4Human.CellState[][][] map) {

        this.map = map;

    }


    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }



    private int rowChecker(){

        int returner = 0;

        int counterX = 0;
        int counterO = 0;

        for(int a = 0; a < 4; a++){
            System.out.println("x: " + x + " y: " + y +" a: " + a  );
            System.out.println("                                   " + map[x][y][a] + "  ");


        }


        for(int a = 0; a < 4; a++){



            if(map[x][y][a] != Tictactoe3D4by4Human.CellState.EMPTY){
                if(map[x][y][a] == Tictactoe3D4by4Human.CellState.X){counterX++;}
                if(map[x][y][a] == Tictactoe3D4by4Human.CellState.O){counterO++;}
            }

            


        }

        if(counterX == 4){
            returner = 1;
        }
        else if(counterO == 4){
            returner = 2;
        }
        return returner;
    }










    public int check(Tictactoe3D4by4Human.CellState[][][] map){

        this.map = map;

        rowChecker();

        return checked;
    }




}
