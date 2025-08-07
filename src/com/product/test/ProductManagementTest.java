package com.product.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.product.sbeans.Shipment;

public class ProductManagementTest {

	public static void main(String[] args)
	{
		//1.Create IOC container
		FileSystemXmlApplicationContext ctx=
				new FileSystemXmlApplicationContext("E:\\Full-Stack-Java-Development\\Spring\\Spring-Lab\\Order-Management-System\\src\\com\\product\\confg\\applicationContext.xml");
		//2.Get the bean
		Shipment bean=(Shipment)ctx.getBean("ship");
		//3.print the result
		System.out.println(bean);
		//4.close IOC
		ctx.close();

	}

}
