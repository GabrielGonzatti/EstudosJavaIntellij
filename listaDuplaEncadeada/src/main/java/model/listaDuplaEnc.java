package model;

public class listaDuplaEnc {
    no inicio;
    no fim;
    int tamanho;
    public void inserirInicio(int info){
        no nodo = new no();
        nodo.info = info;
        nodo.anterior = null;
        nodo.proximo = inicio;
        if(inicio != null){
            inicio.anterior = nodo;
        }
        inicio = nodo;
        if (tamanho == 0){
            fim = inicio;
        }
        tamanho++;
    }
    public String toString (){
        String str = "(" + tamanho + ") ";
        no local = inicio;
        while (local != null){
            str += local.info + " ";
            local = local.proximo;
        }
        return str;
    }
    public static void main (String[] args){
        listaDuplaEnc l = new listaDuplaEnc();
        System.out.println();
        for (int i=0;i<10;i++){
            l.inserirInicio(i);
            System.out.println(l);
        }
    }
}
