package losernuto.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import losernuto.springboot.web.app.models.Comics;
import losernuto.springboot.web.app.models.Personajes;

import java.util.*;



@Controller
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexcontroller.comics.titulo}")
	private String textoComics;
	@Value("${texto.indexcontroller.personajes.titulo}")
	private String textoPersonajes; 
	@Value("${texto.indexcontroller.index.descripcion}")
	private String descripcionTitulo;
	
	@GetMapping({ "/index", "/", "", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex );
		model.addAttribute("descripcion", descripcionTitulo);
		return "index";
	}
	
		
	@RequestMapping("/comics")
	public String comics(Model model) {
		List<Comics> comics = comicsLista();
		model.addAttribute("titulo", textoComics);
		model.addAttribute("comics", comics);
		return "comics";
	}
	
	@RequestMapping("/personajes")
	public String personajes(Model model) {
							
		//List<Personajes> personaje = Arrays.asList(new Personajes("LoserNuto","/images/losernuto/losernuto.png","/textos/losernuto.txt"), 
				//new Personajes("Ingetroll","/images/losernuto/ingetrol.png","/textos/ingetroll.txt"));
		List<Personajes> personaje = new ArrayList<>(); 
		personaje.add(new Personajes("LoserNuto","losernuto.png","/textos/losernuto.txt"));
		personaje.add(new Personajes("Ingetroll","ingetrol.png","/textos/ingetroll.txt"));
		
		model.addAttribute("titulo", textoPersonajes);
		model.addAttribute("personaje", personaje);
		
		return "personajes";
	}

	private List<Comics> comicsLista(){
		List<Comics> comics = Arrays.asList(
				new Comics(1,"https://www.pixton.com/es/comic/yxdphkxy","losernuto1.png"),
				new Comics(2,"https://www.pixton.com/es/comic/3bzvgak6","losernuto2.png"),
				new Comics(3,"https://www.pixton.com/es/comic/duimalab","losernuto3.png"),
				new Comics(4,"https://www.pixton.com/es/comic/9tpdi2a8","losernuto4.png"), 
				new Comics(5,"https://www.pixton.com/es/comic/0p8a734x","losernuto5.png"), 
				new Comics(6,"https://www.pixton.com/es/comic/hen1ycl8","losernuto6.png"));
		return comics;
	}
}
