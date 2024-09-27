package br.com.hotel.reserva;

//herança
public class QuartoPresidencial extends Quarto{

    public QuartoPresidencial(){
        super(1000.0);
    }
    //polimorfismo
    @Override
             public String getBeneficios() {
        return "3 quartos, 1 cama king-size, 2 camas de casal, servico de Spa, servico de quarto, wifi, cafe da manha, almoco";
    }
}
