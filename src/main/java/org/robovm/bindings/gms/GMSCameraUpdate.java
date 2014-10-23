package org.robovm.bindings.gms;

import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.uikit.UIEdgeInsets;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.MachineSizedFloat;

/**
 * GMSCameraUpdate represents an update that may be applied to a GMSMapView.
 * It encapsulates some logic for modifying the current camera.
 * It should only be constructed using the factory helper methods below.
 */
@Library("CoreLocation")
@NativeClass
public class GMSCameraUpdate extends NSObject {

    /**
     * Returns a GMSCameraUpdate that zooms in on the map.
     * The zoom increment is 1.0.
     */

    /*(GMSCameraUpdate *)zoomIn*/
    @Method(selector = "zoomIn")
    public static native GMSCameraUpdate zoomIn();


    /**
     * Returns a GMSCameraUpdate that zooms out on the map.
     * The zoom increment is -1.0.
     */
    /* (GMSCameraUpdate *)zoomOut */
    @Method(selector = "zoomOut")
    public static native GMSCameraUpdate zoomOut();


    /**
     * Returns a GMSCameraUpdate that changes the zoom by the specified amount.
     */
   /*(GMSCameraUpdate *)zoomBy:(float)delta */
    @Method(selector = "zoomBy:")
    public static native GMSCameraUpdate zoomBy(float delta);

    /**
     * Returns a GMSCameraUpdate that sets the zoom to the specified amount.
     */
    /* (GMSCameraUpdate *)zoomTo:(float)zoom */
    @Method(selector = "zoomTo:")
    public static native GMSCameraUpdate zoomTo(float zoom);


    /**
     * Returns a GMSCameraUpdate that sets the camera target to the specified
     * coordinate.
     */
    /* (GMSCameraUpdate *)setTarget:(CLLocationCoordinate2D)target;*/
    @Method(selector = "setTarget:")
    public static native GMSCameraUpdate setTarget(@ByVal CLLocationCoordinate2D target);

    /**
     * Returns a GMSCameraUpdate that sets the camera target and zoom to the
     * specified values.
     */
    /* (GMSCameraUpdate *)setTarget:(CLLocationCoordinate2D)target zoom:(float)zoom;*/
    @Method(selector = "setTarget:zoom:")
    public static native GMSCameraUpdate setTarget(@ByVal CLLocationCoordinate2D target, float zoom);

    /**
     * Returns a GMSCameraUpdate that sets the camera to the specified
     * GMSCameraPosition.
     */
    /* (GMSCameraUpdate *)setCamera:(GMSCameraPosition *)camera;*/
    @Method(selector = "setCamera:")
    public static native GMSCameraUpdate setCamera(GMSCameraPosition camera);

    /**
     * Returns a GMSCameraUpdate that transforms the camera such that the specified
     * bounds are centered on screen at the greatest possible zoom level. The bounds
     * will have a default padding of 64 points.
     *
     * The returned camera update will set the camera's bearing and tilt to their
     * default zero values (i.e., facing north and looking directly at the Earth).
     */
    /* (GMSCameraUpdate *)fitBounds:(GMSCoordinateBounds *)bounds;*/
    @Method(selector = "fitBounds:")
    public static native GMSCameraUpdate fitBounds(GMSCoordinateBounds bounds);

    /**
     * This is similar to fitBounds: but allows specifying the padding (in points)
     * in order to inset the bounding box from the view's edges.
     * If the requested |padding| is larger than the view size in either the
     * vertical or horizontal direction the map will be maximally zoomed out.
     */
    /* (GMSCameraUpdate *)fitBounds:(GMSCoordinateBounds *)bounds
    withPadding:(CGFloat)padding;*/
    @Method(selector = "fitBounds:withPadding")
    public static native GMSCameraUpdate fitBounds(GMSCoordinateBounds bounds, @MachineSizedFloat float padding );

    /**
     * This is similar to fitBounds: but allows specifying edge insets
     * in order to inset the bounding box from the view's edges.
     * If the requested |edgeInsets| are larger than the view size in either the
     * vertical or horizontal direction the map will be maximally zoomed out.
     */
    /* (GMSCameraUpdate *)fitBounds:(GMSCoordinateBounds *)bounds
     * withEdgeInsets:(UIEdgeInsets)edgeInsets;
     */
    @Method(selector = "fitBounds:withEdgeInsets")
    public static native GMSCameraUpdate fitBounds(GMSCoordinateBounds bounds, UIEdgeInsets edgeInsets );

    /**
     * Returns a GMSCameraUpdate that shifts the center of the view by the
     * specified number of points in the x and y directions.
     * X grows to the right, Y grows down.
     */
    /* (GMSCameraUpdate *)scrollByX:(CGFloat)dX Y:(CGFloat)dY;*/
    @Method(selector = "scrollByX:Y:")
    public static native GMSCameraUpdate scrollBy(@MachineSizedFloat float dX, @MachineSizedFloat float y );

    /**
     * Returns a GMSCameraUpdate that zooms with a focus point; the focus point
     * stays fixed on screen.
     */
    /* (GMSCameraUpdate *)zoomBy:(float)zoom atPoint:(CGPoint)point;*/
    @Method(selector = "zoomBy:atPoint:")
    public static native GMSCameraUpdate zoomBy(float zoom, CGPoint point );


}