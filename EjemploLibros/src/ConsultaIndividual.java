import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.*;


public class ConsultaIndividual extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<Libro> librosCombo;
	private JTextArea listaArea;
	private Vector<Libro> libros;
	
	public ConsultaIndividual(Vector<Libro> libros) {
		setTitle("Consulta Individual");
		setModal(true);
		this.libros=libros;
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,2));
		
		JPanel panelTmp = new JPanel();
		JLabel etiqueta = new JLabel("Libros registrados");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);
		
		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		librosCombo = new JComboBox<Libro>();
		librosCombo.setPreferredSize(new Dimension(250,20));
		panelTmp.add(librosCombo);
		panel1.add(panelTmp);
		add(panel1, BorderLayout.NORTH);
		
		panel1 = new JPanel();
		listaArea = new JTextArea();
		JScrollPane panelScroll = new JScrollPane(listaArea);
		panelScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panelScroll.setPreferredSize(new Dimension(500,500));
		panel1.add(panelScroll);
		
		mostrar();
		
		add(panel1, BorderLayout.CENTER);
		
		setSize(650,400);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void mostrar() {
		librosCombo.setModel(new DefaultComboBoxModel<Libro>(libros));
		int seleccion = librosCombo.getSelectedIndex();
		if (seleccion < 0) {
			return;
		}
		Libro libro = (Libro) librosCombo.getItemAt(seleccion);
		String cad = "";
		cad += libro.getTituloLibro() + "\n";
		cad += libro.getAutorNombres() + "\n";
		cad += libro.getApellidosAutor() + "\n";
		cad += libro.getNombreEditorial() + "\n";
		cad += String.valueOf(libro.getAñoPublicacion()) + "\n";
		cad += libro.getCodigoISBN() + "\n";
		cad += libro.getLugarPublicacion() + "\n";
		cad += String.valueOf(libro.getNumeroPaginas()) + "\n";
		if (libro.getGenero() == 'L') {
			cad += "Lírico\n";
		} else if(libro.getGenero() == 'N') {
			cad += "Narrativo\n";
		} else {
			cad += "Dramático\n";
		}
		cad += "Subgenero: " + libro.getSubgeneroLibro() + "\n";
		cad += "Idioma del libro: \n";
		if(libro.isEspañolCheck()){
			cad += "-Español\n";
		}
		if(libro.isInglesCheck()){
			cad += "-Ingles\n";
		}
		if(libro.isMandarinCheck()){
			cad += "-Mandarin\n";
		}
		listaArea.setText(cad);
	}

}
