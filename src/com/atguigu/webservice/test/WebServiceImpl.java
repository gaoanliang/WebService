package com.atguigu.webservice.test;

public class WebServiceImpl implements WebService2 {

	@Override
	public String sayhello(String name, int age) {
		// TODO Auto-generated method stub
		return "hello" + name +"("+age+"years old)";
	}

}
