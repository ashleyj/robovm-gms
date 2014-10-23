package org.robovm.bindings.gms;

import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Bridge;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.Pointer;

/**
 * GMSCoordinateBounds represents a rectangular bounding box on the Earth's
 * surface. GMSCoordinateBounds is immutable and can't be modified after
 * construction.
 */
@Library("CoreLocation")
@NativeClass
public class GMSCoordinateBounds extends NSObject {

    /** The North-East corner of these bounds. */
    /* @property(nonatomic, readonly) CLLocationCoordinate2D northEast */
    @Property(selector="northEast")
    public native @ByVal CLLocationCoordinate2D getNorthEast();

    /** The South-West corner of these bounds. */
    /* @property(nonatomic, readonly) CLLocationCoordinate2D southWest */
    @Property(selector="southWest")
    public native @ByVal CLLocationCoordinate2D getSouthWest();

    /**
     * Returns NO if this bounds does not contain any points.
     * For example, [[GMSCoordinateBounds alloc] init].valid == NO.
     * When an invalid bounds is expanded with valid coordinates via
     * includingCoordinate: or includingBounds:, the resulting bounds will be valid
     * but contain only the new coordinates.
     */
    /* @property(readonly, getter=isValid) BOOL valid */
    private static final Selector valid$ = Selector.register("isValid");

    @Bridge
    private native static boolean objc_valid (GMSCoordinateBounds __self__, Selector __cmd__);

    public boolean isValid() {
        return objc_valid(this, valid$);
    }

    /**
     * Inits the northEast and southWest bounds corresponding
     * to the rectangular region defined by the two corners.
     *
     * It is ambiguous whether the longitude of the box
     * extends from |coord1| to |coord2| or vice-versa;
     * the box is constructed as the smaller of the two variants, eliminating the
     * ambiguity.
     */
    /*
     * (id)initWithCoordinate:(CLLocationCoordinate2D)coord1
     * coordinate:(CLLocationCoordinate2D)coord2;
     */
    @Method(selector = "initWithCoordinate:coordinate:")
    private native @Pointer long init(@ByVal CLLocationCoordinate2D coord1, @ByVal CLLocationCoordinate2D coord2);

    public GMSCoordinateBounds (@ByVal CLLocationCoordinate2D coord1, @ByVal CLLocationCoordinate2D coord2) {
        super((SkipInit)null);
        initObject(init(coord1, coord2));
    }

    /**
     * Inits with bounds that encompass |region|.
     */
    /* (id)initWithRegion:(GMSVisibleRegion)region */
    @Method(selector = "initWithRegion:")
    private native @Pointer long init(GMSProjection.GMSVisibleRegion region);

    public GMSCoordinateBounds (GMSProjection.GMSVisibleRegion region) {
        super((SkipInit)null);
        initObject(init(region));
    }

    /**
     * Inits with bounds that encompass |path|.
     */
    /* (id)initWithPath:(GMSPath *)path */
    @Method(selector = "initWithPath:")
    private native @Pointer long init(GMSPath path);

    public GMSCoordinateBounds (GMSPath path) {
        super((SkipInit)null);
        initObject(init(path));
    }

    /**
     * Returns a GMSCoordinateBounds representing
     * the current bounds extended to include the passed-in coordinate.
     * If the current bounds is invalid, the result is a valid bounds containing
     * only |coordinate|.
     */
    /* (GMSCoordinateBounds *)includingCoordinate:(CLLocationCoordinate2D)coordinate */
    @Method(selector = "includingCoordinate:")
    public native GMSCoordinateBounds includingCoordinate (@ByVal CLLocationCoordinate2D coordinate );

    /**
     * Returns a GMSCoordinateBounds representing
     * the current bounds extended to include the entire other bounds.
     * If the current bounds is invalid, the result is a valid bounds equal
     * to |other|.
     */
    /* (GMSCoordinateBounds *)includingBounds:(GMSCoordinateBounds *)other */
    @Method(selector = "includingBounds:")
    public native GMSCoordinateBounds includingBounds (GMSCoordinateBounds other );

    /**
     * Returns a GMSCoordinateBounds representing the current bounds extended to
     * include |path|.
     */
    /* (GMSCoordinateBounds *)includingPath:(GMSPath *)path */
    @Method(selector = "includingPath:")
    public native GMSCoordinateBounds includingPath (GMSPath path );

    /**
     * Returns YES if |coordinate| is contained within this bounds. This includes
     * points that lie exactly on the edge of the bounds.
     */
    /* (BOOL)containsCoordinate:(CLLocationCoordinate2D)coordinate */
    @Method(selector = "containsCoordinate:")
    public native boolean containsCoordinate (@ByVal CLLocationCoordinate2D coordinate );

    /**
     * Returns YES if |other| overlaps with this bounds.
     * Two bounds are overlapping if there is at least one coordinate point
     * contained by both.
     */
    /* (BOOL)intersectsBounds:(GMSCoordinateBounds *)other */
    @Method(selector = "intersectsBounds:")
    public native boolean intersectsBounds (GMSCoordinateBounds other );

}