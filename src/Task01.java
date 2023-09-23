public class Task01 {
    public static void main(String[] args) {

    }
    static int [][] create(int sizeA, int sizeB,int mode){
        int matr[][] = new int[sizeA][sizeB];
        for (int i=0;i<sizeA;i++){
            for (int j=0;j<sizeB;j++){    //создание нулевой матрицы
                if (mode==0){
                    matr[i][j] = 0;
                }
                if(mode==1){              //создание единичной матрицы
                    if (i==j) {
                        matr[i][j] = 1;
                    }
                    else matr[i][j] = 0;
                }
            }
        }
    return matr;
    }
    static int [][] addMatr(int matrA[][],int matrB[][]){
        int matrC[][];
        if (matrA.length==matrB[0].length){
            matrC = new int[matrA.length][matrA[0].length];
            for (int i = 0; i < matrA.length; i++) {
                for (int j = 0; j < matrA[0].length; j++) {
                    matrC[i][j] = matrA[i][j] + matrB[i][j];
                }
            }
        } else {
            matrC = new int[2][2];
        }
        return matrC;
    }
    static int[][] Scalar(int matr[][], int var) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = matr[i][j] * var;
            }
        }
        return matr;
    }
    static int[][] multMatr(int matrA[][], int matrB[][]) {
        int matrC[][];
        if (matrA[0].length == matrB.length) {
            matrC = new int[matrA.length][matrB[0].length];
            for (int i = 0; i < matrC.length; i++) {
                for(int j = 0; j < matrC[0].length; j++) {
                    for(int k = 0; k < matrA[0].length; k++) {
                        matrC[i][j] += matrA[i][k] * matrB[k][j];
                    }
                }
            }
        } else {
            matrC = new int[2][2];
        }
        return matrC;
    }
    static String showMatr(int arr[]) {
        String str = new String();
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str;
    }
    static String showMatr(int arr[][]) {
        String str = new String();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                str += arr[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }

}
