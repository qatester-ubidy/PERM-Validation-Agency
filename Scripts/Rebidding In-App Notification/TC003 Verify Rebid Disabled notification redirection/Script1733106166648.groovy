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

WebUI.callTestCase(findTestCase("Call TestCases/Agency Apply Only without Approving"), [:])

WebUI.callTestCase(findTestCase("Call TestCases/Employer Decline Application - Disabled"), [:])
//
WebUI.callTestCase(findTestCase("Call TestCases/Open Ubidy Agency"), [:])

WebUI.callTestCase(findTestCase("Call TestCases/Login Agency Account"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page/Buttons/Notification Btn'), 3)

WebUI.click(findTestObject('Object Repository/Notification Page/Buttons/Notification Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page/Buttons/View Now Btn'), 3)

WebUI.click(findTestObject('Object Repository/Notification Page/Buttons/View Now Btn'))

//VERIFY REDIRECTION
WebUI.verifyElementPresent(findTestObject('Object Repository/Engagement Page/Application Tab/Application Declined/Application Status Banner'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Engagement Page/Application Tab/Application Declined/Application Declined Title'), "Application Declined")

WebUI.verifyElementText(findTestObject('Object Repository/Engagement Page/Application Tab/Application Declined/Decline Reason Txt'), "Reason: This is test automation declined reason")

WebUI.verifyElementText(findTestObject('Object Repository/Engagement Page/Application Tab/Application Declined/Rebidding Permission Txt'), "Rebidding Permission: Disabled")

WebUI.verifyElementPresent(findTestObject('Object Repository/Engagement Page/Application Tab/Buttons/Withdraw Application Btn'), 3)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Engagement Page/Application Tab/Buttons/Re-bid Application Btn'), 3)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Engagement Page/Application Tab/Buttons/Edit Application Btn'), 3)

WebUI.closeBrowser()