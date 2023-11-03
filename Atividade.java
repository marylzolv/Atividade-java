import javax.swing.JOptionPane;

public class Atividade {
    public static void main(String[] args) {
        String tamEnt = JOptionPane.showInputDialog("Digite a quantidade de nomes e contatinhos:");

        if (tamEnt.length() > 0) {
            int tam = Integer.parseInt(tamEnt);

            if (tam <= 0) {
                JOptionPane.showMessageDialog(null, "A quantidade de contatos deve ser maior que zero.");
            } else {
                String[] contatinho = new String[tam];
                String[] nome = new String[tam];

                for (int i = 0; i < tam; i++) {
                    contatinho[i] = JOptionPane.showInputDialog("Digite o número dos contatinhos:");
                    nome[i] = JOptionPane.showInputDialog("Digite o nome dos contatinhos:");
                }
                StringBuilder tabelaContatinhos = new StringBuilder("<html><body style='color:white; background-color:black; font-weight:bold;'><h1 style center>Lista de Contatos</h1>");
                tabelaContatinhos.append("<table border=\"1\" style=\"width: 100%; text-align: center; vertical-align: middle;\"><tr><th>Nome</th><th>Número do Contatinho</th></tr>");

                for (int j = 0; j < tam; j++) {
                    tabelaContatinhos.append("<tr><td>").append(nome[j]).append("</td><td>").append(contatinho[j]).append("</td><td align=\"right\"></td></tr>");
                }

                tabelaContatinhos.append("</table></body></html>");

                JOptionPane.showMessageDialog(null, tabelaContatinhos.toString(), "Contatinhos e Nomes", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}
