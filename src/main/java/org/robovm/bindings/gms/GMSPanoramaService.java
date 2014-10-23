package org.robovm.bindings.gms;

import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSObject;
import org.robovm.bindings.gms.GMSPanoramaCallback;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.ByVal;

@NativeClass
public class GMSPanoramaService extends NSObject {

    /*
     * (void)requestPanoramaNearCoordinate:(CLLocationCoordinate2D)coordinate
     * callback:(GMSPanoramaCallback)callback;
     */
    @Method(selector = "requestPanoramaNearCoordinate:callback:")
    public native void requestPanoramaNearCoordinate(@ByVal CLLocationCoordinate2D coordinate, GMSPanoramaCallback callback );


    /*
     * (void)requestPanoramaNearCoordinate:(CLLocationCoordinate2D)coordinate
     * radius:(NSUInteger)radius
     * callback:(GMSPanoramaCallback)callback;
    */
    @Method(selector = "requestPanoramaNearCoordinate:radius:callback:")
    public native void requestPanoramaNearCoordinate(@ByVal CLLocationCoordinate2D coordinate,
                                                     int radius, GMSPanoramaCallback callback);

    /*
     * (void)requestPanoramaWithID:(NSString *)panoramaID
     * callback:(GMSPanoramaCallback)callback;
    */
    @Method(selector = "requestPanoramaWithID:callback:")
    public native void requestPanoramaWithID(String panoramaID, GMSPanoramaCallback callback );

}