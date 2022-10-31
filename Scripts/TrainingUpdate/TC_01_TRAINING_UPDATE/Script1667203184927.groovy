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

WebUI.navigateToUrl('https://staging.smartkungahara.rw/#/')

WebUI.click(findTestObject('Object Repository/UpdateTraining/button_Login'))

WebUI.setText(findTestObject('Object Repository/UpdateTraining/input_Home_form-control ng-untouched ng-pri_f7992a'), 'adminj@tamanta.net')

WebUI.setEncryptedText(findTestObject('Object Repository/UpdateTraining/input_Home_form-control ng-untouched ng-dir_de7c82'), 
    'o5diQKmCv4HcSLNSqOzbHA==')

WebUI.click(findTestObject('Object Repository/UpdateTraining/button_Login_1'))

WebUI.click(findTestObject('Object Repository/UpdateTraining/span_Training Management'))

WebUI.click(findTestObject('Object Repository/UpdateTraining/span_Trainings'))

WebUI.setText(findTestObject('Object Repository/UpdateTraining/input'), 'tugirimana')

WebUI.sendKeys(findTestObject('Object Repository/UpdateTraining/input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/UpdateTraining/em_Not Scheduled_fa fa-pencil'))

WebUI.setText(findTestObject('Object Repository/UpdateTraining/input_Training Name_form-control ng-untouch_08c318'), 'ABAHINZI BAKAWA ')

WebUI.click(findTestObject('Object Repository/UpdateTraining/span_Select'))

WebUI.click(findTestObject('Object Repository/UpdateTraining/div_TUGIRIMANA JDD GAP'))

WebUI.click(findTestObject('Object Repository/UpdateTraining/img_Attach files_training-file-input-icon'))

WebUI.click(findTestObject('Object Repository/UpdateTraining/button_Update Training'))

WebUI.verifyElementText(findTestObject('Object Repository/UpdateTraining/div_Thank you   TUGIRIMANA JDD Farmer T   h_1d88fa'), 
    'Thank you “ TUGIRIMANA JDD Farmer T “ has been edited Ok')

