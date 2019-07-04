package losernuto.springboot.web.app.models;

public class Personajes {
	
	private String nombre;
	private String imagen;
	private String texto;
	
	public Personajes() {
		
	}
	
	public Personajes(String nombre, String imagen, String texto) {
		
		this.nombre = nombre;
		this.imagen = imagen;
		this.texto = texto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getImagen() {
		return imagen;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
	
	

}
