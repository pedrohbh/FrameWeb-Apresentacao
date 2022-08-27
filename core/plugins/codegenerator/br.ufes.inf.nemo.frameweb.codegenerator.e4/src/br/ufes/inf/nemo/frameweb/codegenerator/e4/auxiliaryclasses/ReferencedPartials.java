package br.ufes.inf.nemo.frameweb.codegenerator.e4.auxiliaryclasses;

import java.util.LinkedList;
import java.util.List;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.NavigationModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponentField;

public class ReferencedPartials
{
	private String name;
	private Integer upperBound;
	private String nameDash;
	private String nameCamelCase;
	private final List<UIComponentField> spaPropsAttributes = new LinkedList<>();

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

	public List<UIComponentField> getSpaPropsAttributes()
	{
		return spaPropsAttributes;
	}

	public void addSpaPropAttribute(UIComponentField spaAttribute)
	{
		this.spaPropsAttributes.add(spaAttribute);
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
