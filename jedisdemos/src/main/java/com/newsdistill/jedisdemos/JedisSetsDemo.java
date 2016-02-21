package com.newsdistill.jedisdemos;

import redis.clients.jedis.Jedis;

public class JedisSetsDemo {

	public static void main(String[] args) {
		Jedis jedis = new Jedis();

		// jedis configuratio with port number
		Jedis jedisWithPortNumber = new Jedis("localhost", 6357);

		// timeout of the cache objects
		
		Jedis jedisWithTimeOut = new Jedis("local", 534, 30);
	
	}

}
