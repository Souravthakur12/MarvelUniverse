package com.oyelabs.marvel.universe;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.oyelabs.marvel.universe.Adapter.RecyclerViewAdapter;
import com.oyelabs.marvel.universe.Model.Characters;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclervw);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        getcharacters();
    }

    public void getcharacters() {

        Call<List<Characters>> call = apicontroller.getInstance().getapi().getData(apicontroller.getInstance().TS, apicontroller.getInstance().PUBLIC_API_KEY, apicontroller.getInstance().hash);

        call.enqueue(new Callback<List<Characters>>() {
            @Override
            public void onResponse(Call<List<Characters>> call, @NonNull Response<List<Characters>> response) {
                List<Characters> result = response.body();

                Toast.makeText(MainActivity.this, "Error ha bhai", Toast.LENGTH_SHORT).show();

                // getData is null : ERROR HERE

                RecyclerViewAdapter adapter = new RecyclerViewAdapter(((Characters) result).getData().getResults(), MainActivity.this);

                    LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
                    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setAdapter(adapter);


            }

            @Override
            public void onFailure(Call<List<Characters>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}