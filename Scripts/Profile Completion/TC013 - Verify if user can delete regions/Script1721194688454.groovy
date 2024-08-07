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


def DeleteRegion() {
	WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Regions Tab/Buttons/Delete Region Btn'), 10)

	WebUI.click(findTestObject('Object Repository/Profile Completion/Regions Tab/Buttons/Delete Region Btn'))

	WebUI.click(findTestObject('Object Repository/Profile Completion/Regions Tab/Delete Regions Modal/OK Regions Btn'))

	WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Regions Tab/Delete Regions Modal/Delete Region Success Toast Msg'), 3)

	WebUI.verifyTextPresent('Region has been successfully deleted!', false)
	
}

WebUI.openBrowser(GlobalVariable.StagingEnv)

WebUI.maximizeWindow()

//LOG IN VALID ACCOUNT
WebUI.callTestCase(findTestCase("Call TestCases/Login with Verifed Account"), [:])

WebUI.delay(5)

//DELETE REGIONS
WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Regions Tab/Buttons/Regions Tab Btn'), 10)

WebUI.click(findTestObject('Object Repository/Profile Completion/Regions Tab/Buttons/Regions Tab Btn'))

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Regions Tab/Buttons/Delete Region Btn'), 3) == true) {
	DeleteRegion()
	
} else {
	WebUI.callTestCase(findTestCase("Test Cases/Profile Completion/TC012 - Verify if user can add regions"), [:])
	
	DeleteRegion()
}

WebUI.closeBrowser()