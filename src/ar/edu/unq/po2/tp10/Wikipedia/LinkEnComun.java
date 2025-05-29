package ar.edu.unq.po2.tp10.Wikipedia;

import java.util.List;

public class LinkEnComun extends FilterPage {

	@Override
	public Boolean sonSimilares(WikipediaPage page, WikipediaPage pageWiki) {
		List<WikipediaPage> linksPage = page.getLinks();
		List<WikipediaPage> linksPageWiki = pageWiki.getLinks();
		
		for(WikipediaPage link : linksPage) {
			if (linksPageWiki.contains(link)) {
				return true;
			}
		}
		return false;
	}

}
