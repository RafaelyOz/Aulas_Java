package funções;


import  java.util.Scanner;



public class met01 {
    public static float calcularMedia(float nota1, float nota2, float nota3){
        return (nota1 + nota2 + nota3) / 3;
   }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do aluno  ");
        String nome = input.next();

        System.out.print("digite 3 notas deste aluno  ");
        float nota1 = input.nextFloat();
        float nota2 = input.nextFloat();
        float nota3 = input.nextFloat();

        
        float media = calcularMedia(nota1, nota2, nota3);

        System.out.printf("O aluno %s obteve média %.2f\n", nome, media);

        input.close();


    }
}
