package cn.dao;

import java.util.List;

import cn.bean.FilmType;

public interface FilmTypeDao
{
	public void save(String name);
	
	public List<FilmType> list();
}
