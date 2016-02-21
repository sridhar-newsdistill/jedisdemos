package com.newsdistill.jedisdemos;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

public class TestJedis {

	public static void main(String[] args) throws InterruptedException {
		String cacheKey = "cacheKey";

		JedisPoolConfig jedisConf = new JedisPoolConfig();
		//jedisConf.s
		Jedis jedis = new Jedis("localhost");
		
		jedis.set(cacheKey, "cached value");
		jedis.expire(cacheKey, 5);
		Thread.sleep(3000);
		System.out.println("ttl :" + jedis.ttl(cacheKey));
		Thread.sleep(2000);

		System.out.println("ttl :" + jedis.get(cacheKey));
	}

}
