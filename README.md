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
Implement the following endpoints



SIGNUP			=	BASE_URL+"/users"
ME			=	BASE_URL+"/users/me"
PROFILE			=	BASE_URL+"/users/profiles/{userId}"
NOTIFICATIONS		=	BASE_URL+"/users/{userId}/notifications"
PENDING_NOTIFICATIONS	=	BASE_URL+"/users/{userId}/pendingNotificationsCount"
USER_TIMELINE		=	BASE_URL+"/timelines/users/{userId}"
TAG_TIMELINE		=	BASE_URL+"/timelines/{tag}"
POST_COMMENTS		=	BASE_URL+"/posts/{postId}/comments"
POST_COMMENT		=	BASE_URL+"/posts/{postId}/comments/{commentId}"
USER_LIKES		=	BASE_URL+"/timelines/users/{userId}/likes"
POST_LIKES		=	BASE_URL+"/posts/{postId}/likes"
USER_FOLLOW		=	BASE_URL+"/users/{userId}/followers"
USER_BLOCK		=	BASE_URL+"/users/{myUserId}/blocked/{userId}"
POST_REPORT		=	BASE_URL+"/posts/{postId}/complaints"
POST_LIKE		=	BASE_URL+"/posts/{postId}/likes"
POST_ADD_COMMENT	=	BASE_URL+"/posts/{postId}/comments"
