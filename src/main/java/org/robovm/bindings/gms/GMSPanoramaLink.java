package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.MachineSizedFloat;

/** Links from a GMSPanorama to neighboring panoramas. */
@NativeClass
public class GMSPanoramaLink extends NSObject {

    /*@property(nonatomic, assign) CGFloat heading*/
    @Property(selector = "heading", strongRef = true)
    public native @MachineSizedFloat float getHeading();

    @Property(selector = "setHeading:", strongRef = true)
    public native void setHeading();

    /**
     * Panorama ID for the neighboring panorama.
     * Do not store this persistenly, it changes in time.
     */
    /* @property(nonatomic, copy) NSString *panoramaID */
    @Property(selector = "panoramaID")
    public native String getPanoramaID();

    @Property(selector = "setPanoramaID:")
    public native void setPanoramaID();

}