package org.robovm.bindings.gms;


/** Delegate for events on GMSIndoorDisplay. */
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface GMSIndoorDisplayDelegate extends NSObjectProtocol {

    /**
     * Raised when the activeBuilding has changed.  The activeLevel will also have
     * already been updated for the new building, but didChangeActiveLevel: will
     * be raised after this method.
     */
    /* (void)didChangeActiveBuilding:(GMSIndoorBuilding *)building */
    @Method(selector = "didChangeActiveBuilding")
    void didChangeActiveBuilding(GMSIndoorBuilding building);

    /**
     * Raised when the activeLevel has changed.  This event is raised for all
     * changes, including explicit setting of the property.
     */
    /* (void)didChangeActiveLevel:(GMSIndoorLevel *)level */
    @Method(selector = "didChangeActiveLevel")
    void didChangeActiveLevel(GMSIndoorLevel level);

}
