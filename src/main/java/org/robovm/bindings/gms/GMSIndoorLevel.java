package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSString;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

/**
 * Describes a single level in a building.
 * Multiple buildings can share a level - in this case the level instances will
 * compare as equal, even though the level numbers/names may be different.
 */
@NativeClass
public class GMSIndoorLevel extends NSObject {

    /** Localized display name for the level, e.g. "Ground floor". */
    /* @property(nonatomic, copy, readonly) NSString *name */
    @Property(selector= "name")
    public native NSString getName();

    /** Localized short display name for the level, e.g. "1". */
    /* @property(nonatomic, copy, readonly) NSString *shortName */
    @Property(selector= "shortName")
    public native NSString getShortName();

}