package r3;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.c;
import androidx.slice.SliceSpec;
import com.google.android.exoplayer2.ExoPlayer;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: CompatPinnedList */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16461a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16462b;

    public b(Context context, String str) {
        this.f16461a = context;
        this.f16462b = str;
    }

    private static SliceSpec b(Set<SliceSpec> set, String str) {
        for (SliceSpec next : set) {
            if (c.a(next.c(), str)) {
                return next;
            }
        }
        return null;
    }

    private Set<String> e(Uri uri) {
        SharedPreferences f11 = f();
        return f11.getStringSet("pinned_" + uri.toString(), new androidx.collection.b());
    }

    private SharedPreferences f() {
        SharedPreferences sharedPreferences = this.f16461a.getSharedPreferences(this.f16462b, 0);
        long j = sharedPreferences.getLong("last_boot", 0);
        long c11 = c();
        if (Math.abs(j - c11) > ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
            sharedPreferences.edit().clear().putLong("last_boot", c11).apply();
        }
        return sharedPreferences;
    }

    private static androidx.collection.b<SliceSpec> h(androidx.collection.b<SliceSpec> bVar, Set<SliceSpec> set) {
        int i11;
        int i12 = 0;
        while (i12 < bVar.size()) {
            SliceSpec k = bVar.k(i12);
            SliceSpec b11 = b(set, k.c());
            if (b11 == null) {
                i11 = i12 - 1;
                bVar.i(i12);
            } else if (b11.b() < k.b()) {
                i11 = i12 - 1;
                bVar.i(i12);
                bVar.add(b11);
            } else {
                i12++;
            }
            i12 = i11;
            i12++;
        }
        return bVar;
    }

    private void j(Uri uri, Set<String> set) {
        SharedPreferences.Editor edit = f().edit();
        edit.putStringSet("pinned_" + uri.toString(), set).apply();
    }

    private void k(Uri uri, androidx.collection.b<SliceSpec> bVar) {
        String[] strArr = new String[bVar.size()];
        String[] strArr2 = new String[bVar.size()];
        for (int i11 = 0; i11 < bVar.size(); i11++) {
            strArr[i11] = bVar.k(i11).c();
            strArr2[i11] = String.valueOf(bVar.k(i11).b());
        }
        SharedPreferences.Editor edit = f().edit();
        SharedPreferences.Editor putString = edit.putString("spec_names_" + uri.toString(), TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, strArr));
        putString.putString("spec_revs_" + uri.toString(), TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, strArr2)).apply();
    }

    public synchronized boolean a(Uri uri, String str, Set<SliceSpec> set) {
        boolean isEmpty;
        Set<String> e11 = e(uri);
        isEmpty = e11.isEmpty();
        e11.add(str);
        j(uri, e11);
        if (isEmpty) {
            k(uri, new androidx.collection.b(set));
        } else {
            k(uri, h(g(uri), set));
        }
        return isEmpty;
    }

    /* access modifiers changed from: protected */
    public long c() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public List<Uri> d() {
        ArrayList arrayList = new ArrayList();
        for (String next : f().getAll().keySet()) {
            if (next.startsWith("pinned_")) {
                Uri parse = Uri.parse(next.substring(7));
                if (!e(parse).isEmpty()) {
                    arrayList.add(parse);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0063=Splitter:B:13:0x0063, B:20:0x007b=Splitter:B:20:0x007b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized androidx.collection.b<androidx.slice.SliceSpec> g(android.net.Uri r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            androidx.collection.b r0 = new androidx.collection.b     // Catch:{ all -> 0x0082 }
            r0.<init>()     // Catch:{ all -> 0x0082 }
            android.content.SharedPreferences r1 = r6.f()     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r2.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "spec_names_"
            r2.append(r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0082 }
            r2.append(r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0082 }
            r3 = 0
            java.lang.String r2 = r1.getString(r2, r3)     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r4.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = "spec_revs_"
            r4.append(r5)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0082 }
            r4.append(r7)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = r1.getString(r7, r3)     // Catch:{ all -> 0x0082 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x007b
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x004a
            goto L_0x007b
        L_0x004a:
            java.lang.String r1 = ","
            r3 = -1
            java.lang.String[] r1 = r2.split(r1, r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = ","
            java.lang.String[] r7 = r7.split(r2, r3)     // Catch:{ all -> 0x0082 }
            int r2 = r1.length     // Catch:{ all -> 0x0082 }
            int r3 = r7.length     // Catch:{ all -> 0x0082 }
            if (r2 == r3) goto L_0x0062
            androidx.collection.b r7 = new androidx.collection.b     // Catch:{ all -> 0x0082 }
            r7.<init>()     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)
            return r7
        L_0x0062:
            r2 = 0
        L_0x0063:
            int r3 = r1.length     // Catch:{ all -> 0x0082 }
            if (r2 >= r3) goto L_0x0079
            androidx.slice.SliceSpec r3 = new androidx.slice.SliceSpec     // Catch:{ all -> 0x0082 }
            r4 = r1[r2]     // Catch:{ all -> 0x0082 }
            r5 = r7[r2]     // Catch:{ all -> 0x0082 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x0082 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0082 }
            r0.add(r3)     // Catch:{ all -> 0x0082 }
            int r2 = r2 + 1
            goto L_0x0063
        L_0x0079:
            monitor-exit(r6)
            return r0
        L_0x007b:
            androidx.collection.b r7 = new androidx.collection.b     // Catch:{ all -> 0x0082 }
            r7.<init>()     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)
            return r7
        L_0x0082:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.b.g(android.net.Uri):androidx.collection.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean i(android.net.Uri r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Set r0 = r3.e(r4)     // Catch:{ all -> 0x002c }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r1 != 0) goto L_0x002a
            boolean r1 = r0.contains(r5)     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x0013
            goto L_0x002a
        L_0x0013:
            r0.remove(r5)     // Catch:{ all -> 0x002c }
            r3.j(r4, r0)     // Catch:{ all -> 0x002c }
            androidx.collection.b r5 = new androidx.collection.b     // Catch:{ all -> 0x002c }
            r5.<init>()     // Catch:{ all -> 0x002c }
            r3.k(r4, r5)     // Catch:{ all -> 0x002c }
            int r4 = r0.size()     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            monitor-exit(r3)
            return r2
        L_0x002a:
            monitor-exit(r3)
            return r2
        L_0x002c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.b.i(android.net.Uri, java.lang.String):boolean");
    }
}
