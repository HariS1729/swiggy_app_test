package q1;

import java.text.CharacterIterator;
import kotlin.jvm.internal.p;

/* compiled from: CharSequenceCharacterIterator.kt */
public final class b implements CharacterIterator {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f16283a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16284b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16285c;

    /* renamed from: d  reason: collision with root package name */
    private int f16286d;

    public b(CharSequence charSequence, int i11, int i12) {
        p.j(charSequence, "charSequence");
        this.f16283a = charSequence;
        this.f16284b = i11;
        this.f16285c = i12;
        this.f16286d = i11;
    }

    public Object clone() {
        try {
            Object clone = super.clone();
            p.i(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public char current() {
        int i11 = this.f16286d;
        if (i11 == this.f16285c) {
            return 65535;
        }
        return this.f16283a.charAt(i11);
    }

    public char first() {
        this.f16286d = this.f16284b;
        return current();
    }

    public int getBeginIndex() {
        return this.f16284b;
    }

    public int getEndIndex() {
        return this.f16285c;
    }

    public int getIndex() {
        return this.f16286d;
    }

    public char last() {
        int i11 = this.f16284b;
        int i12 = this.f16285c;
        if (i11 == i12) {
            this.f16286d = i12;
            return 65535;
        }
        int i13 = i12 - 1;
        this.f16286d = i13;
        return this.f16283a.charAt(i13);
    }

    public char next() {
        int i11 = this.f16286d + 1;
        this.f16286d = i11;
        int i12 = this.f16285c;
        if (i11 < i12) {
            return this.f16283a.charAt(i11);
        }
        this.f16286d = i12;
        return 65535;
    }

    public char previous() {
        int i11 = this.f16286d;
        if (i11 <= this.f16284b) {
            return 65535;
        }
        int i12 = i11 - 1;
        this.f16286d = i12;
        return this.f16283a.charAt(i12);
    }

    public char setIndex(int i11) {
        int i12 = this.f16284b;
        boolean z11 = false;
        if (i11 <= this.f16285c && i12 <= i11) {
            z11 = true;
        }
        if (z11) {
            this.f16286d = i11;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
