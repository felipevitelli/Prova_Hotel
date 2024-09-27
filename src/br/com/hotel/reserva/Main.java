package br.com.hotel.reserva;

import br.com.hotel.reserva.Quarto;
import br.com.hotel.reserva.QuartoSimples;
import br.com.hotel.reserva.QuartoLuxo;
import br.com.hotel.reserva.QuartoPresidencial;
import br.com.hotel.reserva.ReservarQuarto;

public class Hotel{
    public class Main {
                public static void main(String[] args) {

                     Quarto Simples = new QuartoSimples();
                     Quarto Luxo = new QuartoLuxo();
                     Quarto Presidencial = new QuartoPresidencial();

            Reserva reservaSimples = new Reserva(simples, 7);
            Reserva reservaLuxo = new Reserva(luxo, 10);
            Reserva reservaPresidencial = new Reserva(presidencial, 3);

            reservaSimples.exibirInfoReserva();
            System.out.println();

            reservaLuxo.exibirInfoReserva();
            System.out.println();

            reservaPresidencial.exibirInfoReserva();
            System.out.println();

        }
    }
}