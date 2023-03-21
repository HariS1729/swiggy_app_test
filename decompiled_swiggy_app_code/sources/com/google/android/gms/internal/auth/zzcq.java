package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.a;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public final class zzcq {
    private static final a<String, Uri> zza = new a<>();

    public static synchronized Uri zza(String str) {
        Uri uri;
        String str2;
        synchronized (zzcq.class) {
            a<String, Uri> aVar = zza;
            uri = aVar.get("com.google.android.gms.auth_account");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.auth_account"));
                if (valueOf.length() != 0) {
                    str2 = "content://com.google.android.gms.phenotype/".concat(valueOf);
                } else {
                    str2 = new String("content://com.google.android.gms.phenotype/");
                }
                uri = Uri.parse(str2);
                aVar.put("com.google.android.gms.auth_account", uri);
            }
        }
        return uri;
    }
}
