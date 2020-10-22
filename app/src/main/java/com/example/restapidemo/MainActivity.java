package com.example.restapidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView currentDateTime, week;
    Button refreshBtn;
    DateService dateService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentDateTime = findViewById(R.id.currentDateTimeId);
        week = findViewById(R.id.dayofWeekId);
        refreshBtn = findViewById(R.id.refreshId);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://worldclockapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        dateService = retrofit.create(DateService.class);
        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                refreshDate();
            }
        });
    }

    private void refreshDate() {
        dateService.estTime().enqueue(new Callback<DateResponse>() {
            @Override
            public void onResponse(Call<DateResponse> call, Response<DateResponse> response) {
                currentDateTime.setText(response.body().getCurrentFileTime());
                week.setText(response.body().getDayOfTheWeek());
            }

            @Override
            public void onFailure(Call<DateResponse> call, Throwable t) {
                Log.d("failure", "onFailure: "+t.getLocalizedMessage());
                Toast.makeText(MainActivity.this, "Server not responding", Toast.LENGTH_SHORT).show();
            }
        });
    }
}