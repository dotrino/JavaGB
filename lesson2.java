
public class lesson2 {
    public static void main(String[] args) {
        toFirstTaskArrays();
        toSecondTaskArrays();
        toThirdTaskArrays();
        toFourthTaskArrays();
    }

    static void toFirstTaskArrays() {
        int[] arrays1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrays1.length; i++) {
            arrays1[i] = arrays1[i] == 1 ? 0 : 1;
            System.out.print(arrays1[i] + " ");
        }
    }

    static void toSecondTaskArrays() {
        int[] arrays2 = new int[8];
        for (int i = 1, j = 0; i < arrays2.length; i++) arrays2[i] = j += 3;
        for (int x : arrays2) System.out.print(x + " ");
    }

    static void toThirdTaskArrays() {
        int[] arrays3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrays3.length; i++) {
            if (arrays3[i] < 6) arrays3[i] *= 2;
            System.out.print(arrays3[i] + " ");
        }
    }

    static void toFourthTaskArrays() {
        int[][] arrays4 = new int[7][7];
        for (int i = 0; i < arrays4.length; i++) {
            for (int j = 0, j2 = arrays4[i].length; j < arrays4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arrays4[i][j] = 1;
                System.out.print(arrays4[i][j] + " ");
            }
        }
    }
}