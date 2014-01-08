
package matrices;

import java.util.Scanner;


public class Matrices {

   final static int TAMANYO=3;
    public static void main(String[] args) {
        int[][] matriz=new int[TAMANYO][TAMANYO];
        //rellenarMatriz(matriz);
        matrizIdentidad(matriz);
        mostrarMatriz(matriz);
        //mostrarDiagonal(matriz);
        //mostrarDiagonalSecundaria(matriz);
    }
    
    public static void rellenarMatriz(int[][] m){
        Scanner sc=new Scanner(System.in);
        //recorremos por filas
        for(int i=0;i<m.length;i++){
            //recorremos por columnas
            for(int j=0;j<m[i].length;j++){
                System.out.println("Dame un elemento");
                m[i][j]=sc.nextInt();
            }
        }
    }
    
    public static void mostrarMatriz(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] +  " ");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarDiagonal(int[][] m){ 
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i == j){
                    System.out.print(m[i][j] + " ");
                }
            }
        }
    }
    public static void mostrarDiagonalSecundaria(int[][] m){
         for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m.length-1-i==j){
                    System.out.println(m[i][j] + " ");
                }
            }
        }
    }
    
    public static void matrizIdentidad(int[][] m){
        for(int i=0;i<m.length;i++){
            m[i][i]=1;
        }
    }
     public static void matrizIdentidad2(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i==j){
                     m[i][j]=1;
                }
            }
        }
    }
    
    
}
