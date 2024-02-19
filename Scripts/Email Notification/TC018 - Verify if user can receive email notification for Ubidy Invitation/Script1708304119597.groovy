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

WebUI.callTestCase(findTestCase("Call TestCases/Login Employer Account"), [:])


WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Agencies/Buttons/Slider Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Agencies/Buttons/Slider Btn'))


WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Agencies/Buttons/Agencies Tab Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Agencies/Buttons/Agencies Tab Btn'))

String[] firstName = findTestData('Data Files/Agency First Names').getAllData()

int randomFirstname = new Random().nextInt(firstName.length + 1)

def getRandomFirstname = findTestData('Data Files/Agency First Names').getValue('Agency First Names', randomFirstname)

def emailAddress = ('qa.tester+' + getRandomFirstname + RandomStringUtils.randomNumeric(4)) + '@ubidy.com'

GlobalVariable.VerifiedAccount = emailAddress

String[] lastName = findTestData('Data Files/Agency Last Names').getAllData()

int randomLastname = new Random().nextInt(lastName.length + 1)

def getRandomLastname = findTestData('Agency Last Names').getValue('Agency Last Names', randomLastname)

String[] companyName = findTestData('Data Files/Agency Company Names').getAllData()

int randomCompany = new Random().nextInt(companyName.length + 1)

def getRandomCompany = findTestData('Agency Company Names').getValue('Agency Company Names', randomCompany)





//WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Agencies/Textboxes/Agency Name Txtboxes'), 3)
//
//WebUI.click(findTestObject('Object Repository/Employer - Agencies/Textboxes/Agency Name Txtboxes'))


WebUI.setText(findTestObject('Object Repository/Employer - Agencies/Textboxes/Agency Name Txtboxes'), getRandomCompany)

WebUI.setText(findTestObject('Object Repository/Employer - Agencies/Textboxes/Agency Last Name Txtboxes'), getRandomLastname)

WebUI.setText(findTestObject('Object Repository/Employer - Agencies/Textboxes/Agency First Name Txtboxes'), getRandomFirstname)

WebUI.setText(findTestObject('Object Repository/Employer - Agencies/Textboxes/Agency Email Txtboxes'), emailAddress)
