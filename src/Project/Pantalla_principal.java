package Project;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
public class Pantalla_principal extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menuOpciones,menuCalcular,menuAcercaDe,menuColorFondo;
    private JMenuItem miCalculo,miRojo,miNegro,miMorado,miElCreador,miSalir,miNuevo;
    private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,
            labelDepartamento,labelAntiguedad,labelResultado,labelFooter;
    private JComboBox comboDepartamento,comboAntiguedad;
    private JTextField txtNombreTrabajador,txtPaternoTrabajador,txtAMaternoTrabajador;
    private JTextArea textArea;
    private JScrollPane scrollPane, scrollPane1;
    private String nombreUser;
    private String resultado;
    public Pantalla_principal(){
        setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        resultado = "";

        Bienvenida ventanaBienvenida = new Bienvenida();
        nombreUser = ventanaBienvenida.getNameUser();

        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255,0,0));
        setJMenuBar(menuBar);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono",1,14));
        menuOpciones.setForeground(new Color(255,255,255));
        menuBar.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono",1,14));
        menuCalcular.setForeground(new Color(255,255,255));
        menuBar.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono",1,14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        menuBar.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setBackground(new Color(255,0,0));
        menuColorFondo.setFont(new Font("Andale Mono",1,14));
        menuColorFondo.setForeground(new Color(255,255,255));
        menuBar.add(menuColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono",1,14));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono",1,14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono",1,14));
        miNegro.setForeground(new Color(255,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono",1,14));
        miMorado.setForeground(new Color(255,0,0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miElCreador = new JMenuItem("Acerca de");
        miElCreador.setFont(new Font("Andale Mono", 1,14));
        miElCreador.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono",1,14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        ImageIcon image = new ImageIcon(getClass().getResource("/images/logo-coca.png"));
        labelLogo = new JLabel(image);
        labelLogo.setBounds(15,5,250,100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido " + nombreUser);
        labelBienvenido.setBounds(275,30,300,50);
        labelBienvenido.setFont(new Font("Andale Mono",1,32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        labelTitle.setBounds(45,140,900,25);
        labelTitle.setFont(new Font("Andale Mono",0,24));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre(s)");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font("Andale Mono",1,12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField(nombreUser);
        txtNombreTrabajador.setBounds(25,213,150,25);
        txtNombreTrabajador.setBackground(new Color(224,224,224));
        txtNombreTrabajador.setFont(new Font("Andale Mono",1,14));
        txtNombreTrabajador.setForeground(new Color(255,0,0));
        add(txtNombreTrabajador);

        labelAPaterno = new JLabel("Apellido paterno");
        labelAPaterno.setBounds(25,248,180,25);
        labelAPaterno.setFont(new Font("Andale Mono",1,12));
        labelAPaterno.setForeground(new Color(255,255,255));
        add(labelAPaterno);

        txtPaternoTrabajador = new JTextField();
        txtPaternoTrabajador.setBounds(25,273,150,25);
        txtPaternoTrabajador.setBackground(new Color(224,224,224));
        txtPaternoTrabajador.setFont(new Font("Andale Mono",1,14));
        txtPaternoTrabajador.setForeground(new Color(255,0,0));
        add(txtPaternoTrabajador);

        labelAMaterno = new JLabel("Apellido materno");
        labelAMaterno.setBounds(25,308,180,25);
        labelAMaterno.setFont(new Font("Andale Mono",1,12));
        labelAMaterno.setForeground(new Color(224,224,224));
        add(labelAMaterno);

        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25,334,150,25);
        txtAMaternoTrabajador.setBackground(new Color(255,255,255));
        txtAMaternoTrabajador.setFont(new Font("Andale Mono",1,14));
        txtAMaternoTrabajador.setForeground(new Color(255,0,0));
        add(txtAMaternoTrabajador);

        labelDepartamento = new JLabel("Seleccione departamento");
        labelDepartamento.setBounds(220,188,180,25);
        labelDepartamento.setFont(new Font("Andale Mono",1,14));
        labelDepartamento.setForeground(new Color(224,224,224));
        add(labelDepartamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220,213,220,25);
        comboDepartamento.setBackground(new Color(224,224,224));
        comboDepartamento.setFont(new Font("Andale Mono",1,14));
        comboDepartamento.setForeground(new Color(255,0,0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atención al Cliente");
        comboDepartamento.addItem("Departamento de Logistica");
        comboDepartamento.addItem("Departamento de Gerencia");

        labelAntiguedad = new JLabel("Seleccione la antigüedad");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font("Andale Mono",1,14));
        labelAntiguedad.setForeground(new Color(224,224,224));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220,273,220,25);
        comboAntiguedad.setBackground(new Color(224,224,224));
        comboAntiguedad.setFont(new Font("Andale Mono",1,14));
        comboAntiguedad.setForeground(new Color(255,0,0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de antigüedad");
        comboAntiguedad.addItem("2 a 6 años de antigüedad");
        comboAntiguedad.addItem("7 años o más de servicio");

        labelResultado = new JLabel("Resultado de calculo");
        labelResultado.setBounds(220,307,180,25);
        labelResultado.setFont(new Font("Andale mono",1,14));
        labelResultado.setForeground(new Color(224,224,224));
        add(labelResultado);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBackground(new Color(224,224,224));
        textArea.setFont(new Font("Andale Mono",1,14));
        textArea.setForeground(new Color(255,0,0));
        textArea.setText("\n    Aquí aparece el resultado del cálculo de las vacaciones");
        scrollPane1 = new JScrollPane(textArea);
        scrollPane1.setBounds(220,333,385,90);
        add(scrollPane1);

        labelFooter = new JLabel("©2020 The Coca-Cola Company | Todos los derechos reservados");
        labelFooter.setBounds(85,445,500,30);
        labelFooter.setFont(new Font("Andale mono",1,12));
        labelFooter.setForeground(new Color(224,224,224));
        add(labelFooter);
    }
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == miCalculo) {
            String nombreTrabajador = txtNombreTrabajador.getText();
            String aPaterno = txtPaternoTrabajador.getText();
            String aMaterno = txtAMaternoTrabajador.getText();
            String departamento = comboDepartamento.getSelectedItem().toString();
            String antiguedad = comboAntiguedad.getSelectedItem().toString();
            if (nombreTrabajador.equals("") || aPaterno.equals("") || aMaterno.equals("") || departamento.equals("") || antiguedad.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            } else {
                if (departamento.equals("Atención al Cliente")) {
                    if (antiguedad.equals("1 año de antigüedad")) {
                        resultado = "\n El trabajador: " + nombreTrabajador + " " + aPaterno + " " + aMaterno + ", " +
                                "\n quien labora en " + departamento + " con " + antiguedad + "." +
                                "\n Recibe 6 dias de vacaciones";
                    } else {
                        if (antiguedad.equals("2 a 6 años de antigüedad")) {
                            resultado = "\n El trabajador: " + nombreTrabajador + " " + aPaterno + " " + aMaterno + ", " +
                                    "\n quien labora en " + departamento + " con " + antiguedad + "." +
                                    "\n Recibe 14 dias de vacaciones";
                        } else {
                            resultado = "\n El trabajador: " + nombreTrabajador + " " + aPaterno + " " + aMaterno + ", " +
                                    "\n quien labora en " + departamento + " con " + antiguedad + "." +
                                    "\n Recibe 20 dias de vacaciones";
                        }
                    }
                }
                if (departamento.equals("Departamento de Logistica")) {
                    if (antiguedad.equals("1 año de antigüedad")) {
                        resultado = "\n El trabajador: " + nombreTrabajador + " " + aPaterno + " " + aMaterno + ", " +
                                "\n quien labora en " + departamento + " con " + antiguedad + "." +
                                "\n Recibe 7 dias de vacaciones";
                    } else {
                        if (antiguedad.equals("2 a 6 años de antigüedad")) {
                            resultado = "\n El trabajador: " + nombreTrabajador + " " + aPaterno + " " + aMaterno + ", " +
                                    "\n quien labora en " + departamento + " con " + antiguedad + "." +
                                    "\n Recibe 15 dias de vacaciones";
                        } else {
                            resultado = "\n El trabajador: " + nombreTrabajador + " " + aPaterno + " " + aMaterno + ", " +
                                    "\n quien labora en " + departamento + " con " + antiguedad + "." +
                                    "\n Recibe 22 dias de vacaciones";
                        }
                    }
                }
                if (departamento.equals("Departamento de Gerencia")) {
                    if (antiguedad.equals("1 año de antigüedad")) {
                        resultado = "\n El trabajador: " + nombreTrabajador + " " + aPaterno + " " + aMaterno + ", " +
                                "\n quien labora en " + departamento + " con " + antiguedad + "." +
                                "\n Recibe 10 dias de vacaciones";
                    } else {
                        if (antiguedad.equals("2 a 6 años de antigüedad")) {
                            resultado = "\n El trabajador: " + nombreTrabajador + " " + aPaterno + " " + aMaterno + ", " +
                                    "\n quien labora en " + departamento + " con " + antiguedad + "." +
                                    "\n Recibe 20 dias de vacaciones";
                        } else {
                            resultado = "\n El trabajador: " + nombreTrabajador + " " + aPaterno + " " + aMaterno + ", " +
                                    "\n quien labora en " + departamento + " con " + antiguedad + "." +
                                    "\n Recibe 30 dias de vacaciones";
                        }
                    }
                }
            }
            textArea.setText(resultado);
        }
        if (event.getSource() == miRojo) {
                this.getContentPane().setBackground(new Color(255,0,0));
            }
        if (event.getSource() == miNegro) {
                this.getContentPane().setBackground(new Color(0,0,0));
            }
        if (event.getSource() == miMorado) {
                this.getContentPane().setBackground(new Color(255,0,255));
            }
        if (event.getSource() == miNuevo) {
                txtNombreTrabajador.setText(nombreUser);
                txtPaternoTrabajador.setText("");
                txtAMaternoTrabajador.setText("");
                comboAntiguedad.setSelectedItem(0);
                comboDepartamento.setSelectedItem(0);
                textArea.setText("\n Aquí aparece el resultado del cálculo de las vacaciones.");
            }
        if (event.getSource() == miSalir) {
                Bienvenida ventanabienvenida = new Bienvenida();
                ventanabienvenida.setBounds(0,0,350,450);
                ventanabienvenida.setVisible(true);
                ventanabienvenida.setResizable(false);
                ventanabienvenida.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        if (event.getSource() == miElCreador) {
                JOptionPane.showMessageDialog(null,"Alex Gonzales");
            }
        }
    public static void main(String [] args){
        Pantalla_principal ventanaPrincipal = new Pantalla_principal();
        ventanaPrincipal.setBounds(0,0,680,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
}
