import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;


public class Altas extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	//private JComboBox<Libro> librosCombo;
	private JTextField numeroRegistro;
	private JTextField tituloLibro;
	private JTextField autorNombres;
	private JTextField apellidosAutor;
	private JTextField nombreEditorial;
	private JTextField a�oPublicacion;
	private JTextField codigoISBN;
	private JTextField lugarPublicacion;
	private JTextField numeroPaginas;
	private JButton guardarBoton;
	private JTextArea descripcionArea;
	private JRadioButton generoLiricoRadio;
	private JRadioButton generoNarrativoRadio;
	private JRadioButton generoDramaRadio;
	private JComboBox<String> subgeneroCombo;
	private JCheckBox espa�olCheck;
	private JCheckBox inglesCheck;
	private JCheckBox mandarinCheck;
	private Vector<Libro> libros;
	private JMenu archivoMenu;
	private JMenuItem guardarMenu;
	
	public Altas(Vector<Libro> libros) {
		setTitle("Altas");
		setModal(true);
		
		this.libros = libros;
		
		JMenuBar barra = new JMenuBar();
		archivoMenu = new JMenu("Archivo");
		guardarMenu = new JMenuItem("Guardar");
		guardarMenu.addActionListener(this);//evento
		archivoMenu.add(guardarMenu);
		barra.add(archivoMenu);
		
		//panel principal
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(13,2));
		
		//numero de registro
		JPanel panelTmp = new JPanel();
		JLabel etiqueta = new JLabel("N�mero de Registro");
		
		panelTmp.add(etiqueta);
		panel1.add(panelTmp);

		panelTmp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		numeroRegistro = new JTextField(20);
		panelTmp.add(numeroRegistro);
		panel1.add(panelTmp);
		
		//titulo libro
		panelTmp = new JPanel();
		etiqueta = new JLabel("Titulo del Libro");
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
		
		//panel para los botones
		JPanel panel2 = new JPanel();
		guardarBoton = new JButton("Guardar");
		panel2.setLayout(new FlowLayout());
		guardarBoton.addActionListener(this);
		panel2.add(guardarBoton);
		add(panel2,BorderLayout.SOUTH);
		setJMenuBar(barra);
		inicializar();
		
		setSize(750,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	/*
	 * Metodo inicializar()
	 * no recibe parametros, agrega los elementos al combobox
	 */
	private void inicializar() {
		//semestreSpinner.setModel(new SpinnerNumberModel(1, 1, 10, 1));
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
		
	}
	/*
	 * Metodo validar()
	 * sin parametros, retorna un false si existes algun error, de lo contrario un true
	 * todos los errores son almacenados en una cadena
	 */
	private boolean validar() {
		String cad = "";
		Vector<Libro> l = libros;
		for (int i = 0; i < l.size(); i++) {
			if (numeroRegistro.equals(l.elementAt(i).getNumeroRegistro())) {
				cad += "Numero de Registro existente, Cambia el numero de registro";
				//return false;
			}
		}
		if(numeroRegistro.getText().isEmpty() || !numeroRegistro.getText().matches("[A-Z]{2}[1-9]{5}")){
			cad += "Error al ingresar el campo N�mero de Regristro";
		}
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
	/*private boolean validarNumeroRegistro(){
		int seleccion = librosCombo.getSelectedIndex(); 
		Libro l = (Libro)librosCombo.getItemAt(seleccion);
		
		for (int i=0; i < getSize(); i++){
			
		}
		if(numeroRegistro.setText(l.getNumeroRegistro())){
			return false;
		}
		return true;
	}*/
	
	/*
	 * Metodo guardar()
	 * depende del retorno del metodo validar(), si retorna un true se ingresan los elementos al vector
	 */
	private void guardar() {
		Libro libro;
		if (!validar()) {
			return;
		}
		
		libro = new Libro();
		libro.setNumeroRegistro(numeroRegistro.getText());
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
		} else {
			libro.setGenero('D');
		}
		libro.setEspa�olCheck(espa�olCheck.isSelected());
		libro.setInglesCheck(inglesCheck.isSelected());
		libro.setMandarinCheck(mandarinCheck.isSelected());
		libro.setDescripcionLibro(descripcionArea.getText());
		libros.addElement(libro);
		JOptionPane.showMessageDialog(null, "Registro agregado con �xito", "Nuevo Libro", JOptionPane.INFORMATION_MESSAGE);
		limpiarCampos();
	}
	/*
	 * Metodo limpiarCampos()
	 * sirve para limpiar cada uno de los campos de la pantalla al guardar el libro
	 */
	private void limpiarCampos() {
		numeroRegistro.setText("");
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
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource().equals(guardarBoton)){
			guardar();
		} if (arg0.getSource().equals(guardarMenu)){
			guardar();
		}
	}
}
