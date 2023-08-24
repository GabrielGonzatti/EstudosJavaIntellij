public class reptil extends animal{
    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Réptil");
    }
    @Override
   public void alimentar(){
        System.out.println("Comendo Vegetais");
   }

}
