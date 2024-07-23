package EncapsulamentoHerancaAbstracaoPolimorfismo;

public class Autodromo 
{
    public static void main(String[] args) 
    {
        Carro jeep = new Carro();
        jeep.setChassi("123456");
        //jeep.Ligar();

        Moto z400 = new Moto();
        z400.setChassi("789789");
        //z400.ligar();

        Veiculo coringa = jeep; // junto com a abstração o polimorfismo

        coringa.ligar();
    }
    
}