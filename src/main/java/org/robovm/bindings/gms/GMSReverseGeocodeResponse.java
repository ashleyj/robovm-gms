package org.robovm.bindings.gms;


import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;

public class GMSReverseGeocodeResponse extends NSObject {
    /** Returns the first result, or nil if no results were available. */
    /* (GMSAddress *)firstResult */
    @Method(selector = "firstResult")
    public native GMSAddress getFirstResult();

    /** Returns an array of all the results (contains GMSAddress), including the first result. */
    /* (NSArray *)results */
    @Method(selector = "results")
    public native NSArray getResults();
}
