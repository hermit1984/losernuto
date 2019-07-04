package losernuto.springboot.web.app.models;

public class Comics {
	
	private int numero;
	private String link;
	private String imagen;
	
public Comics(int numero, String link, String imagen) {
		
		this.numero = numero;
		this.link = link;
		this.imagen = imagen;
	}
	public String getImagen() {
	return imagen;
}
public void setImagen(String imagen) {
	this.imagen = imagen;
}
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}

}
