package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSString;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.GlobalValue;
import org.robovm.rt.bro.annotation.MachineSizedUInt;

/**
 * GMSTileLayer is an abstract class that allows overlaying of custom image
 * tiles on a specified GMSMapView. It may not be initialized directly, and
 * subclasses must implement the tileForX:y:zoom: method to return tiles.
 *
 * At zoom level 0 the whole world is a square covered by a single tile,
 * and the coordinates |x| and |y| are both 0 for that tile. At zoom level 1,
 * the world is covered by 4 tiles with |x| and |y| being 0 or 1, and so on.
 */
@NativeClass
public class GMSTileLayer extends NSObject {

    /**
     * requestTileForX:y:zoom:receiver: generates image tiles for GMSTileOverlay.
     * It must be overridden by subclasses. The tile for the given |x|, |y| and
     * |zoom| _must_ be later passed to |receiver|.
     *
     * Specify kGMSTileLayerNoTile if no tile is available for this location; or
     * nil if a transient error occured and a tile may be available later.
     *
     * Calls to this method will be made on the main thread. See GMSSyncTileLayer
     * for a base class that implements a blocking tile layer that does not run on
     * your application's main thread.
     */
    /*
     * (void)requestTileForX:(NSUInteger)x
     * y:(NSUInteger)y
     * zoom:(NSUInteger)zoom
     * receiver:(id<GMSTileReceiver>)receiver;
     */
    @Method(selector = "requestTileForX:y:zoom:receiver:")
    public native void requestTile(@MachineSizedUInt long x, @MachineSizedUInt long y,
                                   int zoom, GMSTileReceiver receiver);



    /**
     * Clears the cache so that all tiles will be requested again.
     */
    /* (void)clearTileCache */
    @Method(selector = "clearTileCache")
    public native void clearTileCache();

    /**
     * The map this GMSTileOverlay is displayed on. Setting this property will add
     * the layer to the map. Setting it to nil removes this layer from the map. A
     * layer may be active on at most one map at any given time.
     */
    /* @propperty(nonatomic, weak) GMSMapView *map */
    @Property(selector = "map")
    public native GMSMapView getMap();

    @Property(selector = "getMap:")
    public native void setMap(GMSMapView map);

    /**
     * Higher |zIndex| value tile layers will be drawn on top of lower |zIndex|
     * value tile layers and overlays. Equal values result in undefined draw
     * ordering.
     */
    /* @propperty(nonatomic, assign) int zIndex */
    @Property(selector = "zIndex")
    public native GMSMapView getZIndex();

    @Property(selector = "setZIndex:")
    public native void setZIndex(int zIndex);

    /**
     * Specifies the number of pixels (not points) that the returned tile images
     * will prefer to display as. For best results, this should be the edge
     * length of your custom tiles. Defaults to 256, which is the traditional
     * size of Google Maps tiles.
     *
     * Values less than the equivalent of 128 points (e.g. 256 pixels on retina
     * devices) may not perform well and are not recommended.
     *
     * As an example, an application developer may wish to provide retina tiles
     * (512 pixel edge length) on retina devices, to keep the same number of tiles
     * per view as the default value of 256 would give on a non-retina device.
     */
    /* @propperty(nonatomic, assign) NSInteger tileSize */
    @Property(selector = "tileSize")
    public native int getTileSize();

    @Property(selector = "setTileSize:", strongRef = true)
    public native void setTileSize(int tileSize);

    /**
     * Specifies the opacity of the tile layer. This provides a multiplier for
     * the alpha channel of tile images.
     */
    /* @propperty(nonatomic, assign) float opacity */
    @Property(selector = "opacity")
    public native int getOpacity();

    @Property(selector = "setOpacity:", strongRef = true)
    public native void setOpacity(float opacity);

    /**
     * Specifies whether the tiles should fade in. Default YES.
     */
    /* @propperty(nonatomic, assign) BOOL fadeIn */
    @Property(selector = "fadeIn")
    public native int getFadeIn();

    @Property(selector = "setFadeIn:")
    public native void setFadeIn(boolean value);


}