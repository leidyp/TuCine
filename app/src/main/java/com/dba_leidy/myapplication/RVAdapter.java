package com.dba_leidy.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.List;

/**
 * Created by DBA-Leidy on 5/12/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.cineViewHolder> implements View.OnClickListener {


    private View.OnClickListener listener;

    List<cine> cines;
    Context context;
    RVAdapter(List<cine> cines, Context context){
        this.cines = cines;
        this.context = context;
    }


    public class cineViewHolder extends RecyclerView.ViewHolder {
        public RelativeLayout recyclerView;
        CardView cv;
        Button name;
        ImageView personPhoto;

        cineViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card);
            name = (Button)itemView.findViewById(R.id.button);
            personPhoto = (ImageView)itemView.findViewById(R.id.imageView);
        }

    }
    @Override
    public int getItemCount() {
        return cines.size();
    }
    @Override
    public cineViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        v.setOnClickListener(this);
        cineViewHolder pvh = new cineViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(final cineViewHolder cineViewHolder, int i) {
        final cine cine = cines.get(i);
        cineViewHolder.name.setText(cines.get(i).boton);
        cineViewHolder.personPhoto.setImageResource(cines.get(i).photoId);

        cineViewHolder.cv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.i("booton",""+cine.getBoton());
                Intent inten = new Intent(context,MapsActivity.class);
                inten.putExtra("boton", cine.getBoton());
                inten.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(inten);

            }
        });
        cineViewHolder.cv.setTag("prueba");
        //cineViewHolder.getAdapterPosition();
        //cineViewHolder.getAdapterPosition();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
    public void setOnClickListener(View.OnClickListener listener){
    }

    @Override
    public void onClick(View v) {
    }
}
