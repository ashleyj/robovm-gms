package org.robovm.bindings.gms;


import org.robovm.apple.foundation.NSError;

public interface GMSPanoramaCallback {

    /* typedef void (^GMSPanoramaCallback)(GMSPanorama *panorama, NSError *error);*/
    GMSPanoramaCallback invoke(GMSPanorama panorama, NSError error);
}