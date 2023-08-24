import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class vinhos {
    public static void main (String[] args){

        Stack<String> pilhaDeVinhos = new Stack<>();
        Scanner leitura = new Scanner(System.in);
        int capacidade = 10;
        while (true){
            int vinhosNaAdega = pilhaDeVinhos.size();
            if (vinhosNaAdega == capacidade){
                System.out.println("Capacidade máxima alcançada!");
                break;
            }
            System.out.println("Incluir vinho? [S/N]; ");
            String cadastrarVinho = leitura.nextLine();
            if ("S".equalsIgnoreCase(cadastrarVinho)){
                System.out.print("Informe o nome do Vinho: ");
                String nomeDoVinho = leitura.nextLine();
                pilhaDeVinhos.push(nomeDoVinho);
                System.out.println("Vinhos na adega: " + pilhaDeVinhos);
                System.out.println("Existem " + pilhaDeVinhos.size() + " vinhos na adega");
            }
            System.out.print("Hoje tem ocasião especial? [S/N]: ");
            String resposta = leitura.nextLine();
            if ("S".equalsIgnoreCase(resposta)){
                String vinhoParaAbrir = pilhaDeVinhos.pop();
                System.out.println("Abrir o vinho " + vinhoParaAbrir);
            }

            //isEmpty = vazia
            if (pilhaDeVinhos.isEmpty()){
                System.out.println("Acabaram os vinhos!");
            } else {
                String vinhoParaProxima = pilhaDeVinhos.peek();
                System.out.println("Existem " + pilhaDeVinhos.size() + " vinhos na adega.");
                System.out.println("Para a próxima ocasião abrir o vinho: " + vinhoParaProxima);
            }
                System.out.println("Vinhos na Adega " + pilhaDeVinhos);
                System.out.println("----------------------------------------------------------------");
                System.out.println("Finalizar aplicação? [S/N] " );
                String finalizarAplicacao = leitura.nextLine();
                if ("S".equalsIgnoreCase(finalizarAplicacao)){
                    break;
                }
        }
    }
}
