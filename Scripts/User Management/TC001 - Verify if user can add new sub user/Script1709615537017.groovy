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
import internal.GlobalVariable
import org.apache.commons.lang3.RandomStringUtils
import randomInput.RandomInputs
import randomInput.RandomInputs as random

WebUI.callTestCase(findTestCase("Call TestCases/Open Ubidy Agency"), [:])

def firstName = random.randomFirstName()

def number = RandomStringUtils.randomNumeric(3)

def getNewUserEmail = "qa.tester+" + firstName + RandomStringUtils.randomNumeric(3) + "@ubidy.com"

GlobalVariable.AddedUserEmail = getNewUserEmail

def lastName = random.randomLastName()

WebUI.waitForElementPresent(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), 3)

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Email Textbox'), GlobalVariable.AgencyAccount)

WebUI.setText(findTestObject('Object Repository/Login Page/Textboxes/Password Textbox'), GlobalVariable.StandardPw)

WebUI.click(findTestObject('Object Repository/Login Page/Buttons/Sign In Btn'))

//REDIRECT TO USER MANAGEMENT
WebUI.waitForElementPresent(findTestObject('Object Repository/Account Settings Page/Buttons/Profile Icon Btn'), 3)

WebUI.click(findTestObject('Object Repository/Account Settings Page/Buttons/Profile Icon Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Account Settings Page/Buttons/User Management Link'), 3)

WebUI.click(findTestObject('Object Repository/Account Settings Page/Buttons/User Management Link'))

WebUI.click(findTestObject('Object Repository/Account Settings Page/Buttons/Back Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Account Settings Page/Buttons/Create New User Btn'), 3)

WebUI.click(findTestObject('Object Repository/Account Settings Page/Buttons/Create New User Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Account Settings Page/Add User Modal/Email Address Txtbox'), 3)

WebUI.setText(findTestObject('Object Repository/Account Settings Page/Add User Modal/Email Address Txtbox'), GlobalVariable.AddedUserEmail)

WebUI.setText(findTestObject('Object Repository/Account Settings Page/Add User Modal/First Name Txtbox'), firstName)

WebUI.setText(findTestObject('Object Repository/Account Settings Page/Add User Modal/Last Name Txtbox'), lastName)

WebUI.click(findTestObject('Object Repository/Account Settings Page/Buttons/Manager Account Btn'))

WebUI.click(findTestObject('Object Repository/Account Settings Page/Add User Modal/Save Changes Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Account Settings Page/Elements/Add User Success Toast Msg'), 3)

//WebUI.verifyTextPresent("User has been added", false)

WebUI.closeBrowser()
