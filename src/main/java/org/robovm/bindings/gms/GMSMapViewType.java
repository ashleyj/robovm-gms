package org.robovm.bindings.gms;
    /*typedef enum {
        kGMSTypeNormal = 1,
        kGMSTypeSatellite,
        kGMSTypeTerrain,
        kGMSTypeHybrid,
        kGMSTypeNone,
    } GMSMapViewType;*/

import org.robovm.rt.bro.ValuedEnum;

/**
 * Display types for GMSMapView.
 */
public enum GMSMapViewType implements ValuedEnum {
    /** Basic maps.  The default. */
    Normal(1),
    /** Satellite maps with no labels. */
    Satellite(2),
    /** Terrain maps. */
    Terrain(3),
    /** Satellite maps with a transparent label overview. */
    Hybrid(4),
    /** No maps, no labels.  Display of traffic data is not supported. */
    None(5);

    private final long n;

    private GMSMapViewType (long n) {
        this.n = n;
    }

    @Override
    public long value () {
        return n;
    }
}
