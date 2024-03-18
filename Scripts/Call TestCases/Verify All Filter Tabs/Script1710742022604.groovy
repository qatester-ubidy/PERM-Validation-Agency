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

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Center/Filter Tabs/All Tab'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Center/Filter Tabs/All Tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Candidate Center/Elements/Candidate Table'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Center/Filter Tabs/Pending Tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Candidate Center/Elements/Candidate Table'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Center/Filter Tabs/Shortlisted Tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Candidate Center/Elements/Candidate Table'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Center/Filter Tabs/Screening Tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Candidate Center/Elements/Candidate Table'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Center/Filter Tabs/Interviewing Tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Candidate Center/Elements/Candidate Table'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Center/Filter Tabs/Offer Extended Tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Candidate Center/Elements/Candidate Table'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Center/Filter Tabs/Hired Tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Candidate Center/Elements/Candidate Table'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Center/Filter Tabs/Rejected Tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Candidate Center/Elements/Candidate Table'), 3)