public class exemplo04 {
    public static void main(String[] args) {
        Time barcelona = new Time("Barcelona");
        Time santos = new Time("Santos");

        barcelona.adicionarJogador(new Jogador("Neymar", "Atacante"));
        barcelona.adicionarJogador(new Jogador("Messi", "Meio-Campista"));

        santos.adicionarJogador(new Jogador("Neymar", "Atacante"));
        santos.adicionarJogador(new Jogador("Paulo Henrique Ganso", "Atacante"));

        barcelona.mostrarJogadores();
        santos.mostrarJogadores();
    }
}
    class Time{
        private String NomeTime;
        private Jogador[] jogadores;
        private int NumJogadores;

        public Time(String NomeTime){
            this.NomeTime = NomeTime;
            this.jogadores = new Jogador[11];
            this.NumJogadores = 0;
        }

        public void adicionarJogador(Jogador jogador) {
            if (NumJogadores < 11) {
                jogadores[NumJogadores++] = jogador;
            } else {
                System.out.println("O time já possui 11 jogadores.");
            }
        }

        public void mostrarJogadores(){
            System.out.println("Time: " + NomeTime + ":");
            for(int i = 0; i < NumJogadores; i++){
                System.out.println(jogadores[i].getNomeJogador() +"("+ jogadores[i].getPosicao() + ") ");
            }
            System.out.println();
        }
        
    }
    class Jogador{
        private String NomeJogador;
        private String Posicao;

        public Jogador(String NomeJogador, String Posicao ){
            this.NomeJogador = NomeJogador;
            this.Posicao = Posicao;
        }

        public String getNomeJogador(){
            return NomeJogador;
        }

        public String getPosicao(){
            return Posicao;
        }
    }


