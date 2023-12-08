package com.example.elements;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hbb20.CountryCodePicker;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//        val ccp:CountryCodePicker = findViewById(R.id.cpp);
//        val etPhoneNumber:EditText = findViewById(R.id.editTextID);
//
//        ccp.registerCarrierNumberEditText(etPhoneNumber);
//
//        val btnCheck: Button = findViewById(R.id.btnCheck);
//        btnCheck.setOnClickListener{
//            Toast.makeText(this, "Number: "+ccp.fullNumber, Toast.LENGTH_LONG).show();
//        }


        //Start ProgressBar first (Set visibility VISIBLE)
//        Handler handler = new Handler(Looper.getMainLooper());
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                //Starting Write and Read data with URL
//                //Creating array for parameters
//                String[] field = new String[2];
//                field[0] = "param-1";
//                field[1] = "param-2";
//                //Creating array for data
//                String[] data = new String[2];
//                data[0] = "data-1";
//                data[1] = "data-2";
//                PutData putData = new PutData("https://projects.vishnusivadas.com/AdvancedHttpURLConnection/putDataTest.php", "POST", field, data);
//                if (putData.startPut()) {
//                    if (putData.onComplete()) {
//                        String result = putData.getResult();
//                        //End ProgressBar (Set visibility to GONE)
//                        Log.i("PutData", result);
//                    }
//                }
//                //End Write and Read data with URL
//            }
//        });
    }
}