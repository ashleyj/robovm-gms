package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.apple.uikit.UIImage;
import org.robovm.objc.annotation.Method;
import org.robovm.rt.bro.annotation.MachineSizedUInt;

/**
 * Created by ash on 10/10/2014.
 */
public class GMSTileReceiver implements NSObjectProtocol {


    /*
     * (void)receiveTileWithX:(NSUInteger)x
     * y:(NSUInteger)y
     * zoom:(NSUInteger)zoom
     * image:(UIImage *)image;
     */

    @Method(selector = "receiveTileWithX:y:zoom:image:")
    public native void receiveTile(@MachineSizedUInt long x, @MachineSizedUInt long y,
                                   @MachineSizedUInt long zoom, UIImage image);

}

