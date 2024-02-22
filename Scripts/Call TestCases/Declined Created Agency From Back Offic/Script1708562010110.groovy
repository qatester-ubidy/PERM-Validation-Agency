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

WebUI.openBrowser("https://stagingbackoffice.ubidyapp.com/")

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/Back Office - Log In Page/Textboxes/Email Field Txtbox'), 3)

WebUI.setText(findTestObject('Object Repository/Back Office - Log In Page/Textboxes/Email Field Txtbox'), "qa.tester+jerrybackopis@ubidy.com")

WebUI.setText(findTestObject('Object Repository/Back Office - Log In Page/Textboxes/Password Field Txtbox'), "Tester12345!")

WebUI.click(findTestObject('Object Repository/Back Office - Log In Page/Buttons/Log In Btn'))

//VERIFY CREATED ACCOUNT
WebUI.waitForElementPresent(findTestObject('Object Repository/Back Office - Assesstment Page/Buttons/Assesstment Tab Btn'), 3)

WebUI.click(findTestObject('Object Repository/Back Office - Assesstment Page/Buttons/Assesstment Tab Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Back Office - Assesstment Page/Textboxes/Searchbar Txtbox'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Back Office - Assesstment Page/Elements/First Account Card'), 3)

WebUI.click(findTestObject('Object Repository/Back Office - Assesstment Page/Elements/First Account Card'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Back Office - Assesstment Page/Buttons/Update Assessment Dropdown Btn'), 3)

WebUI.click(findTestObject('Object Repository/Back Office - Assesstment Page/Buttons/Update Assessment Dropdown Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Back Office - Assesstment Page/Buttons/Declined Btn'), 3)

WebUI.click(findTestObject('Object Repository/Back Office - Assesstment Page/Buttons/Declined Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Back Office - Assesstment Page/Activation Confirmation Modal/Decline Btn'), 3)

WebUI.click(findTestObject('Object Repository/Back Office - Assesstment Page/Activation Confirmation Modal/Decline Btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Back Office - Assesstment Page/Elements/Application Status Field'), "Declined")

WebUI.callTestCase(findTestCase("Call TestCases/Redirect To Gmail"), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail Page/Elements/First Email Notif'), 3)

WebUI.click(findTestObject('Object Repository/Gmail Page/Elements/First Email Notif'))

WebUI.verifyTextPresent('Account Declined', false)
