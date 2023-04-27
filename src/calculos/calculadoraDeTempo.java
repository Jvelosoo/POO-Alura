/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;
import Modelo.titulo;


    public class calculadoraDeTempo {

        private int tempoTotal;

        public int getTempoTotal() {
            return tempoTotal;
        }

        public void inclui(titulo Titulo) {
            this.tempoTotal += Titulo.getDuracaoEmMinutos();
        }
    }
