import java.util.List;

/**
 * the reposts.
 * @author Brackston Mayhall
 *
 */
public class Reposts {
	
	/**
	 * 
	 */
   	private Number anchor;
   	
	/**
	 * 
	 */
   	private Number count;
   	
	/**
	 * 
	 */
   	private Number nextPage;
   	
	/**
	 * 
	 */
   	private String previousPage;
   	
	/**
	 * 
	 */
   	private List<Records> records;
   	
	/**
	 * 
	 */
   	private Number size;
	/**
	 * @return the anchor
	 */
	public final Number getAnchor() {
		return anchor;
	}
	/**
	 * @param anchor the anchor to set
	 */
	public final void setAnchor(final Number anchor) {
		this.anchor = anchor;
	}
	/**
	 * @return the count
	 */
	public final Number getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public final void setCount(final Number count) {
		this.count = count;
	}
	/**
	 * @return the nextPage
	 */
	public final Number getNextPage() {
		return nextPage;
	}
	/**
	 * @param nextPage the nextPage to set
	 */
	public final void setNextPage(final Number nextPage) {
		this.nextPage = nextPage;
	}
	/**
	 * @return the previousPage
	 */
	public final String getPreviousPage() {
		return previousPage;
	}
	/**
	 * @param previousPage the previousPage to set
	 */
	public final void setPreviousPage(final String previousPage) {
		this.previousPage = previousPage;
	}
	/**
	 * @return the records
	 */
	public final List<Records> getRecords() {
		return records;
	}
	/**
	 * @param records the records to set
	 */
	public final void setRecords(final List<Records> records) {
		this.records = records;
	}
	/**
	 * @return the size
	 */
	public final Number getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public final void setSize(final Number size) {
		this.size = size;
	}


}
