import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.TIKI_RAW_URL)
WebUI.verifyElementPresent(findTestObject('Tiki_search_Block/btn_search'), 10)
String text = WebUI.getText(findTestObject('Tiki_search_Block/btn_search'))
String realText = "Tìm Kiếm"
WebUI.verifyMatch(text, realText, true)

String color = WebUI.getCSSValue(findTestObject('Tiki_search_Block/btn_search'), 'color')
String colorHex = CustomKeywords.'FinalKeywords.convertRGBAStringToHex'(color)
String realColor = "#ffffff"
WebUI.verifyMatch(colorHex, realColor, true)

String bgr = WebUI.getCSSValue(findTestObject('Tiki_search_Block/btn_search'), 'background')
String rgbBrgColor = CustomKeywords.'FinalKeywords.getRGBString'(bgr)
String colorBgrHex = CustomKeywords.'FinalKeywords.convertRGBStringToHex'(rgbBrgColor)
String realBgr = '#0d5cb6'
WebUI.verifyMatch(colorBgrHex, realBgr, true)
