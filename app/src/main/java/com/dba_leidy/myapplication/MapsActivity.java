package com.dba_leidy.myapplication;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    String boton;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        extras = getIntent().getExtras();
        boton  = extras.getString("boton");
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        double latitud = 0;
        double longitud = 0;
        String titulo = "";


        for (int i=0; i < Constantes.cines.size(); i++){
             if (boton.equals(Constantes.cines.get(i).boton)){
                 latitud = Constantes.cines.get(i).getLatitud();
                 longitud = Constantes.cines.get(i).getLongitud();
                 titulo = Constantes.cines.get(i).getTitulo();
             }
        }

        LatLng sydney = new LatLng(latitud, longitud);
        mMap.addMarker(new MarkerOptions().position(sydney).title(titulo));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,18));
    }
}
