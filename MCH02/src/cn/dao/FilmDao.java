package cn.dao;

import java.util.List;

import cn.bean.Film;

public interface FilmDao
{	
	public List<Film> list(int tid);
}
