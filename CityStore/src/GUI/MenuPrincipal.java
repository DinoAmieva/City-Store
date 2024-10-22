package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    private JButton btnProductos, btnClientes, btnTrabajadores, btnTicket, btnLogOut, btnSalir;

    public MenuPrincipal() {
        // Configuración del JFrame
        setTitle("City Store - Menú Principal");
        setSize(800, 600);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(new BorderLayout());

        // Barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Menú Productos
        JMenu menuProductos = new JMenu("Productos");
        JMenuItem itemProductos = new JMenuItem("Gestionar Productos");
        menuProductos.add(itemProductos);

        // Menú Clientes
        JMenu menuClientes = new JMenu("Clientes");
        JMenuItem itemClientes = new JMenuItem("Gestionar Clientes");
        menuClientes.add(itemClientes);

        // Menú Trabajadores
        JMenu menuTrabajadores = new JMenu("Trabajadores");
        JMenuItem itemTrabajadores = new JMenuItem("Gestionar Trabajadores");
        menuTrabajadores.add(itemTrabajadores);

        // Menú Ticket
        JMenu menuTicket = new JMenu("Ticket");
        JMenuItem itemTicket = new JMenuItem("Generar Ticket");
        menuTicket.add(itemTicket);

        // Menú Cerrar sesión
        JMenu menuLogOut = new JMenu("Cerrar sesión");
        JMenuItem itemLogOut = new JMenuItem("Volver a Log In");
        menuLogOut.add(itemLogOut);

        // Menú Salir
        JMenu menuSalir = new JMenu("Salir");
        JMenuItem itemSalir = new JMenuItem("Cerrar Programa");
        menuSalir.add(itemSalir);

        // Añadir menús a la barra de menú
        menuBar.add(menuProductos);
        menuBar.add(menuClientes);
        menuBar.add(menuTrabajadores);
        menuBar.add(menuTicket);
        menuBar.add(menuLogOut);
        menuBar.add(menuSalir);

        setJMenuBar(menuBar);

        // Panel de botones
        JPanel panelBotones = new JPanel(new GridLayout(3, 2, 10, 10));
        btnProductos = new JButton("Productos");
        btnClientes = new JButton("Clientes");
        btnTrabajadores = new JButton("Trabajadores");
        btnTicket = new JButton("Ticket");
        btnLogOut = new JButton("Log Out");
        btnSalir = new JButton("Salir");

        // Añadir botones al panel
        panelBotones.add(btnProductos);
        panelBotones.add(btnClientes);
        panelBotones.add(btnTrabajadores);
        panelBotones.add(btnTicket);
        panelBotones.add(btnLogOut);
        panelBotones.add(btnSalir);

        add(panelBotones, BorderLayout.CENTER);

        // Acciones de los botones
        btnProductos.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Gestionar Productos");
        });

        btnClientes.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Gestionar Clientes");
        });

        btnTrabajadores.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Gestionar Trabajadores");
        });

        btnTicket.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Generar Ticket");
        });

        btnLogOut.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Volver a Log In");
            // Aquí se regresa a la ventana de log in
        });

        btnSalir.addActionListener((ActionEvent e) -> {
            int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        // Acción de menú para cerrar sesión
        itemLogOut.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Volver a Log In");
        });

        // Acción de menú para salir del programa
        itemSalir.addActionListener((ActionEvent e) -> {
            int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginWindow(); 
    }
}
