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

WebUI.openBrowser(GlobalVariable.TIKI_CATEGORY_DEVIDE_URL)
WebUI.waitForPageLoad(10)
List<String> expectList = ['Thiết Bị Âm Thanh và Phụ Kiện', 'Thiết Bị Chơi Game và Phụ Kiện', 'Thiết Bị Đeo Thông Minh và Phụ Kiện'
	, 'Thiết Bị Thông Minh và Linh Kiện Điện Tử', 'Phụ Kiện Điện Thoại và Máy Tính Bảng', 'Phụ kiện máy tính và Laptop']
List<String> actualList = CustomKeywords.'FinalKeywords.getTextFromList'(findTestObject('Tiki_Devide_Category/list_category'))
CustomKeywords.'kms.turing.katalon.plugins.assertj.ListAssert.equalsWithOrder'(actualList, expectList, "contains")