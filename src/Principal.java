import Modelo.filme;
import Modelo.Serie;
import calculos.calculadoraDeTempo;



public class Principal {

    public static void main(String[] args) {

        filme meuFilme = new filme();
        meuFilme.setNome("Piratas do caribe");
        meuFilme.setAnoDeLancamento(2004);
        meuFilme.setDuracaoEmMinutos(190);
        meuFilme.setDiretor("Heisenberg");
                
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(3);
        meuFilme.avalia(5);
        
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacao());
        System.out.println("Media de avaliacoes: " + meuFilme.pegaMedia());              
        
        
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracao para maratonar Lost: " + lost.getDuracaoEmMinutos());

        filme outroFilme = new filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
        
                       
    }
    
}

