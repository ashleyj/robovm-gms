package org.robovm.bindings.gms.sample;


import org.robovm.apple.uikit.UIViewController;
import org.robovm.bindings.gms.GMSCameraPosition;
import org.robovm.bindings.gms.GMSMapView;

public class GMSSample7 extends UIViewController {

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        GMSCameraPosition camera = new GMSCameraPosition(37.78318,-122.40374, 18);
        GMSMapView mapView = new GMSMapView(getView().getBounds(), camera);

        getView().addSubview(mapView);
    }
}
