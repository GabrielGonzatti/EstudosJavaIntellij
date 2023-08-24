import java.util.LinkedList;
import java.util.Queue;

public class testeFilas {
    public static void main (String [] args){
        //criação de filas:
        Queue<String> q = new LinkedList<>();
        //adicionando elementos:
        q.add("Javascript");
        q.add("Python");
        q.add("C#");
        q.add("Java");
        q.add("PHP");

        //editando elementos da fila:
        System.out.println("Elementos na fila: " +  q);
        System.out.println("Removendo um elemento: " + q.remove());
        System.out.println("Primeiro da fila: " + q.element());
        System.out.println("Removendo elemento: " + q.poll());
        System.out.println("Elementos em Queue: " + q);


    }
}
