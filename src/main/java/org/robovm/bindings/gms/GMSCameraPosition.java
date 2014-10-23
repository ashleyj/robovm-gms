package org.robovm.bindings.gms;

import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.*;


/**
 * An immutable class that aggregates all camera position parameters.
 */

@NativeClass
public class GMSCameraPosition extends NSObject {

    /**
     * Location on the Earth towards which the camera points.
     */
    /* @property(nonatomic, readonly) CLLocationCoordinate2D target */
    @Property(selector="target") public native @ByVal CLLocationCoordinate2D getTarget();

    /**
     * Zoom level. Zoom uses an exponentional scale, where zoom 0 represents the entire world as a
     * 256 x 256 square. Each successive zoom level increases magnification by a factor of 2. So at
     * zoom level 1, the world is 512x512, and at zoom level 2, the entire world is 1024x1024.
     */
    /* @property(nonatomic, readonly) float zoom */
    @Property(selector = "zoom")
    public native float getZoom();

    /**
     * Bearing of the camera, in degrees clockwise from true north.
     */
    /* @property(nonatomic, readonly) CLLocationDirection bearing*/
    @Property(selector = "bearing")
    public native double getBearing();

    /**
     * The angle, in degrees, of the camera angle from the nadir (directly facing the Earth). 0 is
     * straight down, 90 is parallel to the ground. Note that the maximum angle allowed is 45 degrees.
     */
    /* @property(nonatomic, readonly) double viewingAngle */
    @Property(selector = "viewingAngle")
    public native double getViewingAngle();


    /*
    * +(id)initWithTarget:(CLLocationCoordinate2D)target
    * zoom:(float)zoom
    * bearing:(CLLocationDirection)bearing
    * viewingAngle:(double)viewingAngle;
    */

    @Method(selector = "initWithTarget:zoom:bearing:viewingAngle:")
    private native @Pointer long init(@ByVal CLLocationCoordinate2D target, float zoom, double bearing, double viewingAngle);

    /**
     * Designated initializer. Configures this GMSCameraPosition with all available camera properties.
     * Building a GMSCameraPosition via this initializer (or by the following convenience constructors)
     * will implicitly clamp camera values.
     *
     * @param target location on the earth which the camera points
     * @param zoom the zoom level near the center of the screen
     * @param bearing of the camera in degrees from true north
     * @param viewingAngle in degrees, of the camera angle from the nadir
     */
    public GMSCameraPosition (@ByVal CLLocationCoordinate2D target, float zoom,
                              double bearing, double viewingAngle) {
        super((SkipInit)null);
        initObject(init(target, zoom, bearing, viewingAngle));
    }


    /**
     * Convenience constructor for GMSCameraPosition for a particular target and zoom level. This will
     * set the bearing and viewingAngle properties of this camera to zero defaults (i.e., directly
     * facing the Earth's surface, with the top of the screen pointing north).
     */
    /* (instancetype)cameraWithTarget:(CLLocationCoordinate2D)target zoom:(float)zoom;*/
    public GMSCameraPosition(@ByVal CLLocationCoordinate2D target, float zoom) {
        super((SkipInit) null);
        initObject(init(target, zoom, 0, 0));
    }

    /**
     * Convenience constructor for GMSCameraPosition, as per cameraWithTarget:zoom:.
     */
    /*
     * (instancetype)cameraWithLatitude:(CLLocationDegrees)latitude
     *                    longitude:(CLLocationDegrees)longitude
     *                         zoom:(float)zoom;
     */
    public GMSCameraPosition (double latitude, double longitude, float zoom) {
        super((SkipInit) null);
        initObject(init(new CLLocationCoordinate2D(latitude,longitude),zoom, 0, 0));
    }


    /**
     * Convenience constructor for GMSCameraPosition, with latitude/longitude and all other camera
     * properties as per initWithTarget:zoom:bearing:viewingAngle:.
     */
    /*
    * (instancetype)cameraWithLatitude:(CLLocationDegrees)latitude
    * longitude:(CLLocationDegrees)longitude
    * zoom:(float)zoom
    * bearing:(CLLocationDirection)bearing
    * viewingAngle:(double)viewingAngle;
    */
    public GMSCameraPosition (double latitude, double longitude,
                              float zoom, double bearing, double viewingAngle) {
        super((SkipInit) null);
        initObject(init(new CLLocationCoordinate2D(latitude, longitude), zoom, bearing, viewingAngle));
    }


    /**
     * Get the zoom level at which |meters| distance, at given |coord| on Earth, correspond to the
     * specified number of screen |points|.
     *
     * For extremely large or small distances the returned zoom level may be smaller or larger than the
     * minimum or maximum zoom level allowed on the camera.
     *
     * This helper method is useful for building camera positions that contain specific physical areas
     * on Earth.
     */
    /*
    * (float)zoomAtCoordinate:(CLLocationCoordinate2D)coordinate
    * forMeters:(CLLocationDistance)meters
    * perPoints:(CGFloat)points;
    */
    @Method(selector = "zoomAtCoordinate:forMeters:perPoints")
    public static native float zoomAtCoordinate(CLLocationCoordinate2D coordinate, double meters, @MachineSizedFloat float points);


    @NativeClass
    public static class GMSMutableCameraPosition extends GMSCameraPosition {

        public GMSMutableCameraPosition(@ByVal CLLocationCoordinate2D target, float zoom, double bearing, double viewingAngle) {
            super(target, zoom, bearing, viewingAngle);
        }

        /* @property(nonatomic, readonly) CLLocationCoordinate2D target */
        @Property(selector="target")
        public native @ByVal CLLocationCoordinate2D getTarget();

        @Property(selector="setTarget")
        public native void setTarget(@ByVal CLLocationCoordinate2D target);

        /* @property(nonatomic, readonly) float zoom */
        @Property(selector = "zoom")
        public native float getZoom();

        @Property(selector = "setZoom:")
        public native void setZoom(float zoom);

        /* @property(nonatomic, readonly) CLLocationDirection bearing*/
        @Property(selector = "bearing")
        public native double getBearing();

        @Property(selector = "setBearing:")
        public native void setBearing(double bearing);

        /* @property(nonatomic, readonly) double viewingAngle */
        @Property(selector = "viewingAngle")
        public native double getViewingAngle();

        @Property(selector = "setViewingAngle:")
        public native void setViewingAngle(double viewingAngle);

    }



}