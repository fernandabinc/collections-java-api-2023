package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivro {
    //atributo
    private List<livro> livroList;

    public catalogoLivro() {
        this.livroList = new ArrayList<>();
    }
    }
     public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
     }

    public List<Livro>pesquisarPorAutor(String autor) {
        List<livros> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase()) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;

        }
        public List<Livro> pesquisarPorIntervaloAnos ( int anoInicial, int anoFinal){
        List<livros> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos;
        }
        public Livro pesquisarPorTitulo(String titulo) {
            Livro livroPorTitulo = null;
                if (!livroList.isEmpty()){
                    for (Livro l : livroList){
                        if (l.getTitulo().equalsIgnoreCase(titulo)){
                            livroPorTitulo = l;
                            break;
                        }
                    }
                }
                return livroPorTitulo;
                }
        
        public static void main(String[]args){
            CatalogoLivros catalogoLivros = new CatalogoLivros();
            catalogoLivros.adicionarLivros( titulo:"Livro 1", autor:"Autor 1", anoPublicacao: 2020);
                catalogoLivros.adicionarLivros(titulo:"Livro 1", autor:"Autor 2"), anoPublicacao: 2021);
                catalogoLivros.adicionarLivros( titulo:"Livro 2", autor:"Autor 2", anoPublicacao: 2022);
                catalogoLivros.adicionarLivros( titulo:"Livro 3", autor:"Autor 3", anoPublicacao: 2023);
                catalogoLivros.adicionarLivros( titulo:"Livro 4", autor:"Autor 4", anoPublicacao: 1994;

                System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
                System.out.println(catalogoLivros.pesquisarPorAutIntervaloAnos(anoInicial 2020, anoFinal 2022));
System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

            }

            }
    }