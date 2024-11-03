public class Function {
    public boolean   ischotastique(double [][]A , int m , int n) {
        for (int i = 0; i < m; i++) {
            double totalligne = 0 ;
            for (int j = 0; j < n; j++) {
                totalligne += A[i][j];
            }
            if(totalligne != 1) {
                return false ;
            }

        }
        return true ;
    }

    public double[][] mulmatrice(double [][]A , double[][]X   ){
        double[][] m = new double[X.length][A[0].length];
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                for (int k = 0; k < X[0].length; k++) {
                    m[i][j] = X[i][k] * A[k][j] + m[i][j];
                }
            }
        }
        return  m ;
    }


    public double[][] matricepuisense(double [][]A,int t) {
        double[][] puismatrice = A;
        for (int nb = 0; nb < t; nb++) {
            puismatrice = mulmatrice(A, puismatrice);
        }
        return puismatrice;
    }




    public void  displaymatrice(double [][]matric ) {
        for (int i = 0; i < matric.length; i++) {
            for (int j = 0; j < matric[i].length; j++) {
                System.out.print(matric[i][j] + " ");
            }
            System.out.println();
        }

    }

    public double[][] recrisive(int y , double[][] A, double[][] X ) {
        double [][] recru = new double[X.length][A[0].length];
        if(y==0){
            return X ;
        }
        else {

            return mulmatrice(A, recrisive(y - 1, A, X));

        }

    }

}

