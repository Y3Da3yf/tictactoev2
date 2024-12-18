public class CheckerHuman {
    
    private int Xaxis;
    private int Yaxis;
    private CellState[][] map;
    
    CheckerHuman(){

    }

    CheckerHuman(CellState[][] map){        //CONSTRUCTER FOR SETTING MAP
        this.map = map;
    }

    CheckerHuman(int x, int y){             //CONSTRUCTER FOR SETTING X AND Y COORDINATES
        this.Xaxis = x;
        this.Yaxis = y;

    }

    public int checkRow(int x, int y){                              //this method will check row for win/no win stiations
        int returner = 0;                                                                                       //RETURNER WILL CHOOSE IS GAME WIN FOR X or WIN FOR O or still no win
            if(map[y][0] != CellState.EMPTY && map[y][1] != CellState.EMPTY && map[y][2] != CellState.EMPTY){     //this line will check is cells empty or not           
                if(map[y][0].equals(map[y][1]) && map[y][1].equals(map[y][2])){                     //I am taking y axis variable to check all row 
                    if(CellState.X == map[y][x]){returner = 1;}                         //this line will determine is it X or O then will return 1 if its X
                    else if(CellState.O == map[y][x]){returner = 2;}                    //this line will determine is it X or O then will return 2 if its O
                }
            }
            return returner;
    }

    public int checkColm(int x, int y){                                  //this method will check Colmn for win/no win stiations
        int returner = 0;                                                                                           //RETURNER WILL CHOOSE IS GAME WIN FOR X or WIN FOR O or still no win
            if(map[0][x] != CellState.EMPTY && map[1][x] != CellState.EMPTY && map[2][x] != CellState.EMPTY){   //this line will check is cells empty or not
                if(map[0][x].equals(map[1][x]) && map[1][x].equals(map[2][x])){                       //I am taking x axis variable to check all row 
                    if(CellState.X == map[y][x]){returner = 1;}                 //this line will determine is it X or O then will return 1 if its X
                    else if(CellState.O == map[y][x]){returner = 2;}            //this line will determine is it X or O then will return 2 if its O
                }
            }
            return returner;
    }

    public int checkCross(){
        int returner = 0;
    
        if(map[0][0] != CellState.EMPTY && map[1][1] != CellState.EMPTY && map[2][2] != CellState.EMPTY){       
            if(map[0][0].equals(map[1][1]) && map[1][1].equals(map[2][2])){                 //in this line it's checking left bottom corner to right top corner
                if(CellState.X == map[1][1]){returner = 1;}                     //this line will determine is it X or O then will return 1 if its X
                else if(CellState.O == map[1][1]){returner = 2;}              //this line will determine is it X or O then will return 2 if its O
            }
        }
    
        if(map[0][2] != CellState.EMPTY && map[1][1] != CellState.EMPTY && map[2][0] != CellState.EMPTY){
            if(map[0][2].equals(map[1][1]) && map[1][1].equals(map[2][0])){        //in this line it's checking right bottom corner to left top corner
                if(CellState.X == map[1][1]){returner = 1;}                     //this line will determine is it X or O then will return 1 if its X
                else if(CellState.O == map[1][1]){returner = 2;}                //this line will determine is it X or O then will return 2 if its O
            }
        }
    
        return returner;
    }



    public int check(int x, int y){
        int checker = 0;

        if(checkRow(x, y) != 0){checker = checkRow(x, y);}   // return 0 == no win, return 1 == X win , return 2 == O win
        if(checkColm(x, y) != 0){checker = checkColm(x, y);} // return 0 == no win, return 1 == X win , return 2 == O win
        if((x == 0 && y == 0 )||
            (x == 1 && y == 1)||
            (x == 2 && y == 2)||
            (x == 0 && y == 2)||
            (x == 2 && y == 0)){
                if(checkCross() != 0){checker = checkCross();}// return 0 == no win, return 1 == X win , return 2 == O win
            }

        return checker;
    } 




}
