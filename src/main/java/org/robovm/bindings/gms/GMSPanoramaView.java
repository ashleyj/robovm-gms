package org.robovm.bindings.gms;

import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.uikit.UIView;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Pointer;
import org.robovm.rt.bro.annotation.StructMember;

@NativeClass
public class GMSPanoramaView extends UIView {

   /*
    *  typedef struct {
    *    const CLLocationDirection heading;
    *    const double pitch;
    * } GMSOrientation;
    */
    public class GMSOrientation extends Struct<GMSOrientation> {
        private GMSOrientation() {}

        @StructMember(0)
        public native @ByVal double heading();

        @StructMember(1)
        public native @ByVal double pitch();
    }

    /* @property(nonatomic, strong) GMSPanorama *panorama */
    @Property(selector = "panorama")
    public native GMSPanorama getPanorama();

    @Property(selector = "setPanorama")
    public native void setPanorama(GMSPanorama panorama);

    /* @property(nonatomic, weak) id<GMSPanoramaViewDelegate> delegate */
    @Property(selector = "delegate")
    public native GMSPanorama getDelegate();

    @Property(selector = "setDelegate:")
    public native void setDelegate(GMSPanoramaViewDelegate delegate);

    /* (void)setAllGesturesEnabled:(BOOL)enabled */
    @Property(selector = "setAllGesturesEnabled:")
    public native void setAllGesturesEnabled(boolean value);

    /* @property(nonatomic, assign) BOOL orientationGestures */
    @Property(selector = "orientationGestures")
    public native boolean getOrientationGestures();

    @Property(selector = "setOrientationGestures:", strongRef = true)
    public native void setOrientationGestures(boolean value);

    /* @property(nonatomic, assign) BOOL zoomGestures */
    @Property(selector = "zoomGestures")
    public native boolean getZoomGestures();

    @Property(selector = "setZoomGestures:", strongRef = true)
    public native void setZoomGestures(boolean value);

    /* @property(nonatomic, assign) BOOL navigationGestures */
    @Property(selector = "navigationGestures")
    public native boolean getNavigationGestures();

    @Property(selector = "setNavigationGestures:", strongRef = true)
    public native void setNavigationGestures(boolean value);

    /* @property(nonatomic, assign) BOOL navigationLinksHidden */
    @Property(selector = "navigationLinksHidden")
    public native boolean getNavigationLinksHidden();

    @Property(selector = "setNavigationLinksHidden:", strongRef = true)
    public native void setNavigationLinksHidden(boolean value);

    /* @property(nonatomic, assign) BOOL streetNamesHidden */
    @Property(selector = "streetNamesHidden")
    public native boolean getStreetNamesHidden();

    @Property(selector = "setStreetNamesHidden:", strongRef = true)
    public native void setStreetNamesHidden(boolean value);

    /* @property(nonatomic, strong) GMSPanoramaCamera *camera */
    @Property(selector = "camera")
    public native GMSPanoramaCamera getCamera();

    @Property(selector = "setCamera:")
    public native void setCamera(GMSPanoramaCamera camera);

    /* @property(nonatomic, readonly, retain) GMSPanoramaLayer *layer */
    @Property(selector = "layer")
    public native GMSPanoramaLayer getLayer();

    /*
     * (void)animateToCamera:(GMSPanoramaCamera *)camera
     * animationDuration:(NSTimeInterval)duration
     */
    @Method(selector = "animateToCamera:animationDuration:")
    public native void animateToCamera(GMSPanoramaCamera camera, double duration);

    /*
     * (void)updateCamera:(GMSPanoramaCameraUpdate *)cameraUpdate
     * animationDuration:(NSTimeInterval)duration
     */
    @Method(selector = "updateCamera:animationDuration:")
    public native void animateToCamera(GMSPanoramaCameraUpdate cameraUpdate, double duration);

    /* (void)moveNearCoordinate:(CLLocationCoordinate2D)coordinate */
    @Method(selector = "moveNearCoordinate:")
    public native void moveNearCoordinate(@ByVal CLLocationCoordinate2D coordinate);

    /* (void)moveNearCoordinate:(CLLocationCoordinate2D)coordinate
    radius:(NSUInteger)radius */
    @Method(selector = "moveNearCoordinate:radius:")
    public native void moveNearCoordinate(@ByVal CLLocationCoordinate2D coordinate, int radius);

    /* (void)moveToPanoramaID:(NSString *)panoramaID */
    @Method(selector = "moveToPanoramaID:")
    public native void moveToPanoramaID(String panoramaID);

    /* (CGPoint)pointForOrientation:(GMSOrientation)orientation */
    @Method(selector = "pointForOrientation:")
    public native CGPoint pointForOrientation(GMSOrientation orientation);

    /* (GMSOrientation)orientationForPoint:(CGPoint)point */
    @Method(selector = "orientationForPoint:")
    public native CGPoint orientationForPoint(CGPoint point);


    /*
     * (instancetype)panoramaWithFrame:(CGRect)frame
     * nearCoordinate:(CLLocationCoordinate2D)coordinate
     * radius:(NSUInteger)radius
     */
    public GMSPanoramaView(@ByVal CGRect frame, @ByVal CLLocationCoordinate2D coordinate,
                           int radius) {
        super((SkipInit)null);
        initObject(initWithFrame$(frame));
        moveNearCoordinate(coordinate, radius);
    }

    /*
  * (instancetype)panoramaWithFrame:(CGRect)frame
  * nearCoordinate:(CLLocationCoordinate2D)coordinate
  */
    public GMSPanoramaView(@ByVal CGRect frame, @ByVal CLLocationCoordinate2D coordinate) {
        super((SkipInit)null);
        initObject(initWithFrame$(frame));
        moveNearCoordinate(coordinate);
    }
}