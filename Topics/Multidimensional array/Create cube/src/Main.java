class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        int[][][] cube = new int[3][3][3];

        for (int i = 0; i < 3; i++) {           // Depth layer
            for (int j = 0; j < 3; j++) {       // Row
                for (int k = 0; k < 3; k++) {   // Column
                    cube[i][j][k] = j * 3 + k;
                }
            }
        }

        return cube;
    }
}