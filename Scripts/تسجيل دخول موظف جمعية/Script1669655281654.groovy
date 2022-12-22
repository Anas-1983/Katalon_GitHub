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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url_external)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('RACA E-Services Login Page External/input__Username_Arabic UI'), GlobalVariable.Username_ExternalEmployee)

WebUI.setText(findTestObject('RACA E-Services Login Page External/input__Password_Arabic UI'), GlobalVariable.password1)

WebUI.delay(20)

WebUI.waitForElementClickable(findTestObject('RACA E-Services Login Page External/button_Login Arabic UI'), 1)

WebUI.click(findTestObject('RACA E-Services Login Page External/button_Login Arabic UI'))

WebUI.delay(30)

WebUI.verifyTextPresent(GlobalVariable.Verify_ExternalEmployee, false, FailureHandling.CONTINUE_ON_FAILURE)

