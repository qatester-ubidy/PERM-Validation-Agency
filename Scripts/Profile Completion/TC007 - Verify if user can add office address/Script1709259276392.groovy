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

//LOG IN VALID ACCOUNT
WebUI.callTestCase(findTestCase("Call TestCases/Login with Verifed Account"), [:])

WebUI.delay(5)

// VERIFY HEAD OFFICE ADDRESS VALIDATION MESSAGES
WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Addresses Tab/Buttons/Addresses Tab Btn'), 10)

WebUI.click(findTestObject('Object Repository/Profile Completion/Addresses Tab/Buttons/Addresses Tab Btn'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Addresses Tab/Buttons/Add Office Address Btn'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Addresses Tab/Textboxes/Address 1 Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Addresses Tab/Textboxes/Address 1 Txtboxes'), GlobalVariable.OfficeAddress1)

WebUI.click(findTestObject('Object Repository/Profile Completion/Addresses Tab/Textboxes/City Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Addresses Tab/Textboxes/City Txtboxes'), GlobalVariable.OfficeCity)

WebUI.click(findTestObject('Object Repository/Profile Completion/Profile Details Tab/Textboxes/State Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Profile Details Tab/Textboxes/State Txtboxes'), GlobalVariable.OfficeProvince)

WebUI.click(findTestObject('Object Repository/Profile Completion/Addresses Tab/Buttons/Select Country Btn'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Addresses Tab/Buttons/OfficeCountry Btn'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Postal Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Assessment Tab/Textboxes/Postal Txtboxes'), GlobalVariable.OfficePostal)

WebUI.click(findTestObject('Object Repository/Profile Completion/Addresses Tab/Textboxes/Address Phone Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Addresses Tab/Textboxes/Address Phone Txtboxes'), GlobalVariable.OfficePhone)

WebUI.click(findTestObject('Object Repository/Profile Completion/Profile Details Tab/Textboxes/Email Address Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Profile Details Tab/Textboxes/Email Address Txtboxes'), GlobalVariable.OfficeEmail)

WebUI.click(findTestObject('Object Repository/Profile Completion/Addresses Tab/Buttons/Address Save Changes Btn'))
