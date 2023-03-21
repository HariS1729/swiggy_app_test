package r3;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.collection.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: CompatPermissionManager */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16455a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16456b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16457c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f16458d;

    /* renamed from: r3.a$a  reason: collision with other inner class name */
    /* compiled from: CompatPermissionManager */
    public static class C0178a {

        /* renamed from: a  reason: collision with root package name */
        private final b<String[]> f16459a;

        /* renamed from: b  reason: collision with root package name */
        private final String f16460b;

        C0178a(Set<String> set, String str, boolean z11) {
            b<String[]> bVar = new b<>();
            this.f16459a = bVar;
            if (z11) {
                bVar.add(new String[0]);
            } else {
                for (String b11 : set) {
                    this.f16459a.add(b(b11));
                }
            }
            this.f16460b = str;
        }

        private String[] b(String str) {
            String[] split = str.split("/", -1);
            for (int i11 = 0; i11 < split.length; i11++) {
                split[i11] = Uri.decode(split[i11]);
            }
            return split;
        }

        private String c(String[] strArr) {
            String[] strArr2 = new String[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                strArr2[i11] = Uri.encode(strArr[i11]);
            }
            return TextUtils.join("/", strArr2);
        }

        private boolean g(String[] strArr, String[] strArr2) {
            int length = strArr.length;
            if (strArr2.length < length) {
                return false;
            }
            for (int i11 = 0; i11 < length; i11++) {
                if (!Objects.equals(strArr2[i11], strArr[i11])) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a(List<String> list) {
            String[] strArr = (String[]) list.toArray(new String[list.size()]);
            for (int size = this.f16459a.size() - 1; size >= 0; size--) {
                String[] k = this.f16459a.k(size);
                if (g(k, strArr)) {
                    return false;
                }
                if (g(strArr, k)) {
                    this.f16459a.i(size);
                }
            }
            this.f16459a.add(strArr);
            return true;
        }

        public String d() {
            return this.f16460b;
        }

        public boolean e(List<String> list) {
            String[] strArr = (String[]) list.toArray(new String[list.size()]);
            Iterator<String[]> it2 = this.f16459a.iterator();
            while (it2.hasNext()) {
                if (g(it2.next(), strArr)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return e(Collections.emptyList());
        }

        /* access modifiers changed from: package-private */
        public boolean h(List<String> list) {
            String[] strArr = (String[]) list.toArray(new String[list.size()]);
            boolean z11 = false;
            for (int size = this.f16459a.size() - 1; size >= 0; size--) {
                if (g(strArr, this.f16459a.k(size))) {
                    this.f16459a.i(size);
                    z11 = true;
                }
            }
            return z11;
        }

        public Set<String> i() {
            b bVar = new b();
            Iterator<String[]> it2 = this.f16459a.iterator();
            while (it2.hasNext()) {
                bVar.add(c(it2.next()));
            }
            return bVar;
        }
    }

    public a(Context context, String str, int i11, String[] strArr) {
        this.f16455a = context;
        this.f16456b = str;
        this.f16457c = i11;
        this.f16458d = strArr;
    }

    private int b(Uri uri, String str) {
        return c(str, uri.getAuthority()).e(uri.getPathSegments()) ? 0 : -1;
    }

    private C0178a c(String str, String str2) {
        String str3 = str + "_" + str2;
        return new C0178a(d().getStringSet(str3, Collections.emptySet()), str3, d().getBoolean(str3 + "_all", false));
    }

    private SharedPreferences d() {
        return this.f16455a.getSharedPreferences(this.f16456b, 0);
    }

    private synchronized void f(C0178a aVar) {
        SharedPreferences.Editor putStringSet = d().edit().putStringSet(aVar.d(), aVar.i());
        putStringSet.putBoolean(aVar.d() + "_all", aVar.f()).apply();
    }

    public int a(Uri uri, int i11, int i12) {
        if (i12 == this.f16457c) {
            return 0;
        }
        String[] packagesForUid = this.f16455a.getPackageManager().getPackagesForUid(i12);
        for (String b11 : packagesForUid) {
            if (b(uri, b11) == 0) {
                return 0;
            }
        }
        for (String checkPermission : this.f16458d) {
            if (this.f16455a.checkPermission(checkPermission, i11, i12) == 0) {
                for (String e11 : packagesForUid) {
                    e(uri, e11);
                }
                return 0;
            }
        }
        return this.f16455a.checkUriPermission(uri, i11, i12, 2);
    }

    public void e(Uri uri, String str) {
        C0178a c11 = c(str, uri.getAuthority());
        if (c11.a(uri.getPathSegments())) {
            f(c11);
        }
    }

    public void g(Uri uri, String str) {
        C0178a c11 = c(str, uri.getAuthority());
        if (c11.h(uri.getPathSegments())) {
            f(c11);
        }
    }
}
