public class Classic {
    
    private String[][] map = new String[3][3];

    private boolean XorO;       //Who will start first      true == X , false == Y
    private boolean humanOrPc;  //Human or Pc will play as second player

    private int round;
    private int score;
    


    public Classic(boolean XorO) {
        this.XorO = XorO;
    }


    
    



    public void game(){
        System.out.println(XorO);


    }







}
