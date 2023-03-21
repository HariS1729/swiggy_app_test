package androidx.constraintlayout.core.parser;

import java.util.ArrayList;

/* compiled from: CLKey */
public class d extends b {

    /* renamed from: g  reason: collision with root package name */
    private static ArrayList<String> f8102g;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f8102g = arrayList;
        arrayList.add("ConstraintSets");
        f8102g.add("Variables");
        f8102g.add("Generate");
        f8102g.add("Transitions");
        f8102g.add("KeyFrames");
        f8102g.add("KeyAttributes");
        f8102g.add("KeyPositions");
        f8102g.add("KeyCycles");
    }

    public d(char[] cArr) {
        super(cArr);
    }

    public static c N(char[] cArr) {
        return new d(cArr);
    }

    public c O() {
        if (this.f8096f.size() > 0) {
            return this.f8096f.get(0);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String q() {
        if (this.f8096f.size() > 0) {
            return g() + c() + ": " + this.f8096f.get(0).q();
        }
        return g() + c() + ": <> ";
    }
}
