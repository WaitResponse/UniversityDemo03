package com.gem.proxy1;

public class Test {
	public static void main(String[] args) {
/*		Isale sale=new WuDaLang();
		sale.saleShaoBing();*/
		Isale sale=new WuDaLang();
		WuDaLangProxy proxy=new WuDaLangProxy(sale);
		proxy.saleShaoBing();
	}
}
