public class CheckerHuman {
    
    private int Xaxis;
    private int Yaxis;
    private String[][] map;
    
    CheckerHuman(){

    }

    CheckerHuman(String[][] map){
        this.map = map;
    }

    CheckerHuman(int x, int y){
        this.Xaxis = x;
        this.Yaxis = y;

    }

    public int checkRow(int x, int y){
        int returner = 0;
            if(map[y][0] != null && map[y][1] != null && map[y][2] != null){
                if(map[y][0].equals(map[y][1]) && map[y][1].equals(map[y][2])){
                    if("X".equals(map[y][x])){returner = 1;}
                    else if("O".equals(map[y][x])){returner = 2;}
                }
            }
            return returner;
    }

    public int checkColm(int x, int y){
        int returner = 0;
            if(map[0][x] != null && map[1][x] != null && map[2][x] != null){
                if(map[0][x].equals(map[1][x]) && map[1][x].equals(map[2][x])){
                    if("X".equals(map[y][x])){returner = 1;}
                    else if("O".equals(map[y][x])){returner = 2;}
                }
            }
            return returner;
    }

    public int checkCross(){
        int returner = 0;
    
        if(map[0][0] != null && map[1][1] != null && map[2][2] != null){
            if(map[0][0].equals(map[1][1]) && map[1][1].equals(map[2][2])){
                if("X".equals(map[1][1])){returner = 1;}
                else if("O".equals(map[1][1])){returner = 2;}
            }
        }
    
        if(map[0][2] != null && map[1][1] != null && map[2][0] != null){
            if(map[0][2].equals(map[1][1]) && map[1][1].equals(map[2][0])){
                if("X".equals(map[1][1])){returner = 1;}
                else if("O".equals(map[1][1])){returner = 2;}
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
