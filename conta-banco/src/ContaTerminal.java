import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO importar e conhecer a classe scanner
        //Exibir as mensagens para o novo usuario
        //Obter pelo scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
    
        Scanner scanner = new Scanner(System.in);

        double saldo = 25 ;
        double valorSolicitado = 22 ;

        if (saldo >= valorSolicitado){
            saldo -= valorSolicitado;
            System.out.println("Novo saldo = " + saldo + ("R$"));
        }else  {
            System.out.println("Saldo Insuficiente  ");
        }
        System.out.println( "Saldo atual = " + saldo + ("R$"));
        scanner.close();
    }
}
