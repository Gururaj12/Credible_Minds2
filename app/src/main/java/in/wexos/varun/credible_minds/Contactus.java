package in.wexos.varun.credible_minds;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import in.wexos.varun.credible_minds.model.Contact;

public class Contactus extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerDragListener, GoogleMap.OnMapLongClickListener {

    private GoogleMap mMap;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;

    EditText name,website,email,phone,message;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        name= (EditText) findViewById(R.id.name);
        website= (EditText) findViewById(R.id.website);
        email= (EditText) findViewById(R.id.email);
        phone= (EditText) findViewById(R.id.phone);
        message= (EditText) findViewById(R.id.msg);
        firebaseAuth = FirebaseAuth.getInstance();
        save= (Button) findViewById(R.id.btnLinkToRegisterScreen);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nam = name.getText().toString().trim();
                String web = website.getText().toString().trim();
                String ema = email.getText().toString().trim();
                String phn = phone.getText().toString().trim();
                String msgg = message.getText().toString().trim();

                //creating a userinformation object
                Contact userInformation = new Contact(nam, web, ema, phn, msgg);

                //getting the current logged in user
                FirebaseUser user = firebaseAuth.getCurrentUser();


                databaseReference.child(user.getUid()).setValue(userInformation);

                //displaying a success toast
                Toast.makeText(getApplicationContext(),"Please enter email",Toast.LENGTH_LONG).show();

            }
        });

        databaseReference = FirebaseDatabase.getInstance().getReference();

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

        // goToLocation(12.972272, 77.750799);

        // Add a marker in Sydney and move the camera
        LatLng wexos = new LatLng(12.972272, 77.750799);
        mMap.addMarker(new MarkerOptions().position(wexos).title("Marker in wexos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wexos));
        mMap.setOnMarkerDragListener(this);
        mMap.setOnMapLongClickListener(this);
    }

    @Override
    public void onMarkerDragStart(Marker marker) {

    }

    @Override
    public void onMarkerDrag(Marker marker) {

    }

    @Override
    public void onMarkerDragEnd(Marker marker) {

    }

    @Override
    public void onMapLongClick(LatLng latLng) {

    }
}