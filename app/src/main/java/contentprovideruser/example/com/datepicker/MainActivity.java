package contentprovideruser.example.com.datepicker;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b =  (Button)findViewById(R.id.keyfragment);
        b.setOnClickListener(this);


    }

    public void showTimePickerDialog(View v) {
        DatePickerFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "timePicker");
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.keyfragment:
                Toast.makeText(getApplicationContext(),"OKAY",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,KeyActivity.class));
                break;
            default:
                break;

        }
    }
}
