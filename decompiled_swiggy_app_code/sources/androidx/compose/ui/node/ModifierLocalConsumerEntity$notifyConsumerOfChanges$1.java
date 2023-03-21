package androidx.compose.ui.node;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: ModifierLocalConsumerEntity.kt */
final class ModifierLocalConsumerEntity$notifyConsumerOfChanges$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ModifierLocalConsumerEntity f6919a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModifierLocalConsumerEntity$notifyConsumerOfChanges$1(ModifierLocalConsumerEntity modifierLocalConsumerEntity) {
        super(0);
        this.f6919a = modifierLocalConsumerEntity;
    }

    public final void invoke() {
        this.f6919a.e().D(this.f6919a);
    }
}
