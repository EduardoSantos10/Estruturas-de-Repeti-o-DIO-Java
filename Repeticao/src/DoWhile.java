import java.util.Random;
public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando..."); // O telefone está discando
        do{
            System.out.println("Telefone tocando");// está tocando
        }while(tocando());

        System.out.println("Alô !!!");// Quando a expressão se tronar falsa, ele vai para a etapa de alô
        

    }
    private static boolean tocando(){ // Criei o método boolean tocando() para ver se atendeu sim ou não
        boolean atendeu = new Random().nextInt(3) == 1; // Vou atribuir a essa Var, um valor aleatório (Random)
                                                            // Se esse valor aleatório for igual a 1, quer dizer que ele atendeu
        System.out.println("Atendeu? " + atendeu); // Vou imprimir a mensagem questionando se ele atendeu

        return ! atendeu; // Operador (!) vai negar a chamada se caso ele atender

    }
    
}
