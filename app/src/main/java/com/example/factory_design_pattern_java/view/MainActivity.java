package com.example.factory_design_pattern_java.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.factory_design_pattern_java.R;
import com.example.factory_design_pattern_java.factory.MobileFactory;
import com.example.factory_design_pattern_java.interfaces.Mobile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO ::
        /*
        * The factory design pattern is used when we have a superclass
        *  with multiple sub-classes and based on input, we need to return one of the sub-class.
        * This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
        * */

        Mobile mobile = MobileFactory.createMobile(Mobile.IPHONE);
        Mobile mobile2 = MobileFactory.createMobile(Mobile.SAMSUNG);
        Mobile mobile3 = MobileFactory.createMobile(Mobile.SONY);

    }
}
