package cn.dao.impl;

import cn.dao.BaseDao;

public class BaseDaoImpl implements BaseDao{

	@Override
	public void say() {
		System.out.println("��ϣ��Ϊ��"+this.hashCode());
		
	}
	public BaseDaoImpl(){
		System.out.println("123");
	}

}
