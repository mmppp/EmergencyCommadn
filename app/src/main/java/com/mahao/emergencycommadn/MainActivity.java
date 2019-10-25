package com.mahao.emergencycommadn;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText("家");
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText("通讯录");
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText("群组");
                    return true;
                case R.id.navigation_pepole:
                    mTextMessage.setText("个人");
                    return true;
            }
            return false;
        }
    };
    private BottomNavigationView mNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mNavigation = findViewById(R.id.navigation);
        //设置下面的tab大于三个的时候文字也会显示
        mNavigation.setLabelVisibilityMode(1);
    }

}
