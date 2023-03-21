package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.g;
import androidx.core.app.o;
import androidx.core.view.m;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.f0;
import androidx.lifecycle.k;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r;
import androidx.lifecycle.r0;
import androidx.lifecycle.t;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import e.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements p0, k, n3.d, i, androidx.activity.result.c {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final d.a mContextAwareHelper;
    private l0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final t mLifecycleRegistry;
    private final androidx.core.view.k mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<androidx.core.util.a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<g>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<o>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<Integer>> mOnTrimMemoryListeners;
    final n3.c mSavedStateRegistryController;
    private o0 mViewModelStore;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e11) {
                if (!TextUtils.equals(e11.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e11;
                }
            }
        }
    }

    class b extends ActivityResultRegistry {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1374a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a.C0118a f1375b;

            a(int i11, a.C0118a aVar) {
                this.f1374a = i11;
                this.f1375b = aVar;
            }

            public void run() {
                b.this.c(this.f1374a, this.f1375b.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        class C0010b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1377a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f1378b;

            C0010b(int i11, IntentSender.SendIntentException sendIntentException) {
                this.f1377a = i11;
                this.f1378b = sendIntentException;
            }

            public void run() {
                b.this.b(this.f1377a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f1378b));
            }
        }

        b() {
        }

        public <I, O> void f(int i11, e.a<I, O> aVar, I i12, androidx.core.app.c cVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0118a<O> b11 = aVar.b(componentActivity, i12);
            if (b11 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i11, b11));
                return;
            }
            Intent a11 = aVar.a(componentActivity, i12);
            Bundle bundle = null;
            if (a11.getExtras() != null && a11.getExtras().getClassLoader() == null) {
                a11.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a11.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a11.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a11.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a11.getAction())) {
                String[] stringArrayExtra = a11.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.v(componentActivity, stringArrayExtra, i11);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a11.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a11.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.b.A(componentActivity, intentSenderRequest.d(), i11, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e11) {
                    new Handler(Looper.getMainLooper()).post(new C0010b(i11, e11));
                }
            } else {
                androidx.core.app.b.z(componentActivity, a11, i11, bundle2);
            }
        }
    }

    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static final class e {

        /* renamed from: a  reason: collision with root package name */
        Object f1380a;

        /* renamed from: b  reason: collision with root package name */
        o0 f1381b;

        e() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new d.a();
        this.mMenuHostHelper = new androidx.core.view.k(new c(this));
        this.mLifecycleRegistry = new t(this);
        n3.c a11 = n3.c.a(this);
        this.mSavedStateRegistryController = a11;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i11 = Build.VERSION.SDK_INT;
            getLifecycle().a(new androidx.lifecycle.o() {
                public void b(r rVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            c.a(peekDecorView);
                        }
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.o() {
                public void b(r rVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            getLifecycle().a(new androidx.lifecycle.o() {
                public void b(r rVar, Lifecycle.Event event) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().c(this);
                }
            });
            a11.c();
            SavedStateHandleSupport.c(this);
            if (i11 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new d(this));
            addOnContextAvailableListener(new b(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        q0.b(getWindow().getDecorView(), this);
        r0.b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.b(getWindow().getDecorView(), this);
        j.a(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Context context) {
        Bundle b11 = getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b11 != null) {
            this.mActivityResultRegistry.g(b11);
        }
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(m mVar) {
        this.mMenuHostHelper.c(mVar);
    }

    public final void addOnConfigurationChangedListener(androidx.core.util.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(d.b bVar) {
        this.mContextAwareHelper.a(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(androidx.core.util.a<g> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(androidx.core.util.a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(androidx.core.util.a<o> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(androidx.core.util.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f1381b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new o0();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public g3.a getDefaultViewModelCreationExtras() {
        g3.d dVar = new g3.d();
        if (getApplication() != null) {
            dVar.c(l0.a.f10758h, getApplication());
        }
        dVar.c(SavedStateHandleSupport.f10689a, this);
        dVar.c(SavedStateHandleSupport.f10690b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.c(SavedStateHandleSupport.f10691c, getIntent().getExtras());
        }
        return dVar;
    }

    public l0.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new f0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f1380a;
        }
        return null;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final n3.b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public o0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (!this.mActivityResultRegistry.b(i11, i12, intent)) {
            super.onActivityResult(i11, i12, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.a<Configuration>> it2 = this.mOnConfigurationChangedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        ReportFragment.g(this);
        if (androidx.core.os.a.d()) {
            this.mOnBackPressedDispatcher.g(d.a(this));
        }
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    public boolean onCreatePanelMenu(int i11, Menu menu) {
        if (i11 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i11, menu);
        this.mMenuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z11) {
        if (!this.mDispatchingOnMultiWindowModeChanged) {
            Iterator<androidx.core.util.a<g>> it2 = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it2.hasNext()) {
                it2.next().accept(new g(z11));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.a<Intent>> it2 = this.mOnNewIntentListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(intent);
        }
    }

    public void onPanelClosed(int i11, Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i11, menu);
    }

    public void onPictureInPictureModeChanged(boolean z11) {
        if (!this.mDispatchingOnPictureInPictureModeChanged) {
            Iterator<androidx.core.util.a<o>> it2 = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it2.hasNext()) {
                it2.next().accept(new o(z11));
            }
        }
    }

    public boolean onPreparePanel(int i11, View view, Menu menu) {
        if (i11 != 0) {
            return true;
        }
        super.onPreparePanel(i11, view, menu);
        this.mMenuHostHelper.k(menu);
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.b(i11, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        o0 o0Var = this.mViewModelStore;
        if (o0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            o0Var = eVar.f1381b;
        }
        if (o0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f1380a = onRetainCustomNonConfigurationInstance;
        eVar2.f1381b = o0Var;
        return eVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof t) {
            ((t) lifecycle).o(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    public void onTrimMemory(int i11) {
        super.onTrimMemory(i11);
        Iterator<androidx.core.util.a<Integer>> it2 = this.mOnTrimMemoryListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(Integer.valueOf(i11));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(e.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.a<O> aVar2) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    public void removeMenuProvider(m mVar) {
        this.mMenuHostHelper.l(mVar);
    }

    public final void removeOnConfigurationChangedListener(androidx.core.util.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(d.b bVar) {
        this.mContextAwareHelper.e(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(androidx.core.util.a<g> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(androidx.core.util.a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(androidx.core.util.a<o> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(androidx.core.util.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    public void reportFullyDrawn() {
        try {
            if (x3.a.d()) {
                x3.a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            x3.a.b();
        }
    }

    public void setContentView(int i11) {
        initViewTreeOwners();
        super.setContentView(i11);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i11) {
        super.startActivityForResult(intent, i11);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14);
    }

    public void addMenuProvider(m mVar, r rVar) {
        this.mMenuHostHelper.d(mVar, rVar);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i11, Bundle bundle) {
        super.startActivityForResult(intent, i11, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(m mVar, r rVar, Lifecycle.State state) {
        this.mMenuHostHelper.e(mVar, rVar, state);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z11, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z11, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<androidx.core.util.a<g>> it2 = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it2.hasNext()) {
                it2.next().accept(new g(z11, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z11, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z11, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<androidx.core.util.a<o>> it2 = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it2.hasNext()) {
                it2.next().accept(new o(z11, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    public final <I, O> androidx.activity.result.b<I> registerForActivityResult(e.a<I, O> aVar, androidx.activity.result.a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i11) {
        this();
        this.mContentLayoutId = i11;
    }
}
