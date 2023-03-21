package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;

public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    private Random f1410a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f1411b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Integer> f1412c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d> f1413d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f1414e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, c<?>> f1415f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f1416g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f1417h = new Bundle();

    class a extends b<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f1423b;

        a(String str, e.a aVar) {
            this.f1422a = str;
            this.f1423b = aVar;
        }

        public void b(I i11, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f1412c.get(this.f1422a);
            if (num != null) {
                ActivityResultRegistry.this.f1414e.add(this.f1422a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f1423b, i11, cVar);
                } catch (Exception e11) {
                    ActivityResultRegistry.this.f1414e.remove(this.f1422a);
                    throw e11;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f1423b + " and input " + i11 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void c() {
            ActivityResultRegistry.this.l(this.f1422a);
        }
    }

    class b extends b<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1425a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f1426b;

        b(String str, e.a aVar) {
            this.f1425a = str;
            this.f1426b = aVar;
        }

        public void b(I i11, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f1412c.get(this.f1425a);
            if (num != null) {
                ActivityResultRegistry.this.f1414e.add(this.f1425a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f1426b, i11, cVar);
                } catch (Exception e11) {
                    ActivityResultRegistry.this.f1414e.remove(this.f1425a);
                    throw e11;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f1426b + " and input " + i11 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void c() {
            ActivityResultRegistry.this.l(this.f1425a);
        }
    }

    private static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        final a<O> f1428a;

        /* renamed from: b  reason: collision with root package name */
        final e.a<?, O> f1429b;

        c(a<O> aVar, e.a<?, O> aVar2) {
            this.f1428a = aVar;
            this.f1429b = aVar2;
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final Lifecycle f1430a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<o> f1431b = new ArrayList<>();

        d(Lifecycle lifecycle) {
            this.f1430a = lifecycle;
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar) {
            this.f1430a.a(oVar);
            this.f1431b.add(oVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Iterator<o> it2 = this.f1431b.iterator();
            while (it2.hasNext()) {
                this.f1430a.c(it2.next());
            }
            this.f1431b.clear();
        }
    }

    private void a(int i11, String str) {
        this.f1411b.put(Integer.valueOf(i11), str);
        this.f1412c.put(str, Integer.valueOf(i11));
    }

    private <O> void d(String str, int i11, Intent intent, c<O> cVar) {
        if (cVar == null || cVar.f1428a == null || !this.f1414e.contains(str)) {
            this.f1416g.remove(str);
            this.f1417h.putParcelable(str, new ActivityResult(i11, intent));
            return;
        }
        cVar.f1428a.a(cVar.f1429b.c(i11, intent));
        this.f1414e.remove(str);
    }

    private int e() {
        int nextInt = this.f1410a.nextInt(2147418112);
        while (true) {
            int i11 = nextInt + PDButton.FLAG_PUSHBUTTON;
            if (!this.f1411b.containsKey(Integer.valueOf(i11))) {
                return i11;
            }
            nextInt = this.f1410a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (this.f1412c.get(str) == null) {
            a(e(), str);
        }
    }

    public final boolean b(int i11, int i12, Intent intent) {
        String str = this.f1411b.get(Integer.valueOf(i11));
        if (str == null) {
            return false;
        }
        d(str, i12, intent, this.f1415f.get(str));
        return true;
    }

    public final <O> boolean c(int i11, @SuppressLint({"UnknownNullness"}) O o11) {
        a<O> aVar;
        String str = this.f1411b.get(Integer.valueOf(i11));
        if (str == null) {
            return false;
        }
        c cVar = this.f1415f.get(str);
        if (cVar == null || (aVar = cVar.f1428a) == null) {
            this.f1417h.remove(str);
            this.f1416g.put(str, o11);
            return true;
        } else if (!this.f1414e.remove(str)) {
            return true;
        } else {
            aVar.a(o11);
            return true;
        }
    }

    public abstract <I, O> void f(int i11, e.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i12, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f1414e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f1410a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f1417h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                    String str = stringArrayList.get(i11);
                    if (this.f1412c.containsKey(str)) {
                        Integer remove = this.f1412c.remove(str);
                        if (!this.f1417h.containsKey(str)) {
                            this.f1411b.remove(remove);
                        }
                    }
                    a(integerArrayList.get(i11).intValue(), stringArrayList.get(i11));
                }
            }
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f1412c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f1412c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f1414e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f1417h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f1410a);
    }

    public final <I, O> b<I> i(final String str, r rVar, final e.a<I, O> aVar, final a<O> aVar2) {
        Lifecycle lifecycle = rVar.getLifecycle();
        if (!lifecycle.b().isAtLeast(Lifecycle.State.STARTED)) {
            k(str);
            d dVar = this.f1413d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new o() {
                public void b(r rVar, Lifecycle.Event event) {
                    if (Lifecycle.Event.ON_START.equals(event)) {
                        ActivityResultRegistry.this.f1415f.put(str, new c(aVar2, aVar));
                        if (ActivityResultRegistry.this.f1416g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f1416g.get(str);
                            ActivityResultRegistry.this.f1416g.remove(str);
                            aVar2.a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f1417h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f1417h.remove(str);
                            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
                        }
                    } else if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f1415f.remove(str);
                    } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f1413d.put(str, dVar);
            return new a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + rVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final <I, O> b<I> j(String str, e.a<I, O> aVar, a<O> aVar2) {
        k(str);
        this.f1415f.put(str, new c(aVar2, aVar));
        if (this.f1416g.containsKey(str)) {
            Object obj = this.f1416g.get(str);
            this.f1416g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f1417h.getParcelable(str);
        if (activityResult != null) {
            this.f1417h.remove(str);
            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
        }
        return new b(str, aVar);
    }

    /* access modifiers changed from: package-private */
    public final void l(String str) {
        Integer remove;
        if (!this.f1414e.contains(str) && (remove = this.f1412c.remove(str)) != null) {
            this.f1411b.remove(remove);
        }
        this.f1415f.remove(str);
        if (this.f1416g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f1416g.get(str));
            this.f1416g.remove(str);
        }
        if (this.f1417h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f1417h.getParcelable(str));
            this.f1417h.remove(str);
        }
        d dVar = this.f1413d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f1413d.remove(str);
        }
    }
}
