package org.robovm.bindings.gms.sample;


import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.*;
import org.robovm.bindings.gms.*;

public class GMSSample4 extends UIViewController {


    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        CLLocationCoordinate2D panoramaNear = new CLLocationCoordinate2D(50.059139,-122.958391);
        GMSPanoramaView panoramaView = new GMSPanoramaView(getView().getBounds(), panoramaNear);
        getView().addSubview(panoramaView);
    }
}
