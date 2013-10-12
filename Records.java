import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * a record.
 * @author Brackston Mayhall
 *
 */
public class Records {
	
	/**
	 * 
	 */
   	private String avatarUrl;
	/**
	 * 
	 */
   	private Comments comments;
   	
	/**
	 * 
	 */
   	private String created;
   	
	/**
	 * 
	 */
   	private String description;
   	
	/**
	 * 
	 */
   	private List<Entity> entities;
   	
	/**
	 * 
	 */
   	private Number explicitContent;
   	
	/**
	 * 
	 */
   	private String foursquareVenueId;
   	
	/**
	 * 
	 */
   	private Number liked;
   	
	/**
	 * 
	 */
   	private Likes likes;
   	
	/**
	 * 
	 */
   	private String location;
   	
	/**
	 * 
	 */
   	private Number myRepostId;
   	
	/**
	 * 
	 */
   	private Number postFlags;
   	
	/**
	 * 
	 */
   	private Number postId;
   	
	/**
	 * 
	 */
   	private Number postToFacebook;
   	
	/**
	 * 
	 */
   	private Number postToTwitter;
   	
	/**
	 * 
	 */
   	private String postVerified;
   	
	/**
	 * 
	 */
   	@SerializedName("private")
   	private Number isPrivate;
   	
	/**
	 * 
	 */
   	private Number promoted;
   	
	/**
	 * 
	 */
   	private Reposts reposts;
   	
	/**
	 * 
	 */
   	private String shareUrl;
   	
	/**
	 * 
	 */
   	private List<Tags> tags;
   	
	/**
	 * 
	 */
   	private String thumbnailUrl;
   	
	/**
	 * 
	 */
   	private Number userId;
   	
	/**
	 * 
	 */
   	private String username;
   	
	/**
	 * 
	 */
   	private Number verified;
   	
	/**
	 * 
	 */
   	private String videoLowURL;
   	
	/**
	 * 
	 */
   	private String videoUrl;
	
   	/**
	 * @return the avatarUrl
	 */
	public final String getAvatarUrl() {
		return avatarUrl;
	}
	/**
	 * @param avatarUrl the avatarUrl to set
	 */
	public final void setAvatarUrl(final String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	/**
	 * @return the comments
	 */
	public final Comments getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public final void setComments(final Comments comments) {
		this.comments = comments;
	}
	/**
	 * @return the created
	 */
	public final String getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public final void setCreated(final String created) {
		this.created = created;
	}
	/**
	 * @return the description
	 */
	public final String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public final void setDescription(final String description) {
		this.description = description;
	}
	/**
	 * @return the entities
	 */
	public final List<Entity> getEntities() {
		return entities;
	}
	/**
	 * @param entities the entities to set
	 */
	public final void setEntities(final List<Entity> entities) {
		this.entities = entities;
	}
	/**
	 * @return the explicitContent
	 */
	public final Number getExplicitContent() {
		return explicitContent;
	}
	/**
	 * @param explicitContent the explicitContent to set
	 */
	public final void setExplicitContent(final Number explicitContent) {
		this.explicitContent = explicitContent;
	}
	/**
	 * @return the foursquareVenueId
	 */
	public final String getFoursquareVenueId() {
		return foursquareVenueId;
	}
	/**
	 * @param foursquareVenueId the foursquareVenueId to set
	 */
	public final void setFoursquareVenueId(final String foursquareVenueId) {
		this.foursquareVenueId = foursquareVenueId;
	}
	/**
	 * @return the liked
	 */
	public final Number getLiked() {
		return liked;
	}
	/**
	 * @param liked the liked to set
	 */
	public final void setLiked(final Number liked) {
		this.liked = liked;
	}
	/**
	 * @return the likes
	 */
	public final Likes getLikes() {
		return likes;
	}
	/**
	 * @param likes the likes to set
	 */
	public final void setLikes(final Likes likes) {
		this.likes = likes;
	}
	/**
	 * @return the location
	 */
	public final String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public final void setLocation(final String location) {
		this.location = location;
	}
	/**
	 * @return the myRepostId
	 */
	public final Number getMyRepostId() {
		return myRepostId;
	}
	/**
	 * @param myRepostId the myRepostId to set
	 */
	public final void setMyRepostId(final Number myRepostId) {
		this.myRepostId = myRepostId;
	}
	/**
	 * @return the postFlags
	 */
	public final Number getPostFlags() {
		return postFlags;
	}
	/**
	 * @param postFlags the postFlags to set
	 */
	public final void setPostFlags(final Number postFlags) {
		this.postFlags = postFlags;
	}
	/**
	 * @return the postId
	 */
	public final Number getPostId() {
		return postId;
	}
	/**
	 * @param postId the postId to set
	 */
	public final void setPostId(final Number postId) {
		this.postId = postId;
	}
	/**
	 * @return the postToFacebook
	 */
	public final Number getPostToFacebook() {
		return postToFacebook;
	}
	/**
	 * @param postToFacebook the postToFacebook to set
	 */
	public final void setPostToFacebook(final Number postToFacebook) {
		this.postToFacebook = postToFacebook;
	}
	/**
	 * @return the postToTwitter
	 */
	public final Number getPostToTwitter() {
		return postToTwitter;
	}
	/**
	 * @param postToTwitter the postToTwitter to set
	 */
	public final void setPostToTwitter(final Number postToTwitter) {
		this.postToTwitter = postToTwitter;
	}
	/**
	 * @return the postVerified
	 */
	public final String getPostVerified() {
		return postVerified;
	}
	/**
	 * @param postVerified the postVerified to set
	 */
	public final void setPostVerified(final String postVerified) {
		this.postVerified = postVerified;
	}
	/**
	 * @return the isPrivate
	 */
	public final Number getIsPrivate() {
		return isPrivate;
	}
	/**
	 * @param isPrivate the isPrivate to set
	 */
	public final void setIsPrivate(final Number isPrivate) {
		this.isPrivate = isPrivate;
	}
	/**
	 * @return the promoted
	 */
	public final Number getPromoted() {
		return promoted;
	}
	/**
	 * @param promoted the promoted to set
	 */
	public final void setPromoted(final Number promoted) {
		this.promoted = promoted;
	}
	/**
	 * @return the reposts
	 */
	public final Reposts getReposts() {
		return reposts;
	}
	/**
	 * @param reposts the reposts to set
	 */
	public final void setReposts(final Reposts reposts) {
		this.reposts = reposts;
	}
	/**
	 * @return the shareUrl
	 */
	public final String getShareUrl() {
		return shareUrl;
	}
	/**
	 * @param shareUrl the shareUrl to set
	 */
	public final void setShareUrl(final String shareUrl) {
		this.shareUrl = shareUrl;
	}
	/**
	 * @return the tags
	 */
	public final List<Tags> getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public final void setTags(final List<Tags> tags) {
		this.tags = tags;
	}
	/**
	 * @return the thumbnailUrl
	 */
	public final String getThumbnailUrl() {
		return thumbnailUrl;
	}
	/**
	 * @param thumbnailUrl the thumbnailUrl to set
	 */
	public final void setThumbnailUrl(final String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
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
	/**
	 * @return the verified
	 */
	public final Number getVerified() {
		return verified;
	}
	/**
	 * @param verified the verified to set
	 */
	public final void setVerified(final Number verified) {
		this.verified = verified;
	}
	/**
	 * @return the videoLowURL
	 */
	public final String getVideoLowURL() {
		return videoLowURL;
	}
	/**
	 * @param videoLowURL the videoLowURL to set
	 */
	public final void setVideoLowURL(final String videoLowURL) {
		this.videoLowURL = videoLowURL;
	}
	/**
	 * @return the videoUrl
	 */
	public final String getVideoUrl() {
		return videoUrl;
	}
	/**
	 * @param videoUrl the videoUrl to set
	 */
	public final void setVideoUrl(final String videoUrl) {
		this.videoUrl = videoUrl;
	}

}
