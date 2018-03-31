import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.comment('Start Story SignUp')

def apkPath = PathUtil.relativeToAbsolutePath(GlobalVariable.apkName, RunConfiguration.getProjectDir())

Mobile.startApplication(apkPath, false)

Mobile.verifyElementAttributeValue(findTestObject('Akun button'), 'resource-id', 'com.bukalapak.android:id/bb_bottom_bar_title', 
    0)

Mobile.tap(findTestObject('Akun button'), GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Daftar Akun - Button'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Daftar - Button'), 'resource-id', 'com.bukalapak.android:id/btn_register', 
    0)

Mobile.tap(findTestObject('Daftar Akun - Button'), GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Nama Lengkap - Edit Text'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Nama Lengkap - Edit Text'), 'resource-id', 'com.bukalapak.android:id/et', 
    0)

Mobile.tap(findTestObject('Nama Lengkap - Edit Text'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Nama Lengkap - Edit Text'), 'Nama Lengkap', GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementText(findTestObject('Nama Lengkap - Edit Text'), 'Nama Lengkap')

Mobile.getText(findTestObject('Nama Lengkap - Edit Text'), GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Daftar - Button'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Daftar - Button'), 'resource-id', 'com.bukalapak.android:id/btnRegister', 
    0)

Mobile.tap(findTestObject('Daftar - Button'), GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('EmailNomor Handphone - Edit Text'), GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('EmailNomor Handphone - Edit Text'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('EmailNomor Handphone - Edit Text'), 'Emailkamu', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Daftar - Button'), GlobalVariable.G_ShortTimeOut)

message = Mobile.getText(findTestObject('EmailNomor Handphone - Edit Text'), GlobalVariable.G_ShortTimeOut)

Mobile.comment('Then the correct dialog message should be displayed')

Mobile.verifyEqual(message, 'Email atau nomor handphone harus valid', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('EmailNomor Handphone - Edit Text'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('EmailNomor Handphone - Edit Text'), 'resource-id', 'com.bukalapak.android:id/et', 
    0)

Mobile.tap(findTestObject('EmailNomor Handphone - Edit Text'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('EmailNomor Handphone - Edit Text'), 'blabla@gmail.com', GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementText(findTestObject('EmailNomor Handphone - Edit Text'), 'blabla@gmail.com')

Mobile.getText(findTestObject('EmailNomor Handphone - Edit Text'), GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Jenis Kelamin Perempuan'), GlobalVariable.G_ShortTimeOut)

Mobile.swipe(48, 1538, 48, 469)

Mobile.waitForElementPresent(findTestObject('Username - EditText'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Username - EditText'), 'resource-id', 'com.bukalapak.android:id/et', 
    0)

Mobile.tap(findTestObject('Username - EditText'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Username - EditText'), 'Username', GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementText(findTestObject('Username - EditText'), 'Username')

Mobile.getText(findTestObject('Username - EditText'), GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Password - EditText'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Password - EditText'), 'resource-id', 'com.bukalapak.android:id/et', 
    0)

Mobile.tap(findTestObject('Password - EditText'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Password - EditText'), 'password', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

WS.comment('Field Referal blank, so direct to click Daftar Button')

not_run: Mobile.tap(findTestObject('Daftar - Button'), GlobalVariable.G_ShortTimeOut)

