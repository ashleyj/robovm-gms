package org.robovm.bindings.gms;

import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.MachineSizedFloat;
import org.robovm.rt.bro.annotation.StructMember;

/**
 * Defines a mapping between Earth coordinates (CLLocationCoordinate2D) and coordinates in the map's
 * view (CGPoint). A projection is constant and immutable, in that the mapping it embodies never
 * changes. The mapping is not necessarily linear.
 *
 * Passing invalid Earth coordinates (i.e., per CLLocationCoordinate2DIsValid) to this object may
 * result in undefined behavior.
 *
 * This class should not be instantiated directly, instead, obtained via projection on GMSMapView.
 */
@NativeClass
public class GMSProjection extends NSObject {

    /**
     * GMSVisibleRegion contains the four points defining the polygon that is visible in a map's camera.
     *
     * This polygon can be a trapezoid instead of a rectangle, because a camera can have tilt. If the
     * camera is directly over the center of the camera, the shape is rectangular, but if the camera is
     * tilted, the shape will appear to be a trapezoid whose smallest side is closest to the point of
     * view.
     */
    /*
     * typedef struct {
     *    CLLocationCoordinate2D nearLeft;
     *   CLLocationCoordinate2D nearRight;
     *   CLLocationCoordinate2D farLeft;
     *   CLLocationCoordinate2D farRight;
     * } GMSVisibleRegion;
     */
    public class GMSVisibleRegion extends Struct<GMSVisibleRegion> {
        private GMSVisibleRegion() {}

        @StructMember(0)
        public native @ByVal CLLocationCoordinate2D nearLeft();

        @StructMember(0)
        public native GMSVisibleRegion nearLeft(@ByVal CLLocationCoordinate2D nearLeft);

        @StructMember(1)
        public native @ByVal CLLocationCoordinate2D nearRight();

        @StructMember(1)
        public native GMSVisibleRegion nearRight(@ByVal CLLocationCoordinate2D nearRight);

        @StructMember(2)
        public native @ByVal CLLocationCoordinate2D farLeft();

        @StructMember(2)
        public native  GMSVisibleRegion farLeft(@ByVal CLLocationCoordinate2D farLeft);

        @StructMember(3)
        public native @ByVal CLLocationCoordinate2D farRight();

        @StructMember(3)
        public native GMSVisibleRegion farRight(@ByVal CLLocationCoordinate2D farRight);
    }

    /** Maps an Earth coordinate to a point coordinate in the map's view. */
    /* (CGPoint)pointForCoordinate:(CLLocationCoordinate2D)coordinate */
    @Method(selector = "pointForCoordinate:")
    public native CGPoint getPointForCoordinate (@ByVal CLLocationCoordinate2D coordinate );

    /** Maps a point coordinate in the map's view to an Earth coordinate. */
    /* (CLLocationCoordinate2D)coordinateForPoint:(CGPoint)point */
    @Method(selector = "coordinateForPoint:")
    public native @ByVal CLLocationCoordinate2D getCoordinateForPoint (CGPoint point );

    /**
     * Converts a distance in meters to content size.  This is only accurate for small Earth distances,
     * as it uses CGFloat for screen distances.
     */
    /* (CGFloat)pointsForMeters:(CLLocationDistance)meters atCoordinate:(CLLocationCoordinate2D)coordinate */
    @Method(selector = "pointsForMeters:atCoordinate:")
    public native @MachineSizedFloat float getPointsForMeters (double meters,
                                                               @ByVal CLLocationCoordinate2D coordinate);

    /**
     * Returns whether a given coordinate (lat/lng) is contained within the projection.
     */
    /* (BOOL)containsCoordinate:(CLLocationCoordinate2D)coordinate */
    @Method(selector = "containsCoordinate:")
    public native boolean containsCoordinate (@ByVal CLLocationCoordinate2D coordinate );

    /**
     * Returns the region (four location coordinates) that is visible according to the projection. If
     * padding was set on GMSMapView, this region takes the padding into account.
     *
     * The visible region can be non-rectangular. The result is undefined if the projection includes
     * points that do not map to anywhere on the map (e.g., camera sees outer space).
     */
    /* (GMSVisibleRegion)visibleRegion */
    @Method(selector = "visibleRegion")
    public native GMSVisibleRegion getVisibleRegion ( );


}