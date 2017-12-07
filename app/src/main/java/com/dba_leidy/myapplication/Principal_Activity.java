package com.dba_leidy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

public class Principal_Activity extends AppCompatActivity {

    private RecyclerView rv;
    private RVAdapter adapter;
     Button ubicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_);


        rv = (RecyclerView)findViewById(R.id.recycler_view);
        rv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RVAdapter(initializeData(), getApplicationContext());

        /*adapter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.i("hola",""+v.getTag(0));
                Intent inten = new Intent(Principal_Activity.this,MapsActivity.class);
                startActivity(inten);
            }
        });
*/



        //rv.setHasFixedSize(true);
        rv.setAdapter(adapter);



        /*ubicacion.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent inten = new Intent(Principal_Activity.this,MapsActivity.class);
                startActivity(inten);
            }
        });*/

    }

    public List<cine> initializeData(){
        Constantes.cines.add(new cine("CINEMARK VENTURA PLAZA", R.drawable.cinemark,7.888477,-72.496507,"Ventura Plaza 3 piso"));
        Constantes.cines.add(new cine("ROYAL FILMS METRO", R.drawable.royalf, 7.886061,-72.489859,"Royal films metro exito"));
        Constantes.cines.add(new cine("ROYAL FILMS UNICENTRO", R.drawable.royal_films, 7.918537, -72.493808,"Royal films unicentro"));
        return Constantes.cines;
    }
}
