package operacoes.java;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private Lista <'tarefa'> tarefaLista;

    public ListaTarefa() {
        this.tarefaLista =  new Arraylist<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefaLista.add(new.tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<tarefa> tarefaParaRemover = new ArrayList();
        for(tarefa t : tarefaLista) {
            if(t.getdescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }

        }
        tarefalist.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefalist.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        listaTarefa listaTarefa = new ListaTarefa();

        System.out.println("o numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");


        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("o numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas("");

    }

}

