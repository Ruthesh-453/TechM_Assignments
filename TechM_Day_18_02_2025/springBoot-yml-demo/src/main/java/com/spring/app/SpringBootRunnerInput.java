package com.spring.app;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringBootRunnerInput implements CommandLineRunner {
	
	@Value("${my.code.id}")
	private int codeId;
	@Value("${my.code.cost}")
	private double codeCost;
	@Value("${my.code.mdn.type}")
	private String codelver;
	@Value("${my.code.mdn.obj}")
	private String codeObj;
	@Value("${my.code.mdn.sale}")
	private String codeSale;
	
	@Override
	public String toString() {
		return "SpringBootRunnerInput [prodid=" + codeId + ",prodCode=" + codeCost + ",modelVer=" + codelver + ",isDetEnable=" + codeObj + ",startKey=" + codeSale + "]";
	}
	
	public void run(String...args) throws Exception{
		System.out.println(this.toString());
	}

}