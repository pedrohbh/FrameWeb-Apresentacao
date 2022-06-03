package br.ufes.inf.nemo.frameweb.codegenerator.e4.auxiliaryclasses;

public class ReferencedPartials
{
	private String name;
	private Integer upperBound;
	private String nameDash;
	private String nameCamelCase;

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

	public String getNameDash()
	{
		return nameDash;
	}

	public void setNameDash(String nameDash)
	{
		this.nameDash = nameDash;
	}

	public String getNameCamelCase()
	{
		return nameCamelCase;
	}

	public void setNameCamelCase(String nameCamelCase)
	{
		this.nameCamelCase = nameCamelCase;
	}	
	
}
