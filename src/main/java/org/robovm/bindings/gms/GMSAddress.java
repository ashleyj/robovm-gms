package org.robovm.bindings.gms;


import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Library;


/**
 * A result from a reverse geocode request, containing a human-readable address. This class is
 * immutable and should be obtained via GMSGeocoder.
 *
 * Some of the fields may be nil, indicating they are not present.
 */
@Library("CoreLocation")
@NativeClass
public class GMSAddress extends NSObject {


    /* @property(nonatomic, readonly) CLLocationCoordinate2D coordinate */
    @Property(selector="coordinate")
    public native @ByVal CLLocationCoordinate2D getCoordinate();

    @Property(selector="setCoordinate:")
    public native void setCoordinate(String coordinate);

    /** Street number and name. */
    /* @property(nonatomic, copy, readonly) NSString *thoroughfare */
    @Property(selector = "thoroughfare")
    public native String getThoroughFare();

    @Property(selector = "setThoroughfare:")
    public native void setThoroughFare(String thoroughFare);

    /** Locality or city. */
    /* @property(nonatomic, copy, readonly) NSString *locality */
    @Property(selector= "locality")
    public native String getLocality();

    @Property(selector= "setLocality:")
    public native void setLocality(String locality);

    /** Subdivision of locality, district or park. */
    /*@property(nonatomic, copy, readonly) NSString *subLocality;*/
    @Property(selector= "subLocality")
    public native String getSubLocality();

    @Property(selector= "setSubLocality:")
    public native void setSubLocality(String subLocality);

    /** Region/State/Administrative area. */
    /* @property(nonatomic, copy, readonly) NSString *administrativeArea */
    @Property(selector= "administrativeArea")
    public native String getAdministrativeArea();

    @Property(selector= "setAdministrativeArea:")
    public native void setAdministrativeArea(String administrativeArea);

    /** Postal/Zip code. */
    /* @property(nonatomic, copy, readonly) NSString *postalCode */
    @Property(selector= "postalCode")
    public native String getPostalCode();

    @Property(selector= "setPostalCode:")
    public native void setPostalCode(String postalCode);

    /** The country name. */
    /* @property(nonatomic, copy, readonly) NSString *country */
    @Property(selector= "country")
    public native String getCountry();

    @Property(selector= "setCountry:")
    public native void setCountry(String country);

    /** An array of NSString containing formatted lines of the address. May be nil. */
    /* @property(nonatomic, copy, readonly) NSArray*lines */
    @Property(selector= "lines")
    public native NSArray getLines();

    @Property(selector= "setLines:")
    public native void setLines(NSArray lines);

    /* (NSString *)addressLine1 __GMS_AVAILABLE_BUT_DEPRECATED */
    @Deprecated
    @Method(selector = "addressLine1:")
    public native String getAddressLine1();

    /* (NSString *)addressLine2 __GMS_AVAILABLE_BUT_DEPRECATED */
    @Deprecated
    @Method(selector = "addressLine2:")
    public native String getAddressLine2();
}