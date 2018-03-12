package utkarshdubey.iiitd_mess;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            public void run()
            {
                Intent i=new Intent(splash.this,Googlesignin.class);
                startActivity(i);
                finish();
            }
        }, 2000);
    }
    }

