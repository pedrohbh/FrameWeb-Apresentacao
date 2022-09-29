package br.ufes.inf.nemo.frameweb.codegenerator.e4.auxiliaryclasses;

public class RedirectLinkSPA
{	
	private String partialName;
	private String partialHref;
	
	public RedirectLinkSPA()
	{
		
	}	
	
	public RedirectLinkSPA(String partialName, String partialHref)
	{
		this.partialName = partialName;
		this.partialHref = partialHref;
	}

	public String getPartialName()
	{
		return partialName;
	}
	
	public void setPartialName(String partialName)
	{
		this.partialName = partialName;
	}
	
	public String getPartialHref()
	{
		return partialHref;
	}
	
	public void setPartialHref(String partialHref)
	{
		this.partialHref = partialHref;
	}
	
	

}
