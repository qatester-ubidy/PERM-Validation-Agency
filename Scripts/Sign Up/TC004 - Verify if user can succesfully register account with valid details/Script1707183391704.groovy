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

WebUI.callTestCase(findTestCase("Call TestCases/Go To Sign Up Page"), [:])

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

WebUI.waitForElementPresent(findTestObject('Object Repository/Sign Up Page/Textboxes/Sign Up Email Field Txtboxes'), 3)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/Sign Up Email Field Txtboxes'), emailAddress)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/Sign Up Password Field Txtboxes'), GlobalVariable.StandardPw)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/Confirm Password Field Txtboxes'), GlobalVariable.StandardPw)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/Company Name Field Txtboxes'), getRandomCompany)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/First Name Field Txtboxes'), getRandomFirstname)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/Last Name Field Txtboxes'), getRandomLastname)

WebUI.click(findTestObject('Object Repository/Sign Up Page/Checkboxes/General Terms and Condition Checkbox'))

WebUI.click(findTestObject('Object Repository/Sign Up Page/Checkboxes/Perm Placement T and C Checkbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Sign Up Page/Buttons/Create An Account Btn'))

WebUI.click(findTestObject('Object Repository/Sign Up Page/Buttons/Create An Account Btn'))

//VERIFY REDIRECTION
WebUI.verifyElementPresent(findTestObject('Object Repository/Sign Up Page/Confirm Email/Confirm Email Title'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Sign Up Page/Confirm Email/Thank You for Registering Text'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Sign Up Page/Confirm Email/Go Back To Sign In Page Btn'), 3)

WebUI.verifyElementClickable(findTestObject('Object Repository/Sign Up Page/Confirm Email/Go Back To Sign In Page Btn'))

//VERIFY EMAIL CONFIRMATION
WebUI.callTestCase(findTestCase('Call TestCases/Verify Email for Agency Account'), [:])

WebUI.closeBrowser()