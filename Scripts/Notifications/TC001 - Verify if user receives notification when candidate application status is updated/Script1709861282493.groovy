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

WebUI.callTestCase(findTestCase("Call TestCases/Agency Apply To New Engagement"), [:])

WebUI.callTestCase(findTestCase("Call TestCases/Log In Existing Agency Account"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page/Buttons/Notification Btn'), 3)

WebUI.click(findTestObject('Object Repository/Notification Page/Buttons/Notification Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page/Buttons/View Now Btn'), 3)

WebUI.click(findTestObject('Object Repository/Notification Page/Buttons/View Now Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Buttons/Fulfillment Tab Btn'), 3)

WebUI.click(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Buttons/Fulfillment Tab Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Buttons/Submit New Candidate Btn'), 3)

WebUI.click(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Buttons/Submit New Candidate Btn'))

//SUBMIT CANDIDATE
WebUI.callTestCase(findTestCase("Call TestCases/Submit Candidate Only"), [:])

//UPDATE CANDIDATE STATUS
WebUI.callTestCase(findTestCase("Call TestCases/Login Employer Account"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Notification Page/Buttons/Notification Btn'), 5)

WebUI.click(findTestObject('Object Repository/Employer - Notification Page/Buttons/Notification Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Notification Page/Buttons/First Card View Now Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Notification Page/Buttons/First Card View Now Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Candidate Viewer/Buttons/Status Update Dropdown Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Candidate Viewer/Buttons/Status Update Dropdown Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Candidate Viewer/Elements/Offer Extended Option'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Candidate Viewer/Elements/Offer Extended Option'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Candidate Viewer/Candidate Status Update Modal/24 hours Option'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Candidate Viewer/Candidate Status Update Modal/24 hours Option'))

WebUI.click(findTestObject('Object Repository/Employer - Candidate Viewer/Candidate Status Update Modal/Confirm Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Candidate Viewer/Elements/Candidate Status Update Toast Msg'), 5)

//WebUI.verifyTextPresent("candidate has an Offer Extended", false)

//VERIFY WEBAPP NOTIFICATION
WebUI.callTestCase(findTestCase("Call TestCases/Log In Existing Agency Account"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page/Buttons/Notification Btn'), 5)

WebUI.click(findTestObject('Object Repository/Notification Page/Buttons/Notification Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Notification Page/Buttons/Offer Extended View Now Btn'), 5)

WebUI.click(findTestObject('Object Repository/Notification Page/Buttons/Offer Extended View Now Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Viewer Page/Elements/Candidate Status'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Candidate Viewer Page/Elements/Candidate Status'), "Offer Extended")

WebUI.closeBrowser()