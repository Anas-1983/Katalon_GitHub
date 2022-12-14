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

switch (GlobalVariable.LicensingSpecialist1st) {
    case 'موظف التراخيص 1':
        WebUI.callTestCase(findTestCase('تسجيل دخول أخصائي تراخيص 1'), [:], FailureHandling.STOP_ON_FAILURE)

        break
    case 'موظف التراخيص 2':
        WebUI.callTestCase(findTestCase('تسجيل دخول أخصائي تراخيص 2'), [:], FailureHandling.STOP_ON_FAILURE)

        break
    case 'موظف التراخيص 1-ايبلا':
        WebUI.callTestCase(findTestCase('تسجيل دخول أخصائي تراخيص إيبلا 1'), [:], FailureHandling.STOP_ON_FAILURE)

        break
    case 'موظف التراخيص 2-ايبلا':
        WebUI.callTestCase(findTestCase('تسجيل دخول أخصائي تراخيص إيبلا 2'), [:], FailureHandling.STOP_ON_FAILURE)

        break
    default:
        break
}

WebUI.click(findTestObject('Licensing Specialist/span_User Inbox'))

WebUI.rightClick(findTestObject('Organization Manager_Home Page/User Inbox/Request Number'))

WebUI.click(findTestObject('Licensing Specialist/User Inbox/span_Accept 1st (right click)'))

WebUI.setText(findTestObject('Licensing Specialist/User Inbox/textarea__Accept comment'), '')

WebUI.click(findTestObject('Licensing Specialist/User Inbox/button_Accept (popup window)'))

WebUI.delay(2)

WebUI.click(findTestObject('Licensing Specialist/User Inbox/i__Reload (Refresh)'))

WebUI.delay(3)

WebUI.verifyTextNotPresent(GlobalVariable.RequestNumber, false)

WebUI.click(findTestObject('Licensing Specialist/i__Home'))

'شوف وين بيروح الطلب لعند أي موظف تراخيص كمان مرة'
WebUI.click(findTestObject('Organization Manager_Home Page/a_Services Search'))

WebUI.selectOptionByLabel(findTestObject('Organization Manager_Home Page/Services Search/select_Services List'), 'جمع تبرعات', 
    false)

WebUI.setText(findTestObject('Organization Manager_Home Page/Services Search/input__Serial number'), GlobalVariable.RequestNumber)

WebUI.click(findTestObject('Organization Manager_Home Page/Services Search/button_Search'))

WebUI.delay(5)

WebUI.rightClick(findTestObject('Organization Manager_Home Page/User Inbox/Request Number'))

WebUI.click(findTestObject('Organization Manager_Home Page/Services Search/span_Logs'))

WebUI.click(findTestObject('Organization Manager_Home Page/Services Search/a_Item (request) location'))

GlobalVariable.LicensingSpecialist2nd = WebUI.getText(findTestObject('Organization Manager_Home Page/Services Search/td_Item (request) location text'))

WebUI.delay(2)

WebUI.closeBrowser()

