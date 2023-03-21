package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.r;
import b7.d;
import z6.b;

/* compiled from: GenericViewTarget.kt */
public abstract class GenericViewTarget<T extends View> implements b<T>, d, DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private boolean f13684a;

    private final void i() {
        Drawable a11 = a();
        Animatable animatable = a11 instanceof Animatable ? (Animatable) a11 : null;
        if (animatable != null) {
            if (this.f13684a) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }

    private final void j(Drawable drawable) {
        Drawable a11 = a();
        Animatable animatable = a11 instanceof Animatable ? (Animatable) a11 : null;
        if (animatable != null) {
            animatable.stop();
        }
        h(drawable);
        i();
    }

    public abstract Drawable a();

    public void e(Drawable drawable) {
        j(drawable);
    }

    public void f(Drawable drawable) {
        j(drawable);
    }

    public void g(Drawable drawable) {
        j(drawable);
    }

    public abstract void h(Drawable drawable);

    public /* synthetic */ void onCreate(r rVar) {
        androidx.lifecycle.d.a(this, rVar);
    }

    public /* synthetic */ void onDestroy(r rVar) {
        androidx.lifecycle.d.b(this, rVar);
    }

    public /* synthetic */ void onPause(r rVar) {
        androidx.lifecycle.d.c(this, rVar);
    }

    public /* synthetic */ void onResume(r rVar) {
        androidx.lifecycle.d.d(this, rVar);
    }

    public void onStart(r rVar) {
        this.f13684a = true;
        i();
    }

    public void onStop(r rVar) {
        this.f13684a = false;
        i();
    }
}
