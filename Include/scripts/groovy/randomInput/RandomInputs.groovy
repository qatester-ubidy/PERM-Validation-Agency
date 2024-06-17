package randomInput
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.apache.commons.lang.RandomStringUtils



class RandomInputs {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	public static String randomNumber() {
		1 + RandomStringUtils.randomNumeric(1)
	}


	public static String randomFirstName() {
		String[][] firstname = findTestData("First Names").getAllData()
		if (firstname == null || firstname.length == 0) {
			return "No data found"
		}
		int randomFirstName = new Random().nextInt(firstname.length)
		String getFirstName = firstname[randomFirstName][0].replaceAll("\\[|\\]", "")
		return getFirstName
	}

	public static String randomLastName() {
		String[][] lastname = findTestData("Last Names").getAllData()
		if (lastname == null || lastname.length == 0) {
			return "No data found"
		}
		int randomFirstName = new Random().nextInt(lastname.length)
		String getLastName = lastname[randomFirstName][0].replaceAll("\\[|\\]", "")
		return getLastName
	}


	public static String randomJobTitle() {
		String[][] jobTitle = findTestData('Data Files/Job Titles').getAllData()
		if (jobTitle == null || jobTitle.length == 0) {
			return "No data found"
		}
		int randomJobTitle = new Random().nextInt(jobTitle.length)
		String randomJob = jobTitle[randomJobTitle][0].replaceAll("\\[|\\]", "") + " - QATestData"
		return randomJob
	}


	public static String randomCity() {
		String[][] City = findTestData('Data Files/Cities').getAllData()
		if (City == null || City.length == 0) {
			return "No data found"
		}
		int randomCity = new Random().nextInt(City.length)
		String getRandomCity = City[randomCity][0].replaceAll("\\[|\\]", "")
		return getRandomCity
	}

	public static String randomCompany() {
		String[][] Company = findTestData('Data Files/Company Names').getAllData()
		if (Company == null || Company.length == 0) {
			return "No data found"
		}
		int randomCompany = new Random().nextInt(Company.length)
		String getRandomCompany = Company[randomCompany][0].replaceAll("\\[|\\]", "") + "TEST"
		return getRandomCompany
	}
}