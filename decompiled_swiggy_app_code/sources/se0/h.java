package se0;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import ef0.e;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: SwiggyRNUtils.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f19878a = new h();

    /* compiled from: SwiggyRNUtils.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19879a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            iArr[ReadableType.Null.ordinal()] = 1;
            iArr[ReadableType.String.ordinal()] = 2;
            f19879a = iArr;
        }
    }

    private h() {
    }

    public static final Bundle a(HashMap<String, String> hashMap) {
        p.j(hashMap, "headers");
        return d(hashMap);
    }

    public static final ReadableMap b(e eVar) {
        WritableMap createMap = Arguments.createMap();
        if (eVar != null) {
            createMap.putString(HttpRequest.TID_KEY, eVar.getTid());
            createMap.putString(HttpRequest.SWIGGY_HEADER_SID, eVar.getSessionId());
            createMap.putString("token", eVar.getToken());
            createMap.putString(AnalyticsAttribute.USER_ID_ATTRIBUTE, eVar.getCustomerId());
            createMap.putString("userName", eVar.getName());
        }
        p.i(createMap, "userMap");
        return createMap;
    }

    public static final Bundle c(ReadableMap readableMap) {
        p.j(readableMap, "readableMap");
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        p.i(keySetIterator, "readableMap.keySetIterator()");
        Bundle bundle = new Bundle();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int i11 = a.f19879a[readableMap.getType(nextKey).ordinal()];
            String str = "";
            if (i11 == 1) {
                bundle.putString(nextKey, str);
            } else if (i11 != 2) {
                u.c("Could not convert object with key: " + nextKey + '.');
            } else {
                String string = readableMap.getString(nextKey);
                if (string != null) {
                    str = string;
                }
                bundle.putString(nextKey, str);
            }
        }
        return bundle;
    }

    public static final Bundle d(HashMap<String, String> hashMap) {
        p.j(hashMap, "map");
        Bundle bundle = new Bundle();
        for (Map.Entry next : hashMap.entrySet()) {
            bundle.putString((String) next.getKey(), (String) next.getValue());
        }
        return bundle;
    }
}
