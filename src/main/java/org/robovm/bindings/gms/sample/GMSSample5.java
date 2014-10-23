package org.robovm.bindings.gms.sample;


import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.bindings.gms.GMSCameraPosition;
import org.robovm.bindings.gms.GMSMapView;
import org.robovm.bindings.gms.GMSMutablePath;
import org.robovm.bindings.gms.GMSPolyline;

public class GMSSample5 extends UIViewController {

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        GMSCameraPosition cameraPosition = new GMSCameraPosition(0, -165, 2);
        GMSMapView mapView = new GMSMapView(getView().getBounds(), cameraPosition);

        GMSMutablePath path = new GMSMutablePath();
        path.addCoordinate(-33.866, 151.195); // Sydney
        path.addCoordinate(-18.142, 178.431); // Fiji
        path.addCoordinate(21.291, -157.821); // Hawaii
        path.addCoordinate(37.423, -122.091); // Mountain View

        GMSPolyline polyline = new GMSPolyline(path);
        polyline.setStrokeColor(UIColor.blue());
        polyline.setStrokeWidth(5.6f);
        polyline.setMap(mapView);

        getView().addSubview(mapView);
    }
}
