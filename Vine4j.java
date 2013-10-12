import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;

/**
 * 
 * @author Brackston Mayhall
 *
 */
public class Vine4j {
	
	/**
	 * username WITHOUT twitter connect.
	 * Need to create an official vine login
	 */
	private static final String USERNAME = ""; //add username here
	
	/**
	 * password WITHOUT twitter connect.
	 * Need to create an official vine login
	 */
	private static final String PASSWORD = ""; //add password here
	
	/**
	 * Gson Pojo Util.
	 */
	private static Gson gson = new Gson();
	
	/**
	 * http client.
	 */
	private static HttpClient client = new DefaultHttpClient();
	
	/**
	 * stores vine auth data.
	 */
	private static VineAuth vineAuth = new VineAuth();
	
	/**
	 * user agent for vine.
	 */
	private static final String USER_AGENT = "com.vine.iphone/1.0.3 (unknown, iPhone OS 6.0.1, iPhone, Scale/2.000000)";
	
	/**
	 * accept lang for vine.
	 */
	private static final String ACCEPT_LANGUAGE = "en, sv, fr, de, ja, nl, it, es, pt, pt-PT, da, fi, nb, ko, zh-Hans, zh-Hant, ru, pl, tr, uk, ar, hr, cs, el, he, ro, sk, th, id, ms, en-GB, ca, hu, vi, en-us;q=0.8";
	
	/**
	 * vine unoffical base url.
	 */
	private static final String BASE_URL = "https://api.vineapp.com/";
	
	/**
	 * login url.
	 */
	private static final String LOGIN = "users/authenticate";
	
	/**
	 * tag url.
	 */
	private static final String TAG = "timelines/tags/";
	
	/**
	 * popular url.
	 */
	private static final String POPULAR = "timelines/popular";
	
	/**
	 * venues url.
	 */
	private static final String VENUES = "timelines/venues/";
	
	/**
	 * search url.
	 */
	private static final String SEARCH_USER = "users/search/";
	
	/**
	 * tag search url.
	 */
	private static final String SEARCH_TAG = "tags/search/";
	
	/**
	 * @return the username
	 */
	public static final String getUsername() {
		return USERNAME;
	}

	/**
	 * @return the password
	 */
	public static final String getPassword() {
		return PASSWORD;
	}
	
	/**
	 * used for loging in and getting session keys.
	 * @param username username
	 * @param password password
	 */
	public final void login(final String username, final String password) {
		
		HttpPost post = new HttpPost(BASE_URL + LOGIN);
	    try {

	        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
	        nameValuePairs.add(new BasicNameValuePair("username", username));
	        nameValuePairs
	            .add(new BasicNameValuePair("password", password));
	        nameValuePairs.add(new BasicNameValuePair("User-Agent", "com.vine.iphone/1.0.3 (unknown, iPhone OS 6.0.1, iPhone, Scale/2.000000)"));
	        nameValuePairs.add(new BasicNameValuePair("Accept-Language",
	            "en, sv, fr, de, ja, nl, it, es, pt, pt-PT, da, fi, nb, ko, zh-Hans, zh-Hant, ru, pl, tr, uk, ar, hr, cs, el, he, ro, sk, th, id, ms, en-GB, ca, hu, vi, en-us;q=0.8"));

	        post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	        HttpResponse response = client.execute(post);
	        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

	        String line = "";
	        while ((line = rd.readLine()) != null) {
	        	vineAuth = gson.fromJson(line, VineAuth.class);
	        	
	        	
	        }
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	}
	
	/**
	 * executes an http get for all queries except for popular.
	 * @param page page number to request
	 * @param size size
	 * @param type type of query
	 * @param param query param
	 * @return a pojo'd vine object
	 */
	public static Vine executeGet(final String page, final String size, final String type, final String param)
	{
		
		HttpGet get = new HttpGet(BASE_URL + type + param);
		Vine vineResponse = null;
	    try {

	        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);

	        nameValuePairs.add(new BasicNameValuePair("page", page));
	        nameValuePairs.add(new BasicNameValuePair("size", size));

	        get.setHeader("User-Agent", USER_AGENT);
	        get.setHeader("Accept-Language", ACCEPT_LANGUAGE);
	        get.setHeader("vine-session-id", vineAuth.getData().getKey());
	        HttpResponse response = client.execute(get);
	        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

	        String line = "";
	        while ((line = rd.readLine()) != null) {
	        	System.out.println(line);
	        	vineResponse = gson.fromJson(line, Vine.class);
	        }
	        
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
		return vineResponse;
	}
	
	/**
	 * gets popular vines.
	 * @param page the page number
	 * @param size the size
	 * @return a pojo'd vine object
	 */
	public final Vine getPopular(final String page, final String size) {
		HttpGet get = new HttpGet(BASE_URL + POPULAR);
		Vine vineResponse = null;
	    try {

	        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);

	        nameValuePairs.add(new BasicNameValuePair("page", page));
	        nameValuePairs.add(new BasicNameValuePair("size", size));

	        get.setHeader("User-Agent", USER_AGENT);
	        get.setHeader("Accept-Language", ACCEPT_LANGUAGE);
	        get.setHeader("vine-session-id", vineAuth.getData().getKey());
	        HttpResponse response = client.execute(get);
	        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

	        String line = "";
	        while ((line = rd.readLine()) != null) {
	        	vineResponse = gson.fromJson(line, Vine.class);
	        }
	        
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
		return vineResponse;
	}
	
	/**
	 * gets popular vines.
	 * @param page the page number
	 * @param size the size
	 * @param params the query params
	 * @return a pojo'd vine object
	 */
	public final Vine getTags(final String page, final String size, final String params) {
		return executeGet(page, size, TAG, params);
	}
	
	public final Vine searchTags(final String page, final String size, final String params) {
		return executeGet(page, size, SEARCH_TAG, params);
	}
	
	public final Vine getVenues(final String page, final String size, final String params) {
		return executeGet(page, size, VENUES, params);
	}
	
	public final Vine searchUser(final String page, final String size, final String params) {
		return executeGet(page, size, SEARCH_USER, params);
	}

	


} 