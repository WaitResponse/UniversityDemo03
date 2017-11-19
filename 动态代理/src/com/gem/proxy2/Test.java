package com.gem.proxy2;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		Isale target=new WuDaLang();
		WuDaLangHandler handler = new WuDaLangHandler(target);
		Isale proxy=(Isale)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),handler);
		proxy.saleShaoBing();
		//proxy.saleJianBing();
	
	
	}
}
