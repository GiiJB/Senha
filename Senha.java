package senha;
import javax.swing.JOptionPane;//Importação da classe JOptionPane (Cria caixa de diálogo)

public class Senha {

    public static void main(String[] args) {
               
        final String senha = "java";//Definição da constante do tipo String que vai armazenar a senha correta
        int cont=1, tentativas = 3;//Declaração da variável contador e a quantidade máxima de tentativas 
        String digitacao;//Variável do tipo String que vai armazenar o que o usuário vai digitar
       
        //Enquanto o contador for menor ou igual 3
        while(cont<=3){
            digitacao = JOptionPane.showInputDialog("Digite a senha: ");//Solicite a senha
            
            //Se a variável digitação estiver armazenando o mesmo valor da constante Senha
            if(digitacao.equalsIgnoreCase(senha)){
                JOptionPane.showMessageDialog(null, "Acesso Liberado!");//Apresenta ao usuário que seu acesso foi liberado
                break;//E finaliza o programa
            }
            //Se o usuário não acertar a senha e o contador for menor que três
            else if (cont < 3){
               JOptionPane.showMessageDialog(null, "Senha incorreta, você tem mais " + (tentativas - cont) + " tentativas");//Apresenta que a senha está incorreta e mostre quantas tentativas o usuário ainda possui
            }
            //Se o usuário não acertar a senha durante as três tentativas
            else{
            JOptionPane.showMessageDialog(null, "Suas tentativas acabaram");//Apresenta que suas tentativas acabaram
            }        
                     
            cont++;
        }
    }
    
}
