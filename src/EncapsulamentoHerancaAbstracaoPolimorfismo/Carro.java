package EncapsulamentoHerancaAbstracaoPolimorfismo;

public class Carro extends Veiculo
{


    public void ligar()
    {
        confereCambio(); // chamando os metodos encapsulados aqui e colocando dentro do metodo ligar
        confereCombustivel(); 
        System.out.println("CARRO LIGADO");
    }


    // metodos encapsulados -> private não é visivel na classe autodromo
    private void confereCombustivel() 
    {
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio()
    {
        System.out.println("Conferindo cambio em P");
    }
}
