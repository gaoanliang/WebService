package com.atguigu.webservice.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
	
	public static void main(String[] args) {
		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		factoryBean.setAddress("http://localhost:9999/Cxf_test");
		factoryBean.setServiceClass(WebService2.class);
		WebService2 create = (WebService2) factoryBean.create();
		String sayhello = create.sayhello("李坤", 100);
		System.out.println(sayhello);
	}

}
