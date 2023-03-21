package androidx.lifecycle;

import android.app.Application;
import g3.a;
import in.swiggy.android.tejas.feature.timeline.model.Destination;
import in.swiggy.android.tejas.network.HttpRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ViewModelProvider.kt */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final o0 f10753a;

    /* renamed from: b  reason: collision with root package name */
    private final b f10754b;

    /* renamed from: c  reason: collision with root package name */
    private final g3.a f10755c;

    /* compiled from: ViewModelProvider.kt */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10761a = a.f10762a;

        /* compiled from: ViewModelProvider.kt */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f10762a = new a();

            private a() {
            }
        }

        <T extends j0> T a(Class<T> cls);

        <T extends j0> T b(Class<T> cls, g3.a aVar);
    }

    /* compiled from: ViewModelProvider.kt */
    public static class c implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f10763b = new a((i) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static c f10764c;

        /* renamed from: d  reason: collision with root package name */
        public static final a.b<String> f10765d = a.C0067a.f10766a;

        /* compiled from: ViewModelProvider.kt */
        public static final class a {

            /* renamed from: androidx.lifecycle.l0$c$a$a  reason: collision with other inner class name */
            /* compiled from: ViewModelProvider.kt */
            private static final class C0067a implements a.b<String> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0067a f10766a = new C0067a();

                private C0067a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(i iVar) {
                this();
            }

            public final c a() {
                if (c.f10764c == null) {
                    c.f10764c = new c();
                }
                c c11 = c.f10764c;
                p.g(c11);
                return c11;
            }
        }

        public <T extends j0> T a(Class<T> cls) {
            p.j(cls, "modelClass");
            try {
                T newInstance = cls.newInstance();
                p.i(newInstance, "{\n                modelC…wInstance()\n            }");
                return (j0) newInstance;
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        public /* synthetic */ j0 b(Class cls, g3.a aVar) {
            return m0.b(this, cls, aVar);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    public static class d {
        public void c(j0 j0Var) {
            p.j(j0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l0(o0 o0Var, b bVar) {
        this(o0Var, bVar, (g3.a) null, 4, (i) null);
        p.j(o0Var, Destination.TYPE_STORE);
        p.j(bVar, "factory");
    }

    public l0(o0 o0Var, b bVar, g3.a aVar) {
        p.j(o0Var, Destination.TYPE_STORE);
        p.j(bVar, "factory");
        p.j(aVar, "defaultCreationExtras");
        this.f10753a = o0Var;
        this.f10754b = bVar;
        this.f10755c = aVar;
    }

    public <T extends j0> T a(Class<T> cls) {
        p.j(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends j0> T b(String str, Class<T> cls) {
        T t;
        p.j(str, HttpRequest.HEADER_KEY);
        p.j(cls, "modelClass");
        T b11 = this.f10753a.b(str);
        if (cls.isInstance(b11)) {
            b bVar = this.f10754b;
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                p.i(b11, "viewModel");
                dVar.c(b11);
            }
            Objects.requireNonNull(b11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b11;
        }
        g3.d dVar2 = new g3.d(this.f10755c);
        dVar2.c(c.f10765d, str);
        try {
            t = this.f10754b.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t = this.f10754b.a(cls);
        }
        this.f10753a.d(str, t);
        return t;
    }

    /* compiled from: ViewModelProvider.kt */
    public static class a extends c {

        /* renamed from: f  reason: collision with root package name */
        public static final C0065a f10756f = new C0065a((i) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static a f10757g;

        /* renamed from: h  reason: collision with root package name */
        public static final a.b<Application> f10758h = C0065a.C0066a.f10760a;

        /* renamed from: e  reason: collision with root package name */
        private final Application f10759e;

        /* renamed from: androidx.lifecycle.l0$a$a  reason: collision with other inner class name */
        /* compiled from: ViewModelProvider.kt */
        public static final class C0065a {

            /* renamed from: androidx.lifecycle.l0$a$a$a  reason: collision with other inner class name */
            /* compiled from: ViewModelProvider.kt */
            private static final class C0066a implements a.b<Application> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0066a f10760a = new C0066a();

                private C0066a() {
                }
            }

            private C0065a() {
            }

            public /* synthetic */ C0065a(i iVar) {
                this();
            }

            public final b a(p0 p0Var) {
                p.j(p0Var, "owner");
                if (!(p0Var instanceof k)) {
                    return c.f10763b.a();
                }
                b defaultViewModelProviderFactory = ((k) p0Var).getDefaultViewModelProviderFactory();
                p.i(defaultViewModelProviderFactory, "owner.defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            public final a b(Application application) {
                p.j(application, "application");
                if (a.f10757g == null) {
                    a.f10757g = new a(application);
                }
                a e11 = a.f10757g;
                p.g(e11);
                return e11;
            }
        }

        private a(Application application, int i11) {
            this.f10759e = application;
        }

        private final <T extends j0> T g(Class<T> cls, Application application) {
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t = (j0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                p.i(t, "{\n                try {\n…          }\n            }");
                return t;
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InstantiationException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            } catch (InvocationTargetException e14) {
                throw new RuntimeException("Cannot create an instance of " + cls, e14);
            }
        }

        public <T extends j0> T a(Class<T> cls) {
            p.j(cls, "modelClass");
            Application application = this.f10759e;
            if (application != null) {
                return g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public <T extends j0> T b(Class<T> cls, g3.a aVar) {
            p.j(cls, "modelClass");
            p.j(aVar, "extras");
            if (this.f10759e != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f10758h);
            if (application != null) {
                return g(cls, application);
            }
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            p.j(application, "application");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(o0 o0Var, b bVar, g3.a aVar, int i11, i iVar) {
        this(o0Var, bVar, (i11 & 4) != 0 ? a.C0124a.f14730b : aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l0(androidx.lifecycle.p0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.p.j(r3, r0)
            androidx.lifecycle.o0 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.jvm.internal.p.i(r0, r1)
            androidx.lifecycle.l0$a$a r1 = androidx.lifecycle.l0.a.f10756f
            androidx.lifecycle.l0$b r1 = r1.a(r3)
            g3.a r3 = androidx.lifecycle.n0.a(r3)
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l0.<init>(androidx.lifecycle.p0):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l0(androidx.lifecycle.p0 r3, androidx.lifecycle.l0.b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.p.j(r3, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.p.j(r4, r0)
            androidx.lifecycle.o0 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.jvm.internal.p.i(r0, r1)
            g3.a r3 = androidx.lifecycle.n0.a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l0.<init>(androidx.lifecycle.p0, androidx.lifecycle.l0$b):void");
    }
}
