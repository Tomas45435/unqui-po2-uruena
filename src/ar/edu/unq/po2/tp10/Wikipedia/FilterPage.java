package ar.edu.unq.po2.tp10.Wikipedia;

import java.util.ArrayList;
import java.util.List;

public abstract class FilterPage {

	public List<WikipediaPage> getSimilarPage(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> similarPages = new ArrayList<>();
		for (WikipediaPage pageWiki : wikipedia) {
			if (sonSimilares(page, pageWiki)) {
				similarPages.add(pageWiki);
			}
		}
		
		return similarPages;
		
	}
	
	public abstract Boolean sonSimilares(WikipediaPage page, WikipediaPage pageWiki);
}
