package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public abstract class zzbz extends FastSafeParcelableJsonResponse {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes(HttpRequest.CHARSET_UTF8);
        } catch (UnsupportedEncodingException e11) {
            Log.e("AUTH", "Error serializing object.", e11);
            return null;
        }
    }
}
