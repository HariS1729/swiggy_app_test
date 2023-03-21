package com.BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.g0;
import kf.a;

public class LinearGradientManager extends SimpleViewManager<b> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POS = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POS = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    public String getName() {
        return REACT_CLASS;
    }

    @a(defaultFloat = 45.0f, name = "angle")
    public void setAngle(b bVar, float f11) {
        bVar.setAngle(f11);
    }

    @a(name = "angleCenter")
    public void setAngleCenter(b bVar, ReadableArray readableArray) {
        bVar.setAngleCenter(readableArray);
    }

    @a(name = "borderRadii")
    public void setBorderRadii(b bVar, ReadableArray readableArray) {
        bVar.setBorderRadii(readableArray);
    }

    @a(name = "colors")
    public void setColors(b bVar, ReadableArray readableArray) {
        bVar.setColors(readableArray);
    }

    @a(name = "endPoint")
    public void setEndPosition(b bVar, ReadableArray readableArray) {
        bVar.setEndPosition(readableArray);
    }

    @a(name = "locations")
    public void setLocations(b bVar, ReadableArray readableArray) {
        if (readableArray != null) {
            bVar.setLocations(readableArray);
        }
    }

    @a(name = "startPoint")
    public void setStartPosition(b bVar, ReadableArray readableArray) {
        bVar.setStartPosition(readableArray);
    }

    @a(defaultBoolean = false, name = "useAngle")
    public void setUseAngle(b bVar, boolean z11) {
        bVar.setUseAngle(z11);
    }

    /* access modifiers changed from: protected */
    public b createViewInstance(g0 g0Var) {
        return new b(g0Var);
    }
}
