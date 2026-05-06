class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;

        char[][] res = new char[n][m];

        // Fill with empty cells
        for (char[] row : res) {
            Arrays.fill(row, '.');
        }

        for (int i = 0; i < m; i++) {

            int empty = n - 1;

            for (int j = n - 1; j >= 0; j--) {

                if (box[i][j] == '*') {

                    // Rotate obstacle
                    res[j][m - 1 - i] = '*';

                    // Next available position becomes left of obstacle
                    empty = j - 1;

                } 
                else if (box[i][j] == '#') {

                    // Place stone at rightmost valid position
                    res[empty][m - 1 - i] = '#';

                    empty--;
                }
            }
        }

        return res;
    }
}