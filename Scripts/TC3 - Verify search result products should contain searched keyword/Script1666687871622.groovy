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

WebUI.openBrowser(GlobalVariable.AMAZON_RAW_URL)
WebUI.sendKeys(findTestObject("Amazon_Search_Block/tbx_search_box"), keyword)
WebUI.click(findTestObject("Amazon_Search_Block/btn_search"))
WebUI.waitForElementPresent(findTestObject("Amazon_Result_Page/title_result_page"), 10)
List<String> titleResult = CustomKeywords.'FinalKeywords.getTextFromList'(findTestObject("Amazon_Result_Page/txt_result_list_title"))
println(titleResult)
for(int i =0; i<5; i++ ) {
	println(titleResult[i])
	String titleNoCommon = titleResult[i].replaceAll(',', " ")
	String[] titleSplit = titleNoCommon.split()
	String title = String.join('', titleSplit).toLowerCase()
	println(title)
	CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.contains'(title, keyword, false, "contains", FailureHandling.STOP_ON_FAILURE)
}