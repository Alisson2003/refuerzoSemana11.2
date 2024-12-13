import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainpanel;
    private JTextField Cedulatxt;
    private JTextField Nombretxt;
    private JTextField Eaddtxt;
    private JTextField Telefonotxt;
    private JTextField Direcciontxt;
    private JTextField Correotxt;
    private JButton crearButton;
    private JLabel RESULTADO;

    public form1() {
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComunidadEPN miembroepn1 = new ComunidadEPN();
                miembroepn1.setCedula(Cedulatxt.getText());
                miembroepn1.setNombre_completo(Nombretxt.getText());
                RESULTADO.setText(miembroepn1.mostrarDatos2());
            }
        });
    }
}
