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

WebUI.openBrowser('https://mail.google.com/mail/u/0/#inbox')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/Gmail Page/Email Field'), 3)

WebUI.setText(findTestObject('Object Repository/Gmail Page/Email Field'), GlobalVariable.QAEmail)

WebUI.click(findTestObject('Object Repository/Gmail Page/Next Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Gmail Page/Password Field'), 3)

WebUI.setText(findTestObject('Object Repository/Gmail Page/Password Field'), GlobalVariable.QAPw)

WebUI.click(findTestObject('Object Repository/Gmail Page/Next Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Gmail Page/First Email Notif'), 3)

WebUI.click(findTestObject('Object Repository/Gmail Page/First Email Notif'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Gmail Page/Password Change Request Title'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Gmail Page/Password Change Request Title'), "Password Change Request")

WebUI.verifyTextPresent("Ubidy Agency Account Password", false)

WebUI.verifyElementClickable(findTestObject('Object Repository/Gmail Page/Click Here Link'))

WebUI.closeBrowser()
