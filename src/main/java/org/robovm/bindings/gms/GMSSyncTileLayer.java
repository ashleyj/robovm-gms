package org.robovm.bindings.gms;

import org.robovm.apple.uikit.UIImage;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.MachineSizedUInt;

/**
 * GMSSyncTileLayer is an abstract subclass of GMSTileLayer that provides a sync
 * interface to generate image tile data.
 */
@NativeClass
public class GMSSyncTileLayer extends GMSTileLayer {

    /**
     * As per requestTileForX:y:zoom:receiver: on GMSTileLayer, but provides a
     * synchronous interface to return tiles. This method may block or otherwise
     * perform work, and is not called on the main thread.
     *
     * Calls to this method may also be made from multiple threads so
     * implementations must be threadsafe.
     */
    /* (UIImage *)tileForX:(NSUInteger)x y:(NSUInteger)y zoom:(NSUInteger)zoom */
    @Method(selector = "tileForX:y:zoom:")
    public native UIImage getTile(int x, int y, @MachineSizedUInt long zoom);

}