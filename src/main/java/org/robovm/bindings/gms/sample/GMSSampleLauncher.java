package org.robovm.bindings.gms.sample;

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.*;
import org.robovm.bindings.gms.*;


public class GMSSampleLauncher extends UIApplicationDelegateAdapter {

    private UIWindow window = null;
    private static String GOOGLE_MAPS_KEY = "";

    @Override
    public void didFinishLaunching(UIApplication application) {

        final UIViewController[] viewControllers = new UIViewController[] {
                new GMSSample1(),
                new GMSSample2(),
                new GMSSample3(),
                new GMSSample4(),
                new GMSSample5(),
                new GMSSample6(),
                new GMSSample7()
        };

        final UINavigationController navigationController = new UINavigationController();
        UIViewController mainView = new UIViewController();



        window = new UIWindow(UIScreen.getMainScreen().getBounds());
        window.setRootViewController(navigationController);
        window.setBackgroundColor(UIColor.white());

        GMSServices.provideAPIKey(GOOGLE_MAPS_KEY);

        int x, y;

        y = 80;
        x = (int) ((window.getBounds().getWidth() / 2 - (y / 2)));

        for (int i = 0; i < viewControllers.length; i++) {
            final UIButton button = UIButton.create(UIButtonType.RoundedRect);
            button.setFrame(new CGRect(x, y += 30, 80, 20));
            button.setTitle("Sample " + String.valueOf(i + 1), UIControlState.Normal);
            final int vcRef = i;
            button.addOnTouchUpInsideListener(new UIControl.OnTouchUpInsideListener() {
                @Override
                public void onTouchUpInside(UIControl uiControl, UIEvent uiEvent) {
                    viewControllers[vcRef].setTitle("Sample " + String.valueOf(vcRef + 1));
                    navigationController.pushViewController(viewControllers[vcRef], true);
                }
            });
            mainView.getView().addSubview(button);
        }

        navigationController.pushViewController(mainView, false);
        navigationController.getNavigationBar().getTopItem().setTitle("GMS Sample");
        window.makeKeyAndVisible();
        addStrongRef(window);
    }

    public static void main (String[] args) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(args, null, GMSSampleLauncher.class);
        pool.drain();
    }
}
