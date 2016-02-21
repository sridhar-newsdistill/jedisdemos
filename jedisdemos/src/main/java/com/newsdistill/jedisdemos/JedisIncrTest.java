package com.newsdistill.jedisdemos;

import redis.clients.jedis.Jedis;

public class JedisIncrTest {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1");

		System.out.println(jedis.get("counter"));
		System.out.println(jedis.incr("counter"));

	}

}
