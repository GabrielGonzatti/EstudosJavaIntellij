import java.util.Scanner;

public class pontos {
    public static void main (String []args){
        Scanner ler = new Scanner(System.in);
//3 jogadores 1D
        int jogador [][] = new int [3] [2];
        int pontos[] = new int [2];
//i será os jogadores
//j será os níveis

        int i, j=0;
        for (i=0;i<3;i++){
            System.out.printf("Pontos do jogador %d do nível %d: ", i+1, j+1 );
            jogador[i][j] = ler.nextInt();
        }
        j = 1;
        for (i=0;i<3;i++){
            System.out.printf("Pontos do jogador %d do nível %d: ", i+1, j+1);
            jogador[i][j] = ler.nextInt();
        }
        for (i=0;i<3;i++){
            for (j=0;j<2;j++){
                pontos[j] = pontos[j] + jogador[i][j];
            }
        }
        System.out.println();

        for (j=0;j<2;j++){
            System.out.printf("Total de pontos dos jogadores do nível %d é de: %d \n",j+1, pontos[j]);
        }
    }
}
