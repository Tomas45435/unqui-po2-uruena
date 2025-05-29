package ar.edu.unq.po2.tp10.Wikipedia;

import java.util.Map;

public class PropiedadEnComun extends FilterPage {

	@Override
	public Boolean sonSimilares(WikipediaPage page, WikipediaPage pageWiki) {
		Map<String, WikipediaPage> infoboxPage = page.getInfobox();
		Map<String, WikipediaPage> infoboxPageWiki = pageWiki.getInfobox();
		
		for(String key : infoboxPage.keySet()) {
			if(infoboxPageWiki.containsKey(key)) {
				return true;
			}
		}
		return false;
	}

}
