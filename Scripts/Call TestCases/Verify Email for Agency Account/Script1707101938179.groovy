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

WebUI.openBrowser('https://mail.google.com/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail Page/Email field'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail Page/Next Btn'), 3)

WebUI.setText(findTestObject('Object Repository/Gmail Page/Email field'), GlobalVariable.QAEmail)

WebUI.click(findTestObject('Object Repository/Gmail Page/Next Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail Page/Password field'), 5)

WebUI.setText(findTestObject('Object Repository/Gmail Page/Password field'), GlobalVariable.QAPw)

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail Page/Next Btn'), 3)

WebUI.click(findTestObject('Object Repository/Gmail Page/Next Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail Page/First Email Notif'), 3)

WebUI.click(findTestObject('Object Repository/Gmail Page/First Email Notif'))

WebUI.verifyTextPresent('Welcome to Ubidy', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail Page/Confirm Email Btn'), 3)

WebUI.verifyElementClickable(findTestObject('Object Repository/Gmail Page/Confirm Email Btn'))

WebUI.click(findTestObject('Object Repository/Gmail Page/Confirm Email Btn'))

WebUI.switchToWindowIndex(1)

WebUI.verifyTextPresent('Email Verified', false)

WebUI.verifyTextPresent('Your email address was successfully verified.', false)