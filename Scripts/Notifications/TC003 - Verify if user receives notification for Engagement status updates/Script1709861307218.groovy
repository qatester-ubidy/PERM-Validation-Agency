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

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/Fulfillment Tab'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/Fulfillment Tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/Engagement Card'), 3)

WebUI.mouseOver(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/Engagement Card'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/Edit TR Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/Edit TR Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/TR Info Modal/Cancel Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/TR Info Modal/Cancel Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/TR Info Modal/Cancel TR Modal/TR no longer required Option'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/TR Info Modal/Cancel TR Modal/TR no longer required Option'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/TR Info Modal/Cancel TR Modal/Done Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/TR Info Modal/Cancel TR Modal/Done Btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Fulfillment Tab/TR Info Modal/Success toast msg'), 3)

WebUI.verifyTextPresent("Talent request change status to cancel.", false)

//VERIFY AGENCY NOTIFICATION
WebUI.callTestCase(findTestCase("Call TestCases/Log In Existing Agency Account"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page/Buttons/Notification Btn'), 3)

WebUI.click(findTestObject('Object Repository/Notification Page/Buttons/Notification Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page/Elements/Status Sub Category Notif'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Notification Page/Elements/Status Sub Category Notif'), "Cancelled")

//WebUI.verifyElementPresent(findTestObject('Object Repository/Notification Page/Buttons/Engagement Notif View Now Btn'), 3)

//WebUI.click(findTestObject('Object Repository/Notification Page/Buttons/Engagement Notif View Now Btn'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Notification Page/Elements/Cancelled Engagement Toast Msg'), 3)

//WebUI.verifyTextPresent("Engagement has already been Cancelled.", false)

WebUI.closeBrowser()