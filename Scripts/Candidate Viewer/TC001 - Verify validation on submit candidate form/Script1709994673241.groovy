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


WebUI.callTestCase(findTestCase("Call TestCases/Open Ubidy Agency"), [:])

//LOG IN VALID ACCOUNT
WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), GlobalVariable.ValidEmail)

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Password Textbox'), GlobalVariable.StandardPw)

WebUI.click(findTestObject('Object Repository/Login Page/Buttons/Sign In Btn'))

WebUI.click(findTestObject('Object Repository/Engagement Page/Engagement Tab'))

WebUI.click(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Buttons/Submit New Candidate Btn'))

WebUI.click(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Candidate Form/Buttons/Submit Candidate Btn'))

//VERIFY VALIDATION MESSAGES
WebUI.verifyTextPresent('Please input Candidate first name', false)

WebUI.verifyTextPresent('Please input Candidate last name', false)

WebUI.verifyTextPresent('Please input Candidate email', false)

WebUI.verifyTextPresent('Please input Candidate contact no.', false)

WebUI.verifyTextPresent('Please select a nationality', false)

WebUI.verifyTextPresent('Please select a current country', false)

WebUI.verifyTextPresent('Please input annualized base salary.', false)

WebUI.closeBrowser()

