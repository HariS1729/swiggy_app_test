package androidx.compose.runtime;

import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.h0;
import e0.l0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;

/* compiled from: ProduceState.kt */
final class e<T> implements l0<T>, h0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineContext f6127a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h0<T> f6128b;

    public e(h0<T> h0Var, CoroutineContext coroutineContext) {
        p.j(h0Var, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(coroutineContext, "coroutineContext");
        this.f6127a = coroutineContext;
        this.f6128b = h0Var;
    }

    public CoroutineContext X0() {
        return this.f6127a;
    }

    public T getValue() {
        return this.f6128b.getValue();
    }

    public void setValue(T t) {
        this.f6128b.setValue(t);
    }
}
