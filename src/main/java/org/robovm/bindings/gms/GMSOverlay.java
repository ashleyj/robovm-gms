package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Bridge;

/**
 * GMSOverlay is an abstract class that represents some overlay that may be
 * attached to a specific GMSMapView. It may not be instantiated directly;
 * instead, instances of concrete overlay types should be created directly
 * (such as GMSMarker, GMSPolyline, and GMSPolygon).
 *
 * This supports the NSCopying protocol; [overlay_ copy] will return a copy
 * of the overlay type, but with |map| set to nil.
 */
@NativeClass
public class GMSOverlay extends NSObject {

    protected GMSOverlay(SkipInit skipInit) { super(skipInit); }


    /**
     * Title, a short description of the overlay. Some overlays, such as markers,
     * will display the title on the map. The title is also the default
     * accessibility text.
     */
    /* @property(nonatomic, copy) NSString *title */
    @Property(selector = "title")
    public native String getTitle();

    @Property(selector = "setTitle:")
    public native void setTitle(String title);


    /**
     * The map this overlay is on. Setting this property will add the overlay to the
     * map. Setting it to nil removes this overlay from the map. An overlay may be
     * active on at most one map at any given time.
     */
    /* @property(nonatomic, weak) GMSMapView *map */
    @Property(selector = "map")
    public native GMSMapView getMap();

    @Property(selector = "setMap:", strongRef = true)
    public native void setMap(GMSMapView map);

    /**
     * If this overlay should cause tap notifications. Some overlays, such as
     * markers, will default to being tappable.
     */
    /* @property(nonatomic, assign, getter=isTappable) BOOL tappable */
    @Method(selector = "isTappable")
    public native boolean getTappable();

    @Property(selector = "setTappable:")
    public native void setTappable(boolean value);

    /**
     * Higher |zIndex| value overlays will be drawn on top of lower |zIndex|
     * value tile layers and overlays.  Equal values result in undefined draw
     * ordering.  Markers are an exception that regardless of |zIndex|, they will
     * always be drawn above tile layers and other non-marker overlays; they
     * are effectively considered to be in a separate z-index group compared to
     * other overlays.
     */
    /* @property(nonatomic, assign) int zIndex */
    @Property(selector = "zIndex")
    public native int getZIndex();

    @Property(selector = "setZIndex:")
    public native void setMap(int setZIndex);
}