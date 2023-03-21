package i3;

import android.os.Message;
import android.view.Choreographer;
import android.view.View;
import com.newrelic.agent.android.agentdata.HexAttribute;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: JankStatsApi22Impl.kt */
public final class d extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, Choreographer choreographer, List<q> list) {
        super(view, choreographer, list);
        p.j(view, "decorView");
        p.j(choreographer, "choreographer");
        p.j(list, "delegates");
    }

    public void f(Message message) {
        p.j(message, HexAttribute.HEX_ATTR_MESSAGE);
        message.setAsynchronous(true);
    }
}
