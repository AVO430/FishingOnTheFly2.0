package com.example.operationrollingthunder40;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

/*
    This class is used to create the Explore
    Fragment view and functionality
 */

public class ExploreFragment extends Fragment {


    MapView mMapView;
    private GoogleMap googleMap;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_explore, container, false);

        mMapView = (MapView) v.findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);

        mMapView.onResume();

        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }

        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap mMap) {
                googleMap = mMap;

                googleMap.getUiSettings().setZoomControlsEnabled(true);
                googleMap.getUiSettings().setCompassEnabled(true);
                /*
                if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                                                        && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION)
                                                        != PackageManager.PERMISSION_GRANTED) {

                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }*/
                //googleMap.setMyLocationEnabled(true);




                //Flatbrook River Polyline
                Polyline flatbrook = mMap.addPolyline(new PolylineOptions()
                        .clickable(true)
                        .width(20)
                        .color(Color.BLUE)
                        .add(
                                new LatLng(41.239054, -74.735797),
                                new LatLng(41.239151, -74.736546),
                                new LatLng(41.238973, -74.736685),
                                new LatLng(41.239554, -74.738831),
                                new LatLng(41.240700, -74.741234),
                                new LatLng(41.240579, -74.741792),
                                new LatLng(41.238320, -74.743080),
                                new LatLng(41.237973, -74.744131),
                                new LatLng(41.237586, -74.744506),
                                new LatLng(41.236190, -74.746288),
                                new LatLng(41.235601, -74.746776),
                                new LatLng(41.234955, -74.746894),
                                new LatLng(41.233870, -74.748010),
                                new LatLng(41.232797, -74.749490),
                                new LatLng(41.231042, -74.751454),
                                new LatLng(41.231038, -74.751862),
                                new LatLng(41.230546, -74.752028),
                                new LatLng(41.229610, -74.752921),
                                new LatLng(41.228520, -74.753855),
                                new LatLng(41.228811, -74.754944),
                                new LatLng(41.228811, -74.756907),
                                new LatLng(41.228169, -74.757578),
                                new LatLng(41.227076, -74.757765),
                                new LatLng(41.226487, -74.758736),
                                new LatLng(41.226148, -74.760094),
                                new LatLng(41.225107, -74.760662),
                                new LatLng(41.225035, -74.761284),
                                new LatLng(41.225353, -74.762282),
                                new LatLng(41.225515, -74.763017),
                                new LatLng(41.225999, -74.764101),
                                new LatLng(41.226007, -74.764444),
                                new LatLng(41.226257, -74.764648),
                                new LatLng(41.226414, -74.765066),
                                new LatLng(41.226406, -74.766295),
                                new LatLng(41.226176, -74.766751),
                                new LatLng(41.225285, -74.767952),
                                new LatLng(41.224256, -74.768382),
                                new LatLng(41.224224, -74.768918),
                                new LatLng(41.223747, -74.769975),
                                new LatLng(41.223889, -74.770484),
                                new LatLng(41.223925, -74.771353),
                                new LatLng(41.223481, -74.772340),
                                new LatLng(41.223053, -74.773805),
                                new LatLng(41.222339, -74.774964),
                                new LatLng(41.221742, -74.776037),
                                new LatLng(41.221859, -74.776423),
                                new LatLng(41.222037, -74.776589),
                                new LatLng(41.222255, -74.777447),
                                new LatLng(41.221795, -74.777877),
                                new LatLng(41.221117, -74.778333),
                                new LatLng(41.220080, -74.779212),
                                new LatLng(41.218538, -74.779936),
                                new LatLng(41.217699, -74.780956),
                                new LatLng(41.216065, -74.782431),
                                new LatLng(41.215233, -74.783552),
                                new LatLng(41.215282, -74.785344),
                                new LatLng(41.215306, -74.786883),
                                new LatLng(41.214967, -74.788423),
                                new LatLng(41.214551, -74.788616),
                                new LatLng(41.213825, -74.789383),
                                new LatLng(41.213720, -74.790000),
                                new LatLng(41.213430, -74.790982),
                                new LatLng(41.213688, -74.791722),
                                new LatLng(41.213389, -74.793042),
                                new LatLng(41.212808, -74.794093),
                                new LatLng(41.212736, -74.795289),
                                new LatLng(41.212958, -74.796255),
                                new LatLng(41.212974, -74.796985),
                                new LatLng(41.212635, -74.797462),
                                new LatLng(41.211783, -74.797934),
                                new LatLng(41.211388, -74.798717),
                                new LatLng(41.210984, -74.799667),
                                new LatLng(41.211089, -74.800037),
                                new LatLng(41.210653, -74.800740),
                                new LatLng(41.209870, -74.801228),
                                new LatLng(41.209463, -74.800997),
                                new LatLng(41.209132, -74.801131),
                                new LatLng(41.208607, -74.801759),
                                new LatLng(41.208325, -74.802446),
                                new LatLng(41.208220, -74.803304),
                                new LatLng(41.207445, -74.803100),
                                new LatLng(41.206850, -74.803636)));



                //qmMap.setOnPolylineClickListener((GoogleMap.OnPolylineClickListener) getContext());

                Polyline flatbrookEnd = mMap.addPolyline(new PolylineOptions()
                        .clickable(true)
                        .width(20)
                        .color(Color.BLUE)
                        .add(
                                new LatLng(41.097053, -74.969198),
                                new LatLng(41.098185, -74.967479),
                                new LatLng(41.098819, -74.966223),
                                new LatLng(41.099313, -74.964818),
                                new LatLng(41.099656, -74.963595),
                                new LatLng(41.100529, -74.963192),
                                new LatLng(41.101083, -74.962801),
                                new LatLng(41.101766, -74.961460),
                                new LatLng(41.102603, -74.961267),
                                new LatLng(41.103088, -74.961122),
                                new LatLng(41.104026, -74.960516),
                                new LatLng(41.104652, -74.959904),
                                new LatLng(41.104855, -74.959335),
                                new LatLng(41.104818, -74.958681),
                                new LatLng(41.104612, -74.958257),
                                new LatLng(41.104523, -74.957546),
                                new LatLng(41.104620, -74.956873),
                                new LatLng(41.104879, -74.955763),
                                new LatLng(41.105089, -74.954961),
                                new LatLng(41.105784, -74.953620),
                                new LatLng(41.106188, -74.952364),
                                new LatLng(41.106892, -74.950685),
                                new LatLng(41.107538, -74.949156),
                                new LatLng(41.108331, -74.947933),
                                new LatLng(41.108880, -74.946732),
                                new LatLng(41.108911, -74.945573),
                                new LatLng(41.109186, -74.944827),
                                new LatLng(41.109905, -74.943958),
                                new LatLng(41.110269, -74.943186),
                                new LatLng(41.110366, -74.942252),
                                new LatLng(41.110592, -74.941032),
                                new LatLng(41.111393, -74.940673),
                                new LatLng(41.111950, -74.940179),
                                new LatLng(41.112981, -74.938564),
                                new LatLng(41.114335, -74.937432),
                                new LatLng(41.115673, -74.936188),
                                new LatLng(41.116259, -74.935523),
                                new LatLng(41.117406, -74.934109),
                                new LatLng(41.117859, -74.933433),
                                new LatLng(41.117972, -74.933026),
                                new LatLng(41.117609, -74.932296),
                                new LatLng(41.118700, -74.931057),
                                new LatLng(41.119650, -74.930528),
                                new LatLng(41.120131, -74.929225),
                                new LatLng(41.119779, -74.928823),
                                new LatLng(41.119007, -74.928597),
                                new LatLng(41.118336, -74.928401),
                                new LatLng(41.118983, -74.927436),
                                new LatLng(41.120195, -74.926288),
                                new LatLng(41.121440, -74.924013),
                                new LatLng(41.121618, -74.922876),
                                new LatLng(41.122151, -74.921637),
                                new LatLng(41.122119, -74.920591),
                                new LatLng(41.122167, -74.919829),
                                new LatLng(41.123291, -74.918906),
                                new LatLng(41.123897, -74.918021),
                                new LatLng(41.125837, -74.914524),
                                new LatLng(41.126532, -74.913429),
                                new LatLng(41.126047, -74.911326),
                                new LatLng(41.127841, -74.910683),
                                new LatLng(41.128520, -74.910812),
                                new LatLng(41.129328, -74.909567),
                                new LatLng(41.130184, -74.908322),
                                new LatLng(41.130702, -74.908451),
                                new LatLng(41.130896, -74.909782),
                                new LatLng(41.131542, -74.909524),
                                new LatLng(41.131542, -74.906584),
                                new LatLng(41.132092, -74.905662),
                                new LatLng(41.132005, -74.904447),
                                new LatLng(41.132000, -74.905259),
                                new LatLng(41.132000, -74.904469),
                                new LatLng(41.131907, -74.904281),
                                new LatLng(41.131869, -74.903121),
                                new LatLng(41.131902, -74.903087),
                                new LatLng(41.132063, -74.903095),
                                new LatLng(41.132476, -74.903403),
                                new LatLng(41.132661, -74.903400),
                                new LatLng(41.132819, -74.903274),
                                new LatLng(41.132973, -74.902971),
                                new LatLng(41.133090, -74.902488),
                                new LatLng(41.133092, -74.902282),
                                new LatLng(41.133007, -74.901850),
                                new LatLng(41.132870, -74.901649),
                                new LatLng(41.132704, -74.901547),
                                new LatLng(41.132425, -74.901434),
                                new LatLng(41.132356, -74.901338),
                                new LatLng(41.132358, -74.901185),
                                new LatLng(41.132459, -74.901091),
                                new LatLng(41.132608, -74.901035),
                                new LatLng(41.132756, -74.901002),
                                new LatLng(41.132938, -74.901002),
                                new LatLng(41.133101, -74.900952),
                                new LatLng(41.133229, -74.900831),
                                new LatLng(41.133348, -74.900595),
                                new LatLng(41.133390, -74.900297),
                                new LatLng(41.133425, -74.899943),
                                new LatLng(41.133510, -74.899525),
                                new LatLng(41.133679, -74.898865),
                                new LatLng(41.133679, -74.898602),
                                new LatLng(41.133655, -74.898441),
                                new LatLng(41.133568, -74.898192),
                                new LatLng(41.133604, -74.898003),
                                new LatLng(41.133715, -74.897750),
                                new LatLng(41.133830, -74.897576),
                                new LatLng(41.133929, -74.897426),
                                new LatLng(41.134043, -74.897255),
                                new LatLng(41.134133, -74.897123),
                                new LatLng(41.134202, -74.897017),
                                new LatLng(41.134249, -74.896911),
                                new LatLng(41.134396, -74.896685),
                                new LatLng(41.134476, -74.896563),
                                new LatLng(41.134626, -74.896368),
                                new LatLng(41.134783, -74.896188),
                                new LatLng(41.134942, -74.896008),
                                new LatLng(41.135039, -74.895889),
                                new LatLng(41.135171, -74.895771),
                                new LatLng(41.135348, -74.895613),
                                new LatLng(41.135395, -74.895587),
                                new LatLng(41.135589, -74.895414),
                                new LatLng(41.135752, -74.895267),
                                new LatLng(41.135909, -74.895131),
                                new LatLng(41.136141, -74.894925),
                                new LatLng(41.136309, -74.894788),
                                new LatLng(41.136507, -74.894634),
                                new LatLng(41.136678, -74.894490),
                                new LatLng(41.136775, -74.894406),
                                new LatLng(41.136923, -74.894313),
                                new LatLng(41.137133, -74.894116),
                                new LatLng(41.137196, -74.894057),
                                new LatLng(41.137340, -74.893848),
                                new LatLng(41.137457, -74.893596),
                                new LatLng(41.137514, -74.893445),
                                new LatLng(41.137524, -74.893290),
                                new LatLng(41.137456, -74.893205),
                                new LatLng(41.137402, -74.893178),
                                new LatLng(41.137360, -74.893106),
                                new LatLng(41.137437, -74.892831),
                                new LatLng(41.137500, -74.892673),
                                new LatLng(41.137547, -74.892560),
                                new LatLng(41.137620, -74.892436),
                                new LatLng(41.137728, -74.892317),
                                new LatLng(41.137868, -74.892233),
                                new LatLng(41.137960, -74.892199),
                                new LatLng(41.138168, -74.892061),
                                new LatLng(41.138237, -74.892012),
                                new LatLng(41.138314, -74.891931),
                                new LatLng(41.138475, -74.891719),
                                new LatLng(41.138616, -74.891477),
                                new LatLng(41.138660, -74.891402),
                                new LatLng(41.138903, -74.891100),
                                new LatLng(41.139195, -74.890964),
                                new LatLng(41.139500, -74.890972),
                                new LatLng(41.139708, -74.891042),
                                new LatLng(41.139837, -74.891066),
                                new LatLng(41.139995, -74.891064),
                                new LatLng(41.140268, -74.890967),
                                new LatLng(41.140589, -74.890736),
                                new LatLng(41.140732, -74.890626),
                                new LatLng(41.141098, -74.890471),
                                new LatLng(41.141478, -74.890374),
                                new LatLng(41.141617, -74.890369),
                                new LatLng(41.142009, -74.890296),
                                new LatLng(41.142158, -74.890275),
                                new LatLng(41.142372, -74.890181),
                                new LatLng(41.142415, -74.890160),
                                new LatLng(41.142764, -74.890095),
                                new LatLng(41.143257, -74.890085),
                                new LatLng(41.143597, -74.890074),
                                new LatLng(41.143669, -74.890044),
                                new LatLng(41.143788, -74.889883),
                                new LatLng(41.143807, -74.889827),
                                new LatLng(41.143879, -74.889739),
                                new LatLng(41.143938, -74.889717),
                                new LatLng(41.144065, -74.889722),
                                new LatLng(41.144085, -74.889739),
                                new LatLng(41.144190, -74.889763),
                                new LatLng(41.144314, -74.889760),
                                new LatLng(41.144388, -74.889706),
                                new LatLng(41.144600, -74.889454),
                                new LatLng(41.144814, -74.889258),
                                new LatLng(41.145041, -74.889100),
                                new LatLng(41.145768, -74.888585),
                                new LatLng(41.146327, -74.888668),
                                new LatLng(41.147121, -74.886952),
                                new LatLng(41.147729, -74.885404),
                                new LatLng(41.148097, -74.884597),
                                new LatLng(41.147711, -74.883789),
                                new LatLng(41.147723, -74.883422),
                                new LatLng(41.146751, -74.883291),
                                new LatLng(41.146556, -74.882738),
                                new LatLng(41.146602, -74.881644),
                                new LatLng(41.147147, -74.880034),
                                new LatLng(41.147313, -74.879042),
                                new LatLng(41.147620, -74.878774),
                                new LatLng(41.148327, -74.879096),
                                new LatLng(41.148707, -74.879071),
                                new LatLng(41.148812, -74.878854),
                                new LatLng(41.148826, -74.878682),
                                new LatLng(41.149599, -74.878610),
                                new LatLng(41.150316, -74.879071),
                                new LatLng(41.150670, -74.879195),
                                new LatLng(41.150835, -74.879082),
                                new LatLng(41.151655, -74.879420),
                                new LatLng(41.152324, -74.880021),
                                new LatLng(41.152552, -74.880463),
                                new LatLng(41.153394, -74.880938),
                                new LatLng(41.153693, -74.881142),
                                new LatLng(41.154139, -74.880737),
                                new LatLng(41.155165, -74.879484),
                                new LatLng(41.155884, -74.878725),
                                new LatLng(41.156187, -74.878650),
                                new LatLng(41.156456, -74.878090),
                                new LatLng(41.156775, -74.877996),
                                new LatLng(41.157199, -74.877282),
                                new LatLng(41.157403, -74.876891),
                                new LatLng(41.157613, -74.876679),
                                new LatLng(41.157912, -74.875743),
                                new LatLng(41.158536, -74.875311),
                                new LatLng(41.158661, -74.875032),
                                new LatLng(41.158543, -74.874348),
                                new LatLng(41.159322, -74.873535),
                                new LatLng(41.159973, -74.873812),
                                new LatLng(41.160746, -74.873981),
                                new LatLng(41.161317, -74.873498),
                                new LatLng(41.161402, -74.872867),
                                new LatLng(41.161182, -74.872599),
                                new LatLng(41.161723, -74.871540),
                                new LatLng(41.162337, -74.870845),
                                new LatLng(41.162672, -74.870510),
                                new LatLng(41.163167, -74.870813),
                                new LatLng(41.163611, -74.870486),
                                new LatLng(41.163932, -74.870703),
                                new LatLng(41.164023, -74.871033),
                                new LatLng(41.164292, -74.871234),
                                new LatLng(41.164258, -74.871682),
                                new LatLng(41.164585, -74.871840),
                                new LatLng(41.164657, -74.872141),
                                new LatLng(41.165108, -74.872288),
                                new LatLng(41.165780, -74.872020),
                                new LatLng(41.166255, -74.871003),
                                new LatLng(41.166307, -74.870526),
                                new LatLng(41.166992, -74.869869),
                                new LatLng(41.167389, -74.869343),
                                new LatLng(41.167460, -74.868871),
                                new LatLng(41.167878, -74.868608),
                                new LatLng(41.168165, -74.868243),
                                new LatLng(41.168165, -74.867739),
                                new LatLng(41.168682, -74.867664),
                                new LatLng(41.169001, -74.868136),
                                new LatLng(41.169457, -74.868372),
                                new LatLng(41.170002, -74.867959),
                                new LatLng(41.170030, -74.867471),
                                new LatLng(41.169752, -74.866575),
                                new LatLng(41.170115, -74.864858),
                                new LatLng(41.170361, -74.863544),
                                new LatLng(41.171460, -74.863340),
                                new LatLng(41.172603, -74.862739),
                                new LatLng(41.173527, -74.862541),
                                new LatLng(41.174864, -74.861919),
                                new LatLng(41.175683, -74.861734),
                                new LatLng(41.176588, -74.861897),
                                new LatLng(41.177299, -74.861747),
                                new LatLng(41.177563, -74.861567),
                                new LatLng(41.177997, -74.861819),
                                new LatLng(41.178681, -74.861618)));

                // For showing a move to my location button



                //googleMap.setMyLocationEnabled(true);

                // For dropping a marker at a point on the Map
                LatLng home = new LatLng(40.9250986, -74.6232158);
                googleMap.addMarker(new MarkerOptions().position(home).title("Current Location").snippet("Home"));

                // For zooming automatically to the location of the marker
                CameraPosition cameraPosition = new CameraPosition.Builder().target(home).zoom(12).build();
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));




            }
        });
        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }



}