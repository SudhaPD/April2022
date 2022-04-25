package org.page;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass{
	
	public SearchPage() {
		PageFactory.initElements(driver,this);
	 }
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement btnClose;
	
	@FindBy(name="q")
	private WebElement tabSearch;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnSearch; 
	
	//@FindBy(xpath="//div[@class='_4rR01T']")
	@FindBys({@FindBy(xpath="//div[@class='_4rR01T']")})
	private List<WebElement> phnPrc;
	
	public WebElement getBtnClose() {
		return btnClose;
	}
	
	public WebElement getTabSearch() {
		return tabSearch;
	}
	
	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public List<WebElement> getPhnPrc() {
		return phnPrc;
	}


	public void search() {
		click(getBtnClose());
		sendkeys(getTabSearch(), "Iphone");
		click(getBtnSearch());
//		System.out.println(phnPrc.getText());
		
		System.out.println(getPhnPrc().size());
		for(int i=0;i<getPhnPrc().size();i++) {
			WebElement phnPrice = getPhnPrc().get(i);
			System.out.println(phnPrice.getAttribute("innerText"));
			}
		
	}

}

