package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulo;


public class calculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;

    }

   /* public void inlcui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Series s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }
*/
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
