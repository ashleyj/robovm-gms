package org.robovm.bindings.gms.sample;


import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.bindings.gms.GMSCameraPosition;
import org.robovm.bindings.gms.GMSMapView;
import org.robovm.bindings.gms.GMSMarker;
import org.robovm.bindings.gms.GMSMarkerAnimation;

public class GMSSample3 extends UIViewController {

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        GMSCameraPosition camera = new GMSCameraPosition(41.887,-87.622,15);
        GMSMapView mapView = new GMSMapView(getView().getBounds(),camera);

        GMSMarker marker = new GMSMarker();
        marker.setPosition(new CLLocationCoordinate2D(41.887, -87.622));
        marker.setAppearAnimation(GMSMarkerAnimation.Pop);
        marker.setMap(mapView);

        getView().addSubview(mapView);

    }
}
