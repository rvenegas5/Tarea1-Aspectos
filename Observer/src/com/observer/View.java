package com.observer;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class View extends JFrame implements ActionListener{
	JButton botonRed;
	JButton botonBlack;
	JButton botonBlue;
	JLabel texto;
	
	public View() {
		
		setLayout(null);
		botonRed=new JButton("RED");
		botonBlack=new JButton("BLACK");
		botonBlue=new JButton("BLUE");
		
		botonRed.setBounds(100,150,100,30);
		botonBlack.setBounds(200, 150, 100, 30);
		//botonBlue.setBounds(x, y, width, height);
		
		botonRed.setBackground(Color.RED);
		botonBlack.setBackground(Color.BLACK);
		
		botonRed.addActionListener(this);
		botonBlack.addActionListener(this);
		
		add(botonRed);
		add(botonBlack);
		
		texto=new JLabel("Presione el botón para cambiar el color:");
		texto.setBounds(50,50,220,40);
		
		add(texto);
	}
	
	private void cambiarRojo() {
		try{
			Thread.sleep(3000);
			this.getContentPane().setBackground(Color.RED);
			} catch(Exception excep) {
				System.out.println(excep.getMessage());
			}
		finally {
			setTitle("Color RED establecido");
		}
	}
	
	private void cambiarNegro() {
		setTitle("Cambiando el color...");
		
		try{
		Thread.sleep(3000);
		this.getContentPane().setBackground(Color.BLACK);
		} catch(Exception excep) {
			System.out.println(excep.getMessage());
		}
		finally {
			setTitle("Color Black establecido");
			
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==botonRed) {
			setTitle("Cambiando el color");
			
			cambiarRojo();
		}
		else if (e.getSource()==botonBlack) {
			cambiarNegro();
		}
		
	}
}
