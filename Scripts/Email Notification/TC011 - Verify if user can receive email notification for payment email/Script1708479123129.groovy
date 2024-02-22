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
import org.openqa.selenium.Keys
import org.openqa.selenium.grid.web.ErrorHandler as Keys

//HIRE CANDIDATE
//WebUI.callTestCase(findTestCase("Email Notification/TC009 - Verify if user can receive email notification for Candidate Status update for Hired"), [:])

//COMPUTATION FOR PAYMENT
//def UbidyFee = GlobalVariable.EngagementFee * 0.25
//
//UbidyFee = GlobalVariable.UbidyFee
//
//def AgencyPayment = GlobalVariable.EngagementFee * 0.75
//
//AgencyPayment = GlobalVariable.AgencyPayment

//VERIFY EMAIL NOTIFICATION
WebUI.callTestCase(findTestCase("Call TestCases/Redirect To Gmail"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Gmail Page/Textboxes/Search Txtbox'), 3)

WebUI.setText(findTestObject('Object Repository/Gmail Page/Textboxes/Search Txtbox'), "Payment Email")

WebUI.click(findTestObject('Object Repository/Gmail Page/Buttons/Search Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Gmail Page/Elements/First Email Notif'), 3)

WebUI.waitForElementPresent(findTestObject('Object Repository/Gmail Page/Elements/First Email Payment Notif'), 3)

WebUI.click(findTestObject('Object Repository/Gmail Page/Elements/First Email Payment Notif'))

WebUI.verifyTextPresent("invoice for payment of the fee to the Employer", false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail Page/Elements/Payment Employer Table Details'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail Page/Elements/Payment Schedule Table Details'), 3)

//WebUI.verifyTextPresent(GlobalVariable.EngagementFee, false)
//
//WebUI.verifyTextPresent(GlobalVariable.UbidyFee, false)
//
//WebUI.verifyTextPresent(GlobalVariable.AgencyPayment, false)

WebUI.closeBrowser()
