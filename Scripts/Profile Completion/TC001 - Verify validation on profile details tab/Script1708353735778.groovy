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

WebUI.callTestCase(findTestCase("Call TestCases/Login Agency Account"), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Profile Details Tab/Textboxes/Company Name Txtboxes'), Keys.chord(Keys.ALT, 'a') + Keys.BACK_SPACE)

WebUI.setText(findTestObject('Object Repository/Profile Completion/Profile Details Tab/Textboxes/Email Address Txtboxes'), Keys.chord(Keys.ALT, 'a') + Keys.BACK_SPACE)

WebUI.setText(findTestObject('Object Repository/Profile Completion/Profile Details Tab/Textboxes/PhoneNo Txtboxes'), Keys.chord(Keys.ALT, 'a') + Keys.BACK_SPACE)

WebUI.click(findTestObject('Object Repository/Profile Completion/Profile Details Tab/Buttons/Profile Save AND Continue Btn'))


//VALIDATION MESSAGES
WebUI.verifyTextPresent('Company Name is required!', false)

WebUI.verifyTextPresent('Email is required!', false)

WebUI.verifyTextPresent('Phone Number is required!', false)

WebUI.closeBrowser()