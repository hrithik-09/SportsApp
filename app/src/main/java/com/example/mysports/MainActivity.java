package com.example.mysports;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Sport>sportList;
    CustomAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        sportList=new ArrayList<>();

        Sport s1=new Sport("Football",R.drawable.football);
        Sport s2=new Sport("Basketball",R.drawable.basketball);
        Sport s3=new Sport("Volleyball",R.drawable.volley);
        Sport s4=new Sport("Tennis",R.drawable.tennis);
        Sport s5=new Sport("Ping pong",R.drawable.ping);

        sportList.add(s1);
        sportList.add(s2);
        sportList.add(s3);
        sportList.add(s4);
        sportList.add(s5);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        myAdapter=new CustomAdapter(sportList);
        recyclerView.setAdapter(myAdapter);
    }
}