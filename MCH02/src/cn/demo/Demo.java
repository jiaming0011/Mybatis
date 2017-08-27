package cn.demo;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.bean.Film;
import cn.bean.FilmType;
import cn.dao.FilmDao;
import cn.dao.FilmTypeDao;
import cn.util.MyBatisUtil;

public class Demo
{
	MyBatisUtil mu=new MyBatisUtil();
	SqlSession session=null;
	@Test
	public void test01()
	{
		session=mu.getSession();
		try
		{
			FilmTypeDao ftDao=session.getMapper(FilmTypeDao.class);
			ftDao.save("爱情片");
			session.commit();
			System.out.println("添加成功");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
	
	@Test
	public void test02()
	{
		session=mu.getSession();
		try
		{
			FilmTypeDao ftDao=session.getMapper(FilmTypeDao.class);
			for(FilmType ft:ftDao.list())
			{
				System.out.println(ft.getName());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
	
	@Test
	public void test03()
	{
		session=mu.getSession();
		try
		{
			FilmDao filmDao=session.getMapper(FilmDao.class);
			for(Film f:filmDao.list(1))
			{
				System.out.println(f.getName()+"\t"+f.getFt().getName());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
}
