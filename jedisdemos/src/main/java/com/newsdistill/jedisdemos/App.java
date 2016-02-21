package com.newsdistill.jedisdemos;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App {
	public static final String LOCAL_HOST = "127.0.0.1";

	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		Jedis jedisServer = new Jedis(LOCAL_HOST);
		jedisServer.set("movies", "deadpool");

		System.out.println(jedisServer.get("movies"));
	}
}
