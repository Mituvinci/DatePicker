package contentprovideruser.example.com.datepicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;

public class KeyActivity extends AppCompatActivity  {

    EditText et;

    private static Context CONTEXT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_fragment);
        et =(EditText)findViewById(R.id.etKey);
        //et.setOnClickListener(this);
    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.v("I am ","KeyDown");
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
            {
                //your Action code
                startActivity(new Intent(KeyActivity.this,MainActivity.class));
                return true;
            }
            case KeyEvent.KEYCODE_B:
            {
                //your Action code
                et.setText("B");
                return true;
            }
            // similarly write for others too
        }



        return true;
    }


}
