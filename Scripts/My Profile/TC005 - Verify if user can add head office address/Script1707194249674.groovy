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

// WebUI.callTestCase(findTestCase("Call TestCases/Redirect to My Profile page"), [:], FailureHandling.CONTINUE_ON_FAILURE)== true)


WebUI.openBrowser(GlobalVariable.StagingEnv)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), 'qa.tester+kompamp-meta8759@ubidy.com')

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Password Textbox'), 'Ubidy12345!')

WebUI.click(findTestObject('Object Repository/Login Page/Buttons/Sign In Btn'))

WebUI.delay(5)

// VERIFY HEAD OFFICE ADDRESS VALIDATION MESSAGES
WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'), 5)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'))

WebUI.waitForElementPresent(findTestObject('Object Repository/My Profile/Buttons/Addressess Btn'), 10)

WebUI.click(findTestObject('Object Repository/My Profile/Buttons/Addressess Btn'))

WebUI.click(findTestObject('Object Repository/My Profile/Buttons/Edit Head Office Address Btn'))

WebUI.click(findTestObject('Object Repository/My Profile/Buttons/Save Address Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Validation Messages/Address 1 Validation'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Validation Messages/Address 1 Validation'), "Address 1 is required!")

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Validation Messages/City Validation'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Validation Messages/City Validation'), "City is required!")

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Validation Messages/Province Validation'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Validation Messages/Province Validation'), "Province/State is required!")

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Validation Messages/Country Validation'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Validation Messages/Country Validation'), "Country is required!")

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Validation Messages/Postal Validation'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Validation Messages/Postal Validation'), "Postal/Zip is required!" ,FailureHandling.CONTINUE_ON_FAILURE)== true

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Validation Messages/Phone Validation'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Validation Messages/Phone Validation'), "Phone is required!")

WebUI.verifyElementPresent(findTestObject('Object Repository/My Profile/Validation Messages/Email Validation'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/My Profile/Validation Messages/Email Validation'), "Email is required!")

// VERIFY IF USER CAN ADD HEAD OFFICE ADDRESS 
WebUI.click(findTestObject('Object Repository/My Profile/Textboxes/Address 1 Txtboxes'))

WebUI.setText(findTestObject('Object Repository/My Profile/Textboxes/Address 1 Txtboxes'), GlobalVariable.Address1)

WebUI.click(findTestObject('Object Repository/My Profile/Textboxes/City Txtboxes'))

WebUI.setText(findTestObject('Object Repository/My Profile/Textboxes/City Txtboxes'), GlobalVariable.City)

WebUI.click(findTestObject('Object Repository/My Profile/Textboxes/State Txtboxes'))

WebUI.setText(findTestObject('Object Repository/My Profile/Textboxes/State Txtboxes'), GlobalVariable.Province)

WebUI.click(findTestObject('Object Repository/My Profile/Buttons/Select Country Btn'))

WebUI.click(findTestObject('Object Repository/My Profile/Buttons/Country Btn'))

WebUI.click(findTestObject('Object Repository/My Profile/Textboxes/Postal Txtboxes'))

WebUI.setText(findTestObject('Object Repository/My Profile/Textboxes/Postal Txtboxes'), GlobalVariable.PostalZip)

WebUI.click(findTestObject('Object Repository/My Profile/Textboxes/Address Phone Txtboxes'))

WebUI.setText(findTestObject('Object Repository/My Profile/Textboxes/Address Phone Txtboxes'), GlobalVariable.AddressPhone)

WebUI.click(findTestObject('Object Repository/My Profile/Textboxes/Email Address Txtboxes'))

WebUI.setText(findTestObject('Object Repository/My Profile/Textboxes/Email Address Txtboxes'), GlobalVariable.AddressEmail)

WebUI.click(findTestObject('Object Repository/My Profile/Buttons/Address Save Changes Btn'))