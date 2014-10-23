package org.robovm.bindings.gms;

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.corelocation.CLLocation;
import org.robovm.apple.uikit.UIEdgeInsets;
import org.robovm.apple.uikit.UIView;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.*;

/**
 * This is the main class of the Google Maps SDK for iOS and is the entry point
 * for all methods related to the map.
 *
 * The map should be instantiated via the convenience constructor
 * [GMSMapView mapWithFrame:camera:]. It may also be created with the default
 * [[GMSMapView alloc] initWithFrame:] method (wherein its camera will be set to
 * a default location).
 *
 * GMSMapView can only be read and modified from the main thread, similar to all
 * UIKit objects. Calling these methods from another thread will result in an
 * exception or undefined behavior.
 */
@Library(Library.INTERNAL)
@NativeClass
public class GMSMapView extends UIView {

    /** GMSMapView delegate. */
    /* @property(nonatomic, weak) id<GMSMapViewDelegate> delegate */
    @Property(selector ="delegate")
    public native GMSMapViewDelegate getDelegate();

    @Property(selector ="setDelegate:", strongRef = true)
    public native void setDelegate(GMSMapViewDelegate delegate);

    /**
     * Controls the camera, which defines how the map is oriented. Modification of
     * this property is instantaneous.
     */
    /* @property(nonatomic, copy) GMSCameraPosition *camera */
    @Property(selector ="camera")
    public native GMSCameraPosition getCamera();

    @Property(selector ="setCamera:")
    public native void setCamera(GMSCameraPosition camera);

    /**
     * Returns a GMSProjection object that you can use to convert between screen
     * coordinates and latitude/longitude coordinates.
     *
     * This is a snapshot of the current projection, and will not automatically
     * update when the camera moves. It represents either the projection of the last
     * drawn GMSMapView frame, or; where the camera has been explicitly set or the
     * map just created, the upcoming frame. It will never be nil.
     */
    /* @property(nonatomic, readonly) GMSProjection *projection */
    @Property(selector ="projection")
    public native GMSProjection getProjection();


    /* @property(nonatomic, assign, getter=isMyLocationEnabled) BOOL myLocationEnabled */
    /**
     * Controls whether the My Location dot and accuracy circle is enabled.
     * Defaults to NO.
     */
    @Method(selector = "isMyLocationEnabled")
    public native boolean isMyLocationEnabled() ;

    @Property(selector = "setMyLocationEnabled:")
    public native void setMyLocationEnabled (boolean value);

    /* @property(nonatomic, strong, readonly) CLLocation *myLocation */
    @Property(selector = "myLocation")
    public native CLLocation getMyLocation();

    /**
     * The marker that is selected.  Setting this property selects a particular
     * marker, showing an info window on it.  If this property is non-nil, setting
     * it to nil deselects the marker, hiding the info window.  This property is
     * observable using KVO.
     */

    /* @property(nonatomic, strong) GMSMarker *selectedMarker */
    @Property(selector ="selectedMarker")
    public native GMSMarker getSelectedMarker();

    @Property(selector ="setSelectedMarker:")
    public native void setSelectedMarker(GMSMarker selectedMarker);

    /* @property(nonatomic, assign, getter=isTrafficEnabled) BOOL trafficEnabled */
    /**
     * Controls whether the map is drawing traffic data, if available.  This is
     * subject to the availability of traffic data.  Defaults to NO.
     */
    @Method(selector = "isTrafficEnabled")
    public native boolean isTrafficEnabled();

    @Property(selector = "setTrafficEnabled:")
    public native void setTrafficEnabled (boolean value);

    /**
     * Controls the type of map tiles that should be displayed.  Defaults to
     * kGMSTypeNormal.
     */
    /* @property(nonatomic, assign) GMSMapViewType mapType */
    @Property(selector = "mapType")
    public native GMSMapViewType getMapType();

    @Property(selector = "setMapType:", strongRef = true)
    public native void setMapType(GMSMapViewType mapType);

    /**
     * Minimum zoom (the farthest the camera may be zoomed out). Defaults to
     * kGMSMinZoomLevel. Modified with -setMinZoom:maxZoom:.
     */
    /* @property(nonatomic, assign, readonly) float minZoom */
    @Property(selector = "minZoom")
    public native float getMinZoom();

    /**
     * Maximum zoom (the closest the camera may be to the Earth). Defaults to
     * kGMSMaxZoomLevel. Modified with -setMinZoom:maxZoom:.
     */
    /* @property(nonatomic, assign, readonly) float maxZoom */
    @Property(selector = "maxZoom")
    public native float getMaxZoom();

    /* @property(nonatomic, assign, getter=isBuildingsEnabled) BOOL buildingsEnabled */
    /**
     * If set, 3D buildings will be shown where available.  Defaults to YES.
     *
     * This may be useful when adding a custom tile layer to the map, in order to
     * make it clearer at high zoom levels.  Changing this value will cause all
     * tiles to be briefly invalidated.
     */
    @Method(selector = "isBuildingsEnabled")
    public native boolean isBuildingsEnabled$();

    @Property(selector = "setBuildingsEnabled:", strongRef = true)
    public native void setBuildingsEnabled(boolean value);

    /* @property(nonatomic, assign, getter=isIndoorEnabled) BOOL indoorEnabled */
    /**
     * Sets whether indoor maps are shown, where available. Defaults to YES.
     *
     * If this is set to NO, caches for indoor data may be purged and any floor
     * currently selected by the end-user may be reset.
     */
    @Method(selector = "isIndoorEnabled")
    public native boolean isIndoorEnabled();

    @Property(selector = "setIndoorEnabled:", strongRef = true)
    public native void setIndoorEnabled(boolean value);

    /**
     * Gets the GMSIndoorDisplay instance which allows to observe or control
     * aspects of indoor data display.
     */
    /* @property(nonatomic, strong, readonly) GMSIndoorDisplay *indoorDisplay */
    @Property(selector = "indoorDisplay")
    public native GMSIndoorDisplay getIndoorDisplay();


    /**
     * Gets the GMSUISettings object, which controls user interface settings for the
     * map.
     */
    /* @property(nonatomic, strong, readonly) GMSUISettings *settings */
    @Property(selector = "settings")
    public native GMSUISettings getSettings();

    /**
     * Controls the 'visible' region of the view.  By applying padding an area
     * arround the edge of the view can be created which will contain map data
     * but will not contain UI controls.
     *
     * If the padding is not balanced, the visual center of the view will move as
     * appropriate.  Padding will also affect the |projection| property so the
     * visible region will not include the padding area.  GMSCameraUpdate
     * fitToBounds will ensure that both this padding and any padding requested
     * will be taken into account.
     *
     * This property may be animated within a UIView-based animation block.
     */
    /* @property(nonatomic, assign) UIEdgeInsets padding */
    @Property(selector = "padding")
    public native UIEdgeInsets getPadding();

    @Property(selector = "setPadding:", strongRef = true)
    public native void setPadding(UIEdgeInsets padding);

    /**
     * Defaults to YES. If set to NO, GMSMapView will generate accessibility
     * elements for overlay objects, such as GMSMarker and GMSPolyline.
     *
     * This property is as per the informal UIAcessibility protocol, except for the
     * default value of YES.
     */
    /* @property(nonatomic) BOOL accessibilityElementsHidden */
    @Property(selector = "accessibilityElementsHidden")
    public native boolean getAccessibilityElementsHidden();

    @Property(selector = "setAccessibilityElementsHidden:")
    public native void setAccessibilityElementsHidden(boolean value);

    /**
     * Accessor for the custom CALayer type used for the layer.
     */
    /* @property(nonatomic, readonly, retain) GMSMapLayer *layer */
    @Property(selector = "layer")
    public native GMSMapLayer getLayer();

    @Method(selector = "init")
    private native @Pointer long init();

    /**
     * Builds and returns a GMSMapView, with a frame and camera target.
     */
    public GMSMapView (@ByVal CGRect frame, GMSCameraPosition camera) {
        super((SkipInit)null);
        initObject(init());
        this.setFrame(frame);
        this.setCamera(camera);
        //initWithMap(frame, camera);
    }



    /* (void)startRendering __GMS_AVAILABLE_BUT_DEPRECATED */
    @Deprecated
    @Method(selector = "startRendering")
    public native void startRendering();

    /* (void)stopRendering __GMS_AVAILABLE_BUT_DEPRECATED */
    @Deprecated
    @Method(selector = "stopRendering")
    public native void stopRendering();

    /**
     * Clears all markup that has been added to the map, including markers,
     * polylines and ground overlays.  This will not clear the visible location dot
     * or reset the current mapType.
     */
    /* (void)clear */
    @Method(selector = "clear")
    public native void clear();

    /**
     * Sets |minZoom| and |maxZoom|. This method expects the minimum to be less than
     * or equal to the maximum, and will throw an exception with name
     * NSRangeException otherwise.
     */
    /* (void)setMinZoom:(float)minZoom maxZoom:(float)maxZoom */
    @Method(selector = "setMinZoom:maxZoom")
    public native void setMinZoom(float minZoom, float maxZoom);

    /**
     * Build a GMSCameraPosition that presents |bounds| with |padding|. The camera
     * will have a zero bearing and tilt (i.e., facing north and looking directly at
     * the Earth). This takes the frame and padding of this GMSMapView into account.
     *
     * If the bounds is nil or invalid this method will return a nil camera.
     */
    /*
     * (GMSCameraPosition *)cameraForBounds:(GMSCoordinateBounds *)bounds
     * insets:(UIEdgeInsets)insets 
     */
    @Method(selector = "cameraForBounds:insets:")
    public native GMSCameraPosition getCameraForBounds (GMSCoordinateBounds bounds, UIEdgeInsets insets);

    /**
     * Changes the camera according to |update|.
     * The camera change is instantaneous (with no animation).
     */
    /* (void)moveCamera:(GMSCameraUpdate *)update */
    @Method(selector = "moveCamera:")
    public native void moveCamera(GMSCameraUpdate update);


}