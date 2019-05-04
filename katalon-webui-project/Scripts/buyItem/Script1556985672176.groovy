import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.canadapost.ca/cpc/en/home.page')

WebUI.click(findTestObject('Object Repository/testHomePage/Page_Mailing and shipping for Personal and Business  Canada Post/a_English'))

WebUI.scrollToPosition(500, 1500)


TestObject to = new TestObject()

// click the online shop
to.addProperty("xpath", ConditionType.EQUALS, "//a[contains(text(),'online Shop')]")
WebUI.click(to)

// click the i understand for the cookie
to.addProperty("xpath", ConditionType.EQUALS, "//a[contains(text(),'I understand')]")
if(WebUI.verifyElementPresent(to, 5)){
	WebUI.click(to)
} 

// scroll to the item
to.addProperty("xpath", ConditionType.EQUALS, "//div[@id='featuredProductsDiv']/h2/strong")
WebUI.scrollToElement(to, 3)


// add item
to.addProperty("xpath", ConditionType.EQUALS, "//a[@onclick='addToShoppingCart(414112111);']")
WebUI.click(to)

WebUI.waitForPageLoad(2)
WebUI.click(to)

// going to shopping cart to check the bought items
to.addProperty("xpath", ConditionType.EQUALS, "//div[@id='mainNav']/div/div/div/section/ul/li[4]/a/span")
WebUI.scrollToPosition(500,0)
WebUI.click(to)






