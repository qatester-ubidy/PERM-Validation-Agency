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

WebUI.callTestCase(findTestCase("Call TestCases/Create New Job Post - ATR"), [:])

//APPLY TO THE NEWLY CREATED JOB POST
WebUI.callTestCase(findTestCase("Call TestCases/Log In Existing Agency Account"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Engagement Page/Slider Btn'), 3)

WebUI.click(findTestObject('Object Repository/Opportunities Page/Buttons/Opportunities Tab Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Opportunities Page/Buttons/All Other Opportunities Tab Btn'), 3)

WebUI.click(findTestObject('Object Repository/Opportunities Page/Buttons/All Other Opportunities Tab Btn'))

WebUI.setText(findTestObject('Object Repository/Opportunities Page/Textboxes/Search Txtbox'), GlobalVariable.EngagementNumber)

WebUI.waitForElementPresent(findTestObject('Object Repository/Opportunities Page/Textboxes/Search Txtbox'), 3)

WebUI.waitForElementClickable(findTestObject('Object Repository/Opportunities Page/Elements/First Opportunity Card'), 3)

WebUI.enhancedClick(findTestObject('Object Repository/Opportunities Page/Elements/First Opportunity Card'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Employer - Engagements Page/Application Tab/Checkboxes/Nondisclosure Agreement'), 30)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Application Tab/Checkboxes/Nondisclosure Agreement'))

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Application Tab/Checkboxes/Terms and Conditions'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Engagement Page/Application Tab/Textboxes/Fee Amount Txtbox'), 3)

WebUI.sendKeys(findTestObject('Object Repository/Engagement Page/Application Tab/Textboxes/Fee Amount Txtbox'), Keys.chord(Keys.CONTROL+"a"))

WebUI.sendKeys(findTestObject('Object Repository/Engagement Page/Application Tab/Textboxes/Fee Amount Txtbox'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/Engagement Page/Application Tab/Textboxes/Fee Amount Txtbox'), "10")

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Application Tab/Buttons/Submit Application Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Application Tab/Confirmation Modal/Confirm Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Application Tab/Confirmation Modal/Confirm Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Application Tab/Assign Team Member Modal/Done Btn'), 3)

WebUI.click(findTestObject('Object Repository/Employer - Engagements Page/Application Tab/Assign Team Member Modal/Done Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer - Engagements Page/Application Tab/Elements/Submitting Application Toast Msg'), 3)