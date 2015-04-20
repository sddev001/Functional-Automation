package homeFeatures;

import baseApi.Base;

import java.util.List;


public class AmazonHomePage extends Base{

    public void search(String locator, String value){
        typeByCss(locator, value);
    }

    public List<String> searchDropDownMenu(String locator){
        List<String> menuList = getListOfTextByCss(locator);

        return menuList;

    }
}

