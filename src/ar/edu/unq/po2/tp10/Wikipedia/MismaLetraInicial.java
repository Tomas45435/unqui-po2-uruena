package ar.edu.unq.po2.tp10.Wikipedia;

public class MismaLetraInicial extends FilterPage {

	@Override
	public Boolean sonSimilares(WikipediaPage page, WikipediaPage pageWiki) {
		Boolean sonSimilires = pageWiki.getTitle().startsWith(page.getTitle().substring(0,1)); 
		return sonSimilires;
	}

}
