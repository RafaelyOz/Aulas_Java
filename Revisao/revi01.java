package Revisao;

public class revi01 {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();
        Contato contato1 = new Contato("Andre", "7777-8888");
        Contato contato2 = new Contato("Rafaely", "8888-3333");

        minhaAgenda.AdicionarContato(contato1);
        minhaAgenda.AdicionarContato(contato2);

        minhaAgenda.ExibirContato();

       
        System.out.println("Total de contatos na agenda: " + minhaAgenda.TotalContatos());
    }
}

class Contato {
    private String NomeContato;
    private String Numerotelefone;

    public Contato(String NomeContato, String Numerotelefone) {
        this.NomeContato = NomeContato;
        this.Numerotelefone = Numerotelefone;
    }

    public String getNomeContato() {
        return NomeContato;
    }

    public String getNumerotelefone() {
        return Numerotelefone;
    }
}

class Agenda {
    private Contato[] contatos;
    private int NumContatos;

    public Agenda()
    {
        this.contatos = new Contato[50];
        this.NumContatos = 0;
    }

    public void AdicionarContato(Contato contato){
        if(NumContatos < 50){
            contatos[NumContatos++] = contato;
            System.out.println("Contato adicionado a agenda " + contato.getNomeContato());
        }else{
            System.out.println("Agenda está lotada!");
        }
    }

    public void ExibirContato(){
        for(int i = 0; i < NumContatos; i++){
            Contato contato = contatos[i];
            System.out.println("Nome do Contato: " + contato.getNomeContato() + ", número do contato: "+ contato.getNumerotelefone());
        }
    }

    public int TotalContatos() {
        return this.NumContatos;
    }
}
