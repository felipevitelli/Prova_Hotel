package br.com.hotel.reserva;

//herança
public class QuartoSimples extends Quarto{

    public QuartoSimples(){
        super(200.0);
    }
    //polimorfismo
    @Override
    public String getBeneficios(){
        return "1 quarto, 1 cama de solteiro, wifi";
    }
}



