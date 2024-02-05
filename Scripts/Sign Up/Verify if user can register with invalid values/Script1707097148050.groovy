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
import com.thoughtworks.selenium.webdriven.commands.GetValue

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase("Call TestCases/Go To Sign Up Page"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Sign Up Page/Sign Up Email Field'), 3)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Sign Up Email Field'), "adminEmail.Testing! ")

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Sign Up Password Field'), "test")

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Confirm Password Field'), "TesT")

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Company Name Field'), "Co")

WebUI.setText(findTestObject('Object Repository/Sign Up Page/First Name Field'), GlobalVariable.LongName)

WebUI.setText(findTestObject('Object Repository/Sign Up Page/Last Name Field'), GlobalVariable.LongName)

WebUI.click(findTestObject('Object Repository/Sign Up Page/General Terms and Condition Checkbox'))

WebUI.click(findTestObject('Object Repository/Sign Up Page/Perm Placement T and C Checkbox'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Sign Up Page/Create An Account Btn'))

//VERIFY VALIDATION MESSAGES
WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page/Validation Messages/Sign Up Invalid Email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page/Validation Messages/Confirm Password Validation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page/Validation Messages/Company Name Validation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page/Validation Messages/First Name Validation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up Page/Validation Messages/Last Name Validation'))

WebUI.closeBrowser()