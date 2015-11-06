import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;


public class Cambios extends JDialog implements ActionListener {
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
	private JButton guardarBoton;
	private JButton modificarBoton;
	private JTextArea descripcionArea;
	private JRadioButton generoLiricoRadio;
	private JRadioButton generoNarrativoRadio;
	private JRadioButton generoDramaRadio;
	private JComboBox<String> subgeneroCombo;
	private JCheckBox espa�olCheck;
	private JCheckBox inglesCheck;
	private JCheckBox mandarinCheck;
	private Vector<Libro> libros;
	
	public Cambios(Vector<Libro> libros) {
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
		guardarBoton = new JButton("Guardar");
		panel2.setLayout(new FlowLayout());
		guardarBoton.addActionListener(this);
		panel2.add(guardarBoton);
		modificarBoton = new JButton("Modificar");
		panel2.setLayout(new FlowLayout());
		modificarBoton.addActionListener(this);
		panel2.add(modificarBoton);
		add(panel2,BorderLayout.SOUTH);
		
		inicializar();
		
		setSize(750,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);	
	}
	/*
	 * Metodo activr()
	 * sin parametros, sin retorno, activa todos los campos de nuestra interfaz
	 */
	private void activar() {
		tituloLibro.setEditable(true);
		autorNombres.setEditable(true);
		apellidosAutor.setEditable(true);
		nombreEditorial.setEnabled(true);
		a�oPublicacion.setEnabled(true);
		codigoISBN.setEnabled(true);
		lugarPublicacion.setEnabled(true);
		numeroPaginas.setEnabled(true);
		descripcionArea.setEnabled(true);
		generoLiricoRadio.setEnabled(true);
		generoNarrativoRadio.setEnabled(true);
		generoDramaRadio.setEnabled(true);
		subgeneroCombo.setEnabled(true);
		espa�olCheck.setEnabled(true);
		inglesCheck.setEnabled(true);
		espa�olCheck.setEnabled(true);
		mandarinCheck.setEnabled(true);
	}
	/*
	 * Metodo revisarCombo()
	 * 
	 */
	private void revisarCombo() {
		if (librosCombo.getItemCount() == 0) {
			limpiarCampos();
			librosCombo.setEnabled(false);
			guardarBoton.setEnabled(false);
			modificarBoton.setEnabled(false);
		} else {
			librosCombo.setSelectedIndex(0);
			librosCombo.setEnabled(true);
			guardarBoton.setEnabled(false);
			modificarBoton.setEnabled(true);
			mostrarLibro();
		}
	}
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
		//semestreSpinner.setValue(1);
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
		guardarBoton.setEnabled(false);
		modificarBoton.setEnabled(true);
		//revisarCombo();
	}
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
	
	private boolean validar() {
		String cad = "";
		
		if(tituloLibro.getText().isEmpty()) {
			cad += "Error al ingresar el T�tulo del Libro";
		}
		if(!autorNombres.getText().matches("[A-Za-z������ ]+") || autorNombres.getText().isEmpty()) {
			cad += "Error al ingresar los nombres";
		}
		if(!apellidosAutor.getText().matches("[A-Za-z������ ]+") || apellidosAutor.getText().isEmpty()) {
			cad += "\nError al ingresar los apellidos";
		}
		if(a�oPublicacion.getText().isEmpty()) {
			cad += "\nDebe de ingresar el campo A�o de publicaci�n";	
		} else {
			long a = 0L;
			try {
				a = Long.parseLong(a�oPublicacion.getText());
			} catch(NumberFormatException e){
				cad += "\n Campo A�o de publicaci�n no es un n�mero";	
			}
			if (a <= 1700 || a >= 2015) {
				cad += "\nDebe ingresar un A�o valido";
			}
		}
		if(codigoISBN.getText().isEmpty() || !codigoISBN.getText().matches("[0-9]{3}-[0-9]{3}-[0-9]{4}-[0-9]{2}-[0-9]{1}")) {
			cad += "\nError al ingresar el ISBN";
		}
		if(lugarPublicacion.getText().isEmpty() || !lugarPublicacion.getText().matches("[A-Za-z�]+")) {
			cad += "\nError en el campo Lugar de publicaci�n";
		}
		if(numeroPaginas.getText().isEmpty()) {
			cad += "\nDebe de ingresar el campo N�mero de P�ginas";	
		} else {
			long a = 0L;
			try {
				a = Long.parseLong(numeroPaginas.getText());
			} catch(NumberFormatException e){
				cad += "\n Campo N�mero de P�ginas no es un n�mero";	
			}
			if (a <= 0) {
				cad += "\nDebe ingresar un n�mero valido de p�ginas";
			}
		}		
		
		if(!cad.equals("")){
			JOptionPane.showMessageDialog(null,cad,"Error al guardar",JOptionPane.ERROR_MESSAGE);
			return false;
		} else {
			return true;
		}
	}
	
	
	private void guardar() {
		Libro libro;
		if (!validar()) {
			return;
		}
		int seleccion = librosCombo.getSelectedIndex();
		libro = (Libro)librosCombo.getItemAt(seleccion);
		libro.setTituloLibro(tituloLibro.getText());
		libro.setAutorNombres(autorNombres.getText());
		libro.setApellidosAutor(apellidosAutor.getText());
		libro.setNombreEditorial(nombreEditorial.getText());
		libro.setA�oPublicacion(Long.parseLong(a�oPublicacion.getText()));
		libro.setCodigoISBN(codigoISBN.getText());
		libro.setLugarPublicacion(lugarPublicacion.getText());
		libro.setNumeroPaginas(Long.parseLong(numeroPaginas.getText()));
		libro.setSubgeneroLibro(subgeneroCombo.getSelectedItem().toString());
		 if(generoLiricoRadio.isSelected()) {
			libro.setGenero('L');
		} else if(generoNarrativoRadio.isSelected()) {
			libro.setGenero('N');
		} else if(generoDramaRadio.isSelected()) {
			libro.setGenero('D');
		}
		
		libro.setEspa�olCheck(espa�olCheck.isSelected());
		libro.setInglesCheck(inglesCheck.isSelected());
		libro.setMandarinCheck(mandarinCheck.isSelected());
		libro.setDescripcionLibro(descripcionArea.getText());
		//libros.addElement(libro);
		JOptionPane.showMessageDialog(this, "Registro modificado con �xito", "Modificar Libro", JOptionPane.INFORMATION_MESSAGE);
		revisarCombo();
		desactivar();
	}
	public void modificar(){
		activar();
		guardarBoton.setEnabled(true);
		modificarBoton.setEnabled(false);
		librosCombo.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(modificarBoton)) {
			modificar();
		}else if (e.getSource().equals(guardarBoton)) {
			guardar();
		}
	}

	
}
