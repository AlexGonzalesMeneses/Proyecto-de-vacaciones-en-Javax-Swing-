package Project;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Licencia extends JFrame implements ChangeListener,ActionListener{
    private JLabel label1,label2;
    private JCheckBox checkBox;
    private JButton button1,button2;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private String nombre ="";
    public Licencia(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Licencia de uso");

        Bienvenida ventanaBienvenida = new Bienvenida();
        nombre = ventanaBienvenida.getNameUser();

        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(200,5,230,30);
        label1.setFont(new Font("Andale Mono",1,14));
        label1.setBackground(new Color(0,0,0));
        add(label1);

        textArea = new JTextArea();
        //Para que no se pueda agregar texto en el lado del usuario
        textArea.setEditable(false);
        textArea.setFont(new Font("Andale Mono", 0,9));
        textArea.setText("\n\n      TÉRMINOS Y CONDICIONES");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10,40,575,200);
        add(scrollPane);

        checkBox = new JCheckBox("Yo " + nombre +" acepto");
        checkBox.setBounds(10,250,300,30);
        checkBox.addChangeListener(this);
        add(checkBox);

        button1 = new JButton("Continuar");
        button1.setBounds(10,290,130,30);
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);

        button2 = new JButton("No acepto");
        button2.setBounds(150,290,130,30);
        button2.addActionListener(this);
        add(button2);

        ImageIcon image = new ImageIcon(getClass().getResource("/images/coca-cola.png"));
        label2 = new JLabel(image);
        label2.setBounds(315,135,300,300);
        add(label2);
    }
    public void stateChanged(ChangeEvent event){
        if (checkBox.isSelected() == true){
            button1.setEnabled(true);
            button2.setEnabled(false);
        }else {
            button1.setEnabled(false);
            button2.setEnabled(true);
        }
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == button1){
            Pantalla_principal ventanaPrincipal = new Pantalla_principal();
            ventanaPrincipal.setBounds(0,0,680,535);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        }else
            if (event.getSource() == button2){
                Bienvenida ventanabienvenida = new Bienvenida();
                ventanabienvenida.setBounds(0,0,350,450);
                ventanabienvenida.setVisible(true);
                ventanabienvenida.setResizable(false);
                ventanabienvenida.setLocationRelativeTo(null);
                this.setVisible(false);
        }
    }
    public static void main(String [] args){
        Licencia ventanaLicencia = new Licencia();
        ventanaLicencia.setBounds(0,0,600,360);
        ventanaLicencia.setVisible(true);
        ventanaLicencia.setResizable(false);
        ventanaLicencia.setLocationRelativeTo(null);
    }
}
