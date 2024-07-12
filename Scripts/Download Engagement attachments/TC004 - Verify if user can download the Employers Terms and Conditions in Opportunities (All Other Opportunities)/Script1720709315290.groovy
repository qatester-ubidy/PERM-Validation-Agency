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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By


WebUI.callTestCase(findTestCase("Test Cases/Call TestCases/Redirect to My Profile page"), [:])

// Click the download button
WebUI.click(findTestObject('Object Repository/Opportunities Page/Buttons/Opportunities Tab Btn'))

WebUI.click(findTestObject('Object Repository/Opportunities Page/Buttons/All Other Opportunities Tab Btn'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Opportunities Page/Elements/First Opportunity Card'), 6)

WebUI.click(findTestObject('Object Repository/Opportunities Page/Elements/First Opportunity Card'))

WebUI.click(findTestObject('Object Repository/Engagement Page/Application Tab/Links/Employer Terms and Conditions'))

WebUI.click(findTestObject('Object Repository/Engagement Page/Application Tab/Buttons/Download Btn'))

WebUI.delay(3)

String expectedFileName = WebUI.getText(findTestObject('Object Repository/Opportunities Page/Elements/Document Name'))

// Download path
String downloadPath = "/Users/joymartinez"

// Verify if the file is downloaded
File downloadFolder = new File(downloadPath)
File[] files = downloadFolder.listFiles()

boolean fileDownloaded = false
for (File file : files) {
	if (file.name.contains('Object Repository/Opportunities Page/Elements/Document Name') && file.lastModified()) {
		fileDownloaded = true
		break
	}
}

if (fileDownloaded) {
	WebUI.comment("File downloaded successfully: " + expectedFileName)
} else {
	WebUI.comment("Failed to download the file: " + expectedFileName)
}

WebUI.closeBrowser()

