package senha;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Senha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
       
        final String senha = "java";
        int cont=1, tentativas = 3;
        String digitacao;
       
        while(cont<=3){
            digitacao = JOptionPane.showInputDialog("Digite a senha: ");
            
            if(digitacao.equalsIgnoreCase(senha)){
                JOptionPane.showMessageDialog(null, "Acesso Liberado!");
                break;
            }
            else if (cont < 3){
               JOptionPane.showMessageDialog(null, "Senha incorreta, você tem mais " + (tentativas - cont) + " tentativas");
            }
            else{
            JOptionPane.showMessageDialog(null, "Suas tentativas acabaram");
            }        
                     
            cont++;
        }
    }
    
}
