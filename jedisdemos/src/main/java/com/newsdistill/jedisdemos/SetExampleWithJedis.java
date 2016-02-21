package com.newsdistill.jedisdemos;

import redis.clients.jedis.Jedis;

public class SetExampleWithJedis {

	public static void main(String[] args) {
		String cacheKey = "languages";
		Jedis jedis = new Jedis("localhost");
		System.out.println(jedis.select(10));
		jedis.sadd(cacheKey, "sridhar", "bandlamudi", "sridhar");
		System.out.println(jedis.smembers(cacheKey));
	}

}
