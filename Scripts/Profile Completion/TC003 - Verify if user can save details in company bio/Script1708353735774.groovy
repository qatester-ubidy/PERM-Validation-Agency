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

WebUI.openBrowser(GlobalVariable.StagingEnv)

WebUI.maximizeWindow()


def AddDescription() {
	
	WebUI.click(findTestObject('Object Repository/Profile Completion/Company Bio Tab/Buttons/Create Your Company Bio Btn'))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Company Bio Tab/Textboxes/Company Bio Txtboxes'), 10)
	
	WebUI.setText(findTestObject('Object Repository/Profile Completion/Company Bio Tab/Textboxes/Company Bio Txtboxes'), GlobalVariable.CompanyBioMessage)
	
	WebUI.click(findTestObject('Object Repository/Profile Completion/Company Bio Tab/Buttons/Company Bio Save AND Continue Btn'))
}
	
//LOG IN VALID ACCOUNT
WebUI.callTestCase(findTestCase("Call TestCases/Login with Verifed Account"), [:])

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Company Bio Tab/Buttons/Company Bio Btn'))

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Company Bio Tab/Buttons/Create Your Company Bio Btn'), 3) == true) {
	AddDescription()
	
} else {
	
	WebUI.setText(findTestObject('Object Repository/Profile Completion/Company Bio Tab/Textboxes/Company Bio Txtboxes'), Keys.chord(Keys.COMMAND, 'a') + Keys.BACK_SPACE)
	
	WebUI.setText(findTestObject('Object Repository/Profile Completion/Company Bio Tab/Textboxes/Company Bio Txtboxes'), GlobalVariable.CompanyBioMessage)
	
	WebUI.click(findTestObject('Object Repository/Profile Completion/Company Bio Tab/Buttons/Company Bio Save AND Continue Btn'))
}

WebUI.delay(3)

WebUI.closeBrowser()