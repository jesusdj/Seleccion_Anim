import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;//Bordes

import java.awt.event.*;


public class Button_Group extends JFrame implements ActionListener {

    public Button_Group(){

        this.setLayout(new BorderLayout());
        JPanel panelArriba=new JPanel();
        JPanel panelAbajo=new JPanel();

       // panelAbajo.setLayout(new GridLayout(3,3,5,10));
        panelAbajo.setLayout(new BoxLayout(panelAbajo,BoxLayout.X_AXIS));
        panelArriba.setLayout(new BoxLayout(panelArriba,BoxLayout.Y_AXIS));
        JLabel picture=new JLabel(new ImageIcon("src/gato.jpg"));

        JRadioButton  birdButton =new JRadioButton("Lorito");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setActionCommand("Bird");
        birdButton.setSelected(true);

        JRadioButton catButton=new JRadioButton("Gatito");
        catButton.setMnemonic(KeyEvent.VK_B);
        catButton.setActionCommand("Cat");


        JRadioButton dogButton=new JRadioButton("Perrito");
        dogButton.setMnemonic(KeyEvent.VK_B);
        dogButton.setActionCommand("Dog");

        JRadioButton rabbitButton=new JRadioButton("Conejito");
        rabbitButton.setMnemonic(KeyEvent.VK_B);
        rabbitButton.setActionCommand("Rabbit");

        JRadioButton pigButton=new JRadioButton("Cerdito");
        pigButton.setMnemonic(KeyEvent.VK_B);
        pigButton.setActionCommand("Pig");

        ButtonGroup btgAnimalitos = new ButtonGroup();

        btgAnimalitos.add(birdButton);
        btgAnimalitos.add(catButton);
        btgAnimalitos.add(dogButton);
        btgAnimalitos.add(rabbitButton);
        btgAnimalitos.add(pigButton);

        getContentPane().add(picture);
        panelArriba.setBackground(Color.green);
        panelAbajo.setBackground(Color.DARK_GRAY);

        //Se AÃ±aden a la ventana principal (JFRAME)
        this.add(panelArriba,BorderLayout.WEST);
        this.add(panelAbajo,BorderLayout.SOUTH);


        panelArriba.add(catButton).setBackground(Color.green);
        panelArriba.add(birdButton).setBackground(Color.green);
        panelArriba.add(dogButton).setBackground(Color.green);
        panelArriba.add(rabbitButton).setBackground(Color.green);
        panelArriba.add(pigButton).setBackground(Color.green);
        panelArriba.setBackground(Color.green);
        getContentPane().setBackground(Color.green);


        JButton btnAceptar=new JButton("Aceptar");//Creacción de un botón
        btnAceptar.setBackground(Color.orange);
        btnAceptar.setBounds(40,100,100,30);//Ubicaci�n del boton
        panelAbajo.add(btnAceptar);

        JButton btnCancelar=new JButton("Cancelar");//Creacción de un botón
        btnCancelar.setBackground(Color.orange);
        btnCancelar.setBounds(150,100,100,30);//Ubicaci�n del boton
        panelAbajo.add(btnCancelar);//Se agrega el boton al panel principal

        pack();

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento producido por " + e.getActionCommand());
    }

    public static void main (String[] args) {
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        JFrame frame = new Button_Group();
        frame.addWindowListener(l);
        frame.pack();
        frame.setVisible(true);
    }

   /* public static void main(String[] args) {
        Button_Group BG =new Button_Group();
        BG.setVisible(true);
        BG.setBounds(200, 200, 400, 250);

    }*/
}