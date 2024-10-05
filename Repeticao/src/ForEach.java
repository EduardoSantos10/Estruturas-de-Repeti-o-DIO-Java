public class ForEach {

    public static void main(String[] args) {
        String alunos[] = {"EDUARDO", "SANTOS", "NOAH", "SANTOS"};
        // Declarei a minha string alunos e atribui seus valores com uma lista de arrays "[]"

        for(int x = 0; x < alunos.length; x++){ // Iniciei meu FOR
            // comecei com x e atrubui o valor de "0"(padrão de todas array)
            // comparei x com alunos.lenght(tamanho) e inicializei o contador 
            // enquanto x for menor que tamanho de alunos, ele vai contar e incrementar
            System.out.println("O aluno no indice x=: " + x + " \né\n " + alunos[x]); // Imprimi a mensagem
            // com "x" que é a posição e "alunos[x]" que é o meu indice virá resultado após a contagem
        }

        for (String aluno: alunos){ // Vou passando o valor incrementado de alunos para aluno (alunos -> aluno)
            System.out.println("Nome do aluno é: " + aluno); // A cada iteração, ele acrescenta o valor em aluno com ":"
        }// Forma abreviada
        
    }// For com Arrays

    
}
