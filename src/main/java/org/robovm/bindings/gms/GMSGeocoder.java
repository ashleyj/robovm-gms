package org.robovm.bindings.gms;

import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.Pointer;

/**
 * Exposes a service for reverse geocoding. This maps Earth coordinates (latitude and longitude) to
 * a collection of addresses near that coordinate.
 */
@Library("CoreLocation")
@NativeClass
public class GMSGeocoder extends NSObject {

    /* (GMSGeocoder *)geocoder */
    @Method(selector = "geocoder")
    private native @Pointer long init();

    /* Convenience constructor for GMSGeocoder. */
    public GMSGeocoder () {
        super((SkipInit) null);
        initObject(init());
    }


    /**
     * Reverse geocodes a coordinate on the Earth's surface.
     *
     * @param coordinate The coordinate to reverse geocode.
     * @param handler The callback to invoke with the reverse geocode results.
     *        The callback will be invoked asynchronously from the main thread.
     */
    /*
     * (void)reverseGeocodeCoordinate:(CLLocationCoordinate2D)coordinate
     * completionHandler:(GMSReverseGeocodeCallback)handler;
     */
    @Method(selector = "reverseGeocodeCoordinate:completionHandler:")
    public native void getReverseGeocodeCoordinate (@ByVal CLLocationCoordinate2D coordinate, GMSReverseGeocodeCallback handler);


}