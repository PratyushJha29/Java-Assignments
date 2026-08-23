public class MatrixOperations {

    static int[] rowSums(int[][] m) {
        int[] sum = new int[m.length];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                sum[i] += m[i][j];

        return sum;
    }

    static int[] columnSums(int[][] m) {
        int[] sum = new int[m[0].length];

        for (int j = 0; j < m[0].length; j++)
            for (int i = 0; i < m.length; i++)
                sum[j] += m[i][j];

        return sum;
    }

    static int[][] add(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length)
            return null;

        int[][] c = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                c[i][j] = a[i][j] + b[i][j];

        return c;
    }

    static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];

        return t;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        if (a[0].length != b.length)
            return null;

        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    c[i][j] += a[i][k] * b[k][j];

        return c;
    }

    static void printMatrix(int[][] m) {
        if (m == null) {
            System.out.println("Not possible");
            return;
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] A = {{1,2,3},{4,5,6}};
        int[][] B = {{7,8,9},{1,2,3}};
        int[][] C = {{1,2},{3,4},{5,6}};

        printMatrix(add(A,B));

        System.out.println("Transpose:");
        printMatrix(transpose(A));

        System.out.println("Multiply:");
        printMatrix(multiply(A,C));
    }
}
