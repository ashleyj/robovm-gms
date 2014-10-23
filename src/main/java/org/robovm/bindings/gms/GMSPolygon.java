package org.robovm.bindings.gms;

import org.robovm.apple.uikit.UIColor;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.MachineSizedFloat;
import org.robovm.rt.bro.annotation.Pointer;

/**
 * GMSPolygon defines a polygon that appears on the map. A polygon (like a polyline) defines a
 * series of connected coordinates in an ordered sequence; additionally, polygons form a closed loop
 * and define a filled region.
 */
@NativeClass
public class GMSPolygon extends GMSOverlay {

    /** The path that describes this polygon. The coordinates composing the path must be valid. */
    /* @property(nonatomic, copy) GMSPath *path */
    @Property(selector = "path")
    public native GMSPath getPath();

    @Property(selector = "setPath:")
    public native void setPath(GMSPath path);

    /** The width of the polygon outline in screen points. Defaults to 1. */
    /* @property(nonatomic, assign) CGFloat strokeWidth */
    @Property(selector = "strokeWidth")
    public native @MachineSizedFloat float getStrokeWidth();

    @Property(selector = "setStrokeWidth:", strongRef = true)
    public native void setStrokeWidth(@MachineSizedFloat float strokeWidth);

    /** The color of the polygon outline. Defaults to nil. */
    /* @property(nonatomic, strong) UIColor *strokeColor */
    @Property(selector = "strokeColor")
    public native UIColor getStrokeColor();

    @Property(selector = "setStrokeColor:")
    public native void setStrokeColor(UIColor strokeColor);

    /** The fill color. Defaults to blueColor. */
    /* @property(nonatomic, strong) UIColor *fillColor */
    @Property(selector = "fillColor")
    public native UIColor getFillColor();

    @Property(selector = "setFillColor:")
    public native void setFillColor(UIColor fillColor);

    /** Whether this polygon should be rendered with geodesic correction. */
    /* @property(nonatomic, assign) BOOL geodesic */
    @Property(selector = "geodesic")
    public native boolean getGeodesic();

    @Property(selector = "setGeodesic:")
    public native void setGeodesic(boolean geodesic);

    @Method(selector = "init")
    private native @Pointer long init();

    /* (instancetype)polygonWithPath:(GMSPath *)path */
    @Method(selector = "polygonWithPath:")
    private native @Pointer long init(GMSPath path);

    /**
     * Convenience constructor for GMSPolygon for a particular path. Other properties will have default
     * values.
     */
    public GMSPolygon(GMSPath path) {
        super((SkipInit)null);
        init();
        this.setPath(path);
    }

}