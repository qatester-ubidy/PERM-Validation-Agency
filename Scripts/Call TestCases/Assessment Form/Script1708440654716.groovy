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


// VERIFY HEAD OFFICE ADDRESS VALIDATION MESSAGES
WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'), 5)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Buttons/Slider Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Logo/Sidebar Company Logo'))

String[] firstName = findTestData('Data Files/First Names').getAllData()

int randomFirstname = new Random().nextInt(firstName.length + 1)

def getRandomFirstname = findTestData('First Names').getValue('First Names', randomFirstname)

def emailAddress = ('qa.tester+' + getRandomFirstname + RandomStringUtils.randomNumeric(4)) + '@ubidy.com'

GlobalVariable.VerifiedAccount = emailAddress

String[] lastName = findTestData('Data Files/Last Names').getAllData()

int randomLastname = new Random().nextInt(lastName.length + 1)

def getRandomLastname = findTestData('Last Names').getValue('Surnames', randomLastname)

String[] companyName = findTestData('Data Files/Company Names').getAllData()

int randomCompany = new Random().nextInt(companyName.length + 1)

def getRandomCompany = findTestData('Company Names').getValue('Company Names', randomCompany)

String[] cities = findTestData('Data Files/Cities').getAllData()

int randomCity = new Random().nextInt(cities.length + 1)

def getRandomCity = findTestData('Cities').getValue('Cities', randomCity)

def randomNumber = RandomStringUtils.randomNumeric(9)

def policyNumber = RandomStringUtils.randomNumeric(6)

def postalCode = RandomStringUtils.randomNumeric(4)

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Buttons/Assessment Btn'), 10)

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Assessment Btn'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Legal Name Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Legal Name Txtboxes'), getRandomCompany)

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Company No Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Company No Txtboxes'), randomNumber)

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Trading Name Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Trading Name Txtboxes'), "LLC")

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Insurer Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Insurer Txtboxes'), "Insurance")

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Policy No Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Policy No Txtboxes'), policyNumber)

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Assessment - Expiry Month Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Elements/January Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Elements/January Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Assessment - Expiry Day Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Elements/14 Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Elements/14 Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Assessment - Expiry Year Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Elements/2025 Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Elements/2025 Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Limit of Idemnity Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Limit of Idemnity Txtboxes'), "2,000,000")

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Address 1 Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Address 1 Txtboxes'), "Blk 10 Lot 32")

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Address2 Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Address2 Txtboxes'), "Santa Rosa")

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - City Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - City Txtboxes'), getRandomCity)

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Assessment - Country Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Elements/Algeria Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Elements/Algeria Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Postal Code Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Postal Code Txtboxes'), postalCode)

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Contact Name Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Contact Name Txtboxes'), "Joy Martinez")

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Department Email Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Department Email Txtboxes'), "qa.tester+assessment@ubidy.com")

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Phone Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Phone Txtboxes'), randomNumber)

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Assessment - Start Survey Btn'))


//START ASSESSMENT FORM
WebUI.click(findTestObject('Object Repository/Profile Completion/Checkboxes/Assessment/Question 1 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Checkboxes/Assessment/Question 2 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Checkboxes/Assessment/Question 3 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Checkboxes/Assessment/Question 4 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Checkboxes/Assessment/Question 5 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Checkboxes/Assessment/Question 6 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Checkboxes/Assessment/Question 7 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Question 8 Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Elements/4 Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Elements/4 Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Question 9 Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Elements/1 to 100,000 Candidates Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Elements/1 to 100,000 Candidates Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Question 10 Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Elements/5 Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Elements/5 Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Checkboxes/Assessment/Question 11 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Question 12 Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Question 12 Txtboxes'), "Potential Agency Here")

WebUI.click(findTestObject('Object Repository/Profile Completion/Checkboxes/Assessment/Question 13 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Checkboxes/Assessment/Question 14 Checkbox'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Confirm Name Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Confirm Name Txtboxes'), "Joy Martinez")

WebUI.click(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Confirm Position Txtboxes'))

WebUI.setText(findTestObject('Object Repository/Profile Completion/Textboxes/Assessment - Confirm Position Txtboxes'), "Human Resources")

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Confirm Date - Month Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Elements/March Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Elements/March Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Confirm Date - Day Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Elements/13 Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Elements/13 Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Confirm Date - Year Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profile Completion/Elements/2026 Option'), 3)

WebUI.click(findTestObject('Object Repository/Profile Completion/Elements/2026 Option'))

WebUI.click(findTestObject('Object Repository/Profile Completion/Buttons/Submit Assessment Btn'))

WebUI.delay(5)

