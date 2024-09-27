package br.com.hotel.reserva;

public class Quarto{

    private double precoPorNoite;

    public Quarto(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }
//encapsulamento
    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public abstract String getBeneficios();

    public double calcularPrecoPorNoite(int qtdNoites){

        return qtdNoites * precoPorNoite;

    }

}
