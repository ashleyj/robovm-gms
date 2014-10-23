package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

/**
 * GMSPanoramaCamera is used to control the viewing direction of a GMSPanoramaView. It does not
 * contain information about which particular panorama should be displayed.
 */
@NativeClass
public class GMSPanoramaCamera extends NSObject {


    /*  (id)initWithOrientation:(GMSOrientation)orientation zoom:(float)zoom FOV:(double)FOV */
    @Method(selector = "initWithOrientation:zoom:FOV:")
    private native @Pointer long init(GMSPanoramaView.GMSOrientation orientation, float zoom,double FOV);

    /**
     * Designated initializer. Configures this GMSPanoramaCamera with |orientation|, |zoom| and |FOV|.
     * These values will be clamped to acceptable ranges.
     */
    public GMSPanoramaCamera(GMSPanoramaView.GMSOrientation orientation,
                             float zoom, double FOV) {
        super((SkipInit)null);
        initObject(init(orientation, zoom, FOV));
    }

    /* + (id)cameraWithOrientation:(GMSOrientation)orientation zoom:(float)zoom */
    @Method(selector = "cameraWithOrientation:zoom:")
    private native @Pointer long init(GMSPanoramaView.GMSOrientation orientation, float zoom);

    /**
     * Convenience constructor specifying heading and pitch as part of |orientation|, plus |zoom| and
     * default field of view (90 degrees).
     */
    public GMSPanoramaCamera(GMSPanoramaView.GMSOrientation orientation,
                             float zoom) {
        super((SkipInit)null);
        initObject(init(orientation, zoom));
    }

    /* + (id)cameraWithHeading:(CLLocationDirection)heading pitch:(double)pitch zoom:(float)zoom */
    @Method(selector = "cameraWithHeading:pitch:zoom:")
    private native @Pointer long init(double heading, double pitch, float zoom);

    /**
     * Convenience constructor specifying |heading|, |pitch|, |zoom| with default field of view (90
     * degrees).
     */
    public GMSPanoramaCamera(double heading, double pitch, float zoom) {
        super((SkipInit)null);
        initObject(init(heading, pitch, zoom));
    }

    /* + (id)cameraWithOrientation:(GMSOrientation)orientation zoom:(float)zoom FOV:(double)FOV */
    @Method(selector = "cameraWithOrientation:zoom:FOV:")
    private native @Pointer long init(double heading, float zoom, double FOV);

    /**
     * Convenience constructor for GMSPanoramaCamera, specifying all camera properties with heading and
     * pitch as part of |orientation|.
     */
    public GMSPanoramaCamera(double heading, float zoom, double FOV) {
        super((SkipInit)null);
        initObject(init(heading, zoom, FOV));
    }


    /*
     * (id)cameraWithHeading:(CLLocationDirection)heading
     * pitch:(double)pitch
     * zoom:(float)zoom
     * FOV:(double)FOV;
     */
    @Method(selector = "cameraWithHeading:pitch:zoom:FOV")
    private native @Pointer long init(double heading, double pitch, float zoom, double FOV);

    /**
     * Convenience constructor for GMSPanoramaCamera, specifying all camera properties.
     */
    public GMSPanoramaCamera(double heading, double pitch, float zoom, double FOV) {
        super((SkipInit)null);
        initObject(init(heading, pitch, zoom, FOV));
    }

    /**
     * The field of view (FOV) encompassed by the larger dimension (width or height) of the view in
     * degrees. This is clamped to the range [1, 160] degrees, and has a default value of 90.
     *
     * Lower FOV values produce a zooming in effect; larger FOV values produce an fisheye effect.
     */
    /* @property(nonatomic, assign, readonly) double FOV */
    @Property(selector = "FOV")
    public native double getFOV();

    /**
     * Adjusts the visible region of the screen.  A zoom of N will show the same area as the central
     * width/N height/N area of what is shown at zoom 1.
     *
     * Zoom is clamped to the implementation defined range [1, 5].
     */
    /* @property(nonatomic, assign, readonly) float zoom */
    @Property(selector = "zoom")
    public native double getZoom();

    /**
     * The camera orientation, which groups together heading and pitch.
     */
    /* @property(nonatomic, assign, readonly) GMSOrientation orientation */
    @Property(selector = "orientation")
    public native double getOrientation();

}