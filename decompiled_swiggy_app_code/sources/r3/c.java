package r3;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.slice.Slice;
import androidx.slice.SliceItemHolder;
import androidx.slice.SliceSpec;
import com.google.android.exoplayer2.ExoPlayer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: SliceProviderCompat */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f16463a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final Context f16464b;

    /* renamed from: c  reason: collision with root package name */
    String f16465c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.slice.c f16466d;

    /* renamed from: e  reason: collision with root package name */
    private b f16467e;

    /* renamed from: f  reason: collision with root package name */
    private a f16468f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f16469g = new a();

    /* compiled from: SliceProviderCompat */
    class a implements Runnable {
        a() {
        }

        public void run() {
            Process.sendSignal(Process.myPid(), 3);
            Log.wtf("SliceProviderCompat", "Timed out while handling slice callback " + c.this.f16465c);
        }
    }

    /* compiled from: SliceProviderCompat */
    private static class b implements AutoCloseable {

        /* renamed from: a  reason: collision with root package name */
        final ContentProviderClient f16471a;

        b(ContentProviderClient contentProviderClient) {
            this.f16471a = contentProviderClient;
        }

        public void close() {
            ContentProviderClient contentProviderClient = this.f16471a;
            if (contentProviderClient != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    contentProviderClient.close();
                } else {
                    contentProviderClient.release();
                }
            }
        }
    }

    public c(androidx.slice.c cVar, a aVar, Context context) {
        this.f16466d = cVar;
        this.f16464b = context;
        String str = "slice_data_" + getClass().getName();
        SharedPreferences sharedPreferences = context.getSharedPreferences("slice_data_all_slice_files", 0);
        Set<String> stringSet = sharedPreferences.getStringSet("slice_data_all_slice_files", Collections.emptySet());
        if (!stringSet.contains(str)) {
            androidx.collection.b bVar = new androidx.collection.b(stringSet);
            bVar.add(str);
            sharedPreferences.edit().putStringSet("slice_data_all_slice_files", bVar).commit();
        }
        this.f16467e = new b(context, str);
        this.f16468f = aVar;
    }

    private static b a(ContentResolver contentResolver, Uri uri) {
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            return new b(acquireUnstableContentProviderClient);
        }
        throw new IllegalArgumentException("No provider found for " + uri);
    }

    public static void b(Bundle bundle, Set<SliceSpec> set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SliceSpec next : set) {
            arrayList.add(next.c());
            arrayList2.add(Integer.valueOf(next.b()));
        }
        bundle.putStringArrayList("specs", arrayList);
        bundle.putIntegerArrayList("revs", arrayList2);
    }

    private Context e() {
        return this.f16464b;
    }

    public static List<Uri> f(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String bVar : context.getSharedPreferences("slice_data_all_slice_files", 0).getStringSet("slice_data_all_slice_files", Collections.emptySet())) {
            arrayList.addAll(new b(context, bVar).d());
        }
        return arrayList;
    }

    public static Set<SliceSpec> g(Context context, Uri uri) {
        b a11 = a(context.getContentResolver(), uri);
        if (a11.f16471a != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("slice_uri", uri);
                Bundle call = a11.f16471a.call("get_specs", "supports_versioned_parcelable", bundle);
                if (call != null) {
                    Set<SliceSpec> h11 = h(call);
                    a11.close();
                    return h11;
                }
            } catch (RemoteException e11) {
                Log.e("SliceProviderCompat", "Unable to get pinned specs", e11);
            } catch (Throwable th2) {
                a11.close();
                throw th2;
            }
            a11.close();
            return null;
        }
        throw new IllegalArgumentException("Unknown URI " + uri);
    }

    public static Set<SliceSpec> h(Bundle bundle) {
        androidx.collection.b bVar = new androidx.collection.b();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("specs");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("revs");
        if (!(stringArrayList == null || integerArrayList == null)) {
            for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                bVar.add(new SliceSpec(stringArrayList.get(i11), integerArrayList.get(i11).intValue()));
            }
        }
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i(android.content.Context r2, java.lang.String r3, java.lang.String r4, android.net.Uri r5) {
        /*
            android.content.ContentResolver r2 = r2.getContentResolver()
            r3.c$b r2 = a(r2, r5)     // Catch:{ RemoteException -> 0x0037 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "slice_uri"
            r0.putParcelable(r1, r5)     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "provider_pkg"
            r0.putString(r5, r3)     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "pkg"
            r0.putString(r3, r4)     // Catch:{ all -> 0x0029 }
            android.content.ContentProviderClient r3 = r2.f16471a     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = "grant_perms"
            java.lang.String r5 = "supports_versioned_parcelable"
            r3.call(r4, r5, r0)     // Catch:{ all -> 0x0029 }
            r2.close()     // Catch:{ RemoteException -> 0x0037 }
            goto L_0x003f
        L_0x0029:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002b }
        L_0x002b:
            r4 = move-exception
            if (r2 == 0) goto L_0x0036
            r2.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ RemoteException -> 0x0037 }
        L_0x0036:
            throw r4     // Catch:{ RemoteException -> 0x0037 }
        L_0x0037:
            r2 = move-exception
            java.lang.String r3 = "SliceProviderCompat"
            java.lang.String r4 = "Unable to get slice descendants"
            android.util.Log.e(r3, r4, r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.c.i(android.content.Context, java.lang.String, java.lang.String, android.net.Uri):void");
    }

    private Slice j(Uri uri, Set<SliceSpec> set, String str) {
        if (str == null) {
            str = e().getPackageManager().getNameForUid(Binder.getCallingUid());
        }
        if (this.f16468f.a(uri, Binder.getCallingPid(), Binder.getCallingUid()) != 0) {
            return this.f16466d.c(uri, str);
        }
        return n(uri, set);
    }

    private Collection<Uri> k(Uri uri) {
        this.f16465c = "onGetSliceDescendants";
        return this.f16466d.n(uri);
    }

    private void l(Uri uri) {
        this.f16465c = "onSlicePinned";
        this.f16463a.postDelayed(this.f16469g, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        try {
            this.f16466d.p(uri);
            this.f16466d.h(uri);
        } finally {
            this.f16463a.removeCallbacks(this.f16469g);
        }
    }

    private void m(Uri uri) {
        this.f16465c = "onSliceUnpinned";
        this.f16463a.postDelayed(this.f16469g, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        try {
            this.f16466d.q(uri);
            this.f16466d.i(uri);
        } finally {
            this.f16463a.removeCallbacks(this.f16469g);
        }
    }

    private Slice n(Uri uri, Set<SliceSpec> set) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        this.f16465c = "onBindSlice";
        this.f16463a.postDelayed(this.f16469g, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyDeath().build());
            androidx.slice.c.r(set);
            try {
                Slice j = this.f16466d.j(uri);
                androidx.slice.c.r((Set<SliceSpec>) null);
                this.f16463a.removeCallbacks(this.f16469g);
                StrictMode.setThreadPolicy(threadPolicy);
                return j;
            } catch (Exception e11) {
                Log.wtf("SliceProviderCompat", "Slice with URI " + uri.toString() + " is invalid.", e11);
                androidx.slice.c.r((Set<SliceSpec>) null);
                this.f16463a.removeCallbacks(this.f16469g);
                StrictMode.setThreadPolicy(threadPolicy);
                return null;
            }
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th2;
        }
    }

    public Bundle c(String str, String str2, Bundle bundle) {
        Parcelable parcelable = null;
        if (str.equals("bind_slice")) {
            Slice j = j((Uri) bundle.getParcelable("slice_uri"), h(bundle), d());
            Bundle bundle2 = new Bundle();
            if ("supports_versioned_parcelable".equals(str2)) {
                synchronized (SliceItemHolder.f11719h) {
                    if (j != null) {
                        parcelable = z3.a.c(j);
                    }
                    bundle2.putParcelable("slice", parcelable);
                }
            } else {
                if (j != null) {
                    parcelable = j.j();
                }
                bundle2.putParcelable("slice", parcelable);
            }
            return bundle2;
        } else if (str.equals("map_slice")) {
            Uri o11 = this.f16466d.o((Intent) bundle.getParcelable("slice_intent"));
            Bundle bundle3 = new Bundle();
            if (o11 != null) {
                Slice j11 = j(o11, h(bundle), d());
                if ("supports_versioned_parcelable".equals(str2)) {
                    synchronized (SliceItemHolder.f11719h) {
                        if (j11 != null) {
                            parcelable = z3.a.c(j11);
                        }
                        bundle3.putParcelable("slice", parcelable);
                    }
                } else {
                    if (j11 != null) {
                        parcelable = j11.j();
                    }
                    bundle3.putParcelable("slice", parcelable);
                }
            } else {
                bundle3.putParcelable("slice", (Parcelable) null);
            }
            return bundle3;
        } else if (str.equals("map_only")) {
            Uri o12 = this.f16466d.o((Intent) bundle.getParcelable("slice_intent"));
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("slice", o12);
            return bundle4;
        } else if (str.equals("pin_slice")) {
            Uri uri = (Uri) bundle.getParcelable("slice_uri");
            Set<SliceSpec> h11 = h(bundle);
            if (this.f16467e.a(uri, bundle.getString("pkg"), h11)) {
                l(uri);
            }
            return null;
        } else if (str.equals("unpin_slice")) {
            Uri uri2 = (Uri) bundle.getParcelable("slice_uri");
            if (this.f16467e.i(uri2, bundle.getString("pkg"))) {
                m(uri2);
            }
            return null;
        } else if (str.equals("get_specs")) {
            Uri uri3 = (Uri) bundle.getParcelable("slice_uri");
            Bundle bundle5 = new Bundle();
            androidx.collection.b<SliceSpec> g11 = this.f16467e.g(uri3);
            if (g11.size() != 0) {
                b(bundle5, g11);
                return bundle5;
            }
            throw new IllegalStateException(uri3 + " is not pinned");
        } else if (str.equals("get_descendants")) {
            Bundle bundle6 = new Bundle();
            bundle6.putParcelableArrayList("slice_descendants", new ArrayList(k((Uri) bundle.getParcelable("slice_uri"))));
            return bundle6;
        } else if (str.equals("check_perms")) {
            bundle.getString("pkg");
            int i11 = bundle.getInt("pid");
            int i12 = bundle.getInt("uid");
            Bundle bundle7 = new Bundle();
            bundle7.putInt("result", this.f16468f.a((Uri) bundle.getParcelable("slice_uri"), i11, i12));
            return bundle7;
        } else {
            if (str.equals("grant_perms")) {
                Uri uri4 = (Uri) bundle.getParcelable("slice_uri");
                String string = bundle.getString("pkg");
                if (Binder.getCallingUid() == Process.myUid()) {
                    this.f16468f.e(uri4, string);
                } else {
                    throw new SecurityException("Only the owning process can manage slice permissions");
                }
            } else if (str.equals("revoke_perms")) {
                Uri uri5 = (Uri) bundle.getParcelable("slice_uri");
                String string2 = bundle.getString("pkg");
                if (Binder.getCallingUid() == Process.myUid()) {
                    this.f16468f.g(uri5, string2);
                } else {
                    throw new SecurityException("Only the owning process can manage slice permissions");
                }
            }
            return null;
        }
    }

    public String d() {
        return this.f16466d.getCallingPackage();
    }
}
