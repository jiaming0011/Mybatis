package cn.service.impl;

import cn.aspect.AspectDemo;
import cn.dao.BaseDao;
import cn.service.ServiceDao;

public class ServiceDaoImpl implements ServiceDao {

//	private BaseDao baseDao;
	//��ֵע��
//	public void setBaseDao(BaseDao baseDao) {
//		this.baseDao = baseDao;
//	}
	
	//������ע��
//	public ServiceDaoImpl(BaseDao baseDao){
//	this.baseDao = baseDao;
//	}

	@Override
	public void service() {
		System.out.println("�߼����ж�");
//        throw new RuntimeException();
	}

}
