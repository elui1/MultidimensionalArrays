
public class Main {
    public static void main(String[] args) {
        int[][] table = new int[10][5];

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("row " + i + " col " + j + " ");
            }
            System.out.println();
        }

        int[][] multi = new int[12][12];

        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <= 11; j++) {
                multi[i][j] = (i + 1) * (j + 1);
                System.out.print(multi[i][j]);
                System.out.print("\t\t");
            }
            System.out.println();
        }
    }
}


