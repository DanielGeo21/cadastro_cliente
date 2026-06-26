package sistemaclientes;

import javax.swing.SwingUtilities;
import tela.TelaCadastroCliente;

public class SistemaClientes {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaCadastroCliente().setVisible(true);
        });
    }

}