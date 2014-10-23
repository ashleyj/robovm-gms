package org.robovm.bindings.gms;

import org.robovm.rt.bro.ValuedEnum;
  /*
     *  typedef enum {
     *  kGMSMarkerAnimationNone = 0,
     *  kGMSMarkerAnimationPop,
     * } GMSMarkerAnimation;
     */
public enum GMSMarkerAnimation implements ValuedEnum {

    None(0),
    Pop(1);

    private final long n;

    private GMSMarkerAnimation(long n) {
        this.n = n;
    }

    @Override
    public long value() {
        return n;
    }
}