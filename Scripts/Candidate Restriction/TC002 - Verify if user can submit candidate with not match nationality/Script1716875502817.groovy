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

def uploadFile() {
	String osName = System.getProperty('os.name')
	if (osName.contains("Mac OS X")) {
		WebUI.uploadFile(findTestObject('Object Repository/Candidate Viewer Page/Elements/Candidate CV Section'), GlobalVariable.CVFile)
	} else {
		WebUI.uploadFile(findTestObject('Object Repository/Candidate Viewer Page/Elements/Candidate CV Section'), GlobalVariable.JDFile)
	}
}

WebUI.callTestCase(findTestCase("Call TestCases/Agency Apply To New Engagement With Nationality"), [:])

WebUI.callTestCase(findTestCase("Call TestCases/Open Ubidy Agency"), [:])

//LOG IN VALID ACCOUNT
WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), GlobalVariable.ValidEmail)

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Password Textbox'), GlobalVariable.StandardPw)

WebUI.click(findTestObject('Object Repository/Login Page/Buttons/Sign In Btn'))

WebUI.click(findTestObject('Object Repository/Engagement Page/Engagement Tab'))

WebUI.click(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Buttons/Submit New Candidate Btn'))

def firstName = RandomInputs.randomFirstName()

def emailAddress = ('qa.tester+' + firstName + RandomStringUtils.randomNumeric(4)) + '@ubidy.com'

GlobalVariable.VerifiedAccount = emailAddress

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Viewer Page/Buttons/Upload CV Btn'), 3)

//UPLOAD CV
uploadFile()

//FILL IN CANDIDATE DETAILS
WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/First Name Txtbox'), firstName)

WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Last Name Txtbox'), RandomInputs.randomLastName())

WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Email Address Txtbox'), emailAddress)

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Buttons/Country Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Viewer Page/Elements/Afghanistan Option'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Elements/Afghanistan Option'))

WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Contact No Txtbox'), RandomInputs.randomNumber())

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Current Country Txtbox'))

WebUI.enhancedClick(findTestObject('Object Repository/Candidate Viewer Page/Elements/Algeria Option'))

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Buttons/Nationality Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Viewer Page/Elements/French Polynesia Option'), 3)

WebUI.enhancedClick(findTestObject('Object Repository/Candidate Viewer Page/Elements/French Polynesia Option'))

WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Base Salary Txtbox'), "100000")

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Buttons/Submit Candidate Btn'))

//Verify user can't submit candidate with mismatch nationality
WebUI.verifyTextPresent("Not aligned with the employer preferences. Please verify talent request details before submitting.", false)

WebUI.closeBrowser()