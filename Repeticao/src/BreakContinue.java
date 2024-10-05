public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero < 20; numero++){ // Criei meu FOR de 1 a 20
            // Declarei a Var numero e atribui 1 como valor
            // coloque como primeiro revisão se 1(numero) for menor que 20, o contador entra em ação e executa a incrementação
            
            if( numero == 8)// Condição: quando meu número chegar no 8, o comando break entra em ação e para a iteração
                break;// automaticamente quando ele chegar em 8, o loop para

                // OU

                // continue; // Quando tem o continue, ele não para na condição IF, simplesmente vai até o número 20, e não para no 8

            System.out.println(numero);// mensagem para exibir onde ele parou

            // Ele não imprimi o numero(8) da condição
                
        }
    }// Break
}
