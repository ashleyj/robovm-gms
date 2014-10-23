package org.robovm.bindings.gms;


import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;
import org.robovm.rt.bro.annotation.ByVal;

public interface GMSMapViewDelegate extends NSObjectProtocol {

    /**
     * Called before the camera on the map changes, either due to a gesture,
     * animation (e.g., by a user tapping on the "My Location" button) or by being
     * updated explicitly via the camera or a zero-length animation on layer.
     *
     * @param gesture If YES, this is occuring due to a user gesture.
     */
    /* (void)mapView:(GMSMapView *)mapView willMove:(BOOL)gesture;*/
    @Method(selector = "mapView:willMove:")
    void willMove(GMSMapView mapView, boolean gesture);

    /**
     * Called repeatedly during any animations or gestures on the map (or once, if
     * the camera is explicitly set). This may not be called for all intermediate
     * camera positions. It is always called for the final position of an animation
     * or gesture.
     */
    /*
     * (void)mapView:(GMSMapView *)mapView
     * didChangeCameraPosition:(GMSCameraPosition *)position;
     */
    @Method(selector = "mapView:didChangeCameraPosition:")
    void didChangeCameraPosition(GMSMapView mapView, GMSCameraPosition position);

    /**
     * Called when the map becomes idle, after any outstanding gestures or
     * animations have completed (or after the camera has been explicitly set).
     */
    /*
     * (void)mapView:(GMSMapView *)mapView
     * idleAtCameraPosition:(GMSCameraPosition *)position;
     */
    @Method(selector = "mapView:idleAtCameraPosition:")
    void idleAtCameraPosition(GMSMapView mapView, GMSCameraPosition position);

    /**
     * Called after a tap gesture at a particular coordinate, but only if a marker
     * was not tapped.  This is called before deselecting any currently selected
     * marker (the implicit action for tapping on the map).
     */
    /*
     * (void)mapView:(GMSMapView *)mapView
     * didTapAtCoordinate:(CLLocationCoordinate2D)coordinate;
     */
    @Method(selector = "mapView:didTapAtCoordinate:")
    void didTapAtCoordinate(GMSMapView mapView, @ByVal CLLocationCoordinate2D coordinate);

    /**
     * Called after a long-press gesture at a particular coordinate.
     *
     * @param mapView The map view that was pressed.
     * @param coordinate The location that was pressed.
     */
    /*
     * (void)mapView:(GMSMapView *)mapView
     * didLongPressAtCoordinate:(CLLocationCoordinate2D)coordinate;
     */
    @Method(selector = "mapView:didLongPressAtCoordinate:")
    void didLongPressAtCoordinate(GMSMapView mapView, @ByVal CLLocationCoordinate2D coordinate);

    /**
     * Called after a marker has been tapped.
     *
     * @param mapView The map view that was pressed.
     * @param marker The marker that was pressed.
     * @return YES if this delegate handled the tap event, which prevents the map
     *         from performing its default selection behavior, and NO if the map
     *         should continue with its default selection behavior.
     */
    /* (BOOL)mapView:(GMSMapView *)mapView didTapMarker:(GMSMarker *)marker;*/
    @Method(selector = "mapView:didTapMarker:")
    void didTapMarker(GMSMapView mapView, GMSMarker marker);

    /**
     * Called after a marker's info window has been tapped.
     */
    /*
     * (void)mapView:(GMSMapView *)mapView
     * didTapInfoWindowOfMarker:(GMSMarker *)marker;
     */
    @Method(selector = "mapView:didTapInfoWindowOfMarker:")
    void didTapInfoWindowOfMarker(GMSMapView mapView, GMSMarker marker);

    /**
     * Called after an overlay has been tapped.
     * This method is not called for taps on markers.
     *
     * @param mapView The map view that was pressed.
     * @param overlay The overlay that was pressed.
     */
    /* (void)mapView:(GMSMapView *)mapView didTapOverlay:(GMSOverlay *)overlay;*/
    @Method(selector = "mapView:didTapOverlay:")
    void didTapOverlay(GMSMapView mapView, GMSOverlay overlay);

    /**
     * Called when a marker is about to become selected, and provides an optional
     * custom info window to use for that marker if this method returns a UIView.
     * If you change this view after this method is called, those changes will not
     * necessarily be reflected in the rendered version.
     *
     * The returned UIView must not have bounds greater than 500 points on either
     * dimension.  As there is only one info window shown at any time, the returned
     * view may be reused between other info windows.
     *
     * Removing the marker from the map or changing the map's selected marker during
     * this call results in undefined behavior.
     *
     * @return The custom info window for the specified marker, or nil for default
     */
    /* (UIView *)mapView:(GMSMapView *)mapView markerInfoWindow:(GMSMarker *)marker;*/
    @Method(selector = "mapView:markerInfoWindow:")
    void markerInfoWindow(GMSMapView mapView, GMSMarker marker);

    /**
     * Called when mapView:markerInfoWindow: returns nil. If this method returns a
     * view, it will be placed within the default info window frame. If this method
     * returns nil, then the default rendering will be used instead.
     *
     * @param mapView The map view that was pressed.
     * @param marker The marker that was pressed.
     * @return The custom view to disaply as contents in the info window, or null to
     * use the default content rendering instead
     */
    /* (UIView *)mapView:(GMSMapView *)mapView markerInfoContents:(GMSMarker *)marker;*/
    @Method(selector = "mapView:markerInfoContents:")
    void markerInfoContents(GMSMapView mapView, GMSMarker marker);


    /**
     * Called when dragging has been initiated on a marker.
     */
    /* (void)mapView:(GMSMapView *)mapView didBeginDraggingMarker:(GMSMarker *)marker;*/
    @Method(selector = "mapView:didBeginDraggingMarker:")
    void didBeginDraggingMarker(GMSMapView mapView, GMSMarker marker);


    /**
     * Called after dragging of a marker ended.
     */
    /* (void)mapView:(GMSMapView *)mapView didEndDraggingMarker:(GMSMarker *)marker */
    @Method(selector = "mapView:didEndDraggingMarker:")
    void didEndDraggingMarker(GMSMapView mapView, GMSMarker marker);

    /**
     * Called while a marker is dragged.
     */
    /* (void)mapView:(GMSMapView *)mapView didDragMarker:(GMSMarker *)marker */
    @Method(selector = "mapView:didDragMarker:")
    void didDragMarker(GMSMapView mapView, GMSMarker marker);

    /**
     * Called when the My Location button is tapped.
     *
     * @return YES if the listener has consumed the event (i.e., the default behavior should not occur),
     *         NO otherwise (i.e., the default behavior should occur). The default behavior is for the
     *         camera to move such that it is centered on the user location.
     */
    /* (BOOL)didTapMyLocationButtonForMapView:(GMSMapView *)mapView */
    @Method(selector = "mapView:didTapMyLocationButtonForMapView:")
    void didTapMyLocationButtonForMapView(GMSMapView mapView);
}
