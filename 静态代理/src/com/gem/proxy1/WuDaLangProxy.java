package com.gem.proxy1;

public class WuDaLangProxy implements Isale{
	//target��Ŀ�����
	private Isale target;
	
	public WuDaLangProxy(Isale target){
		this.target=target;		
	}
	@Override
	public void saleShaoBing() {
		song();
		target.saleShaoBing();	//1.���ʲ���
		//2.�������
		song();
	}
	private void song(){
		System.out.println("�����š���");
	}
	
}
