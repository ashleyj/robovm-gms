package org.robovm.bindings.gms;

import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.uikit.UIImage;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Bridge;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.Pointer;

/**
 * A marker is an icon placed at a particular point on the map's surface. A
 * marker's icon is drawn oriented against the device's screen rather than the
 * map's surface; i.e., it will not necessarily change orientation due to map
 * rotations, tilting, or zooming.
 */
@Library(Library.INTERNAL)
@NativeClass
public class GMSMarker extends GMSOverlay {

    @Method(selector = "init")
    private native @Pointer long init();

    public GMSMarker() {
        super((SkipInit)null);
        initObject(init());
    }

    /** Marker position. Animated. */
    /* @property(nonatomic, assign) CLLocationCoordinate2D position */
    @Property(selector ="position")
    public native @ByVal CLLocationCoordinate2D getPosition();

    @Property(selector ="setPosition:", strongRef = true)
    public native void setPosition(@ByVal CLLocationCoordinate2D position);

    /** Snippet text, shown beneath the title in the info window when selected. */
    /* @property(nonatomic, copy) NSString*snippet */
    @Property(selector ="snippet")
    public native String getSnippet();

    @Property(selector ="setSnippet:", strongRef = true)
    public native void setSnippet(String snippet);

    /**
     * Marker icon to render. If left nil, uses a default SDK place marker.
     *
     * Supports animated images, but each frame must be the same size or the
     * behavior is undefined.
     *
     * Supports the use of alignmentRectInsets to specify a reduced tap area.  This
     * also redefines how anchors are specified.  For an animated image the
     * value for the animation is used, not the individual frames.
     */
    /* @property(nonatomic, strong) UIImage*icon */
    @Property(selector ="icon")
    public native UIImage getIcon();

    @Property(selector ="setIcon:")
    public native void setIcon(UIImage snippet);

    /**
     * The ground anchor specifies the point in the icon image that is anchored to
     * the marker's position on the Earth's surface. This point is specified within
     * the continuous space [0.0, 1.0] x [0.0, 1.0], where (0,0) is the top-left
     * corner of the image, and (1,1) is the bottom-right corner.
     *
     * If the image has non-zero alignmentRectInsets, the top-left and bottom-right
     * mentioned above refer to the inset section of the image.
     */
    /* @property(nonatomic, assign) CGPoint groundAnchor */
    @Property(selector ="groundAnchor")
    public native CGPoint getGroundAnchor();

    @Property(selector ="setGroundAnchor:", strongRef = true)
    public native void setGroundAnchor(CGPoint groundAnchor);

    /**
     * The info window anchor specifies the point in the icon image at which to
     * anchor the info window, which will be displayed directly above this point.
     * This point is specified within the same space as groundAnchor.
     */
    /* @property(nonatomic, assign) CGPoint infoWindowAnchor */
    @Property(selector ="infoWindowAnchor")
    public native CGPoint getInfoWindowAnchor();

    @Property(selector ="setInfoWindowAnchor:", strongRef = true)
    public native void setInfoWindowAnchor(CGPoint infoWindowAnchor);

    /**
     * Controls the animation used when this marker is placed on a GMSMapView
     * (default kGMSMarkerAnimationNone, no animation).
     */
    /* @property(nonatomic, assign) GMSMarkerAnimation appearAnimation */
    @Property(selector ="appearAnimation")
    public native GMSMarkerAnimation getAppearAnimation();

    @Property(selector ="setAppearAnimation:", strongRef = true)
    public native void setAppearAnimation(GMSMarkerAnimation appearAnimation);

    /**
     * Controls whether this marker can be dragged interactively (default NO).
     */
    /* @property(nonatomic, assign, getter=isDraggable) BOOL draggable */
    @Method(selector = "isDraggable")
    public native boolean getDraggable();

    @Property(selector = "setDraggable:", strongRef = true)
    public native void setDraggable (boolean value);

    /**
     * Controls whether this marker should be flat against the Earth's surface (YES)
     * or a billboard facing the camera (NO, default).
     */
    /* @property(nonatomic, assign, getter=isFlat) BOOL flat */
    @Method(selector = "isFlat")
    public native boolean getFlat();

    @Property(selector = "setFlat:", strongRef = true)
    public native void setFlat (boolean value);

    /**
     * Sets the rotation of the marker in degrees clockwise about the marker's
     * anchor point. The axis of rotation is perpendicular to the marker. A rotation
     * of 0 corresponds to the default position of the marker. Animated.
     *
     * When the marker is flat on the map, the default position is north aligned and
     * the rotation is such that the marker always remains flat on the map. When the
     * marker is a billboard, the default position is pointing up and the rotation
     * is such that the marker is always facing the camera.
     */
    /* @property(nonatomic, assign) CLLocationDegrees rotation */
    @Property(selector ="rotation")
    public native double getRotation();

    @Property(selector ="setRotation:", strongRef = true)
    public native void setRotation(double rotation);

    /**
     * Sets the opacity of the marker, between 0 (completely transparent) and 1
     * (default) inclusive.
     */
    /* @property(nonatomic, assign) float opacity */
    @Property(selector ="opacity")
    public native float getOpacity();

    @Property(selector ="setOpacity:", strongRef = true)
    public native void setOpacity(float opacity);

    /**
     * Marker data. You can use this property to associate an arbitrary object with
     * this marker. Google Maps SDK for iOS neither reads nor writes this property.
     *
     * Note that userData should not hold any strong references to any Maps
     * objects, otherwise a loop may be created (preventing ARC from releasing
     * objects).
     */
    /* @property(nonatomic, strong) id userData */
    @Property(selector ="userData")
    public native NSObject getUserData();

    @Property(selector ="setUserData:")
    public native void setUserData(NSObject userData);

    /**
     * Provides the Core Animation layer for this GMSMarker.
     */
    /* @property(nonatomic, strong, readonly) GMSMarkerLayer *layer */
    @Property(selector ="layer")
    public native GMSMarkerLayer getLayer();

    /**
     * The |panoramaView| specifies which panorama view will attempt to show this
     * marker.  Note that if the marker's |position| is too far away from the
     * |panoramaView|'s current panorama location, it will not be displayed as it
     * will be too small.
     * Can be set to nil to remove the marker from any current panorama view it
     * is attached to.
     * A marker can be shown on both a panorama and a map at the same time.
     */
    /* @property(nonatomic, weak) GMSPanoramaView *panoramaView */
    @Property(selector ="panoramaView")
    public native GMSPanoramaView getPanoramaView();

    @Property(selector ="setPanoramaView:", strongRef = true)
    public native void setPanoramaView(GMSPanoramaView panoramaView);


}