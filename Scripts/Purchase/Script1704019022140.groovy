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

WebUI.navigateToUrl('https://demoblaze.com/index.html')

WebUI.click(findTestObject('Object Repository/purchase/purchase/a_Log in'))

WebUI.setText(findTestObject('Object Repository/purchase/purchase/inputloginusername'), 'pepskipepep')

WebUI.setEncryptedText(findTestObject('Object Repository/purchase/purchase/inputloginpassword'), 'lKxmTOTXSKSWaey3Y2lVgA==')

WebUI.click(findTestObject('Object Repository/purchase/purchase/button_Log in'))

WebUI.click(findTestObject('Object Repository/purchase/purchase/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Object Repository/purchase/purchase/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/purchase/purchase/a_Cart'))

WebUI.click(findTestObject('Object Repository/purchase/purchase/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/purchase/purchase/inputname'), 'Pep Skipepep')

WebUI.setText(findTestObject('Object Repository/purchase/purchase/inputcountry'), 'Citayam')

WebUI.setText(findTestObject('Object Repository/purchase/purchase/inputcity'), 'Citayam city')

WebUI.setText(findTestObject('Object Repository/purchase/purchase/inputcard'), '0881123456789')

WebUI.setText(findTestObject('Object Repository/purchase/purchase/inputmonth'), '08')

WebUI.setText(findTestObject('Object Repository/purchase/purchase/inputyear'), '2045')

WebUI.click(findTestObject('Object Repository/purchase/purchase/button_Purchase'))

WebUI.click(findTestObject('Object Repository/purchase/purchase/button_OK'))

