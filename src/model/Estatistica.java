package model;

public class Estatistica {
	
	public String nomeCidade;
    public String ufCidade;
    public int populacao;
    public int acidentes;
    
    public Estatistica () {
        this ("","",0,0);
    }
    
    public Estatistica (String nCidade, String ufC, int pop, int aci) {
        nCidade = nomeCidade;
        ufC = ufCidade;
        pop = populacao;
        aci = acidentes;
    }
    
}
