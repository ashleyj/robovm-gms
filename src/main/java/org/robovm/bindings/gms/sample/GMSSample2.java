package org.robovm.bindings.gms.sample;


import org.robovm.apple.uikit.UIViewController;
import org.robovm.bindings.gms.GMSCameraPosition;
import org.robovm.bindings.gms.GMSMapView;
import org.robovm.bindings.gms.GMSMapViewType;

public class GMSSample2 extends UIViewController {

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        GMSCameraPosition camera = new GMSCameraPosition(37.80948, 5.965699, 2);
        GMSMapView mapView = new GMSMapView(getView().getBounds(), camera);
        mapView.setMapType(GMSMapViewType.Satellite);
        getView().addSubview(mapView);
    }

}
