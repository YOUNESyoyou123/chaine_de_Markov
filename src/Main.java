import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter le nombre de ligne :");
        int m = sc.nextInt();
        System.out.println("Enter le nombre de column :");
        int n = sc.nextInt();
        double[][] A = new double[m][n];
        System.out.println("enter les element de la matrice  ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                A[i][j] = sc.nextDouble();
            }
        }

        Function ischotastique = new Function();
        boolean desition = ischotastique.ischotastique(A, m, n);
        if (desition) {
            System.out.println("la matrice est sophastique ");
        }
        else {
            System.out.println("la matrice est non sophastique ");
        }

        System.out.println("donner moi u ");
        double[][] X = new double[1][m];
        for (int i = 0; i < X[0].length; i++) {
            X[0][i] = sc.nextDouble();
        }
        double[][] matric = ischotastique.mulmatrice(A, X) ;

        for (int i = 0; i < matric.length; i++) {
            for (int j = 0; j < matric[i].length; j++) {
                System.out.print(matric[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println();
        double[][] multiple = ischotastique.matricepuisense(A,6) ;
        ischotastique.displaymatrice(multiple);



        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("method recricive");
        double[][] recrusive = ischotastique.recrisive(1 , A ,X) ;
        ischotastique.displaymatrice(recrusive);








    }


}