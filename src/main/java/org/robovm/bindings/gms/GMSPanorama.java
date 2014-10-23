package org.robovm.bindings.gms;

import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;

/**
 * GMSPanorama represents metadata for a specific panorama on the Earth. This class is not
 * instantiable directly and is obtained via GMSPanoramaService or GMSPanoramaView.
 */
@NativeClass
public class GMSPanorama extends NSObject {

    /** The precise location of this panorama. */
    /* @property(nonatomic, readonly) CLLocationCoordinate2D coordinate */
    @Property(selector = "coordinate")
    public native @ByVal CLLocationCoordinate2D getCoordinate();

    /** The ID of this panorama. Panoramas may change ID over time, so this should not be persisted */
    /* @property(nonatomic, copy, readonly) NSString *panoramaID */
    @Property(selector = "panoramaID")
    public native String getPanoramaID();

    /** An array of GMSPanoramaLink describing the neighboring panoramas. */
    /* @property(nonatomic, copy, readonly) NSArray *links */
    @Property(selector = "links")
    public native NSArray getLinks();


}