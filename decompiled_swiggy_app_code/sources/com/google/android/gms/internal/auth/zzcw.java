package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzcw extends zzcz {
    final /* synthetic */ zzhl zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcw(zzcx zzcx, String str, Object obj, boolean z11, zzhl zzhl, byte[] bArr) {
        super(zzcx, "getTokenRefactor__blocked_packages", obj, true, (zzct) null);
        this.zza = zzhl;
    }

    /* access modifiers changed from: package-private */
    public final Object zza(Object obj) {
        try {
            return zzhi.zzl(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 27 + str.length());
            sb2.append("Invalid byte[] value for ");
            sb2.append(zzc);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
