import java.util.List;

/**
 * an entity.
 * @author Brackston Mayhall
 *
 */
public class Entity {
	
	/**
	 * the id.
	 */
   	private Number id;
   	
	/**
	 * the link.
	 */
   	private String link;
   	
	/**
	 * the range.
	 */
   	private List<Number> range;
   	
	/**
	 * the title.
	 */
   	private String title;
   	
	/**
	 * the type.
	 */
   	private String type;
   	
	/**
	 * @return the id
	 */
	public final Number getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(final Number id) {
		this.id = id;
	}
	/**
	 * @return the link
	 */
	public final String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public final void setLink(final String link) {
		this.link = link;
	}
	/**
	 * @return the range
	 */
	public final List<Number> getRange() {
		return range;
	}
	/**
	 * @param range the range to set
	 */
	public final void setRange(final List<Number> range) {
		this.range = range;
	}
	/**
	 * @return the title
	 */
	public final String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public final void setTitle(final String title) {
		this.title = title;
	}
	/**
	 * @return the type
	 */
	public final String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public final void setType(final String type) {
		this.type = type;
	}


}
