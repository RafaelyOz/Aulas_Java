public class aula003 {
 
        public static void main(String[] args) {
            Funcionario funcionario1 = new Funcionario("Joao", "Desenvolvedor");
            Funcionario funcionario2 = new Funcionario("Maria", "Gerente");
            Funcionario funcionario3 = new Funcionario("Pedro", "Analista");
            Funcionario funcionario4 = new Funcionario("Ana", "Auxiliar");
            
            Departamento departamento1 = new Departamento("TI");
            departamento1.adicionarFuncionario(funcionario1);
            departamento1.adicionarFuncionario(funcionario2);
            
            Departamento departamento2 = new Departamento("RH");
            departamento2.adicionarFuncionario(funcionario3);
            departamento2.adicionarFuncionario(funcionario4);
            
            Empresa empresa1 = new Empresa("UP");
            empresa1.adicionarDepartamento(departamento1);
            empresa1.adicionarDepartamento(departamento2);
            
            empresa1.mostrarInformacoes();
            
        }
    }
     
    class Funcionario {
        private String nome;
        private String cargo;
     
        public Funcionario(String nome, String cargo) {
            this.nome = nome;
            this.cargo = cargo;
        }
     
        public String getNome() {
            return nome;
        }
     
        public String getCargo() {
            return cargo;
        }
    }
     
    class Departamento{
        private String nome;
        private Funcionario[] funcionarios;
        private int numFuncionarios;
        
        public Departamento(String nome){
            this.nome = nome;
            this.funcionarios = new Funcionario[10];
            this.numFuncionarios = 0;
        }
        
        public void adicionarFuncionario(Funcionario funcionario){
            funcionarios[numFuncionarios] = funcionario;
            numFuncionarios++;
        }
        
        public void mostrarInformacoes(){
            System.out.println("\nDepartamento: " + this.nome);
            for(int i = 0; i < numFuncionarios; i++){
                System.out.println(funcionarios[i].getNome() + " - " + funcionarios[i].getCargo());
            }
        }
    }
     
    class Empresa{
        private String nome;
        private Departamento[] departamentos;
        private int numDepartamentos;
        
        public Empresa(String nome){
            this.nome = nome;
            this.departamentos = new Departamento[10];
            this.numDepartamentos = 0;
        }
        
        public void adicionarDepartamento(Departamento departamento){
            departamentos[numDepartamentos] = departamento;
            numDepartamentos++;
        }
        
        public void mostrarInformacoes(){
            System.out.println("Empresa: " + this.nome);
            for(int i = 0; i < numDepartamentos; i++){
                departamentos[i].mostrarInformacoes();
            }
        }
    }

