public class Grid3D {
    public static void main(String[] args) {
        // Step 1: Define a 4x4x4 3D array
        int[][][] grid = new int[4][4][4];

        // Step 2: Populate the grid with numbers (for simplicity, use the index sum)
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    grid[x][y][z] = x * 16 + y * 4 + z + 1; // Assign sequential numbers
                }
            }
        }

        // Step 3: Display the 3D grid layer by layer
        // for (int x = 0; x < 4; x++) {
        //     System.out.println("Layer " + (x + 1) + ":");
        //     for (int y = 0; y < 4; y++) {
        //         for (int z = 0; z < 4; z++) {
        //             System.out.print(grid[x][y][z] + "\t");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println(); // Blank line between layers
        // }
        
        for(int i = 0; i < 4; i++){
            System.out.println(grid[0][i][0]);
        }

    }
}
