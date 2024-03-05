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

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), 'qa.tester+kompamp-meta8759@ubidy.com')

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Password Textbox'), 'Ubidy12345!')

WebUI.click(findTestObject('Object Repository/Login Page/Buttons/Sign In Btn'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'), 5)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Buttons/Addresses Tab Btn'), 10)

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Addresses Tab Btn'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Delete Office Address Btn'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Delete Address Modal/OK Address Btn'))

WebUI.verifyTextPresent('Edit Regional Address', false)