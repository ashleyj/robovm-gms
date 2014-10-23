package org.robovm.bindings.gms;

import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;


/**
 * GMSMapLayer is a custom subclass of CALayer, provided as the layer class on
 * GMSMapView. This layer should not be instantiated directly. It provides
 * model access to the camera normally defined on GMSMapView.
 *
 * Modifying or animating these properties will typically interrupt any current
 * gesture on GMSMapView, e.g., a user's pan or rotation. Similarly, if a user
 * performs an enabled gesture during an animation, the animation will stop
 * 'in-place' (at the current presentation value).
 */

@NativeClass
public class GMSMapLayer extends GMSCALayer {


    /**
     * The following layer properties and constants describe the camera properties
     * that may be animated on the custom model layer of a GMSMapView with Core
     * Animation. For simple camera control and animation, please see the helper
     * methods in GMSMapView+Animation.h, and the camera object definition within
     * GMSCameraPosition.h.
     *
     * Changing layer properties triggers an implicit animation, e.g.:-
     *   mapView_.layer.cameraBearing = 20;
     *
     * An explicit animation, replacing the implicit animation, may be added after
     * changing the property, e.g.-
     *   CAMediaTimingFunction *curve = [CAMediaTimingFunction functionWithName:
     *                                   kCAMediaTimingFunctionEaseInEaseOut];
     *   CABasicAnimation *animation =
     *       [CABasicAnimation animationWithKeyPath:kGMSLayerCameraBearingKey];
     *   animation.duration = 2.0f;
     *   animation.timingFunction = curve;
     *   animation.toValue = @20;
     *   [mapView_.layer addAnimation:animation forKey:kGMSLayerCameraBearingKey];
     *
     * To control several implicit animations, Core Animation's transaction support
     * may be used, e.g.-
     *   [CATransaction begin];
     *   [CATransaction setAnimationDuration:2.0f];
     *   mapView_.layer.cameraBearing = 20;
     *   mapView_.layer.cameraViewingAngle = 30;
     *   [CATransaction commit];
     *
     * Note that these properties are not view-based. Please see "Animating View
     * and Layer Changes Together" in the View Programming Guide for iOS-
     *   http://developer.apple.com/library/ios/#documentation/windowsviews/conceptual/viewpg_iphoneos/AnimatingViews/AnimatingViews.html
     */

    /* @property(nonatomic, assign) CLLocationDegrees cameraLatitude */
    @Property(selector="cameraLatitude")
    public native double getCameraLatitude();

    @Property(selector="setCameraLatitude:", strongRef = true)
    public native void getCameraLatitude(double cameraLatitude);

    /* @property(nonatomic, assign) CLLocationDegrees cameraLongitude */
    @Property(selector="cameraLongitude")
    public native double getCameraLongitude();

    @Property(selector="setCameraLongitude:", strongRef = true)
    public native void setCameraLongitude(double cameraLongitude);

    /* @property(nonatomic, assign) CLLocationDirection cameraBearing */
    @Property(selector="cameraBearing")
    public native double getCameraBearing();

    @Property(selector="setCameraBearing:", strongRef = true)
    public native void setCameraBearing(double cameraBearing);

    /* @property(nonatomic, assign) float cameraZoomLevel */
    @Property(selector="cameraZoomLevel")
    public native float getCameraZoomLevel();

    @Property(selector="setCameraZoomLevel:", strongRef = true)
    public native void setCameraZoomLevel(double cameraZoomLevel);

    /* @property(nonatomic, assign) double cameraViewingAngle */
    @Property(selector="cameraViewingAngle")
    public native double getCameraViewingAngle();

    @Property(selector="setCameraViewingAngle:", strongRef = true)
    public native void setCameraViewingAngle(double cameraViewingAngle);

}