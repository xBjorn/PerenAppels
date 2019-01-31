/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitautomaat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  


/**
 *
 * @author bw
 */
public class Fruitautomaat {
    
    int appels;
    int peren;
    
    //Lege fruitautomaat
    public Fruitautomaat()
    {
        
    }
    
    //Fruitautomaat die je kan bijvullen
    public Fruitautomaat(int appels, int peren)
    {
        
        this.appels = appels;
        this.peren = peren;
        
    }
    

    public void AppelVullen(int appels)
            
    {
        this.appels += appels;
        if(this.appels > 50)
        {
            this.appels = 50;
            System.out.println("Niet meer dan 50 appels");
        }
        
    }
  
    public void PerenVullen(int peren)
    {
        this.peren += peren;
        if(this.peren > 50)
        {
            this.peren = 50;
            System.out.println("Niet meer dan 50 peren");
        }
        
    }
    
    public void PerenKopen(int peren)
    {
        this.peren -= peren;
        if(this.peren < 0)
        {
            this.peren = 0;
            System.out.println("Niet minder dan 0 peren");
        } 
    }
    
    public void AppelKopen(int appels)
    {
        this.appels -= appels;
        if(this.appels < 0)
        {
            this.appels = 0;
            System.out.println("Niet minder dan 0 appels");
        }
    }
    
    public void CheckFruit()
    {
        System.out.println("Appels: "+this.appels);
        System.out.println("Peren: "+this.peren);
    }
    
    
    public static void main(String[] args) {
        
    Fruitautomaat Fruitautomaat = new Fruitautomaat();
    //Interface    
    JFrame frame = new fruitGUI();
    JButton k = new JButton("Vullen");
    JButton x = new JButton("Kopen");
    JButton c = new JButton("Check");
    JTextField kt = new JTextField(16);
    JTextField vt = new JTextField(16);
    JLabel kl = new JLabel("Peren: ");
    JLabel vl = new JLabel("Appels: ");
    frame.setSize( 800, 600 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Fruitautomaat" );
    frame.setVisible( true );    
    JPanel p = new JPanel();
    
    //Text & TextField
    p.add(kl);
    p.add(kt);
    
    //Text & TextField
    p.add(vl);
    p.add(vt);
    
    
    //Knoppen
    p.add(k);
    p.add(x);
    p.add(c);
  
    
    
    //Voeg het paneel toe aan de frame
    frame.add(p);
        
   
        k.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            String txtPeer = kt.getText();
            String txtAppels = vt.getText();
            //String naar int
            int newPeer = Integer.parseInt(txtPeer);
            int newAppels = Integer.parseInt(txtAppels);
            
            //Vul ze met de waarde
            Fruitautomaat.PerenVullen(newPeer);
            Fruitautomaat.AppelVullen(newAppels);
          }
        });
    

        //Check fruit
        c.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            Fruitautomaat.CheckFruit();
          }
        });
            
        //Kopen
        x.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            String txtPeer = kt.getText();
            String txtAppels = vt.getText();
            
            //String naar int
            int newPeer = Integer.parseInt(txtPeer);
            int newAppels = Integer.parseInt(txtAppels);
            
            Fruitautomaat.PerenKopen(newPeer);
            Fruitautomaat.AppelKopen(newAppels);
          }
        });
    
    }
}

    

    

