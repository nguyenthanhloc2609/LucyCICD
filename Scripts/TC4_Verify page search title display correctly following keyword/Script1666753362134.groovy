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
WebUI.sendKeys(findTestObject("Tiki_Search_Block/tbx_search_box"), keyword)
WebUI.click(findTestObject("Tiki_Search_Block/btn_search"))
WebUI.waitForElementVisible(findTestObject("Tiki_Result_Page/title_result_page"), 10)
String result_title =  CustomKeywords.'FinalKeywords.getTextOfElement'(findTestObject("Tiki_Result_Page/title_result_page"))
println(result_title)
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.contains'(result_title, keyword, false, "contains", FailureHandling.STOP_ON_FAILURE)
