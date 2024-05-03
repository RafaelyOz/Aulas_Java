package herança;

public class exe0 {
    public static void main(String[] args) {

        Animal gato = new Animal("BU", 9);
        gato.emissaoSom();
        gato.ExibirInformacoes();

        Cachorro cachorro = new Cachorro("Cacau", 3, "pinscher");
        cachorro.emissaoSom();
        cachorro.ExibirInformacoes();
    }
}

class Animal {
    String nome;
    int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }

    public void setIdade(){
        this.idade = idade;
    }

    public void emissaoSom() {
        System.out.println("Som genérico do animal!");
    }

    public void ExibirInformacoes(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
    }
}

class Cachorro extends Animal {

    String raca;
    
    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    @Override
    public void emissaoSom() {
        System.out.println("AU AU");
    }
    @Override
    public void ExibirInformacoes(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Raça: " + this.raca);
    }

}
