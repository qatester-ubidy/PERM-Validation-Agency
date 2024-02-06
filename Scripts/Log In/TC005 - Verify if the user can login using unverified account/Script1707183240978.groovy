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

//LOG IN UNVERIFIED ACCOUNT
WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), GlobalVariable.UnverifiedAccount)

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Password Textbox'), GlobalVariable.StandardPw)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login Page/Buttons/Sign In Btn'), 5)

WebUI.click(findTestObject('Object Repository/Login Page/Buttons/Sign In Btn'))

//VERIFY REDIRECTION
WebUI.waitForElementPresent(findTestObject('Object Repository/Confirm Email Page/Logo/Confirm Email Logo'), 5)

def TabTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(TabTitle, "Ubidy Agency - Confirm Email", false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Confirm Email Page/Texts/Confirm Your Email Txt'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Confirm Email Page/Texts/Confirm Your Email Txt'), "CONFIRM YOUR EMAIL")

WebUI.verifyElementPresent(findTestObject('Object Repository/Confirm Email Page/Texts/Confirm Email Subtitle Txt'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Confirm Email Page/Texts/Confirm Email Subtitle Txt'), "Please confirm your email before proceeding to log in.")

WebUI.verifyElementClickable(findTestObject('Object Repository/Confirm Email Page/Links/Go Back To Sign In Link'))

WebUI.closeBrowser()