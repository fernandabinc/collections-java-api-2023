package operacoes.java;


public class Tarefa {
    //Atributo
    private String descrição;

    public Tarefa (String descrição){
        this.descrição = descrição;

    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descrição='" + descrição + '\'' +
                '}';
    }






}
