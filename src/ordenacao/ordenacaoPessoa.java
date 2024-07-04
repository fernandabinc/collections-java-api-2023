package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ordenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    public ordenacaoPessoa() {
        this.pessoaList = new ArrayList<>();

    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new pessoa(nome, idades, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    public List<Pessoa>ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    Public static void main (String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new ordenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa(nome:"Nome 1", idade 20, altura:1.56);
        ordenacaoPessoa.adicionarPessoa(nome:"Nome 2", idade 30, altura:1.88);
        ordenacaoPessoa.adicionarPessoa(nome:"Nome 3", idade 25, altura:1.70);
        ordenacaoPessoa.adicionarPessoa(nome:"Nome 4", idade 17, altura:1.56);


        System.out.println(ordenacao.ordenarPorIdade);
        //System.out.println(ordenacao.ordenarPorAltura);
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
