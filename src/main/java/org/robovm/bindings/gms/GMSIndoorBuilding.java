package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Bridge;
import org.robovm.rt.bro.annotation.MachineSizedUInt;

/**
 * Describes a building which contains levels.
 */
@NativeClass
public class GMSIndoorBuilding extends NSObject {

    /**
     * Array of GMSIndoorLevel describing the levels which make up the building.
     * The levels are in 'display order' from top to bottom.
     */
    /* @property(nonatomic, strong, readonly) NSArray *levels */
    @Property(selector= "levels")
    public native NSArray getLevels();

    /**
     * Index in the levels array of the default level.
     */
    /* @property(nonatomic, assign, readonly) NSUInteger defaultLevelIndex */
    @Property(selector= "defaultLevelIndex")
    public native @MachineSizedUInt long getDefaultLevelIndex();

    /**
     * If YES, the building is entirely underground and supports being hidden.
     */
    /* @property(nonatomic, assign, readonly, getter=isUnderground) BOOL underground */
    private static final Selector underground$ = Selector.register("isUnderground");

    @Bridge
    private native static boolean objc_underground(GMSIndoorBuilding __self__, Selector __cmd__);

    public boolean isUnderground() {
        return objc_underground(this, underground$);
    }



}