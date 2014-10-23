package org.robovm.bindings.gms;

import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.bindings.gms.GMSPath;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.MachineSizedUInt;
import org.robovm.rt.bro.annotation.Pointer;

/**
 * GMSMutablePath is a dynamic (resizable) array of CLLocationCoordinate2D. All coordinates must be
 * valid. GMSMutablePath is the mutable counterpart to the immutable GMSPath.
 */
@Library("CoreLocation")
@NativeClass
public class GMSMutablePath extends GMSPath {


    public GMSMutablePath() {
        super((SkipInit)null);
        initObject(init());
    }

    @Method(selector = "init")
    private native @Pointer long init();

    /** Adds |coord| at the end of the path. */
    /* (void)addCoordinate:(CLLocationCoordinate2D)coord */
    @Method(selector = "addCoordinate:")
    public native void addCoordinate(@ByVal CLLocationCoordinate2D coord);

    /** Adds a new CLLocationCoordinate2D instance with the given lat/lng. */
    /* (void)addLatitude:(CLLocationDegrees)latitude longitude:(CLLocationDegrees)longitude */
    @Method(selector = "addLatitude:longitude:")
    public native void addCoordinate(double latitude, double longitude);

    /**
     * Inserts |coord| at |index|.
     *
     * If this is smaller than the size of the path, shifts all coordinates forward by one. Otherwise,
     * behaves as replaceCoordinateAtIndex:withCoordinate:.
     */

    /* (void)insertCoordinate:(CLLocationCoordinate2D)coord atIndex:(NSUInteger)index */
    @Method(selector = "insertCoordinate:atIndex:")
    public native void addCoordinate(@ByVal CLLocationCoordinate2D coord, @MachineSizedUInt long index);

    /**
     * Replace the coordinate at |index| with |coord|. If |index| is after the end, grows the array with
     * an undefined coordinate.
     */
    /*
     * (void)replaceCoordinateAtIndex:(NSUInteger)index
     * withCoordinate:(CLLocationCoordinate2D)coord
     */
    @Method(selector = "replaceCoordinateAtIndex:withCoordinate:")
    public native void replaceCoordinateAtIndex(@MachineSizedUInt long index,@ByVal CLLocationCoordinate2D coord );

    /**
     * Remove entry at |index|.
     *
     * If |index| < count decrements size. If |index| >= count this is a silent
     * no-op.
     */
    /* (void)removeCoordinateAtIndex:(NSUInteger)index */
    @Method(selector = "removeCoordinateAtIndex:")
    public native void removeCoordinateAtIndex(@MachineSizedUInt long index );


    /**
     * Removes the last coordinate of the path.
     *
     * If the array is non-empty decrements size. If the array is empty, this is a silent no-op.
     */
    /* (void)removeLastCoordinate */
    @Method(selector = "removeLastCoordinate")
    public native void removeLastCoordinate();

    /** Removes all coordinates in this path. */
    /* (void)removeAllCoordinates */
    @Method(selector = "removeAllCoordinates")
    public native void removeAllCoordinates();
}