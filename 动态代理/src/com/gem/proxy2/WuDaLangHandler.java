package com.gem.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WuDaLangHandler implements InvocationHandler {
	private Isale target;
	
	public WuDaLangHandler(Isale target){
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		Object obj = method.invoke(target, args);
		if("saleJianBing".equals(methodName)){
			song();
		}
		return obj;
	}
	private void song(){
		System.out.println("ÀÕ¿œ∆≈°£°£°£");
	}
}
