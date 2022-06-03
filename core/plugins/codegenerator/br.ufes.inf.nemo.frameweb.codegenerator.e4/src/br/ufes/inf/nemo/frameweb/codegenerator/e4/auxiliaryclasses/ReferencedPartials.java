package br.ufes.inf.nemo.frameweb.codegenerator.e4.auxiliaryclasses;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.NavigationModelCodeGenerator;

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
		processNames();
	}

	public ReferencedPartials(String name, Integer upperBound)
	{
		this.name = name;
		this.upperBound = upperBound;
		processNames();
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
	
	private void processNames()
	{
		String[] splitNomeRef = NavigationModelCodeGenerator.separaPorMaiuscula(name);
		String partialRefNameDash = "";
		String partialRefCamelCase = name.substring(0, 1).toUpperCase() + name.substring(1);

		for (int i = 0; i < splitNomeRef.length; i++)
		{
			if (i == splitNomeRef.length - 1)
			{
				partialRefNameDash += splitNomeRef[i];
			} else
			{
				partialRefNameDash += splitNomeRef[i] + "-";
			}
		}
		this.nameDash = partialRefNameDash;
		this.nameCamelCase = partialRefCamelCase;
	}
	
}
