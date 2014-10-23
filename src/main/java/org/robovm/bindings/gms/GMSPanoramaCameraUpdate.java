package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.MachineSizedFloat;

@NativeClass
public class GMSPanoramaCameraUpdate extends NSObject {

    /** Returns an update that increments the camera heading with |deltaHeading|. */
    /* (GMSPanoramaCameraUpdate *)rotateBy:(CGFloat)deltaHeading */
    @Method(selector = "rotateBy:")
    public native static GMSPanoramaCameraUpdate rotateBy(@MachineSizedFloat float deltaHeading);

    /** Returns an update that sets the camera heading to the given value. */
    /* (GMSPanoramaCameraUpdate *)setHeading:(CGFloat)heading */
    @Method(selector = "setHeading:")
    public native static GMSPanoramaCameraUpdate setHeading(@MachineSizedFloat float heading);

    /** Returns an update that sets the camera pitch to the given value. */
    /* (GMSPanoramaCameraUpdate *)setPitch:(CGFloat)pitch */
    @Method(selector = "setPitch:")
    public native static GMSPanoramaCameraUpdate setPitch(@MachineSizedFloat float pitch);

    /** Returns an update that sets the camera zoom to the given value. */
    /* (GMSPanoramaCameraUpdate *)setZoom:(CGFloat)zoom */
    @Method(selector = "setZoom:")
    public native static GMSPanoramaCameraUpdate setZoom(@MachineSizedFloat float zoom);


}