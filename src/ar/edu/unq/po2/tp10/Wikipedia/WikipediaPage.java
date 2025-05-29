package ar.edu.unq.po2.tp10.Wikipedia;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {

	/*retorna el título de la página.*/
	public String getTitle();
	
	/*retorna una Lista de las páginas de Wikipedia con las que se conecta.*/ 
	public List<WikipediaPage> getLinks();
	
	/*retorna un Map con un valor en texto y la pagina que describe ese valor que aparecen en los infobox de la 
	página de Wikipedia.*/ 
	public Map<String, WikipediaPage> getInfobox();

}
