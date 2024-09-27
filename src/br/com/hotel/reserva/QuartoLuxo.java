package br.com.hotel.reserva;

//herança
public class QuartoLuxo extends Quarto{

    public QuartoLuxo(){
        Super(500.0);
    }
//polimorfismo
    @Override
        public String getBeneficios() {
        return "2 quartos, 2 camas, 1 cama de casal wifi, cafe da manha, servico de quarto";
    }
}
