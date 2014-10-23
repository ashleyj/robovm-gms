package org.robovm.bindings.gms.sample;


import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.*;
import org.robovm.bindings.gms.GMSCameraPosition;
import org.robovm.bindings.gms.GMSMapView;
import org.robovm.bindings.gms.GMSServices;

public class GMSSample6 extends UIViewController {

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        GMSCameraPosition camera = new GMSCameraPosition(-37.809487,144.965699,17.5f, 30, 40);
        GMSMapView mapView = new GMSMapView(getView().getBounds(), camera);

        getView().addSubview(mapView);

    }
}
