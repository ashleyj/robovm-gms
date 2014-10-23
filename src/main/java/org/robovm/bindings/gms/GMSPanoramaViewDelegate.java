package org.robovm.bindings.gms;


import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.rt.bro.annotation.ByVal;

public class GMSPanoramaViewDelegate extends NSObject {
    /*
     * (void)panoramaView:(GMSPanoramaView *)view
     * willMoveToPanoramaID:(NSString *)panoramaID
     */
    @Method(selector = "panoramaView:willMoveToPanoramaID:")
    public native void willMoveToPanoramaID(GMSPanoramaView view, String panoramaID );

    /*
     * (void)panoramaView:(GMSPanoramaView *)view
     * didMoveToPanorama:(GMSPanorama *)panorama
     */
    @Method(selector = "panoramaView:didMoveToPanorama:")
    public native void didMoveToPanorama(GMSPanoramaView view, GMSPanorama panorama );

    /*
     * (void)panoramaView:(GMSPanoramaView *)view
     * didMoveToPanorama:(GMSPanorama *)panorama
     * nearCoordinate:(CLLocationCoordinate2D)coordinate
     */
    @Method(selector = "panoramaView:didMoveToPanorama:nearCoordinate:")
    public native void didMoveToPanorama(GMSPanoramaView view, GMSPanorama panorama, @ByVal CLLocationCoordinate2D coordinate);

    /*
     * (void)panoramaView:(GMSPanoramaView *)view
     * error:(NSError *)error
     * onMoveNearCoordinate:(CLLocationCoordinate2D)coordinate
     */
    @Method(selector = "panoramaView:error:onMoveNearCoordinate:")
    public native void onMoveNearCoordinate(GMSPanoramaView view, NSError error, @ByVal CLLocationCoordinate2D coordinate);


    /* (void)panoramaView:(GMSPanoramaView *)view
     * error:(NSError *)error
     * onMoveToPanoramaID:(NSString *)panoramaID
     */
    @Method(selector = "panoramaView:error:onMoveToPanoramaID:")
    public native void onMoveToPanoramaID(GMSPanoramaView view, NSError error, String panoramaID);

    /*
     * (void)panoramaView:(GMSPanoramaView *)panoramaView
     * didMoveCamera:(GMSPanoramaCamera *)camera
     */
    @Method(selector = "panoramaView:didMoveCamera:")
    public native void didMoveCamera(GMSPanoramaView view, GMSPanoramaCamera camera);


    /* (void)panoramaView:(GMSPanoramaView *)panoramaView didTap:(CGPoint)point */
    @Method(selector = "panoramaView:didTap:")
    public native void didTap(GMSPanoramaView view, CGPoint point);

    /*
     * (BOOL)panoramaView:(GMSPanoramaView *)panoramaView
     * didTapMarker:(GMSMarker *)marker
     */
    @Method(selector = "panoramaView:didTapMarker:")
    public native boolean didTapMarker(GMSPanoramaView view, GMSMarker marker);


}
