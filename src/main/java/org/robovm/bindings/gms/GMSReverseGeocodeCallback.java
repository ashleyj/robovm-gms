package org.robovm.bindings.gms;


import org.robovm.apple.foundation.NSError;

/* typedef void (^GMSReverseGeocodeCallback)(GMSReverseGeocodeResponse *, NSError *) */
public interface GMSReverseGeocodeCallback {
    GMSReverseGeocodeCallback invoke(GMSReverseGeocodeResponse response, NSError error);
}