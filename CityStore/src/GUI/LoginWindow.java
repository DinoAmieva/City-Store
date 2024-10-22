package GUI;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class LoginWindow extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton btnAcceder, btnNuevo;

    public LoginWindow() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Inicialización de los componentes
        JLabel lblUsuario = new JLabel("Usuario:");
        txtUsuario = new JTextField();

        JLabel lblContrasena = new JLabel("Contraseña:");
        txtContrasena = new JPasswordField();

        btnAcceder = new JButton("Acceder");
        btnNuevo = new JButton("Nuevo");

        // Agregamos los componentes al layout
        add(lblUsuario);
        add(txtUsuario);
        add(lblContrasena);
        add(txtContrasena);
        add(btnNuevo);
        add(btnAcceder);

        // Acción para el botón "Acceder"
        btnAcceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String contrasena = new String(txtContrasena.getPassword());

                if (usuario.equals("Dino") && contrasena.equals("123")) {
                    // Si las credenciales son correctas, mostramos la ventana de Información Personal
                    MenuPrincipal menuprincipal = new MenuPrincipal();
                    menuprincipal.setVisible(true);
                    dispose(); // Cerramos la ventana de login
                } else {
                    // Si las credenciales son incorrectas, mostramos un mensaje de error
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Acción para el botón "Nuevo"
        btnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsuario.setText("");
                txtContrasena.setText("");
            }
        });

        setVisible(true); // Hacemos visible la ventana de Login
    }

    public static void main(String[] args) {
        // Mostramos la ventana de Login
        LoginWindow loginwindow = new LoginWindow();
    }
}

