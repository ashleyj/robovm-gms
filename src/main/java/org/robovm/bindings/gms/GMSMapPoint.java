package org.robovm.bindings.gms;


import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.StructMember;

/**
 * A point on the map. May represent a projected coordinate. x is in [-1, 1].
 * The axis direction is normal: y grows towards North, x grows towards East.
 * (0, 0) is the center of the map. See GMSProject() and GMSUnproject().
 */


public class GMSMapPoint extends Struct<GMSMapPoint> {
    @StructMember(0)
    public native @ByVal double x();

    @StructMember(1)
    public native @ByVal double pitch();
}
