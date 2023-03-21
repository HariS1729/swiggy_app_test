package wh0;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import in.swiggy.android.swiggylynx.R;
import j3.b;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mg0.g;
import os.u;

@Instrumented
/* compiled from: HelpOverlayCustomDialogFragment.kt */
public final class c extends androidx.fragment.app.c implements TraceFieldInterface {
    public static final a Companion = new a((i) null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f19952c;

    /* renamed from: a  reason: collision with root package name */
    public g f19953a;

    /* renamed from: b  reason: collision with root package name */
    public Trace f19954b;

    /* compiled from: HelpOverlayCustomDialogFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c a() {
            c cVar = new c();
            cVar.setCancelable(false);
            return cVar;
        }
    }

    static {
        String simpleName = c.class.getSimpleName();
        p.i(simpleName, "HelpOverlayCustomDialogF…nt::class.java.simpleName");
        f19952c = simpleName;
    }

    /* access modifiers changed from: private */
    public static final void g0(c cVar, View view) {
        p.j(cVar, "this$0");
        b.a(cVar.getActivity()).edit().putInt("chat_open_count", b.a(cVar.getActivity()).getInt("chat_open_count", 0) + 1).apply();
        cVar.dismissAllowingStateLoss();
        FragmentActivity activity = cVar.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void h0(c cVar, View view) {
        Context applicationContext;
        p.j(cVar, "this$0");
        cVar.dismissAllowingStateLoss();
        FragmentActivity activity = cVar.getActivity();
        if (activity != null) {
            activity.finish();
        }
        FragmentActivity activity2 = cVar.getActivity();
        String str = null;
        if (!(activity2 == null || (applicationContext = activity2.getApplicationContext()) == null)) {
            str = applicationContext.getPackageName();
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(p.s("package:", str)));
        FragmentActivity activity3 = cVar.getActivity();
        if (activity3 != null) {
            activity3.startActivity(intent);
        }
    }

    public final g f0() {
        g gVar = this.f19953a;
        if (gVar != null) {
            return gVar;
        }
        p.B("binding");
        return null;
    }

    public final void i0(g gVar) {
        p.j(gVar, "<set-?>");
        this.f19953a = gVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            TraceMachine.enterMethod(this.f19954b, "HelpOverlayCustomDialogFragment#onCreateView", (ArrayList<String>) null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod((Trace) null, "HelpOverlayCustomDialogFragment#onCreateView", (ArrayList<String>) null);
        }
        p.j(layoutInflater, "inflater");
        g x02 = g.x0(layoutInflater, viewGroup, false);
        p.i(x02, "inflate(inflater, container, false)");
        i0(x02);
        View G = f0().G();
        p.i(G, "binding.root");
        TraceMachine.exitMethod();
        return G;
    }

    public void onStart() {
        Window window;
        Window window2;
        WindowManager windowManager;
        Display defaultDisplay;
        super.onStart();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (!(activity == null || (windowManager = activity.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        Dialog dialog = getDialog();
        if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
            window2.setLayout((int) (((double) displayMetrics.widthPixels) * 0.87d), -2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        p.j(view, "view");
        super.onViewCreated(view, bundle);
        f0().B.setOnClickListener(new b(this));
        f0().C.setOnClickListener(new a(this));
    }

    public void show(FragmentManager fragmentManager, String str) {
        p.j(fragmentManager, "manager");
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException e11) {
            u.h(f19952c, e11);
        }
    }
}
