package org.robovm.bindings.gms;

import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

/**
 * GMSPanoramaLayer is a custom subclass of CALayer, provided as the layer
 * class on GMSPanoramaView. This layer should not be instantiated directly.
 */
@NativeClass
public class GMSPanoramaLayer extends GMSCALayer {

    /* @property(nonatomic, assign) CLLocationDirection cameraHeading */
    @Property(selector = "cameraHeading")
    public native double getCameraHeading();

    @Property(selector = "setCameraHeading:", strongRef = true)
    public native void setCameraHeading(double cameraHeading);

    /* @property(nonatomic, assign) double cameraPitch */
    @Property(selector = "cameraPitch")
    public native double getCameraPitch();

    @Property(selector = "setCameraPitch:")
    public native void setCameraPitch(double cameraPitch);

    /* @property(nonatomic, assign) float cameraZoom */
    @Property(selector = "cameraZoom")
    public native float getCameraZoom();

    @Property(selector = "setCameraZoom:")
    public native void setCameraZoom(float cameraZoom);

    /* @property(nonatomic, assign) double cameraFOV */
    @Property(selector = "cameraFOV")
    public native double getCameraFOV();

    @Property(selector = "setCameraFOV:")
    public native void setCameraFOV(double cameraFOV);


}