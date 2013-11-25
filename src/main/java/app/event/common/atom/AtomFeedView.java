/**
 * 
 */
package app.event.common.atom;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.feed.AbstractAtomFeedView;

import app.event.common.model.Fruit;
import com.sun.syndication.feed.atom.Content;
import com.sun.syndication.feed.atom.Entry;
import com.sun.syndication.feed.atom.Feed;
import com.sun.syndication.feed.atom.Person;


/**
 * @author User
 *
 */
public class AtomFeedView extends AbstractAtomFeedView {

	/**
	 * 
	 */
	public AtomFeedView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buildFeedMetadata(Map<String, Object> model, Feed feed,
			HttpServletRequest request) {
		feed.setTitle("Sample Title");
		/*feed.setDescription("Sample Description");
		feed.setLink("http://google.com");*/
		super.buildFeedMetadata(model, feed, request);
	}
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.view.feed.AbstractAtomFeedView#buildFeedEntries(java.util.Map, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected List<Entry> buildFeedEntries(Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		Fruit fruit = (Fruit) model.get("model");
		String msg = fruit.getName() + fruit.getQuality();
		
		List<Entry> Entries = new ArrayList<Entry>(1);
		Entry entry = new Entry();
		List<Person> authors = new ArrayList<Person>();
		Person p =new Person();
		p.setName("mansoor");
		p.setEmail("manslogic@gmail.com");
		authors.add(p);
		entry.setAuthors(authors);
		
		
		Content content = new Content();
		content.setValue(msg);
		List<Content> contents = new ArrayList<Content>();
		contents.add(content);
		entry.setContents(contents);
		
		Entries.add(entry);
		
		return Entries;
	}

}
