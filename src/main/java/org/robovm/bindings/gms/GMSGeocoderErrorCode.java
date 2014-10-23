package org.robovm.bindings.gms;

import org.robovm.rt.bro.ValuedEnum;
  /*
    * typedef NS_ENUM(NSInteger, GMSGeocoderErrorCode) {
    *    kGMSGeocoderErrorInvalidCoordinate = 1,
    *            kGMSGeocoderErrorInternal,
    * };
    */
public enum GMSGeocoderErrorCode implements ValuedEnum {

    InvalidCoordinate(1),
    Internal(2);

    private final long n;

    private GMSGeocoderErrorCode(long n) {
        this.n = n;
    }
    @Override
    public long value() {
        return n;
    }
}
