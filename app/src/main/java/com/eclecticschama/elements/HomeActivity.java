package com.eclecticschama.elements;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eclecticschama.elements.adapters.ServicesAdapter;
import com.eclecticschama.elements.models.ServicesModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<ServicesModel> serviceModel = new ArrayList<>();

    RecyclerView recyclerView;

    int serviceImage1 = R.drawable.bank_account;
    int serviceImage2 = R.drawable.loans;
    int serviceImage3 = R.drawable.myapprovals;
    int[] serviceImages = {
            R.drawable.bank_account,
            R.drawable.editgroup,
            R.drawable.loans,
            R.drawable.members,
            R.drawable.myapprovals,
            R.drawable.withdrawal};


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

        recyclerView = findViewById(R.id.myRecyclerView);
        setUpServicesModel();

        ImageView backArrow = findViewById(R.id.backArrow);
        if (backArrow != null) {
            backArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        }
    }

    private void setUpServicesModel() {
//        String[] serviceNames = getResources().getStringArray(R.array.services);
//
//        for (int i = 0; i < serviceNames.length; i++) {
//            serviceModel.add(new ServicesModel(serviceNames[i], serviceImages[i]));
//        }
        // Ensure servicesModels is not null
        if (serviceModel == null) {
            serviceModel = new ArrayList<>();
        }

        serviceModel.add(new ServicesModel(
                "Bank Account", "Loans", "My Approvals",
                serviceImage1, serviceImage2, serviceImage3
        ));
        ServicesAdapter adapter = new ServicesAdapter(this, serviceModel);
        recyclerView.setAdapter(adapter);
    }
}