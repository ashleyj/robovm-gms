package org.robovm.bindings.gms;

import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.ByVal;

/**
 * GMSMapView (Animation) offers several animation helper methods.
 *
 * During any animation, retrieving the camera position through the camera
 * property on GMSMapView returns an intermediate immutable GMSCameraPosition.
 * This camera position will typically represent the most recently drawn frame.
 */
@NativeClass
public class GMSMapViewAnimation {

    /** Animates the camera of this map to |cameraPosition|. */
    /*- (void)animateToCameraPosition:(GMSCameraPosition *)cameraPosition;*/
    @Method(selector = "animateToCameraPosition:")
    public static native void animateToCameraPosition(GMSCameraPosition cameraPosition);

    /**
     * As animateToCameraPosition:, but changes only the location of the camera
     * (i.e., from the current location to |location|).
     */
    /*- (void)animateToLocation:(CLLocationCoordinate2D)location;*/
    @Method(selector = "animateToLocation:")
    public static native void animateToLocation(@ByVal CLLocationCoordinate2D location);

    /**
     * As animateToCameraPosition:, but changes only the zoom level of the camera.
     * This value is clamped by [kGMSMinZoomLevel, kGMSMaxZoomLevel].
     */
    /*- (void)animateToZoom:(float)zoom;*/
    @Method(selector = "animateToZoom:")
    public static native void animateToZoom(float zoom);

    /**
     * As animateToCameraPosition:, but changes only the bearing of the camera (in
     * degrees). Zero indicates true north.
     */
    /*- (void)animateToBearing:(CLLocationDirection)bearing;*/
    @Method(selector = "animateToBearing:")
    public static native void animateToBearing(double bearing);

    /**
     * As animateToCameraPosition:, but changes only the viewing angle of the camera
     * (in degrees). This value will be clamped to a minimum of zero (i.e., facing
     * straight down) and between 30 and 45 degrees towards the horizon, depending
     * on the relative closeness to the earth.
     */
    /*- (void)animateToViewingAngle:(double)viewingAngle;*/
    @Method(selector = "animateToViewingAngle:")
    public static native void animateToViewingAngle(double viewingAngle);

    /**
     * Applies |cameraUpdate| to the current camera, and then uses the result as
     * per animateToCameraPosition:.
     */
    /*- (void)animateWithCameraUpdate:(GMSCameraUpdate *)cameraUpdate;*/
    @Method(selector = "animateWithCameraUpdate:")
    public static native void animateWithCameraUpdate(GMSCameraUpdate cameraUpdate);
}