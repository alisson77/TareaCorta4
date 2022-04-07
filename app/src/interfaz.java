import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.plaf.DimensionUIResource;
public class interfaz implements ActionListener{
    JFrame ventana;

    JPanel panelBotones;
    JButton botonUno;
    JButton botonDos;
    JButton botonTres;
    String []orden={"Uno","Dos","Tres"};
    String bnOp="Uno";
    int i=0;
    public interfaz(){
        ventana= new JFrame("Excepciones");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        agregarComponentes();
        ventana.setPreferredSize(new DimensionUIResource(700, 700));
        ventana.pack();
        ventana.setVisible(true);
    }
    private void agregarComponentes(){
       botonUno=new JButton("Uno");
       botonUno.addActionListener(this);
       botonDos=new JButton("Dos");
       botonDos.addActionListener(this);
       botonTres=new JButton("Tres");
       botonTres.addActionListener(this);
       panelBotones = new JPanel();
       panelBotones.setLayout(new GridLayout(15, 1));

        panelBotones.add(botonUno);
        panelBotones.add(botonDos);
        panelBotones.add(botonTres);
        ventana.add(panelBotones, BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        if(e.getSource().equals(botonUno)){
            bnOp="Uno";
            System.out.println(bnOp);
        }
        if(e.getSource().equals(botonDos)){
            bnOp="Dos";
            System.out.println(bnOp);
        }
        if(e.getSource().equals(botonTres)){
            bnOp="Tres";
        }
        try{
            if(orden[i]==bnOp){
                i=i+1;
                System.out.println(i);
                if(i==3){
                    JOptionPane.showMessageDialog(ventana,"A cumplido con la secuencia correctamente, cierre el programa");
                }
            }
            else{
                JOptionPane.showMessageDialog(ventana,"Continue con la se cuencia que iba, va por el boton:"+i);
            } 
        } 
        catch (Exception bn){
            JOptionPane.showMessageDialog(ventana, "Debe seguir la secuentacia de los botones");
        }
        
    }
}
