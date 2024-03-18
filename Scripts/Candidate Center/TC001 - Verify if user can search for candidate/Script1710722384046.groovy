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

//SUBMIT NEW CANDIDATE
WebUI.callTestCase(findTestCase("Engagements/TC002 -Verify if user can submit candidates"), [:])

//REDIRECT TO CANDIDATE CENTER
WebUI.callTestCase(findTestCase("Call TestCases/Log In Existing Agency Account"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Center/Buttons/Candidate Center Tab'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Center/Buttons/Candidate Center Tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Center/Elements/Candidate Center Title'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/Candidate Center/Elements/Candidate Center Title'), "Candidate Center")

WebUI.verifyElementPresent(findTestObject('Object Repository/Candidate Center/Buttons/Assigned To You Tab'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Candidate Center/Buttons/All Candidates Tab'), 3)

WebUI.click(findTestObject('Object Repository/Candidate Center/Buttons/All Candidates Tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Center/Textboxes/Candidate Searchbar'), 3)

def searchName = GlobalVariable.getRandomFirstname + " " + GlobalVariable.getRandomLastname

WebUI.setText(findTestObject('Object Repository/Candidate Center/Textboxes/Candidate Searchbar'), searchName)

WebUI.waitForElementPresent(findTestObject('Object Repository/Candidate Center/Elements/Candidate Table'), 3)

WebUI.verifyTextPresent(searchName, false)

WebUI.closeBrowser()