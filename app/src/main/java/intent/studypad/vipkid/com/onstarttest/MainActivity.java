package intent.studypad.vipkid.com.onstarttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
    }


    @Override
    protected void onRestart() {
        Log.e("TESTTEST", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.e("TESTTEST", "ONSTART");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("TESTTEST", "onResume");
        super.onResume();

    }

    @Override
    protected void onPause() {
        Log.e("TESTTEST", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("TESTTEST", "onStop");
        super.onStop();
    }

    public void startact(View view) {
        startActivity(new Intent(MainActivity.this, SecondAct.class));
    }
}
