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

WebUI.callTestCase(findTestCase("Call TestCases/Login Employer Account"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Notification Page/Buttons/Notification Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Notification Page/Buttons/Notification Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Notification Page/Buttons/First Card View Now Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Notification Page/Buttons/First Card View Now Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Application Status Update Modal/Decline Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Application Status Update Modal/Decline Btn'))

WebUI.setText(findTestObject('Object Repository/Employer - Engagements Page/Decline Application Modal/Decline Reason Txtbox'), "This is test automation declined reason")

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Application Status Update Modal/Decline Application Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Application Status Update Modal/Decline Application Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Decline Application Modal/Decline Application Success Toast Msg'), 3)

WebUI.verifyTextPresent("The agency application has been successfully declined.", false)