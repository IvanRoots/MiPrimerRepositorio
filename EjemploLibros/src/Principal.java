
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;


/*
 * Autor Cristian Ivan Reyes Ramirez
 * Fecha Viernes 27 de junio de 2014
 */

public class Principal extends JFrame implements ActionListener, WindowListener {
	private static final long serialVersionUID = 1L;
	private JMenu archivoMenu;
	private JMenuItem salirMenu;
	private JMenu opcionesMenu;
	private JMenuItem altaMenu;
	private JMenuItem bajaMenu;
	private JMenuItem cambioMenu;
	private JMenuItem consultas;
	private JMenuItem consultaIndividual;
	private JMenuItem consultaGeneral;
	private JMenu ayudaMenu;
	private JMenuItem acercaDe;
	private Vector<Libro> libros;
	
	public Principal() {
		super("Manejo de Libros");
		setSize(1360,720);
		setLocationRelativeTo(null);
		setResizable(false);
		
		//Se crea la barra de menu y un elemento
		JMenuBar barra = new JMenuBar();
		archivoMenu = new JMenu("Archivo");
		archivoMenu.setMnemonic(KeyEvent.VK_A);
		salirMenu = new JMenuItem("Salir");
		salirMenu.setMnemonic(KeyEvent.VK_S);
		salirMenu.addActionListener(this);//evento
		archivoMenu.add(salirMenu);
		barra.add(archivoMenu);
		
		
		//se crea la siguiente elemento de nuestra barra de menu y se agregan sus diferentes opciones
		opcionesMenu = new JMenu("Opciones");
		altaMenu = new JMenuItem("Altas");
		altaMenu.setMnemonic(KeyEvent.VK_B);
		altaMenu.addActionListener(this);
		opcionesMenu.add(altaMenu);
		bajaMenu = new JMenuItem("Bajas");
		bajaMenu.setMnemonic(KeyEvent.VK_B);
		bajaMenu.addActionListener(this);
		opcionesMenu.add(bajaMenu);
		cambioMenu = new JMenuItem("Cambios");
		cambioMenu.setMnemonic(KeyEvent.VK_B);
		cambioMenu.addActionListener(this);
		opcionesMenu.add(cambioMenu);
		
		consultas = new JMenu("Consultas");
		consultaIndividual = new JMenuItem("Consulta Individual");
		consultaGeneral = new JMenuItem("Consulta General");
		
		opcionesMenu.add(bajaMenu);
		opcionesMenu.add(cambioMenu);
		consultaIndividual.setMnemonic(KeyEvent.VK_B);
		consultaIndividual.addActionListener(this);		
		consultas.add(consultaIndividual);
		consultaGeneral.setMnemonic(KeyEvent.VK_B);
		consultaGeneral.addActionListener(this);
		consultas.add(consultaGeneral);		
		opcionesMenu.add(consultas);
		barra.add(opcionesMenu);
		
		//se crea el ultimo elemento de nuestra barra de menu y sus componentes
		ayudaMenu = new JMenu("Ayuda");
		acercaDe = new JMenuItem("Acerca de...");
		acercaDe.addActionListener(this);
		ayudaMenu.add(acercaDe);
		barra.add(ayudaMenu);
		
		
		setJMenuBar(barra);
		
		getContentPane().setBackground(Color.DARK_GRAY);
		
		
		addWindowListener(this);
		
		libros = new Vector<Libro>(); 
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setLocationRelativeTo(null);		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Principal();

	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(salirMenu)) {
			int opcion = JOptionPane.showConfirmDialog(this, "Está seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (opcion == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		} else if (e.getSource().equals(altaMenu)) {
			new Altas(libros);
		} else if (e.getSource().equals(bajaMenu)) {
			new Bajas(libros);
		} else if (e.getSource().equals(cambioMenu)) {
			new Cambios(libros);
		} else if (e.getSource().equals(consultaIndividual)) {
			new ConsultaIndividual(libros);
		} else if (e.getSource().equals(consultaGeneral)) {
			new ConsultaGeneral(libros);
		} else if (e.getSource().equals(acercaDe)) {
			JOptionPane.showMessageDialog(this,"Paradigmas de Programación\nProyecto Final, Manejo de Libros\n\nPrograma realizado por:\nCristian Ivan Reyes Ramirez\nLicenciatura en Informatica","Acerca de...",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}


	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
			int opcion = JOptionPane.showConfirmDialog(this, "Está seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (opcion == JOptionPane.YES_OPTION) {
				System.exit(0);			
		}
	}


	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub  MENSAJE DE BIENVENIDA
		JOptionPane.showMessageDialog(this, "Bienvenido", "Mensaje de Bienvenida", JOptionPane.INFORMATION_MESSAGE);
	}

}
