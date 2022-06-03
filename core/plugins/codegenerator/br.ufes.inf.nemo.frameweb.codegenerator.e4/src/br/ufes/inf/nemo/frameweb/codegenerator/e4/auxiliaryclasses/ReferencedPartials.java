package br.ufes.inf.nemo.frameweb.codegenerator.e4.auxiliaryclasses;

public class ReferencedPartials
{
	private String name;
	private Integer upperBound;

	public ReferencedPartials(String name)
	{
		this.name = name;
		this.upperBound = 1;
	}

	public ReferencedPartials(String name, Integer upperBound)
	{
		this.name = name;
		this.upperBound = upperBound;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getUpperBound()
	{
		return upperBound;
	}

	public void setUpperBound(Integer upperBound)
	{
		this.upperBound = upperBound;
	}
}
