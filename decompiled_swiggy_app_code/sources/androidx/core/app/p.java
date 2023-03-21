package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: RemoteInput */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final String f9144a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f9145b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f9146c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9147d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9148e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f9149f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<String> f9150g;

    /* compiled from: RemoteInput */
    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(p pVar) {
            Set<String> e11;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(pVar.j()).setLabel(pVar.i()).setChoices(pVar.f()).setAllowFreeFormInput(pVar.d()).addExtras(pVar.h());
            if (Build.VERSION.SDK_INT >= 26 && (e11 = pVar.e()) != null) {
                for (String d11 : e11) {
                    b.d(addExtras, d11, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(addExtras, pVar.g());
            }
            return addExtras.build();
        }

        static p c(Object obj) {
            Set<String> b11;
            RemoteInput remoteInput = (RemoteInput) obj;
            d a11 = new d(remoteInput.getResultKey()).g(remoteInput.getLabel()).e(remoteInput.getChoices()).d(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (b11 = b.b(remoteInput)) != null) {
                for (String c11 : b11) {
                    a11.c(c11, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a11.f(c.a(remoteInput));
            }
            return a11.b();
        }

        static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* compiled from: RemoteInput */
    static class b {
        static void a(p pVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(p.a(pVar), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z11) {
            return builder.setAllowDataType(str, z11);
        }
    }

    /* compiled from: RemoteInput */
    static class c {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i11) {
            return builder.setEditChoicesBeforeSending(i11);
        }
    }

    /* compiled from: RemoteInput */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f9151a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<String> f9152b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f9153c = new Bundle();

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f9154d;

        /* renamed from: e  reason: collision with root package name */
        private CharSequence[] f9155e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f9156f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f9157g = 0;

        public d(String str) {
            if (str != null) {
                this.f9151a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public d a(Bundle bundle) {
            if (bundle != null) {
                this.f9153c.putAll(bundle);
            }
            return this;
        }

        public p b() {
            return new p(this.f9151a, this.f9154d, this.f9155e, this.f9156f, this.f9157g, this.f9153c, this.f9152b);
        }

        public d c(String str, boolean z11) {
            if (z11) {
                this.f9152b.add(str);
            } else {
                this.f9152b.remove(str);
            }
            return this;
        }

        public d d(boolean z11) {
            this.f9156f = z11;
            return this;
        }

        public d e(CharSequence[] charSequenceArr) {
            this.f9155e = charSequenceArr;
            return this;
        }

        public d f(int i11) {
            this.f9157g = i11;
            return this;
        }

        public d g(CharSequence charSequence) {
            this.f9154d = charSequence;
            return this;
        }
    }

    p(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z11, int i11, Bundle bundle, Set<String> set) {
        this.f9144a = str;
        this.f9145b = charSequence;
        this.f9146c = charSequenceArr;
        this.f9147d = z11;
        this.f9148e = i11;
        this.f9149f = bundle;
        this.f9150g = set;
        if (g() == 2 && !d()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(p pVar) {
        return a.b(pVar);
    }

    static RemoteInput[] b(p[] pVarArr) {
        if (pVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[pVarArr.length];
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            remoteInputArr[i11] = a(pVarArr[i11]);
        }
        return remoteInputArr;
    }

    static p c(RemoteInput remoteInput) {
        return a.c(remoteInput);
    }

    public static Bundle k(Intent intent) {
        return a.d(intent);
    }

    public boolean d() {
        return this.f9147d;
    }

    public Set<String> e() {
        return this.f9150g;
    }

    public CharSequence[] f() {
        return this.f9146c;
    }

    public int g() {
        return this.f9148e;
    }

    public Bundle h() {
        return this.f9149f;
    }

    public CharSequence i() {
        return this.f9145b;
    }

    public String j() {
        return this.f9144a;
    }

    public boolean l() {
        return !d() && (f() == null || f().length == 0) && e() != null && !e().isEmpty();
    }
}
