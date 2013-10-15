Vine4j
======

A Java library that utilizes the unofficial Vine API with JSON to POJO already handled.

## Dependencies

The following files are supplied in the "lib" folder.

* commons-logging-1.1.1.jar
* gson-2.2.4.jar
* httpclient-4.2.5.jar
* httpcore-4.2.4.jar


## Quick start

Three quick start options are available:

* Clone the repo: `git clone https://github.com/brackmayhall/Vine4j.git`.
* Set up a new java project and resolve dependency issues with the supplied jars in the lib folder.

### What's included

Within the download you'll find the following directories and files. You'll see something like this:

```
Vine4j/
├── Comments.java
├── Data.java
├── Entity.java
├── Likes.java
├── Records.java
├── Tags.java
├── Vine.java
├── Vine4j.java
├── VineAuth.java
├── VineAuthData.java
├── lib/
│   ├── commons-logging-1.1.1.jar
│   ├── gson-2.2.4.jar
│   ├── httpclient-4.2.5.jar
│   ├── httpcore-4.2.4.jar
```

### Vine Account Login Credentials

You must register for an official Vine account and use those credentials in the "Vine4j.java" file.

## TODO
Implement the following
	public static final String VINE_API_BASE_URL="https://api.vineapp.com";
	public static final String VINE_API_LOGIN=VINE_API_BASE_URL+"/users/authenticate";
	public static final String VINE_API_SIGNUP=VINE_API_BASE_URL+"/users";
	public static final String VINE_API_ME=VINE_API_BASE_URL+"/users/me";
	public static final String VINE_API_PROFILE=VINE_API_BASE_URL+"/users/profiles/{userId}";
	public static final String VINE_API_NOTIFICATIONS=VINE_API_BASE_URL+"/users/{userId}/notifications";
	public static final String VINE_API_PENDING_NOTIFICATIONS=VINE_API_BASE_URL+"/users/{userId}/pendingNotificationsCount";
	public static final String VINE_API_SEARCH_USER=VINE_API_BASE_URL+"/users/search/{term}";
	public static final String VINE_API_USER_TIMELINE=VINE_API_BASE_URL+"/timelines/users/{userId}";
	public static final String VINE_API_TAG_TIMELINE=VINE_API_BASE_URL+"/timelines/{tag}";
	public static final String VINE_API_POST_COMMENTS=VINE_API_BASE_URL+"/posts/{postId}/comments";
	public static final String VINE_API_POST_COMMENT=VINE_API_BASE_URL+"/posts/{postId}/comments/{commentId}";
	public static final String VINE_API_USER_LIKES=VINE_API_BASE_URL+"/timelines/users/{userId}/likes";
	public static final String VINE_API_POST_LIKES=VINE_API_BASE_URL+"/posts/{postId}/likes";
	public static final String VINE_API_USER_FOLLOW=VINE_API_BASE_URL+"/users/{userId}/followers";
	public static final String VINE_API_USER_BLOCK=VINE_API_BASE_URL+"/users/{myUserId}/blocked/{userId}";
	public static final String VINE_API_POST_REPORT=VINE_API_BASE_URL+"/posts/{postId}/complaints";
	public static final String VINE_API_POST_LIKE=VINE_API_BASE_URL+"/posts/{postId}/likes";
	public static final String VINE_API_POST_ADD_COMMENT=VINE_API_BASE_URL+"/posts/{postId}/comments";
	public static final String VINE_API_SEACRH_TAG=VINE_API_BASE_URL+"/tags/search/{tag}";
