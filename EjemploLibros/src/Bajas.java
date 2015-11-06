import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;

public class Bajas extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JComboBox<Libro> librosCombo;
	private JTextField tituloLibro;
	private JTextField autorNombres;
	private JTextField apellidosAutor;
	private JTextField nombreEditorial;
	private JTextField a�oPublicacion;
	private JTextField codigoISBN;
	private JTextField lugarPublicacion;
	private JTextField numeroPaginas;
	private JButton eliminarBoton;
	private JTextArea descripcionArea;
	private JRadioButton generoLiricoRadio;
	private JRadioButton generoNarrativoRadio;
	private JRadioButton generoDramaRadio;
	private JComboBox<String> subgeneroCombo;
	private JCheckBox espa�olCheck;
	private JCheckBox inglesCheck;
	private JCheckBox mandarinCheck;
	private Vector<Libro> libros;
	
	public Bajas(Vector<Libro> libros) {
		setTitle("Bajas");
		setModal(true);
		
		this.libros = libros;
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(13,2));
		
		JPanel panelTmp = new JPanel();
		JLabel etiqueta = new JLabel("Libros");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);
		
		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		librosCombo = new JComboBox<Libro>();
		librosCombo.setPreferredSize(new Dimension(250,20));
		librosCombo.addActionListener(this);
		panelTmp.add(librosCombo);
		panel1.add(panelTmp);
		
		//titulo
		panelTmp = new JPanel();
		etiqueta = new JLabel("T�tulo del libro");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);
		
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		tituloLibro = new JTextField(20);
		panelTmp.add(tituloLibro);
		panel1.add(panelTmp);
		
		
		//nombres autor
		panelTmp = new JPanel();
		etiqueta = new JLabel("Nombre(s) del Autor");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		autorNombres = new JTextField(20);
		panelTmp.add(autorNombres);
		panel1.add(panelTmp);
		
		
		//apellidos
		panelTmp = new JPanel();
		etiqueta = new JLabel("Apellidos del Autor");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		apellidosAutor = new JTextField(20);
		panelTmp.add(apellidosAutor);
		panel1.add(panelTmp);
		
		
		//editorial
		panelTmp = new JPanel();
		etiqueta = new JLabel("Editorial");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		nombreEditorial = new JTextField(20);
		panelTmp.add(nombreEditorial);
		panel1.add(panelTmp);
		
		
		//a�o publicacion
		panelTmp = new JPanel();
		etiqueta = new JLabel("A�o de publicaci�n");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		a�oPublicacion = new JTextField(5);
		panelTmp.add(a�oPublicacion);
		panel1.add(panelTmp);
		
		
		//lugar de publicacion
		panelTmp = new JPanel();
		etiqueta = new JLabel("Lugar de publicaci�n");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lugarPublicacion = new JTextField(20);
		panelTmp.add(lugarPublicacion);
		panel1.add(panelTmp);
		
		
		//numero de paginas
		panelTmp = new JPanel();
		etiqueta = new JLabel("N�mero de p�ginas");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		numeroPaginas = new JTextField(5);
		panelTmp.add(numeroPaginas);
		panel1.add(panelTmp);
		
		
		//ISBN
		panelTmp = new JPanel();
		etiqueta = new JLabel("ISBN");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		codigoISBN = new JTextField(20);
		panelTmp.add(codigoISBN);
		panel1.add(panelTmp);
		
		
		//idioma de publicacion
		panelTmp = new JPanel();
		etiqueta = new JLabel("Idiomas de publicaci�n");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		inglesCheck = new JCheckBox("Ingl�s");
		espa�olCheck = new JCheckBox("Espa�ol");
		mandarinCheck = new JCheckBox("Mandar�n");
		panelTmp.add(inglesCheck);
		panelTmp.add(espa�olCheck);
		panelTmp.add(mandarinCheck);
		panel1.add(panelTmp);
		
		
		
		//genero literario
		panelTmp = new JPanel();
		etiqueta = new JLabel("G�nero");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);
		
		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		generoLiricoRadio = new JRadioButton("L�rico");
		generoNarrativoRadio = new JRadioButton("Narrativo");
		generoDramaRadio = new JRadioButton("Drama");
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(generoLiricoRadio);
		grupo.add(generoNarrativoRadio);
		grupo.add(generoDramaRadio);
		panelTmp.add(generoLiricoRadio);
		panelTmp.add(generoNarrativoRadio);
		panelTmp.add(generoDramaRadio);
		panel1.add(panelTmp);
		
		
		//subgenero literario
		panelTmp = new JPanel();
		etiqueta = new JLabel("Subg�nero");
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		subgeneroCombo = new JComboBox<String>();
		subgeneroCombo.setPreferredSize(new Dimension(200,20));
		panelTmp.add(subgeneroCombo);
		panel1.add(panelTmp);
		
		
		//descripcion del libro
		panelTmp = new JPanel();
		etiqueta = new JLabel("Descripci�n");		
		panelTmp.setLayout(new FlowLayout());
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);
		
		descripcionArea = new JTextArea();
		JScrollPane panelScroll = new JScrollPane(descripcionArea);
		panelScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel1.add(panelScroll);
				
		add(panel1);
		
		JPanel panel2 = new JPanel();
		eliminarBoton = new JButton("Eliminar");		
		panel2.setLayout(new FlowLayout());
		eliminarBoton.addActionListener(this);
		panel2.add(eliminarBoton);
		add(panel2,BorderLayout.SOUTH);
		
		inicializar();
		//mostrarLibro();
		setSize(750,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);	
		
	}
	/*
	 * Metodo desactivar()
	 * sin parametros, sin retorno, desactiva cada uno de los campos de la interfaz
	 */
	private void desactivar() {
		tituloLibro.setEditable(false);
		autorNombres.setEditable(false);
		apellidosAutor.setEditable(false);
		nombreEditorial.setEnabled(false);
		a�oPublicacion.setEnabled(false);
		codigoISBN.setEnabled(false);
		lugarPublicacion.setEnabled(false);
		numeroPaginas.setEnabled(false);
		descripcionArea.setEnabled(false);
		generoLiricoRadio.setEnabled(false);
		generoNarrativoRadio.setEnabled(false);
		generoDramaRadio.setEnabled(false);
		subgeneroCombo.setEnabled(false);
		espa�olCheck.setEnabled(false);
		inglesCheck.setEnabled(false);
		espa�olCheck.setEnabled(false);
		mandarinCheck.setEnabled(false);
		eliminarBoton.setEnabled(true);
		//revisarCombo();
	}
	/*
	 * Metodo inicializar()
	 * sin parametros, sin retorno, unicamente agrega elementos al combobox
	 */
	private void inicializar() {
		librosCombo.setModel(new DefaultComboBoxModel<Libro>(libros));
		subgeneroCombo.addItem("Oda");
		subgeneroCombo.addItem("Himno");
		subgeneroCombo.addItem("Eleg�a");
		subgeneroCombo.addItem("�gloga");
		subgeneroCombo.addItem("S�tira");
		subgeneroCombo.addItem("F�bula");
		subgeneroCombo.addItem("Ep�stola");
		subgeneroCombo.addItem("Cuento");
		subgeneroCombo.addItem("Ap�logo");
		subgeneroCombo.addItem("Novela");
		subgeneroCombo.addItem("Leyenda");
		subgeneroCombo.addItem("Tragedia");
		subgeneroCombo.addItem("Comedia");
		subgeneroCombo.addItem("Drama");
		subgeneroCombo.addItem("�pera");
		subgeneroCombo.addItem("Zarzuela");
		subgeneroCombo.addItem("Melodrama");
		desactivar();
		revisarCombo();
	}
	/*
	 * Metodo eliminar()
	 * sin parametros, sin retorno, elimina el elemento seleccionado del vector
	 */
	private void eliminar() {
		int seleccion = librosCombo.getSelectedIndex();
		String nombre = librosCombo.getItemAt(seleccion).getAutorNombres() + " " + librosCombo.getItemAt(seleccion).getApellidosAutor();
		int opcion = JOptionPane.showConfirmDialog(this, "Est� seguro que desea borrar el registro del alumno\n" + nombre, "Eliminar Alumno", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (opcion == JOptionPane.YES_OPTION) {
			librosCombo.removeItemAt(seleccion);
			JOptionPane.showMessageDialog(this, "Registro eliminado con �xito", "Eliminar Alumno", JOptionPane.INFORMATION_MESSAGE);
			revisarCombo();
		}
	}
	
	private void revisarCombo() {
		librosCombo.setModel(new DefaultComboBoxModel<Libro>(libros));
		if (librosCombo.getItemCount() == 0) {
			limpiarCampos();
			librosCombo.setEnabled(false);
			eliminarBoton.setEnabled(false);
		} else {
			librosCombo.setSelectedIndex(0);
			librosCombo.setEnabled(true);
			eliminarBoton.setEnabled(true);
			mostrarLibro();
		}
	}
	/*
	 * Metodo mostrarLibro()
	 * sin parametros, sin retorno, muestra los datos del elemento del vector seleccionado
	 */
	private void mostrarLibro(){
		int seleccion = librosCombo.getSelectedIndex(); 
		Libro l = (Libro)librosCombo.getItemAt(seleccion);
		tituloLibro.setText(l.getTituloLibro());
		autorNombres.setText(l.getAutorNombres());
		apellidosAutor.setText(l.getApellidosAutor());
		nombreEditorial.setText(l.getNombreEditorial());
		a�oPublicacion.setText(String.valueOf(l.getA�oPublicacion()));
		codigoISBN.setText(l.getCodigoISBN());
		lugarPublicacion.setText(l.getLugarPublicacion());
		numeroPaginas.setText(String.valueOf(l.getNumeroPaginas()));
		descripcionArea.setText(l.getDescripcionLibro());
		subgeneroCombo.setSelectedItem(l.getSubgeneroLibro());
		//generoLiricoRadio.setSelected(true);
		//semestreSpinner.setValue(1);}
		if(l.getGenero()=='N'){
			generoNarrativoRadio.setSelected(true);
		} else if(l.getGenero()=='D'){
			generoDramaRadio.setSelected(true);
		}else{
			generoLiricoRadio.setSelected(true);
		}
		espa�olCheck.setSelected(l.isEspa�olCheck());
		inglesCheck.setSelected(l.isInglesCheck());
		mandarinCheck.setSelected(l.isMandarinCheck());
	}
	/*
	 * Metodo limpiarCampos()
	 * sin parametros, sin retorno, limpia cada uno de los campos de la interfaz
	 */
	private void limpiarCampos() {
		tituloLibro.setText("");
		autorNombres.setText("");
		apellidosAutor.setText("");
		nombreEditorial.setText("");
		a�oPublicacion.setText("");
		codigoISBN.setText("");
		lugarPublicacion.setText("");
		numeroPaginas.setText("");
		descripcionArea.setText("");
		subgeneroCombo.setSelectedIndex(0);
		generoLiricoRadio.setSelected(true);
		espa�olCheck.setSelected(false);
		inglesCheck.setSelected(false);
		mandarinCheck.setSelected(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(eliminarBoton)) {
			eliminar();
		}
	}

}
