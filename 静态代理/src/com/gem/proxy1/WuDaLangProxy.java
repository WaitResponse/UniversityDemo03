package com.gem.proxy1;

public class WuDaLangProxy implements Isale{
	//target叫目标对象
	private Isale target;
	
	public WuDaLangProxy(Isale target){
		this.target=target;		
	}
	@Override
	public void saleShaoBing() {
		song();
		target.saleShaoBing();	//1.本质操作
		//2.额外操作
		song();
	}
	private void song(){
		System.out.println("送老婆。。");
	}
	
}
