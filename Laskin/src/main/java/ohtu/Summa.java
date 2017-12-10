/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Otto
 */
public class Summa implements Komento{
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int luku;

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }
 
    

    @Override
    public void suorita() {
        luku = Integer.parseInt(syotekentta.getText());
        sovellus.plus(luku);
    }

    @Override
    public void peru() {
        sovellus.miinus(luku);
    }
    
    
}
