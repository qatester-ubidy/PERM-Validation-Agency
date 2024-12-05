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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase("Call TestCases/Agency Apply Only without Approving"), [:])

WebUI.callTestCase(findTestCase("Call TestCases/Employer Decline Application - Disabled"), [:])

WebUI.callTestCase(findTestCase("Call TestCases/Open Ubidy Agency"), [:])

WebUI.callTestCase(findTestCase("Call TestCases/Login Agency Account"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page/Buttons/Notification Btn'), 3)

WebUI.click(findTestObject('Object Repository/Notification Page/Buttons/Notification Btn'))

//FIRST NOTIF CARD
WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page/Elements/REBID - First notification Status'), 3)

def ApplicationNotif = WebUI.getText(findTestObject('Object Repository/Notification Page/Elements/REBID - First notification Status'))

if (ApplicationNotif == "Application : Declined") {
	WebUI.verifyMatch(ApplicationNotif, "Application : Declined", false)
} else {
	
	WebUI.verifyMatch(ApplicationNotif, "Re-Bid : Disabled", false)
}


def ApplicationNotifText = WebUI.getText(findTestObject('Object Repository/Notification Page/Elements/REBID - First Notification Status Txt'))

def expectedText = "PureSilver CorpTEST declined your application to Engagement No. " + GlobalVariable.EngagementNumber

def expectedText2 = "PureSilver CorpTEST has disabled your application to rebid for Engagement No. "+ GlobalVariable.EngagementNumber+"."

if (ApplicationNotifText == expectedText) {
	WebUI.verifyMatch(ApplicationNotifText, expectedText, false)
} else {
	WebUI.verifyMatch(ApplicationNotifText, expectedText2, false)
}

//SECOND NOTIF CARD
WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page/Elements/REBID - Second notif Status'), 3)

def RebidStatus = WebUI.getText(findTestObject('Object Repository/Notification Page/Elements/REBID - Second notif Status'))

if (RebidStatus == "Re-Bid : Disabled") {
	WebUI.verifyMatch(RebidStatus, "Re-Bid : Disabled", false)
} else {
	WebUI.verifyMatch(RebidStatus, "Application : Declined", false)
}

def RebidStatusText = WebUI.getText(findTestObject('Object Repository/Notification Page/Elements/REBID - Second notif Status Txt'))

if (RebidStatusText == expectedText2) {
	WebUI.verifyMatch(RebidStatusText, expectedText2, false)
} else {
	WebUI.verifyMatch(RebidStatusText, expectedText, false)
}

WebUI.closeBrowser()