package org.robovm.bindings.gms;

import org.robovm.apple.coreanimation.CALayer;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.Library;

/**
 * GMSCALayer is a superclass used by layers in the Google Maps SDK for iOS,
 * such as GMSMapLayer and GMSPanoramaLayer.
 *
 * This is an implementation detail and it should not be instantiated directly.
 */
@Library("QuartzCore")
@NativeClass
public class GMSCALayer extends CALayer {

}