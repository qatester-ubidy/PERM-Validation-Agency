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

String[] firstName = findTestData('Data Files/First Names - Windows').getAllData()

int randomFirstname = new Random().nextInt(firstName.length+ 0 + 1)

def getRandomFirstname = findTestData('First Names - Windows').getValue('First Names', randomFirstname)

GlobalVariable.randomFirstName = getRandomFirstname

def emailAddress = ('qa.tester+' + getRandomFirstname + RandomStringUtils.randomNumeric(4)) + '@ubidy.com'

GlobalVariable.VerifiedAccount = emailAddress

String[] lastName = findTestData('Data Files/Last Names - Windows').getAllData()

int randomLastname = new Random().nextInt(lastName.length+ 0 + 1)

def getRandomLastname = findTestData('Last Names - Windows').getValue('Surnames', randomLastname)

GlobalVariable.randomLastName = getRandomLastname

def randomNumber = RandomStringUtils.randomNumeric(10)

String[] city = findTestData('Data Files/Cities - Windows').getAllData()

int randomCity = new Random().nextInt(city.length + 0 + 1)

def getRandomCity = findTestData('Cities - Windows').getValue('Cities', randomCity)

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Viewer Page/Buttons/Upload CV Btn'), 3)

//UPLOAD CV
WebUI.uploadFile(findTestObject('Object Repository/Candidate Viewer Page/Elements/Candidate CV Section'), GlobalVariable.JDFileLocation)

//FILL IN CANDIDATE DETAILS
WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/First Name Txtbox'), getRandomFirstname)

WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Last Name Txtbox'), getRandomLastname)

WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Email Address Txtbox'), emailAddress)

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Buttons/Country Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Viewer Page/Elements/Aghanistan Option'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Elements/Aghanistan Option'))

WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Contact No Txtbox'), randomNumber)

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Buttons/Nationality Dropdown Btn'))

WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Nationality Txtbox'), "French Polynesia")

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Viewer Page/Elements/French Polynesia Option'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Elements/French Polynesia Option'))

WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Location Txtbox'), getRandomCity)

WebUI.setText(findTestObject('Object Repository/Candidate Viewer Page/Textboxes/Base Salary Txtbox'), "100000")

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Buttons/Submit Candidate Btn'))

//CONFIRM CONSENT
WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Viewer Page/Confirm Consent Modal/Confirm Btn'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Viewer Page/Confirm Consent Modal/Confirm Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Viewer Page/Elements/Submit Candidate Success Toast Msg'), 3)

WebUI.verifyTextPresent("Candidate has been successfully submitted to the employer.", false)