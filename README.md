# tictactoev2



Hello Professor,

In this project, I developed both a classic TicTacToe game and a 4x4x4 3D TicTacToe game. I hope you find my work enjoyable.

Best regards,
Yusuf Aslan 230201001 Computer Engineering


My project files and their explanations:

    -Main.java:  
        For creating Start Screen, we can choose which gamemode we will play and also we can use settings button. Extra Computer will ask for X or O after choosing gamemode then program wil hold this information in its memory then will use it in future.

        // Under Main file we can show other files in two big group


        1- Classic.java:
            First file of Classic Tictactoe game. In this class user can choose are they gonna play against Computer or Human. Then program will call needed class and methods. 
            In this class we can choose do we wanna play against Computer or Human and program will run needed method to call ClassicComputer.java class or ClassicHuman.java class.
            
            A.ClassicHuman.java: 
                This class has a Constructer 3 methods:
                    a. Constructer:
                        Constructer will create a empty map, then it will fill it with CellState.Empty.

                    b. showMap() method:
                        This method will show Map as a 2D grid in terminal, also it has extra details like X and Y coordinates of Cell so player can choose which cell they want easier.

                    c. makeChangesOnMap(Scanner scanner) method:
                        This method will put X or O in map. It will ask for X and Y coordinates. Then code line will check if this cell is empty or not. If empty then it will put X or O. If not it will ask again for new coordinates. Then it will call showMap() method to print map so player can see all map after changes. After, this method will check is board full or not after putting X or Y, then if map is full it will print GAME IS DRAW then close program. In the end it will call CheckerHuman(CheckerHuman.java) class and will check if X or O has win situation or not then if yes it will look who win and print X WON or O WON.     

                    d. game(boolean XorO) method:
                        This method will give other methods Scanner and can set XorO. Main reason for this method is calling other methods (showMap(),makeChangesOnMap()) in one main method.

            B. ClassicComputer.java:
                This class has a Consructer and 3 methods:
                    a. Constructer:
                        Constructer will create a empty map, then it will fill it with CellState.Empty. 
                    
                    b. showMap() method:
                        This method will show Map as a 2D grid in terminal, also it has extra details like X and Y coordinates of Cell so player can choose which cell they want easier.

                    c. makeChangesOnMap(Scanner scanner):
                         This method will put X or O in map. It will ask for X and Y coordinates. Then code line will check if this cell is empty or not. If empty then it will put X or O. If not it will ask again for new coordinates. Then it will call showMap() method to print map so player can see all map after changes. 
                         If computer's turn it will choose a random empty cell then put a X or O in this empty cell.
                         After, this method will check is board full or not after putting X or Y, then if map is full it will print GAME IS DRAW then close program. In the end it will call CheckerHuman(CheckerHuman.java) class and will check if X or O has win situation or not then if yes it will look who win and print X WON or O WON.    

                    d. game(boolean XorO) method:
                        This method will give other methods Scanner and can set XorO. Main reason for this method is calling other methods (showMap(),makeChangesOnMap()) in one main method.

                

            C. CheckerHuman.java:
                This class has 3 Constructer and 4 methods:
                    a. Constructers:
                        Constructers will help me to run code with saving some variables(map, x, y) or without saving them.
                    
                    b. CheckRow(int x, int y):
                        This method will take X and Y coordinates of cell and then it will check all row if is there any win situation or not.
                        If yes it will check who win:
                            If O win method will return 1, if O win method will return 2.

                    c. CheckColm(int x, int y):
                        This method will take X and Y coordinates of cell and then it will check all colmns if is there any win situation or not.
                        If yes it will check who win:
                            If O win method will return 1, if O win method will return 2.

                    d. CheckCross(int x, int y):
                        This method will take X and Y coordinates of cell and then it will check all crosses if is there any win situation or not.
                        If yes it will check who win:
                            If O win method will return 1, if O win method will return 2.

                    e. check(int x, int y):
                        This method will run other check methods in one place then will return 0, 1 or 2 related to other methods.
            
        
            1- Tictactoe3D4by4.java:
                First file of 33D 4x4x4 TicTacToe game. In this class user can choose are they gonna play against Computer or Human. Then program will call needed class and methods. 
                This class will create an empty map then fill it with Cellstate.Empty so we can use this in other classes if needed.
                In this class we can choose do we wanna play against Computer or Human and program will run needed method to call Tictactoe3D4by4Computer.java class or Tictactoe3D4by4Human.java class.


                A. Tictactoe3D4by4Human.java:
                    This class has a Constructer and 5 methods:

                    a. Constructer:
                        Constructer will create a empty map, then it will fill it with CellState.Empty. 

                    b. showMapHorizontal():
                        This method will show 3D map Horizontally in four 2D map. 
                        Extra this method will add X, Y and Z coordinates of cell so player can easly choose empty cell.
                
                    c. showMapVertical():
                        This method will show 3D map Vertically in four 2D map. 
                        Extra this method will add X, Y and Z coordinates of cell so player can easly choose empty cell.

                    d. putX(Scanner scanner):
                        This method will let user put 'X' in empty cells on map. When method run it will ask for x, y and z coordinates of cell you want to fill with then if cell is empty method will put 'X' in this space.
                        In the end it will run checker.setXYZ(y-1,z-1,x-1) method from CheckerTictactoe3D4by4.java to set x, y and z coordinates.

                    e. putO(Scanner scanner):
                        This method will let user put 'O' in empty cells on map. When method run it will ask for x, y and z coordinates of cell you want to fill with then if cell is empty method will put 'O' in this space.
                        In the end it will run checker.setXYZ(y-1,z-1,x-1) method from CheckerTictactoe3D4by4.java to set x, y and z coordinates.

                    f. game(boolean XorO):
                        This method will run all other methods in one place and it will use checker.check(map) to check is there any win situation. 
                
                B. Tictactoe3D4by4Computer.java:
                    This class has a Constructer and 6 methods:
                        
                    a. Constructer:
                        Constructer will create a empty map, then it will fill it with CellState.Empty. 

                    b. showMapHorizontal():
                        This method will show 3D map Horizontally in four 2D map. 
                        Extra this method will add X, Y and Z coordinates of cell so player can easly choose empty cell.
                
                    c. showMapVertical():
                        This method will show 3D map Vertically in four 2D map. 
                        Extra this method will add X, Y and Z coordinates of cell so player can easly choose empty cell.

                    d. putX(Scanner scanner):
                        This method will let user put 'X' in empty cells on map. When method run it will ask for x, y and z coordinates of cell you want to fill with then if cell is empty method will put 'X' in this space.
                        In the end it will run checker.setXYZ(y-1,z-1,x-1) method from CheckerTictactoe3D4by4Computer.java to set x, y and z coordinates.

                    e. putO(Scanner scanner):
                        This method will let user put 'O' in empty cells on map. When method run it will ask for x, y and z coordinates of cell you want to fill with then if cell is empty method will put 'O' in this space.
                        In the end it will run checker.setXYZ(y-1,z-1,x-1) method from CheckerTictactoe3D4by4Computer.java to set x, y and z coordinates.

                    f.putRandom(Scanner scanner, boolean XorO): 
                        This method will put X or O to random Cell on map. When method run it will sellect random number between 0 to 63 and will check if this cell is, if yes it will put X or O in that cell if not it will take another random cell.  In the end it will run checker.setXYZ(y,z,x) method from CheckerTictactoe3D4by4Computer.java to set x, y and z coordinates.

                    g. game(boolean XorO):
                        This method will run all other methods in one place and it will use checker.check(map) to check is there any win situation. 

                C. CheckerTictactoe3D4by4.java:
                    This class has a constructer and 9 methods:

                    a. Constructer:
                        Constructer will save map variable to inside of CheckerTictactoe3D4by4 class.
                    
                    b. setXYZ(int x, int y, int z):
                        This method will set x, y and z coordinates in class variable.

                    c. rowChecker():
                        This method will take X, Y and Z coordinates of cell and then it will check all row if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.

                    d. colmChecker():
                        This method will take X, Y and Z coordinates of cell and then it will check all column if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.

                    e. deepChecker();
                        This method will take X, Y and Z coordinates of cell and then it will check third axis if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.

                    f. crossXCheck();
                        This method will take X, Y and Z coordinates of cell and then it will check cross at special X axis if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.
                 
                    g. crossYCheck();
                        This method will take X, Y and Z coordinates of cell and then it will check cross at special Y axis if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.
                 
                    h. crossZCheck();
                        This method will take X, Y and Z coordinates of cell and then it will check cross at special Z axis if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.

                    i. cross3dCheck():
                        This method will take X, Y and Z coordinates of cell and then it will check in third dimension if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.            

                    j. check(Tictactoe3D4by4Human.CellState[][][] map):
                        This method will take Tictactoe3D4by4Human.CellState[][][] map as variable and use all check methods in one place, then returns if X wins, O wins or nobody wins.


                D. CheckerTictactoe3D4by4Computer.java:  ( same with CheckerTictactoe3D4by4.java )
                    This class has a constructer and 9 methods:

                    a. Constructer:
                        Constructer will save map variable to inside of CheckerTictactoe3D4by4 class.
                    
                    b. setXYZ(int x, int y, int z):
                        This method will set x, y and z coordinates in class variable.

                    c. rowChecker():
                        This method will take X, Y and Z coordinates of cell and then it will check all row if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.

                    d. colmChecker():
                        This method will take X, Y and Z coordinates of cell and then it will check all column if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.

                    e. deepChecker();
                        This method will take X, Y and Z coordinates of cell and then it will check third axis if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.

                    f. crossXCheck();
                        This method will take X, Y and Z coordinates of cell and then it will check cross at special X axis if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.
                 
                    g. crossYCheck();
                        This method will take X, Y and Z coordinates of cell and then it will check cross at special Y axis if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.
                 
                    h. crossZCheck();
                        This method will take X, Y and Z coordinates of cell and then it will check cross at special Z axis if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.

                    i. cross3dCheck():
                        This method will take X, Y and Z coordinates of cell and then it will check in third dimension if is there any win situation or not.
                        If yes it will check who win:
                        If O win method will return 1, if O win method will return 2.            

                    j. check(Tictactoe3D4by4Human.CellState[][][] map):
                        This method will take Tictactoe3D4by4Human.CellState[][][] map as variable and use all check methods in one place, then returns if X wins, O wins or nobody wins.

    