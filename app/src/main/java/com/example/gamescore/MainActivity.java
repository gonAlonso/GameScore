/**
 * https://codeburst.io/android-swipe-menu-with-recyclerview-8f28a235ff28
 */

package com.example.gamescore;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static android.widget.LinearLayout.VERTICAL;

public class MainActivity extends AppCompatActivity {

    private GamePlaysDataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPlayersDataAdapter();
        //setupRecyclerView();
    }

    private void setPlayersDataAdapter() {
        List<GamePlay> players = new ArrayList<>();
            for (int i=0; i<15;i++){
                GamePlay game = new GamePlay();
                int id = (int)Math.floor( Math.random()*50);
                game.setName("GameName-"+ id);
                game.setGame("GameTag-"+ id);
                game.setJugadores(id);
                game.setDate(  new java.util.Date() );
                players.add(game);
            }
        mAdapter = new GamePlaysDataAdapter(players);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(mAdapter);
        // https://proandroiddev.com/itemdecoration-in-android-e18a0692d848
        DividerItemDecoration decoration = new DividerItemDecoration(getApplicationContext(), VERTICAL);
        recyclerView.addItemDecoration(decoration);
    }

}
