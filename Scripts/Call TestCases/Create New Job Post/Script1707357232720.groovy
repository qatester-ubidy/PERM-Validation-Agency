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
import internal.GlobalVariable
import org.apache.commons.lang.math.RandomUtils
import org.apache.commons.lang3.RandomStringUtils
import org.openqa.selenium.Keys as Keys
import randomInput.RandomInputs

def uploadFile() {
	String osName = System.getProperty('os.name')
	if (osName.contains("Mac OS X")) {
		WebUI.uploadFile(findTestObject('Object Repository/Employer - Talent Request Page/Additional Documents/Elements/Job Description Container'), GlobalVariable.JobDescriptionFile)
	} else {
		WebUI.uploadFile(findTestObject('Object Repository/Employer - Talent Request Page/Additional Documents/Elements/Job Description Container'), GlobalVariable.JDFileLocation)
	}
}

WebUI.callTestCase(findTestCase("Call TestCases/Login Employer Account"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Buttons/Talent Request Tab Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Buttons/Talent Request Tab Btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Texts/Talent Request Title Txt'), "Talent Request")

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Buttons/Create Talent Request Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Buttons/Create Talent Request Btn'))

//STEP 1 - JOB REQUIREMENTS
WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Role Category Dropdown Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Role Category Dropdown Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Elements/Role Category Options/Professional Option'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Elements/Role Category Options/Professional Option'))

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Textboxes/Required Roles Txtbox'), RandomInputs.randomNumber())

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Hiring Lead Dropdown Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Elements/Hiring Lead/Hiring Lead List'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Elements/Hiring Lead/Hiring Lead Option'))

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Textboxes/Required Roles Txtbox'))

WebUI.scrollToElement(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Job Classification Dropdown Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Job Classification Dropdown Btn'))

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Textboxes/Job Classification Txtbox'), "Sport & Recreation" + Keys.ENTER)

WebUI.scrollToElement(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Job Classification Dropdown Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Job Sub Classification Dropdown Btn'))

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Elements/Job Sub Classification Options/All Other and Recreation Option'))

GlobalVariable.randomJob = RandomInputs.randomJobTitle()

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Textboxes/Job Title Txtbox'), GlobalVariable.randomJob + Keys.ENTER)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Checkboxes/Min years of experience'))

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Country Dropdown Btn'))

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Textboxes/Country Txtbox'), "French Polynesia")

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Elements/Cities/French Polynesia Option'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Elements/Cities/French Polynesia Option'))

WebUI.scrollToElement(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/City Dropdown Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/City Dropdown Btn'))

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/City Dropdown Btn'), RandomInputs.randomCity() + Keys.ENTER)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Next Btn'))

//STEP 2 - COMPENSATION
WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Compensation/Buttons/Currency Dropdown Btn'))

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Compensation/Textboxes/Currency Txtbox'), "USD" + Keys.ENTER)

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Compensation/Textboxes/Minimum Txtbox'), "1000")

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Compensation/Textboxes/Maximum Txtbox'), "10000")

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Next Btn'))

//STEP 3 - ADDITIONAL DOCUMENTS
WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Additional Documents/Buttons/Choose File Btn'), 3)

uploadFile()

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Next Btn'))

//STEP 4 - CANDIDATE QUALIFICATIONS
WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Next Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Next Btn'))

//STEP 5 - REVIEW & PUBLISH
WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Review and Publish/Buttons/Continue to Engagement Builder Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Review and Publish/Buttons/Continue to Engagement Builder Btn'))

//ENGAGEMENT BUILDER - SET UP
String numberRoles = new Random().nextInt(20) + 1

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagement Builder/Set Up Tab/Textboxes/CV Slot Txtbox'), 3)

WebUI.setText(findTestObject('Object Repository/Employer - Engagement Builder/Set Up Tab/Textboxes/CV Slot Txtbox'), numberRoles)

WebUI.click(findTestObject('Object Repository/Employer - Engagement Builder/Set Up Tab/Buttons/Engagement Type Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagement Builder/Set Up Tab/Elements/Employer Sets Rate Option'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagement Builder/Set Up Tab/Elements/Employer Sets Rate Option'))

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Next Btn'))

//ENGAGEMENT BUILDER - SELECT TR
WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagement Builder/Select TR Tab/Buttons/Select Fee Type Dropdown Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagement Builder/Select TR Tab/Buttons/Select Fee Type Dropdown Btn'))

WebUI.click(findTestObject('Object Repository/Employer - Engagement Builder/Select TR Tab/Elements/Percent Base - Annual Option'))

WebUI.setText(findTestObject('Object Repository/Employer - Engagement Builder/Select TR Tab/Textboxes/Amount Txtbox'), numberRoles)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Buttons/Next Btn'))

//ENGAGEMENT BUILDER - REVIEW & PUBLISH
WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagement Builder/Review and Publish Tab/Buttons/Publish Engagement Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagement Builder/Review and Publish Tab/Buttons/Publish Engagement Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Job Requirements/Create Talent Request Page/Elements/Creating Engagement Toast Message/Creating Job Post Toast Msg'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Texts/Engagements Title Txt'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagement Builder/Review and Publish Tab/Buttons/Confirm Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagement Builder/Review and Publish Tab/Elements/Information Toast Msg'), 3)