package bd.com.bangal.bangalsocialtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import bd.com.bangal.socialviewcore.widget.SocialEditText;

public class MainActivity extends AppCompatActivity {

    SocialEditText bg_text,postText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}