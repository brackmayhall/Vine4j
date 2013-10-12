/**
 * vine auth data.
 * @author Brackston Mayhall
 *
 */
public class VineAuthData {
	
	/**
	 * the user auth key.
	 */
   	private String key;
   	
   	/**
   	 * the user id.
   	 */
   	private Number userId;
   	
   	/**
   	 * the username.
   	 */
   	private String username;

	/**
	 * @return the key
	 */
	public final String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public final void setKey(final String key) {
		this.key = key;
	}

	/**
	 * @return the userId
	 */
	public final Number getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public final void setUserId(final Number userId) {
		this.userId = userId;
	}

	/**
	 * @return the username
	 */
	public final String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public final void setUsername(final String username) {
		this.username = username;
	}


}
