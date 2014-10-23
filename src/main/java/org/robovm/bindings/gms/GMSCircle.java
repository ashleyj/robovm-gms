package org.robovm.bindings.gms;

import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.uikit.UIColor;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.MachineSizedFloat;
import org.robovm.rt.bro.annotation.Pointer;

/**
 * A circle on the Earth's surface (spherical cap).
 */
@Library("CoreLocation")
@NativeClass
public class GMSCircle extends GMSOverlay {

    /** Position on Earth of circle center. */
    /* @property(nonatomic, assign) CLLocationCoordinate2D position */
    @Property(selector = "position")
    public native @ByVal CLLocationCoordinate2D getPosition();

    @Property(selector="setPosition:")
    public native void setPosition(CLLocationCoordinate2D position);

    /** Radius of the circle in meters; must be positive. */
    /* @property(nonatomic, assign) CLLocationDistance radius */
    @Property(selector = "radius")
    public native double getRadius();

    @Property(selector="setRadius:", strongRef = true)
    public native void setRadius(double radius);

    /**
     * The width of the circle's outline in screen points. Defaults to 1. As per
     * GMSPolygon, the width does not scale when the map is zoomed.
     * Setting strokeWidth to 0 results in no stroke.
     */
    /* @property(nonatomic, assign) CGFloat strokeWidth */
    @Property(selector = "strokeWidth")
    public native @MachineSizedFloat float getStrokeWidth();

    @Property(selector="setStrokeWidth:", strongRef = true)
    public native void setPosition(@MachineSizedFloat float strokeWidth);

    /** The color of this circle's outline. The default value is black. */
    /* @property(nonatomic, strong) UIColor *strokeColor */
    @Property(selector= "strokeColor")
    public native UIColor getStrokeColor();

    @Property(selector="setStrokeColor:")
    public native void setPosition(UIColor strokeColor);

    /**
     * The interior of the circle is painted with fillColor.
     * The default value is nil, resulting in no fill.
     */
    /* @property(nonatomic, strong) UIColor *fillColor */
    @Property(selector= "fillColor")
    public native UIColor getFillColor();

    @Property(selector="setFillColor:")
    public native void setFillColor(UIColor color);

    @Method(selector = "id")
    private static native @Pointer long init();


    /**
     * Convenience constructor for GMSCircle for a particular position and radius.
     * Other properties will have default values.
     */
    /* (instancetype)circleWithPosition:(CLLocationCoordinate2D)position
     * radius:(CLLocationDistance)radius
     */
    public GMSCircle (@ByVal CLLocationCoordinate2D position, double radius) {
        super((SkipInit) null);
        initObject(init());
        this.setPosition(position);
        this.setRadius(radius);
    }

}