
public class Libro {
	private String numeroRegistro;
	private String tituloLibro;
	private String autorNombres;
	private String apellidosAutor;
	private String nombreEditorial;
	private String descripcionLibro;
	private String codigoISBN;
	private String lugarPublicacion;
	private String subgeneroLibro;
	private long añoPublicacion;
	private long numeroPaginas; 
	private char genero;
	private boolean españolCheck;
	private boolean inglesCheck;
	private boolean mandarinCheck;
	
	public Libro(){
		numeroRegistro = "";
		tituloLibro = "";
		autorNombres = "";
		apellidosAutor = "";
		nombreEditorial = "";
		descripcionLibro = "";
		codigoISBN = "";
		lugarPublicacion = "";
		subgeneroLibro = "";
		añoPublicacion = 0L;
		numeroPaginas = 0L; 
		genero = '\u0000';
		españolCheck = false;
		inglesCheck = false;
		mandarinCheck = false;
	}
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getTituloLibro() {
		return tituloLibro;
	}
	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}
	public String getAutorNombres() {
		return autorNombres;
	}
	public void setAutorNombres(String autorNombres) {
		this.autorNombres = autorNombres;
	}
	public String getApellidosAutor() {
		return apellidosAutor;
	}
	public void setApellidosAutor(String apellidosAutor) {
		this.apellidosAutor = apellidosAutor;
	}
	public String getNombreEditorial() {
		return nombreEditorial;
	}
	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}
	public long getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(long añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	public String getCodigoISBN() {
		return codigoISBN;
	}
	public void setCodigoISBN(String codigoISBN) {
		this.codigoISBN = codigoISBN;
	}
	public String getLugarPublicacion() {
		return lugarPublicacion;
	}
	public void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}
	public long getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(long numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public boolean isEspañolCheck() {
		return españolCheck;
	}
	public void setEspañolCheck(boolean españolCheck) {
		this.españolCheck = españolCheck;
	}
	public boolean isInglesCheck() {
		return inglesCheck;
	}
	public void setInglesCheck(boolean inglesCheck) {
		this.inglesCheck = inglesCheck;
	}
	public boolean isMandarinCheck() {
		return mandarinCheck;
	}
	public void setMandarinCheck(boolean mandarinCheck) {
		this.mandarinCheck = mandarinCheck;
	}
	public String getDescripcionLibro() {
		return descripcionLibro;
	}
	public void setDescripcionLibro(String descripcionLibro) {
		this.descripcionLibro = descripcionLibro;
	}
	public String getSubgeneroLibro() {
		return subgeneroLibro;
	}
	public void setSubgeneroLibro(String subgeneroLibro) {
		this.subgeneroLibro = subgeneroLibro;
	}
	public String toString(){
		return getTituloLibro() + ", " + getAutorNombres() + " " +  getApellidosAutor();
	}

}
