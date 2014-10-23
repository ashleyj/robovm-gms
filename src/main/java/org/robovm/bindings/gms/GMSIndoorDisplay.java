package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

/**
 * Provides ability to observe or control the display of indoor level data.
 *
 * Like GMSMapView, GMSIndoorDisplay may only be used from the main thread.
 */
@NativeClass
public class GMSIndoorDisplay extends NSObject {


    /** GMSIndoorDisplay delegate */
    /* @property(nonatomic, weak) id<GMSIndoorDisplayDelegate> delegate */
    @Property(selector= "delegate")
    public native GMSIndoorDisplayDelegate getDelegate();

    @Property(selector= "setDelegate:", strongRef = true)
    public native void setDelegate(GMSIndoorDisplayDelegate delegate);

    /**
     * Provides the currently focused building, will be nil if there is no
     * building with indoor data currently under focus.
     */
    /* @property(nonatomic, strong, readonly) GMSIndoorBuilding *activeBuilding */
    @Property(selector= "activeBuilding")
    public native GMSIndoorBuilding getActiveBuilding();

    /**
     * Provides and controls the active level for activeBuilding.  Will be updated
     * whenever activeBuilding changes, and may be set to any member of
     * activeBuilding's levels property.  May also be set to nil if the building is
     * underground, to stop showing the building (the building will remain active).
     * Will always be nil if activeBuilding is nil.
     * Any attempt to set it to an invalid value will be ignored.
     */
    /* @property(nonatomic, strong) GMSIndoorLevel *activeLevel */
    @Property(selector= "activeLevel")
    public native GMSIndoorLevel getActiveLevel();


}