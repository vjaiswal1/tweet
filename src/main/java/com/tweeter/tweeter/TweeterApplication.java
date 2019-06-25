package com.tweeter.tweeter;

import javax.security.auth.login.Configuration;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TweeterApplication {

	public static void main(String[] args) throws TwitterException {

ConfigurationBuilder cb= new ConfigurationBuilder();
cb.setDebugEnabled(true)
	.setOAuthConsumerKey("2ZaU7pGo4qcrndVrQQtjC9Kog")
	.setOAuthConsumerSecret("ZHzcRAx3ncyHpxnkNGzDDCfShq4SdZK8GIsahxMFl4GWLD1PJw")
	.setOAuthAccessToken("1130863042936184837-WfxiY36GwxcvjZyalGsR7Hy9gvXdOo")
	.setOAuthAccessTokenSecret("5gLMOVbDWy9nINCnD9hB2f6ErT4IjoKc0dBJeFrNKgDoz");

TwitterFactory tf=new TwitterFactory(cb.build());
Twitter tw= tf.getInstance();

Query q= new Query("Jet Airways");

QueryResult res=tw.search(q);

System.out.print("VIKAS======="+res.getTweets().size());
	}
	
}