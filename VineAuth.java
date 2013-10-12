/**
 * vine auth.
 * @author Brackston Mayhall
 *
 */
public class VineAuth {
	
	/**
	 * 
	 */
   	private String code;
   	
	/**
	 * 
	 */
   	private VineAuthData data;
   	
	/**
	 * 
	 */
   	private String error;
   	
	/**
	 * 
	 */
   	private boolean success;
	/**
	 * @return the code
	 */
	public final String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public final void setCode(final String code) {
		this.code = code;
	}
	/**
	 * @return the data
	 */
	public final VineAuthData getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public final void setData(final VineAuthData data) {
		this.data = data;
	}
	/**
	 * @return the error
	 */
	public final String getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public final void setError(final String error) {
		this.error = error;
	}
	/**
	 * @return the success
	 */
	public final boolean isSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public final void setSuccess(final boolean success) {
		this.success = success;
	}


}
