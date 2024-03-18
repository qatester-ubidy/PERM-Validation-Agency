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

WebUI.waitForElementPresent(findTestObject('Object Repository/Engagement Page/Buttons/Engagements Tab Btn'), 3)

WebUI.click(findTestObject('Object Repository/Engagement Page/Buttons/Engagements Tab Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Engagement Page/Elements/First Engagement Card'), 3)

WebUI.click(findTestObject('Object Repository/Engagement Page/Elements/First Engagement Card'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Buttons/Submit New Candidate Btn'), 3)

WebUI.click(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Buttons/Submit New Candidate Btn'))

//UPLOAD CV
WebUI.callTestCase(findTestCase("Call TestCases/Submit Candidate Only"), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Elements/Submitted Candidate'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Engagement Page/Fulfillment Tab/Elements/Submitted Candidate Name'), GlobalVariable.getRandomFirstname + " " + GlobalVariable.getRandomLastname)

WebUI.closeBrowser()