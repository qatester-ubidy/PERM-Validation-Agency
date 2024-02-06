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

//LOG IN WITH INVALID CREDENTIALS
WebUI.waitForElementPresent(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), 3)

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), 'admin@testing.com')

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Password Textbox'), 'Password123@')

WebUI.click(findTestObject('Object Repository/Login Page/Buttons/Sign In Btn'))

//VALIDATION MESSAGES
WebUI.verifyElementPresent(findTestObject('Object Repository/Login Page/Validation Messages/Incorrect Credentials Validation'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Login Page/Validation Messages/Incorrect Credentials Validation'), GlobalVariable.IncorrectCredentials)

WebUI.closeBrowser()