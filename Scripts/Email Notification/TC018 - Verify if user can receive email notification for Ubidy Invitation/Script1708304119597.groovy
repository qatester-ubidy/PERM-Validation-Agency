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


WebUI.setText(findTestObject('Object Repository/Employer - Agencies/Textboxes/Agency Name Txtboxes'), getRandomCompany)

WebUI.setText(findTestObject('Object Repository/Employer - Agencies/Textboxes/Agency Last Name Txtboxes'), getRandomLastname)

WebUI.setText(findTestObject('Object Repository/Employer - Agencies/Textboxes/Agency First Name Txtboxes'), getRandomFirstname)

WebUI.setText(findTestObject('Object Repository/Employer - Agencies/Textboxes/Agency Email Txtboxes'), emailAddress)

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Agencies/Buttons/Send Invitation Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Agencies/Buttons/Send Invitation Btn'))

WebUI.delay(5)

//VERIFY EMAIL INVITATION RECEIVE
WebUI.callTestCase(findTestCase("Call TestCases/Redirect To Gmail"), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail Page/Elements/First Email Notif'), 3)

WebUI.click(findTestObject('Object Repository/Gmail Page/Elements/First Email Notif'))

WebUI.verifyTextPresent('Congratulations! You have been invited to register', false)

