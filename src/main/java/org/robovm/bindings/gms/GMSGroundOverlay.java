package org.robovm.bindings.gms;

import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.uikit.UIImage;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.GlobalValue;
import org.robovm.rt.bro.annotation.MachineSizedFloat;
import org.robovm.rt.bro.annotation.Pointer;

/**
 * GMSGroundOverlay specifies the available options for a ground overlay that
 * exists on the Earth's surface. Unlike a marker, the position of a ground
 * overlay is specified explicitly and it does not face the camera.
 */
@NativeClass
public class GMSGroundOverlay extends GMSOverlay {

    protected GMSGroundOverlay() {
        super((SkipInit)(null));
    }

    @Method(selector = "init")
    private native @Pointer long init();

    /**
     * The position of this GMSGroundOverlay, or more specifically, the physical
     * position of its anchor. If this is changed, |bounds| will be moved around
     * the new position.
     */
    /*@property(nonatomic, assign) CLLocationCoordinate2D position;*/
    @Property(selector= "position")
    public native @ByVal CLLocationCoordinate2D getPosition();

    @Property(selector= "setPosition:", strongRef = true)
    public native void setPosition(@ByVal CLLocationCoordinate2D position);

    /**
     * The anchor specifies where this GMSGroundOverlay is anchored to the Earth in
     * relation to |bounds|. If this is modified, |position| will be set to the
     * corresponding new position within |bounds|.
     */
    /*@property(nonatomic, assign) CGPoint anchor;*/
    @Property(selector= "anchor")
    public native CGPoint getAnchor();

    @Property(selector= "setAnchor:", strongRef = true)
    public native void setAnchor(CGPoint anchor);

    /**
     * Icon to render within |bounds| on the Earth. If this is nil, the overlay will
     * not be visible (unlike GMSMarker which has a default image).
     */
    /*@property(nonatomic, strong) UIImage *icon;*/
    @Property(selector= "icon")
    public native UIImage getIcon();

    @Property(selector= "setIcon:")
    public native void setIcon(UIImage icon);

    /**
     * Bearing of this ground overlay, in degrees. The default value, zero, points
     * this ground overlay up/down along the normal Y axis of the earth.
     */
    /*@property(nonatomic, assign) CLLocationDirection bearing;*/
    @Property(selector= "bearing")
    public native double getBearing();

    @Property(selector= "setBearing:", strongRef = true)
    public native void setBearing(double bearing);

    /**
     * The 2D bounds on the Earth in which |icon| is drawn. Changing this value
     * will adjust |position| accordingly.
     */
    /*@property(nonatomic, strong) GMSCoordinateBounds *bounds;*/
    @Property(selector= "bounds")
    public native GMSCoordinateBounds getBounds();

    @Property(selector= "setBounds:")
    public native void setBounds(GMSCoordinateBounds bounds);

    /**
     * Convenience constructor for GMSGroundOverlay for a particular |bounds| and
     * |icon|. Will set |position| accordingly.
     */
    /*
     * (instancetype)groundOverlayWithBounds:(GMSCoordinateBounds *)bounds
     * icon:(UIImage *)icon;
     */
    public GMSGroundOverlay (GMSCoordinateBounds bounds,UIImage icon) {
        super((SkipInit) null);
        initObject(init());
        this.setBounds(bounds);
        this.setIcon(icon);
    }

    /**
     * Constructs a GMSGroundOverlay that renders the given |icon| at |position|,
     * as if the image's actual size matches camera pixels at |zoomLevel|.
     */
    /*
     * (instancetype)groundOverlayWithPosition:(CLLocationCoordinate2D)position
     * icon:(UIImage *)icon
     * zoomLevel:(CGFloat)zoomLevel;
     */
    public GMSGroundOverlay (CLLocationCoordinate2D position,UIImage icon, float zoom) {
        super((SkipInit) null);
        initObject(init());
        this.setPosition(position);
        this.setIcon(icon);
        //TODO do something with the zoom level
    }


}