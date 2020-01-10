package com.example.gamescore;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.util.List;

class GamePlaysDataAdapter extends RecyclerView.Adapter<GamePlaysDataAdapter.GamePlayViewHolder > {
    private List<GamePlay> gamePlays;

    public GamePlaysDataAdapter(List<GamePlay> gamePlays) {
        this.gamePlays= gamePlays;
    }

    @Override
    public GamePlayViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gameplay_row, parent, false);

        return new GamePlayViewHolder (itemView);
    }

    @Override
    public void onBindViewHolder(GamePlayViewHolder holder, int position) {
        GamePlay game = gamePlays.get(position);


        holder.name.setText(game.getName());
        holder.gameTag.setText(game.getGame());
        holder.date.setText(
            DateFormat.getDateInstance(DateFormat.MEDIUM).format( game.getDate() ));
        holder.time.setText(
                DateFormat.getTimeInstance(DateFormat.MEDIUM).format( game.getDate() ));
        //holder.players.setText(game.getJugadores());
        holder.players.setText( 0 );
    }

    @Override
    public int getItemCount() {
        return gamePlays.size();
    }


    /** INNER CLASS **/
    public class GamePlayViewHolder extends RecyclerView.ViewHolder {
        public TextView name, gameTag, date, time, players;
        public GamePlayViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            gameTag = (TextView) view.findViewById(R.id.gameTag);
            date = (TextView) view.findViewById(R.id.Date);
            time = (TextView) view.findViewById(R.id.time);
            players = (TextView) view.findViewById(R.id.nPlayers);
        }
    }
}