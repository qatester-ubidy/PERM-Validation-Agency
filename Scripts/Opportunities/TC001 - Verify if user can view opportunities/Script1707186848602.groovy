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

WebUI.callTestCase(findTestCase("Call TestCases/Open Ubidy Agency"), [:])

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), "qa.tester+a01@ubidy.com")

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Password Textbox'), GlobalVariable.StandardPw)

WebUI.click(findTestObject('Object Repository/Login Page/Buttons/Sign In Btn'))

//VIEW ALL ENGAGEMENTS
WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'), 3)

WebUI.click(findTestObject('Object Repository/Opportunities Page/Buttons/Opportunities Tab Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Opportunities Page/Texts/Opportunities Title Txt'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Opportunities Page/Elements/Empty Opportunities Section'), 3)

WebUI.click(findTestObject('Object Repository/Opportunities Page/Buttons/All Other Opportunities Tab Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Opportunities Page/Elements/Opportunities List Section'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Opportunities Page/Elements/First Opportunity Card'), 3)

WebUI.closeBrowser()