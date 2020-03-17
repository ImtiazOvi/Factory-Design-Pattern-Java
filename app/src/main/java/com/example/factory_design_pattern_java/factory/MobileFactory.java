package com.example.factory_design_pattern_java.factory;

import android.util.Log;

import com.example.factory_design_pattern_java.companies.Iphone;
import com.example.factory_design_pattern_java.companies.Sony;
import com.example.factory_design_pattern_java.interfaces.Mobile;

public class MobileFactory {

    public static Mobile createMobile(String type){
        if (type.equals(Mobile.IPHONE)){

            Log.d("CheckType","Type is : IPHONE");

            return new Iphone("2 GB","A9","dual core");
        }else if (type.equals(Mobile.SAMSUNG)){
            Log.d("CheckType","Type is : SAMSUNG");

            return new Iphone("3 GB","E9","dual core");
        }else if (type.equals(Mobile.SONY)){
            Log.d("CheckType","Type is : SONY");

            return new Sony("1 GB","Dual core");
        }else {
            return null;
        }

    }
}
