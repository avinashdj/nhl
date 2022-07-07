package com.nhl.pages.pagecomponent;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.click;

public class TopMenuComponent {

   // private static final By LNK_ADMIN = By.id("menu_admin_viewAdminModule");
    private String topMenus = "menu_%replaceable%";
    private static final By TOP_MENU = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView[2]");


   /* @FindBy(id = "menu_pim_viewPimModule")
    private WebElement LNK_PIM;

    @FindBy(id = "menu_leave_viewLeaveModule")
    private WebElement LNK_LEAVE;

    public TopMenuComponent(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }*/

    public void clickOnMenu(String menu){
        String pim_viewPimModule = topMenus.replaceAll("%replaceable", "pim_viewPimModule");
        click(By.id(pim_viewPimModule),menu);
    }

    //Dynamic locators is not possible
    // webelement --> By, String

    /*public void clickAdmin(){
        SeleniumUtils.click(LNK_ADMIN);
    }
    public void clickPIMMenu(){
        SeleniumUtils.click(LNK_PIM);
    }*/

    public void clickOnTopMenu(){
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        click(TOP_MENU,"Menu");
    }
}
