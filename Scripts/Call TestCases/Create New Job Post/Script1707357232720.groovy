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

String[] jobTitle = findTestData('Data Files/Job TItles').getAllData()

int randomJobTitle = new Random().nextInt(jobTitle.length + 1)

def getRandomJobTitle = findTestData('Job Titles').getValue('Jobtitles', randomJobTitle)

String[] cities = findTestData('Data Files/Cities').getAllData()

int randomCity = new Random().nextInt(cities.length + 1)

def getRandomCity = findTestData('Cities').getValue('Cities', randomCity)

def randomNumber = RandomStringUtils.randomNumeric(1)

WebUI.openBrowser("https://stagingemployer.ubidyapp.com/")

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Log In Page/Textboxes/Email Txtbox'), 3)

WebUI.setText(findTestObject('Object Repository/Employer - Log In Page/Textboxes/Email Txtbox'), GlobalVariable.EmployerAccount)

WebUI.setText(findTestObject('Object Repository/Employer - Log In Page/Textboxes/Password Txtbox'), GlobalVariable.StandardPw)

WebUI.click(findTestObject('Object Repository/Employer - Log In Page/Buttons/Sign In Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Buttons/Talent Request Tab Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Buttons/Talent Request Tab Btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Employer - Talent Request Page/Texts/Talent Request Title Txt'), "Talent Request")

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Buttons/Create Talent Request Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Buttons/Create Talent Request Btn'))

//STEP 1 - JOB REQUIREMENTS
WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Role Category Dropdown Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Role Category Dropdown Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Job Classification Options/Professional Option'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Job Classification Options/Professional Option'))

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Required Roles Txtbox'), randomNumber)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Hiring Lead Dropdown Btn'))

WebUI.sendKeys(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Hiring Lead Dropdown Btn'), Keys.DOWN + Keys.ENTER)

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Job Classification Dropdown Btn'), "Sports & Recreation")

WebUI.sendKeys(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Job Classification Dropdown Btn'), Keys.ENTER)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Job Sub Classification Dropdown Btn'))

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Job Sub Classification Options/All Other and Recreation Option'))

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Job Title Txtbox'), getRandomJobTitle)

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Experience Dropdown Btn'), "1")

WebUI.sendKeys(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Experience Dropdown Btn'), Keys.ENTER)

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Country Txtbox'), "French Polynesia")

WebUI.sendKeys(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Country Txtbox'), Keys.ENTER)

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/City Txtbox'), getRandomCity)

WebUI.setText(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Preferred Languages Txtbox'), "English")

WebUI.sendKeys(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Textboxes/Preferred Languages Txtbox'), Keys.ENTER)

WebUI.click(findTestObject('Object Repository/Employer - Talent Request Page/Create Talent Request Page/Buttons/Next Btn'))

