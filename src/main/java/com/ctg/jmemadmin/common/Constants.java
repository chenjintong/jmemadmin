package com.ctg.jmemadmin.common;

public class Constants {
	private Constants() {
		//Do nothing
	}
	
	public static final String[] SERVERS = {"10.142.90.152:8718"};//{"10.142.90.153:8718","10.142.90.154:8718"};设置缓存服务器列表，当使用分布式缓存的时，可以指定多个缓存服务器。这里应该设置为多个不同的服务
	public static final Integer[] WEIGHTS = {3, 2, 1};//设置服务器权重
	
	public static final String CREATE_SINGLE_MC_INSTANCE_CMD = "/opt/memcached/1.5.9/memcached-1.5.9/memcached -d -m 200 -u root -l 10.142.90.152 -p 12301 -c 1000 -P /tmp/memcached12301.pid";
	public static final String CREATE_MASTER_MC_INSTANCE_CMD = "/opt/memcached/1.2.8/memcached-1.2.8-repcached-2.2.1/memcached -d -m 200 -u dfs -l 10.142.90.152 -p 12301 -c 1000 -P /tmp/memcached12301.pid";
	public static final String CREATE_SLAVE_MC_INSTANCE_CMD = "/opt/memcached/1.2.8/memcached-1.2.8-repcached-2.2.1/memcached -d -m 200 -u dfs -l 10.142.90.154 -p 12301 -c 1000 -P /tmp/memcached12301.pid";

	public static final String SLAVE_IP = "10.142.90.154";
	public static final String SLAVE_USERNAME = "dfs";
	public static final String SLAVE_PASSWORD = "dfs123";
	
	
}
