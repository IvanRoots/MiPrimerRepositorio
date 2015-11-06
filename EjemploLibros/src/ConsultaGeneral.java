import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;


public class ConsultaGeneral extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextArea listaArea;
	private JTextField buscarLibro;
	private JButton botonBuscar;
	private Vector<Libro> libros;
	//private JComboBox<Libro> librosCombo;
	
	public ConsultaGeneral(Vector<Libro> libros) {
		setTitle("Lista de Libros");
		setModal(true);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,2));
		
		JPanel panelTmp = new JPanel();
		JLabel etiqueta = new JLabel("Buscar Libro");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);
		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		buscarLibro = new JTextField(20);
		panelTmp.add(buscarLibro);
		panel1.add(panelTmp);
		
		botonBuscar = new JButton("Buscar");
		panelTmp = new JPanel(new FlowLayout(FlowLayout.CENTER));
		botonBuscar.addActionListener(this);
		panelTmp.add(botonBuscar);
		panel1.add(botonBuscar);
		
		add(panel1,BorderLayout.NORTH);
		
		setLayout(new FlowLayout());
		
		listaArea = new JTextArea();
		listaArea.setEditable(false);
		JScrollPane panel = new JScrollPane(listaArea);
		panel.setPreferredSize(new Dimension(500,500));
		add(panel);
		
		this.libros = libros;
		
		
		
		setSize(600,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	
	private void mostrarLibro(){
		Vector<Libro> l = libros;
		/*if(buscarLibro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,"Debe de ingresar un Numero de Registro","Error al buscar",JOptionPane.ERROR_MESSAGE);
		}*/
		for (int i = 0; i < l.size(); i++) {
			if(l.elementAt(i).getNumeroRegistro().equals(buscarLibro.getText())){
				listaArea.append(l.elementAt(i) + ", " + ", Rumero de Registro: " + l.elementAt(i).getNumeroRegistro() + ", Titulo: " + l.elementAt(i).getTituloLibro() + ", Nombre(s) Autor: " + l.elementAt(i).getAutorNombres() + ", Apellidos:" + l.elementAt(i).getApellidosAutor() + ", Editorial:" + l.elementAt(i).getNombreEditorial() + "\n");
				return;
			}
		}
		JOptionPane.showMessageDialog(null,"Numero de Registro no existente","Error al buscar",JOptionPane.ERROR_MESSAGE);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(botonBuscar)){
			mostrarLibro();
		}
		
	}

}
