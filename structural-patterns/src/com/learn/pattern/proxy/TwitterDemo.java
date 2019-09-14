package com.learn.pattern.proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
		twitterService.postToTimeline("rohit23ahuja", "from eclipse ide");
		System.out.println(twitterService.getTimeline("rohit23ahuja"));
	}

}
