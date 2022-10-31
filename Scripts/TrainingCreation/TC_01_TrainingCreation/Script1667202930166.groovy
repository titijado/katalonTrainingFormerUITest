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

WebUI.click(findTestObject('Object Repository/Page_Smart  Kungahara/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Smart  Kungahara/input_Home_form-control ng-untouched ng-pri_f7992a'), 
    'adminj@tamanta.net')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Smart  Kungahara/input_Home_form-control ng-untouched ng-dir_de7c82'), 
    'o5diQKmCv4HcSLNSqOzbHA==')

WebUI.click(findTestObject('Object Repository/Page_Smart  Kungahara/button_Login_1'))

WebUI.click(findTestObject('Object Repository/Page_Smart  Kungahara/span_Training Management'))

WebUI.click(findTestObject('Object Repository/Page_Smart  Kungahara/a_Trainings'))

WebUI.click(findTestObject('Object Repository/Page_Smart  Kungahara/a_Add a Training'))

WebUI.setText(findTestObject('Object Repository/Page_Smart  Kungahara/input_Training Name_form-control ng-untouch_08c318'), 
    'Farmer training guide')

WebUI.click(findTestObject('Object Repository/Page_Smart  Kungahara/span_Select_dropdown-multiselect__caret'))

WebUI.click(findTestObject('Object Repository/Page_Smart  Kungahara/div_TUGIRIMANA JDD GAP'))

WebUI.click(findTestObject('Object Repository/Page_Smart  Kungahara/img_Attach Files_training-file-input-icon'))

WebUI.click(findTestObject('Object Repository/Page_Smart  Kungahara/button_Add a Training'))

WebUI.click(findTestObject('Object Repository/Page_Smart  Kungahara/span_Confirm'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smart  Kungahara/div_Thank you   TUGIRIMANA JDD Farmer train_2236ca'), 
    'Thank you “ TUGIRIMANA JDD Farmer training “ has been added OK')

