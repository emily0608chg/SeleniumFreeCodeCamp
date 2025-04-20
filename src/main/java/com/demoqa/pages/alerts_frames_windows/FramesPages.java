package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.utilities.StringsUtility.getText;
import static com.utilities.SwitchTo.*;

public class FramesPages extends Alerts_Frames_WindowsPage {


    private final By textInFrameLocator = By.id("sampleHeading");
    private final String iFrameBigBox = "frame1";
    private final By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private final By iFrameSmallBoxLocator = By.xpath("//div[@id='frame2Wrapper']/iframe");

   private void switchToBigBox() {
       switchToFrameString(iFrameBigBox);
   }

   //index is going to be from 0
   private void switchToSmallBox() {
       //switchToFrameIndex(index);
       switchToFrameByWebElement(find(iFrameSmallBoxLocator));
   }


   public String getTextInBigFrame() {
       switchToBigBox();
       String bigFrameText = getText(textInFrameLocator);
       System.out.println("Big frame text " + bigFrameText);
       switchToDefaultContent();
       return bigFrameText;
   }

   public String getHeaderFramesText() {
       return getText(headerFramesText);
   }

   public String getTextInSmallFrame() {
       switchToSmallBox();
       String smallFrameText = getText(textInFrameLocator);
       System.out.println("Small Frame text = " + smallFrameText);
       switchToDefaultContent();
       return smallFrameText;
   }

}
