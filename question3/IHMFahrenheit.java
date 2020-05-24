package question3;

import question1.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class IHMFahrenheit extends JFrame implements ActionListener {
    private JTextField entree = new JTextField(6);
    /**
     * Le bouton de conversion.
     */
    private JButton boutonDeConversion = new JButton("convertir");
    /**
     * La sortie en degr� Celsius.
     */
    private JTextField sortie = new JTextField(6);

    public IHMFahrenheit() {
        super("IHM Fahrenheit");

        setLayout(new FlowLayout());
        add(entree);
        add(boutonDeConversion);
        add(sortie);
        sortie.setEditable(false);
        getContentPane().setBackground(Color.pink);
        setLocation(100, 100);
        pack();
        setVisible(true);

        boutonDeConversion.addActionListener(this);
    }

    public static float fahrenheitEnCelsius(int f) {
        float cel = 5 / 9.0F * (f - 32);

            NumberFormat formatter = NumberFormat.getInstance(Locale.US);
            formatter.setMaximumFractionDigits(1);
            String temp = formatter.format(cel);
            temp = temp.replaceAll("[,;\\s]", "");
            Float formatedFloat = new Float(temp);
            return formatedFloat;

    }

    /**
     * m�thode d�clench�e lorsque le bouton de conversion est appuy�.
     * remarquer que le champs de droite (les degr�s Celsius) n'est pas �ditable.
     *
     * @param ae l'�v�nement transmis
     */
    public void actionPerformed(ActionEvent ae) {
        try {

            int fahrenheit = Integer.parseInt(entree.getText()); // valeur est une String et doit �tre convertie en entier, voir java.lang.Integer m�thode parseInt (--> try/catch)
            float celsius = fahrenheitEnCelsius(fahrenheit); // � compl�ter, en appelant la m�thode ad'hoc de la question2
            if(celsius < -273.1F){
                celsius = -273.1F;
            }

            sortie.setText(Float.toString(celsius));
        } catch (NumberFormatException nfe) {
            sortie.setText("error ! ");
        }
    }


    public static void main(String[] args) {
        new IHMFahrenheit();
    }
}