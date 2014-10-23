package org.robovm.bindings.gms;

import org.robovm.apple.coreanimation.CALayer;
import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.foundation.NSString;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.GlobalValue;

/**
 * GMSMarkerLayer is a custom subclass of CALayer, available on a per-marker
 * basis, that allows animation of several properties of its associated
 * GMSMarker.
 *
 * Note that this CALayer is never actually rendered directly, as GMSMapView is
 * provided entirely via an OpenGL layer. As such, adjustments or animations to
 * 'default' properties of CALayer will not have any effect.
 */
@NativeClass
public class GMSMarkerLayer extends CALayer {

    /* @property(nonatomic, assign) CLLocationDegrees latitude */
    @Property(selector = "latitude")
    public native double getLatitude();

    @Property(selector = "setLatitude:", strongRef = true)
    public native void setLatitude(double latitude);

    /* @property(nonatomic, assign) CLLocationDegrees longitude */
    @Property(selector = "longitude")
    public native double getLongitude();

    @Property(selector = "setLongitude:", strongRef = true)
    public native void setLongitude(double longitude);

    /* @property(nonatomic, assign) CLLocationDegrees rotation */
    @Property(selector = "rotation")
    public native double getRotation();

    @Property(selector = "setRotation:", strongRef = true)
    public native void setRotation(double rotation);

    /* @property float opacity */
    @Property(selector = "opacity")
    public native float getOpacity();

    @Property(selector = "setOpacity:")
    public native void setOpacity(float opacity);


}