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

WebUI.callTestCase(findTestCase("Call TestCases/Go To Sign Up Page"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Sign Up Page/Textboxes/Sign Up Email Field Txtboxes'), 3)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/Sign Up Email Field Txtboxes'), GlobalVariable.ValidEmail)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/Sign Up Password Field Txtboxes'), GlobalVariable.StandardPw)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/Confirm Password Field Txtboxes'), GlobalVariable.StandardPw)

//RANDOM COMPANY NAME
String[] Company = findTestData('Company Names - Windows').getAllData()

int randomCompany = new Random().nextInt(Company.length + 1)

def CompanyName = findTestData('Company Names - Windows').getValue('Company Names', randomCompany)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/Company Name Field Txtboxes'), CompanyName)

//RANDOM FIRST NAME	
String[] FirstNames = findTestData('First Names - Windows').getAllData()

int randomFirstName = new Random().nextInt(FirstNames.length + 1)

def FirstName = findTestData('First Names - Windows').getValue('First Names', randomFirstName)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/First Name Field Txtboxes'), FirstName)

//RANDOM LAST NAME
String[] LastNames = findTestData('Last Names - Windows').getAllData()

int randomLastName = new Random().nextInt(LastNames.length + 1)

def LastName = findTestData('Last Names - Windows').getValue('Surnames', randomLastName)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Textboxes/Last Name Field Txtboxes'), LastName)

//CHECK GENERAL AND PERM PLACEMENT TERMS & CONDITIONS
WebUI.click(findTestObject('Object Repository/Sign Up Page/Checkboxes/General Terms and Condition Checkbox'))

WebUI.click(findTestObject('Object Repository/Sign Up Page/Checkboxes/Perm Placement T and C Checkbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Sign Up Page/Buttons/Create An Account Btn'))

WebUI.click(findTestObject('Object Repository/Sign Up Page/Buttons/Create An Account Btn'))

//VERIFY VALIDATION
WebUI.verifyElementPresent(findTestObject('Object Repository/Sign Up Page/Validation Messages/Sign Up Existing Email Validation'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Sign Up Page/Validation Messages/Sign Up Existing Email Validation'), "Email already exists.")

WebUI.closeBrowser()