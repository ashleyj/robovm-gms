package org.robovm.bindings.gms;

import org.robovm.bindings.gms.GMSTileLayer;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class GMSURLTileLayer extends GMSTileLayer {

    @Method(selector = "init")
    private native @Pointer long init();

    public GMSURLTileLayer(GMSURLTileLayer constructor) {

    }

    /** Convenience constructor. |constructor| must be non-nil. */
    /* (instancetype)tileLayerWithURLConstructor:(GMSTileURLConstructor)constructor*/
    //@Method(selector = "tileLayerWithURLConstructor:constructor")

    /**
     * Specify the user agent to describe your application. If this is nil (the
     * default), the default iOS user agent is used for HTTP requests.
     */
    /* @property(nonatomic, copy) NSString *userAgent */
    @Property(selector = "userAgent")
    public native String getUserAgent();

    @Property(selector = "setUserAgent:")
    public native void setUserAgent(String userAgent);
}