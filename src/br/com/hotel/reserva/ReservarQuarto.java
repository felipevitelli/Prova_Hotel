package br.com.hotel.reserva;

public class ReservarQuarto{

    private Quarto quarto;
    private int qtdNoites

    public ReservarQuarto(Quarto quarto, int qtdNoites){
        this.quarto = quarto;
        this.qtdNoites = qtdNoites;
    }

    public Double calcularPreco(){

        return quarto.calcularPrecoPorNoite(qtdNoites);
    }
    public void exibirInfoReserva(){

        System.out.println("Categoria de quarto" +quarto.getClass().getSimpleName());
        System.out.println("Beneficios:"+quarto.getBeneficios());
        System.out.println("Quantidade de noites:"+qtdNoites);
        System.out.println("Preco"+calcularPreco());

    }

}
