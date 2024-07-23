package EncapsulamentoHerancaAbstracaoPolimorfismo;

public abstract class Veiculo // abstracao -> abstract = vai ser abstrata porque eu não sei como acontece ou alguma das coisas acontecem
{
    // herança -> chassi vai ter em moto e carro ou seja recursos comuns nos 2 -> classes especializadas 
    private String chassi;
    public String getChassi() 
    {
        return chassi;
    }
    public void setChassi(String chassi) 
    {
        this.chassi = chassi;
    }
    public abstract void ligar(); // abstract-> mas todo mundo que quiser ser um veiculo precisara ter o metodo ligar 
}
