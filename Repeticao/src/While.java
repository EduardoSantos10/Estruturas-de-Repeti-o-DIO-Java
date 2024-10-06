import java.util.concurrent.ThreadLocalRandom; // Realizo a importação de classes, para simular valores aleatórios
public class While {
    public static void main(String[] args) {
        double mesada = 100.0; // Declaração da Var e atribuição de double com 100.0
        while(mesada > 0) { // Condição while (enquanto mesada for maior que 0, ele vai executando o loop)
            Double valorDoce = valorAleatorio(); // Declarei uma Var (valor do doce) que vai receber um valor aleatório qualquer (valorAleatorio)

            if( valorDoce > mesada) // Inicio a minha condição
                valorDoce = mesada; // Uso essa condição para valor do doce igualar a zero quando mesada também for 0
                                    // Mais para não deixar o valor negativo
            
            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho"); // Imprimo a mensagem o doce de um valor foi adiciono ao carrinho
            
            mesada = mesada - valorDoce; // Executo a função que: mesada subtraído o valor do doce adicionado
                                        // Enquanto a minha mesada for maior que o doce, eu continuo executando a condição
                                        // Em algum momento a Var condicionada (mesada) precisa ficar falsa para encerrar o programa
        }
        System.out.println("mesada " + mesada); // Imprimo o quanti tenho de mesada
        System.out.println("Joãozinho gastou toda sua mesada em doces!");


    }
    private static double valorAleatorio(){ // Método criado para auxiliar na chegada do valor aleatório
        return ThreadLocalRandom.current().nextDouble(2, 8); // ele vai me dar um valor entre 2 e 8 (valorAleatorio) para subtrair com mesada
    }
}
