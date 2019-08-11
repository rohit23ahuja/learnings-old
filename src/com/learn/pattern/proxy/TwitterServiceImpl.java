package com.learn.pattern.proxy;

import java.util.List;

import com.oracle.webservices.internal.api.databinding.Databinding.Builder;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterServiceImpl implements TwitterService {

	private static final String TWITTER_CONSUMER_KEY = "NBZi5sUg4oy4QhvL13gBZqNeh";
	private static final String TWITTER_SECRET_KEY = "sebGx0GyePlMnvT0tA34fBAgXvNwNwx3DbB5SxAd4IZT5wSf8L";
	private static final String TWITTER_ACCESS_TOKEN = "152218300-vx6RCoZGnopzXOnnCtJ9z7VPhQMC6KUCGfxPMLHE";
	private static final String TWITTER_ACCESS_TOKEN_SECRET = "ZrMp4vlWYPQBceCNjdAYdFH7Ld9gWuKmX9qvOFJHG9jcW";

	@Override
	public String getTimeline(String screenName) {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey(TWITTER_CONSUMER_KEY).setOAuthConsumerSecret(TWITTER_SECRET_KEY)
				.setOAuthAccessToken(TWITTER_ACCESS_TOKEN).setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		StringBuilder stringBuilder = new StringBuilder();
		try {
			Query query = new Query(screenName);
			QueryResult result;
			do {
				result = twitter.search(query);
				List<Status> tweets = result.getTweets();
				for (Status tweet : tweets) {
					stringBuilder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
					stringBuilder.append("\n");

				}
			} while ((query = result.nextQuery()) != null);
		} catch (TwitterException e) {
			e.printStackTrace();
			System.out.println("Failed to search tweets " + e.getMessage());
		}
		return stringBuilder.toString();
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		// not allowed
	}

}
