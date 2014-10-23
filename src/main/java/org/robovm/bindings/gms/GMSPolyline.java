package org.robovm.bindings.gms;

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.uikit.UIColor;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.MachineSizedFloat;
import org.robovm.rt.bro.annotation.Pointer;


@NativeClass
public class GMSPolyline extends GMSOverlay {

    /** Describes the drawing style for one-dimensional entities such as polylines. */
    public class GMSStrokeStyle extends NSObject {

        /** Creates a solid color stroke style. */
        @Property(selector = "setColor:")
        private native void setColor(UIColor color);

        /** Creates a gradient stroke style interpolating from |fromColor| to |toColor|. */
        @Property(selector = "setToColor:")
        private native void setToColor(UIColor color);

        @Method(selector = "init")
        private native @Pointer long init();

        public GMSStrokeStyle(){
            super((SkipInit)null);
            init();
        }


        /* (instancetype)solidColor:(UIColor*)color */
         public GMSStrokeStyle (UIColor color) {
            super((SkipInit)null);
            initObject(init());
            this.setColor(color);
        }

        /* (instancetype)gradientFromColor:(UIColor *)fromColor toColor:(UIColor *)toColor */
        public GMSStrokeStyle (UIColor fromColor, UIColor toColor) {
            super((SkipInit)null);
            initObject(init());
            this.setColor(fromColor);
            this.setToColor(toColor);
        }
    }


    /** Describes the style for some region of a polyline. */
    public class GMSStyleSpan extends NSObject {

        @Method(selector = "init")
        private native @Pointer long init();

        /* (instancetype)spanWithColor:(UIColor *)color */
        @Method(selector = "spanWithColor:")
        private native @Pointer long init(UIColor color);

        /**
         * Factory returning a solid color span of length one segment. Equivalent to
         * [GMSStyleSpan spanWithStyle:[GMSStrokeStyle solidColor:|color|] segments:1].
         */
        public GMSStyleSpan (UIColor color) {
            super((SkipInit)null);
            initObject(init(color));
        }

        /* (instancetype)spanWithColor:(UIColor *)color segments:(double)segments */
        @Method(selector = "spanWithColor:segments:")
        private native @Pointer long init(UIColor color, double segments);

        /**
         * Factory returning a solid color span with a given number of segments. Equivalent to
         * [GMSStyleSpan spanWithStyle:[GMSStrokeStyle solidColor:|color|] segments:|segments|].
         */
        public GMSStyleSpan (UIColor color, double segments) {
            super((SkipInit)null);
            initObject(init(color, segments));
        }

        /**
         * Factory returning a span with the given |style| of length one segment. Equivalent to
         * [GMSStyleSpan spanWithStyle:|style| segments:1].
         */
        /* (instancetype)spanWithStyle:(GMSStrokeStyle *)style */
        public GMSStyleSpan (GMSStrokeStyle style) {
            super((SkipInit)null);
            initObject(init());
        }

        /* (instancetype)spanWithStyle:(GMSStrokeStyle *)style segments:(double)segments */
        @Method(selector = "spanWithStyle:segments:")
        private native @Pointer long init(GMSStrokeStyle style, double segments);

        /**
         * Factory returning a span with the given |style| and length in number of segments.
         * |segments| must be greater than 0 (i.e. can't be 0).
         */
        public GMSStyleSpan (GMSStrokeStyle style, double segments) {
            super((SkipInit)null);
            initObject(init(style, segments));
        }

        /** The style of this span. */
        /* @property(nonatomic, readonly) GMSStrokeStyle *style */
        @Property(selector = "style")
        public native GMSStrokeStyle getStyle();

        /** The length of this span in number of segments. */
        /* @property(nonatomic, readonly) double segments */
        @Property(selector = "segments")
        public native double getSegments();

    }

   
    /* @property(nonatomic, copy) GMSPath *path */
    @Property(selector = "path")
    public native GMSPath getPath();

    @Property(selector = "setPath:")
    public native void setPath(GMSPath path);

    /* @property(nonatomic, assign) CGFloat strokeWidth */
    @Property(selector = "strokeWidth")
    public native GMSPath getStrokeWidth();

    @Property(selector = "setStrokeWidth:", strongRef = true)
    public native void setStrokeWidth(@MachineSizedFloat float strokeWidth);

    /* @property(nonatomic, strong) UIColor *strokeColor */
    @Property(selector = "strokeColor")
    public native UIColor getStrokeColor();

    @Property(selector = "setStrokeColor:")
    public native void setStrokeColor(UIColor strokeColor);


    /* @property(nonatomic, assign) BOOL geodesic */
    @Property(selector = "geodesic")
    public native UIColor getGeodesic();

    @Property(selector = "setGeodesic:")
    public native void setGeodesic(boolean value);

    @Method(selector = "init")
    private native @Pointer long init();

    public GMSPolyline (GMSPath path) {
        super((SkipInit)null);
        initObject(init());
        this.setPath(path);
    }

    /* @property(nonatomic, copy) NSArray *spans */
    @Property(selector = "spans")
    public native NSArray getSpans();

    @Property(selector = "setSpans:")
    public native void setSpans(NSArray spans);


}