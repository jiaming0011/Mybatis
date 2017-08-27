package cn.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil
{
	public SqlSession getSession()
	{
		SqlSession session=null;
		try
		{
			Reader reader=Resources.getResourceAsReader("mybatis.cfg.xml");
			session=new SqlSessionFactoryBuilder().build(reader).openSession();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return session;
	}
}
