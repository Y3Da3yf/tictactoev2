




public class CheckerTictactoe3D4by4Computer {




    private int checked = 0;            //0 IS DEFAULT NUMBER

    private int x;
    private int y;
    private int z;



    private Tictactoe3D4by4Computer.CellState[][][] map;

    CheckerTictactoe3D4by4Computer(Tictactoe3D4by4Computer.CellState[][][] map) {

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

        // for(int a = 0; a < 4; a++){
        //     System.out.println("x: " + x + " y: " + y +" a: " + a  );
        //     System.out.println("                                   " + map[x][y][a] + "  ");


        // }


        for(int a = 0; a < 4; a++){



            if(map[x][y][a] != Tictactoe3D4by4Computer.CellState.EMPTY){
                if(map[x][y][a] == Tictactoe3D4by4Computer.CellState.X){counterX++;}
                if(map[x][y][a] == Tictactoe3D4by4Computer.CellState.O){counterO++;}
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




    private int colmChecker(){
        
        int returner = 0;

        int counterX = 0;
        int counterO = 0;


        for(int a = 0; a < 4; a++){



            if(map[x][a][z] != Tictactoe3D4by4Computer.CellState.EMPTY){
                if(map[x][a][z] == Tictactoe3D4by4Computer.CellState.X){counterX++;}
                if(map[x][a][z] == Tictactoe3D4by4Computer.CellState.O){counterO++;}
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

    
    private int deepChecker(){
        
        int returner = 0;

        int counterX = 0;
        int counterO = 0;


        for(int a = 0; a < 4; a++){



            if(map[x][a][z] != Tictactoe3D4by4Computer.CellState.EMPTY){
                if(map[a][y][z] == Tictactoe3D4by4Computer.CellState.X){counterX++;}
                if(map[a][y][z] == Tictactoe3D4by4Computer.CellState.O){counterO++;}
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

    private int crossXCheck(){
        int returner = 0;

        int counterX = 0;
        int counterO = 0;


        for(int i = 0; i < 4; i++){


            if(map[x][i][i] == Tictactoe3D4by4Computer.CellState.X){counterX++;}
            if(map[x][i][i] == Tictactoe3D4by4Computer.CellState.O){counterO++;}

        }

        if(counterX == 4){returner = 1;}
        if(counterO == 4){returner = 2;}


        counterX = 0;
        counterO = 0;


        System.out.println("");



        for(int i = 0; i < 4; i++){

            if(map[x][i][3-i] == Tictactoe3D4by4Computer.CellState.X){counterX++;}
            if(map[x][i][3-i] == Tictactoe3D4by4Computer.CellState.O){counterO++;}

        }

        if(counterX == 4){returner = 1;}
        if(counterO == 4){returner = 2;}


        counterX = 0;
        counterO = 0;



        return returner;
    }



    private int crossYCheck(){                                                                                                  //THIS METHOD WILL CHECK IS GAME OVER WITH CROSS, IT WILL HOLD Y COORDINATE AND WILL CHECK CROSSES IN THIS PLANE.
        int returner = 0;                                                                                                       //THIS METHOD WILL TURN 3D TABLE INTO 2D TABLE WITH USING SAME Y AXIS
        
        int counterX = 0;
        int counterO = 0;


        for(int i = 0; i < 4; i++){


            if(map[i][y][i] == Tictactoe3D4by4Computer.CellState.X){counterX++;}                                                               
            if(map[i][y][i] == Tictactoe3D4by4Computer.CellState.O){counterO++;}

        }

        if(counterX == 4){returner = 1;}
        if(counterO == 4){returner = 2;}


        counterX = 0;
        counterO = 0;


        System.out.println("");



        for(int i = 0; i < 4; i++){

            if(map[i][y][3-i] == Tictactoe3D4by4Computer.CellState.X){counterX++;}
            if(map[i][y][3-i] == Tictactoe3D4by4Computer.CellState.O){counterO++;}

        }

        if(counterX == 4){returner = 1;}
        if(counterO == 4){returner = 2;}


        counterX = 0;
        counterO = 0;



        return returner;
    }

    private int crossZCheck(){
        int returner = 0;

        int counterX = 0;
        int counterO = 0;


        for(int i = 0; i < 4; i++){


            if(map[i][i][z] == Tictactoe3D4by4Computer.CellState.X){counterX++;}
            if(map[i][i][z] == Tictactoe3D4by4Computer.CellState.O){counterO++;}

        }

        if(counterX == 4){returner = 1;}
        if(counterO == 4){returner = 2;}


        counterX = 0;
        counterO = 0;





        for(int i = 0; i < 4; i++){

            if(map[i][3-i][z] == Tictactoe3D4by4Computer.CellState.X){counterX++;}
            if(map[i][3-i][z] == Tictactoe3D4by4Computer.CellState.O){counterO++;}

        }

        if(counterX == 4){returner = 1;}
        if(counterO == 4){returner = 2;}


        counterX = 0;
        counterO = 0;



        return returner;
    }

    private int cross3dCheck(){
        int returner = 0;

        int counterX = 0;
        int counterO = 0;



        for(int i = 0; i < 4; i++){


            if(map[i][i][i] == Tictactoe3D4by4Computer.CellState.X){counterX++;}                               //1
            if(map[i][i][i] == Tictactoe3D4by4Computer.CellState.O){counterO++;}

        }

        if(counterX == 4){returner = 1;}
        if(counterO == 4){returner = 2;}


        counterX = 0;
        counterO = 0;




        for(int i = 0; i < 4; i++){


            if(map[3-i][i][i] == Tictactoe3D4by4Computer.CellState.X){counterX++;}                               //2
            if(map[3-i][i][i] == Tictactoe3D4by4Computer.CellState.O){counterO++;}

        }

        if(counterX == 4){returner = 1;}
        if(counterO == 4){returner = 2;}


        counterX = 0;
        counterO = 0;



        for(int i = 0; i < 4; i++){


            if(map[i][3-i][i] == Tictactoe3D4by4Computer.CellState.X){counterX++;}                               //3
            if(map[i][3-i][i] == Tictactoe3D4by4Computer.CellState.O){counterO++;}

        }

        if(counterX == 4){returner = 1;}
        if(counterO == 4){returner = 2;}


        counterX = 0;
        counterO = 0;



        for(int i = 0; i < 4; i++){


            if(map[i][i][3-i] == Tictactoe3D4by4Computer.CellState.X){counterX++;}                               //4
            if(map[i][i][3-i] == Tictactoe3D4by4Computer.CellState.O){counterO++;}

        }

        if(counterX == 4){returner = 1;}
        if(counterO == 4){returner = 2;}


        counterX = 0;
        counterO = 0;







        return returner;
    }




    public int check(Tictactoe3D4by4Computer.CellState[][][] map){

        this.map = map;

        if(rowChecker() == 1){checked = 1;}
        else if(rowChecker() == 2){checked = 2;}
        if(colmChecker() == 1){checked = 1;}
        else if(colmChecker() == 2){checked = 2;}
        if(deepChecker() == 1){checked = 1;}
        else if(deepChecker() == 2){checked = 2;}

        if(crossXCheck() == 1){checked = 1;}
        else if(crossXCheck() == 2){checked = 2;}
        if(crossYCheck() == 1){checked = 1;}
        else if(crossYCheck() == 2){checked = 2;}
        if(crossZCheck() == 1){checked = 1;}
        else if(crossZCheck() == 2){checked = 2;}

        if(cross3dCheck() == 1){checked = 1;}
        else if(cross3dCheck() == 2){checked = 2;}


        return checked;
    }




}
