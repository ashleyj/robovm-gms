package org.robovm.bindings.gms;

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.corelocation.CLLocationCoordinate2D;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.MachineSizedUInt;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class GMSPath extends NSObject {

    @Property(selector = "setEncodedPath:")
    private native void setEncodedPath(String path);

    protected GMSPath(SkipInit skipInit) { super(skipInit); }

    @Method(selector = "init")
    private native @Pointer long init();

    /* (instancetype)path */
    public GMSPath() {
        super((SkipInit)null);
        initObject(init());
    }



    /* (id)initWithPath:(GMSPath *)path; */
    @Method(selector = "initWithPath:")
    private native @Pointer long init(GMSPath path);

    public GMSPath(GMSPath path) {
        super((SkipInit)null);
        initObject(init(path));
    }

    /* (NSUInteger)count */
    @Method(selector = "count")
    public native @MachineSizedUInt long getCount();

    /* (CLLocationCoordinate2D)coordinateAtIndex:(NSUInteger)index */
    @Method(selector = "coordinateAtIndex:")
    public native @ByVal CLLocationCoordinate2D coordinateAtIndex(@MachineSizedUInt long index);

    /* (instancetype)pathFromEncodedPath:(NSString *)encodedPath */
    public GMSPath(String encodedPath) {
        super((SkipInit)null);
        initObject(init(new GMSPath()));
        setEncodedPath(encodedPath);
    }

    /* (NSString *)encodedPath */
    @Method(selector = "encodedPath")
    public native String getEncodedPath();

    /*
     * (instancetype)pathOffsetByLatitude:(CLLocationDegrees)deltaLatitude
     * longitude:(CLLocationDegrees)deltaLongitude;
     */
    @Method(selector = "pathOffsetByLatitude:longitude:")
    private native @Pointer long init(double deltaLatitude, double deltaLongitude);

    public GMSPath(double deltaLatitude, double deltaLongitude) {
        super((SkipInit)null);
        initObject(init(deltaLatitude, deltaLongitude));
    }


}