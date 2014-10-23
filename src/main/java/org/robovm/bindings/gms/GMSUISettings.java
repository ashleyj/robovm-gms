package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

/** Settings for the user interface of a GMSMapView. */
@NativeClass
public class GMSUISettings extends NSObject {
    /**
     * Sets the preference for whether all gestures should be enabled (default) or
     * disabled. This doesn't restrict users from tapping any on screen buttons to
     * move the camera (e.g., compass or zoom controls), nor does it restrict
     * programmatic movements and animation.
     */
    /* (void)setAllGesturesEnabled:(BOOL)enabled */
    @Method(selector = "setAllGesturesEnabled:")
    public native void setAllGesturesEnabled(boolean value);

    /* @property(nonatomic, assign) BOOL scrollGestures */
    @Property(selector = "scrollGestures" )
    public native boolean getScrollGestures();

    /**
     * Controls whether scroll gestures are enabled (default) or disabled. If
     * enabled, users may drag to pan the camera. This does not limit programmatic
     * movement of the camera.
     */
    @Property(selector = "setScrollGestures:" )
    public native void getScrollGestures(boolean value);

    /* @property(nonatomic, assign) BOOL zoomGestures */
    @Property(selector = "zoomGestures" )
    public native boolean sgtZoomGestures();

    /**
     * Controls whether zoom gestures are enabled (default) or disabled. If
     * enabled, users may double tap/two-finger tap or pinch to zoom the camera.
     * This does not limit programmatic movement of the camera.
     */
    @Property(selector = "setZoomGestures:" )
    public native void setZoomGestures(boolean value);

    /* @property(nonatomic, assign) BOOL tiltGestures */
    @Property(selector = "tiltGestures" )
    public native boolean getTiltGestures();

    /**
     * Controls whether tilt gestures are enabled (default) or disabled. If enabled,
     * users may use a two-finger vertical down or up swipe to tilt the camera. This
     * does not limit programmatic control of the camera's viewingAngle.
     */
    @Property(selector = "setTiltGestures:" )
    public native void setTiltGestures(boolean value);

    /* @property(nonatomic, assign) BOOL rotateGestures */
    @Property(selector = "rotateGestures" )
    public native boolean getRotateGestures();

    /**
     * Controls whether rotate gestures are enabled (default) or disabled. If
     * enabled, users may use a two-finger rotate gesture to rotate the camera. This
     * does not limit programmatic control of the camera's bearing.
     */
    @Property(selector = "setRotateGestures:" )
    public native void setRotateGestures(boolean value);

    /* @property(nonatomic, assign) BOOL consumesGesturesInView */
    @Property(selector = "consumesGesturesInView" )
    public native boolean getConsumesGesturesInView();

    /**
     * Controls whether gestures by users are completely consumed by the GMSMapView
     * when gestures are enabled (default YES).  This prevents these gestures from
     * being received by parent views.
     *
     * When the GMSMapView is contained by a UIScrollView (or other scrollable area),
     * this means that gestures on the map will not be additional consumed as scroll
     * gestures.  However, disabling this (set to NO) may be userful to support
     * complex view hierarchies or requirements.
     */
    @Property(selector = "setConsumesGesturesInView:" )
    public native void setConsumesGesturesInView(boolean value);

    /* @property(nonatomic, assign) BOOL compassButton */
    @Property(selector = "compassButton" )
    public native boolean getCompassButton();

    /**
     * Enables or disables the compass. The compass is an icon on the map that
     * indicates the direction of north on the map.
     *
     * If enabled, it is only shown when the camera is rotated away from its default
     * orientation (bearing of 0). When a user taps the compass, the camera orients
     * itself to its default orientation and fades away shortly after. If disabled,
     * the compass will never be displayed.
     */
    @Property(selector = "setCompassButton:" )
    public native void setCompassButton(boolean value);

    /* @property(nonatomic, assign) BOOL myLocationButton */
    @Property(selector = "myLocationButton" )
    public native boolean getMyLocationButton();

    /**
     * Enables or disables the My Location button. This is a button visible on the
     * map that, when tapped by users, will center the map on the current user
     * location.
     */
    @Property(selector = "setMyLocationButton:" )
    public native void setMyLocationButton(boolean value);

    /* @property(nonatomic, assign) BOOL indoorPicker */
    @Property(selector = "indoorPicker" )
    public native boolean getIndoorPicker();

    /**
     * Enables (default) or disables the indoor floor picker. If enabled, it is only
     * visible when the view is focused on a building with indoor floor data.
     * If disabled, the selected floor can still be controlled programatically via
     * the indoorDisplay mapView property.
     */
    @Property(selector = "setIndoorPicker:" )
    public native void setIndoorPicker(boolean value);

}