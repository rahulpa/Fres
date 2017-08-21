package com.fres.test;

import org.testng.annotations.Test;

import com.fres.page.EnterTimeTrackPage;
import com.fres.page.LoginPage;

import generic.BaseTest;
import generic.Excel;

public class ValidLogin extends BaseTest {
	
	@Test(priority=1)
	public void testValidLogin(){
			String un=Excel.getCellValue(XLPATH,"ValidLogin",1,0);
			String pw=Excel.getCellValue(XLPATH,"ValidLogin",1,1);
			String HPT=Excel.getCellValue(XLPATH,"ValidLogin",1,2);
			LoginPage l=new LoginPage(driver);
			l.setUserName(un);
			l.setPassword(pw);
			l.clickLogin();
			EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
			e.verifyTitle(HPT);
	}
}
