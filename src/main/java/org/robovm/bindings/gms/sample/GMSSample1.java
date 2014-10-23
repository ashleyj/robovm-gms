package org.robovm.bindings.gms.sample;

import org.robovm.apple.uikit.UIViewController;
import org.robovm.bindings.gms.GMSCameraPosition;
import org.robovm.bindings.gms.GMSMapView;
import org.robovm.bindings.gms.GMSMarker;
import org.robovm.bindings.gms.GMSMarkerAnimation;


public class GMSSample1 extends UIViewController {

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        GMSCameraPosition camera = new GMSCameraPosition(-33.868,151.2086,6);
        GMSMapView mapView = new GMSMapView(getView().getBounds(),camera);

        GMSMarker marker = new GMSMarker();
        marker.setPosition(camera.getTarget());
        marker.setSnippet("Hello, World!");
        marker.setAppearAnimation(GMSMarkerAnimation.Pop);
        marker.setMap(mapView);
        getView().addSubview(mapView);
    }
}
