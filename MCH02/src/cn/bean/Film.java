package cn.bean;

public class Film
{
	private int id;
	private String name;
	private String star;
	private String content;
	private double price;
	private int number;
	private FilmType ft;
	public Film()
	{
		super();
	}
	public Film(int id, String name, String star, String content, double price,
			int number, FilmType ft)
	{
		super();
		this.id = id;
		this.name = name;
		this.star = star;
		this.content = content;
		this.price = price;
		this.number = number;
		this.ft = ft;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getStar()
	{
		return star;
	}
	public void setStar(String star)
	{
		this.star = star;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	public FilmType getFt()
	{
		return ft;
	}
	public void setFt(FilmType ft)
	{
		this.ft = ft;
	}
}
