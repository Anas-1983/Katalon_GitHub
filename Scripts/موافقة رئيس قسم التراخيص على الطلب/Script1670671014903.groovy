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

WebUI.callTestCase(findTestCase('تسجيل دخول رئيس قسم التراخيص'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Organization Manager_Home Page/a_Team Inbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Organization Manager_Home Page/Team Inbox/i__Reload (Refresh)'))

WebUI.delay(5)

WebUI.rightClick(findTestObject('Organization Manager_Home Page/User Inbox/Request Number'))

WebUI.delay(3)

WebUI.click(findTestObject('Licensing Head/Team Inbox/i__Claim symbol (right click)'))

WebUI.click(findTestObject('Organization Manager_Home Page/i__Home'))

WebUI.delay(2)

WebUI.click(findTestObject('Organization Manager_Home Page/a_User Inbox'))

WebUI.click(findTestObject('Organization Manager_Home Page/User Inbox/i__Reload (Refresh)'))

WebUI.delay(5)

WebUI.rightClick(findTestObject('Organization Manager_Home Page/User Inbox/Request Number'))

WebUI.delay(3)

WebUI.click(findTestObject('Licensing Head/User Inbox/i__Accept symbol (right click)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Licensing Specialist/User Inbox/textarea__Accept comment'), 'موافقة')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Organization Manager_Home Page/User Inbox/i__Reload (Refresh)'))

WebUI.delay(2)

WebUI.verifyTextNotPresent(GlobalVariable.RequestNumber, false)

WebUI.closeBrowser()

