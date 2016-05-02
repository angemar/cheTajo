package com.teamlz.cheTajo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.teamlz.cheTajo.R;

import java.util.List;

/**
 * Created by francesco on 02/05/16.
 */
public class HairDresserAdapter extends RecyclerView.Adapter<HairDresserAdapter.HairViewHolder>{

    private List dressers;

    public HairDresserAdapter(List<String> list){
        this.dressers = list;
    }

    public static class HairViewHolder extends RecyclerView.ViewHolder {

        protected TextView name;

        public HairViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.dresser_name);
        }
    }

    @Override
    public HairViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_homelist, parent, false);
        return new HairViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HairViewHolder holder, int position) {
        holder.name.setText(dressers.get(position).toString());
    }


    @Override
    public int getItemCount() {
        return dressers.size();
    }
}
