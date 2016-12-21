package com.atguigu.webservice.test;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class MainServer {
	
	public static void main(String[] args) {
		//创建一个新的server工厂
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		//设置服务器的端口号
		factoryBean.setAddress("http://localhost:9999/Cxf_test");
		//设置服务器的方法类
		factoryBean.setServiceClass(WebServiceImpl.class);
		//创建服务器
		Server create = factoryBean.create();
		create.start();
		System.out.println("9999服务端启动");
	}

}
