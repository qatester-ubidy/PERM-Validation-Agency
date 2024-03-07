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


WebUI.callTestCase(findTestCase("Call TestCases/Redirect to My Profile page"), [:])

WebUI.delay(5)

// VERIFY HEAD OFFICE ADDRESS VALIDATION MESSAGES
WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'), 5)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Buttons/Addresses Tab Btn'), 10)

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Addresses Tab Btn'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Add Office Address Btn'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Address 1 Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Address 1 Txtboxes'), GlobalVariable.OfficeAddress1)

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/City Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/City Txtboxes'), GlobalVariable.OfficeCity)

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/State Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/State Txtboxes'), GlobalVariable.OfficeProvince)

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Select Country Btn'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/OfficeCountry Btn'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Postal Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Postal Txtboxes'), GlobalVariable.OfficePostal)

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Address Phone Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Address Phone Txtboxes'), GlobalVariable.OfficePhone)

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Email Address Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Email Address Txtboxes'), GlobalVariable.OfficeEmail)

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Address Save Changes Btn'))