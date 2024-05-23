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
import org.apache.commons.lang3.RandomStringUtils
import randomInput.RandomInputs
import randomInput.RandomInputs as random

WebUI.openBrowser(GlobalVariable.StagingEnv)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), "qa.tester+manuwai99@ubidy.com")

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Password Textbox'), GlobalVariable.StandardPw)

WebUI.click(findTestObject('Object Repository/Login Page/Buttons/Sign In Btn'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'), 5)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'))

//def firstName = random.randomFirstName()
//
//def number = RandomStringUtils.randomNumeric(2)
//
//def emailAddress = "qa.tester+" + firstName + number + "@ubidy.com"
//
//GlobalVariable.VerifiedAccount = emailAddress
//
//def randomNumber = RandomStringUtils.randomNumeric(9)
//
//def policyNumber = RandomStringUtils.randomNumeric(6)
//
//def postalCode = RandomStringUtils.randomNumeric(4)

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Assessment Btn'), 10)

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Assessment Btn'))

//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Legal Name Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Legal Name Txtboxes'), RandomInputs.randomCompany() + Keys.ENTER)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Company No Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Company No Txtboxes'), randomNumber)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Trading Name Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Trading Name Txtboxes'), "LLC")
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Insurer Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Insurer Txtboxes'), "Insurance")
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Policy No Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Policy No Txtboxes'), policyNumber)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Assessment - Expiry Month Dropdown Btn'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/January Option'), 3)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/January Option'))
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Assessment - Expiry Day Dropdown Btn'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/14 Option'), 3)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/14 Option'))
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Assessment - Expiry Year Dropdown Btn'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/2025 Option'), 3)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/2025 Option'))
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Limit of Idemnity Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Limit of Idemnity Txtboxes'), "2,000,000")
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Address 1 Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Address 1 Txtboxes'), "Blk 10 Lot 32")
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Address2 Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Address2 Txtboxes'), "Santa Rosa")
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - City Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - City Txtboxes'), RandomInputs.randomCity() + Keys.ENTER)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Assessment - Country Dropdown Btn'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/Algeria Option'), 3)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/Algeria Option'))
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Postal Code Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Postal Code Txtboxes'), postalCode)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Contact Name Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Contact Name Txtboxes'), RandomInputs.randomFirstName() + RandomInputs.randomLastName())
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Department Email Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Department Email Txtboxes'), emailAddress)
//
//WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Phone Txtboxes'))
//
//WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Phone Txtboxes'), randomNumber)
//
WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Assessment - Start Survey Btn'))

def uploadFile() {
	String osName = System.getProperty('os.name')
	if (osName.contains("Mac OS X")) {
		WebUI.uploadFile(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/11 File Uploader Btn'), GlobalVariable.ConductPolicyFile)
	} else {
		WebUI.uploadFile(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/11 File Uploader Btn'), GlobalVariable.JDFileLocation)
	}
}

def uploadFile1() {
	String osName = System.getProperty('os.name')
	if (osName.contains("Mac OS X")) {
		WebUI.uploadFile(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/14 File Uploader Btn'), GlobalVariable.FormalEngagementFile)
	} else {
		WebUI.uploadFile(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/14 File Uploader Btn'), GlobalVariable.JDFileLocation)
	}
}



//START ASSESSMENT FORM
WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 1 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 2 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 3 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 4 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 5 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 6 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 7 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Question 8 Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/4 Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/4 Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 9 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 10 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 11 Checkbox'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/11 File Uploader Btn'), 3)

uploadFile()


WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 12 Checkbox'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Question 12 Txtboxes'), "Ubidy Pty Ltd")

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 13 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 13-1 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 13-2 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 14 Checkbox'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/14 File Uploader Btn'), 3)

uploadFile1()

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 15 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Checkboxes/Question 16 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Confirm Name Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Confirm Name Txtboxes'), "Joy Martinez")

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Confirm Position Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Assessment - Confirm Position Txtboxes'), "Human Resources")

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Confirm Date - Month Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/March Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/March Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Confirm Date - Day Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/13 Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/13 Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Confirm Date - Year Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/2026 Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Elements/2026 Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Buttons/Submit Assessment Btn'))

WebUI.delay(5)

