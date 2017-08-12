package com.hTools.mbs;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RentABikeAssembler {
	public static final void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		CommandLineView clv = (CommandLineView)ctx.getBean("commandLineView");
		clv.printAllBikes();
		((ConfigurableApplicationContext)ctx).close();
	}

}
