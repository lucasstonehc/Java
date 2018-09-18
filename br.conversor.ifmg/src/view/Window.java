/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.TemperatureConverter;
/**
 *
 * @author stone
 */
public class Window extends JFrame implements ActionListener{

    private final JButton btnToFahrenheit;
    private final JButton btnToCelsius;
    private final JLabel lblCelsius;
    private final JLabel lblFahrenheit;
    private final JTextField txtFahrenheit;
    private final JTextField txtCelsius;
    private final int WIDTH = 700,HEIGHT = 100;
    TemperatureConverter converter;
    public Window(){
        this.btnToFahrenheit = new JButton("ºC para ºF");
        this.btnToCelsius = new JButton("ºF para ºC");
        this.lblFahrenheit = new JLabel("ºFahrenheit");
        this.lblCelsius = new JLabel("ºCelsius");
        this.txtFahrenheit = new JTextField(10);
        this.txtCelsius = new JTextField(10);
        this.setWindow();
        this.addComponent();
        this.setActionEvent();
        this.converter = new TemperatureConverter();
    }
    private void addComponent(){
        this.add(lblCelsius);
        this.add(txtCelsius);
        this.add(btnToFahrenheit);
        this.add(btnToCelsius);
        this.add(lblFahrenheit);
        this.add(txtFahrenheit);
        
    }
    private void setWindow(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setTitle("IFMG SABARÁ-BSI-CONVERSOR");
      
    }
    private void setActionEvent(){
        this.btnToCelsius.addActionListener(this);
        this.btnToFahrenheit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Double celsius;
        Double fahrenheit;
        if(e.getSource() == this.btnToCelsius){
           try{
                fahrenheit = Double.valueOf(this.txtFahrenheit.getText());
                this.converter.setFahrenheit(fahrenheit);
                celsius = this.converter.getCelsius();
                this.txtCelsius.setText(String.format(Locale.US,"%.2f",celsius));
           }catch(NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "valor inválido!");
           }
           
        }
        if(e.getSource() == this.btnToFahrenheit){
           try{
                celsius = Double.valueOf(this.txtCelsius.getText());
                this.converter.setCelsius(celsius);
                fahrenheit = this.converter.getFahrenheit();
                this.txtFahrenheit.setText(String.format(Locale.US,"%.2f",fahrenheit));
           }catch(NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "valor inválido!");
           }
        }
    }
    
}
