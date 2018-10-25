package com.abb.ellipse

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class User {
	@Keyword
	def login(){
		WebUI.comment('Given that the user has the valid login information')

		WebUI.openBrowser(GlobalVariable.G_SiteURL)

		WebUI.setText(findTestObject('Page_Login/txt_UserName'), "dl3306")

		WebUI.setText(findTestObject('Page_Login/txt_Password'), "")

		WebUI.click(findTestObject('Page_Login/chk_RememberMe'))

		WebUI.comment('When user logs into the system')

		WebUI.click(findTestObject('Page_Login/btn_Login'))

		WebUI.comment('Then user should be able to login successfully')
	}
}
