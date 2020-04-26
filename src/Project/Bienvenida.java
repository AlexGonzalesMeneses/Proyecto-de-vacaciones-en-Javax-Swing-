package Project;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

    private JTextField textfield1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;
    private static String nameUser = "";
    public Bienvenida(){
        setLayout(null);
        //Para cerrar el proceso
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
    /*El método getImage() -> lo que nos dice es vamos a obtener una imagen en una ruta
          El método getResource() -> Nos cargara la imagen
          getClass() -> obtendrá el nombre de nuestra clase y la mostrará
          setIcon() -> Nos dice que cambiará el icono
        **/
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        //Instanciamos el objto y le pasamos el path
        ImageIcon image = new ImageIcon(getClass().getResource("/images/logo-coca.png"));
        //System.out.println(image.toString());
        label1 = new JLabel(image);
        label1.setBounds(25,15,300,150);
        add(label1);

        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        //en los parametros e font agregamos la fuente, cursiva y tamaño
        label2.setFont(new Font("Andale Mono", 3, 17));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,215,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        label4 = new JLabel("©2020 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        textfield1 = new JTextField ();
        textfield1.setBounds(45,240,255,25);
        textfield1.setBackground(new Color(224,224,224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255,0,0));
        add(textfield1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);
    }
    public static String getNameUser(){
        return nameUser;
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            nameUser = textfield1.getText();
            if (nameUser.equals("")){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre");
            }else {
                Licencia ventanaLicencia = new Licencia();
                ventanaLicencia.setBounds(0,0,600,360);
                ventanaLicencia.setVisible(true);
                ventanaLicencia.setResizable(false);
                ventanaLicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }
    public static void main(String args[]){
        Bienvenida ventanabienvenida = new Bienvenida();
        ventanabienvenida.setBounds(0,0,350,450);
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);
    }
}