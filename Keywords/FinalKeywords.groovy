import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebElement

public class FinalKeywords {

	@Keyword
	def  String convertRGBAStringToHex(String colorRGB) {
		String[] hexValue = colorRGB.replace("rgb(", "").replace(")", "").split(",")
		int hexValue1=Integer.parseInt(hexValue[0])
		hexValue[1] = hexValue[1].trim()
		int hexValue2=Integer.parseInt(hexValue[1])
		hexValue[2] = hexValue[2].trim()
		int hexValue3=Integer.parseInt(hexValue[2])
		String hexColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3)
		return hexColor
	}

	@Keyword
	def  String convertRGBStringToHex(String colorRGB) {
		String[] hexValue = colorRGB.replace("rgb(", "").replace(")", "").split(",")
		int hexValue1=Integer.parseInt(hexValue[0])
		hexValue[1] = hexValue[1].trim()
		int hexValue2=Integer.parseInt(hexValue[1])
		hexValue[2] = hexValue[2].trim()
		int hexValue3=Integer.parseInt(hexValue[2])
		String hexColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3)
		return hexColor
	}


	@Keyword
	def String getRGBString(String str) {
		int start = str.indexOf("rgb")
		int end = str.indexOf(")", start)
		String rgbColor = str.substring(start, end)
		return rgbColor
	}

	@Keyword
	def  List<String> getTextFromList(TestObject obj) {
		'''This function return a list of texts get from list of elements'''
		List<WebElement> lstElements = WebUI.findWebElements(obj,5)
		List<String> elmTexts = new ArrayList<String>()
		for(WebElement element:lstElements)  {
			elmTexts.add(element.getText())
		}
		return elmTexts
	}




	@Keyword
	def String getTextOfElement(TestObject obj) {
		WebElement element = WebUI.findWebElement(obj,5)
		return element.getText()
	}
}
