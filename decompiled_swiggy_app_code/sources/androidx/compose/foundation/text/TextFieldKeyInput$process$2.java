package androidx.compose.foundation.text;

import a0.b;
import a0.w;
import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.p;
import lp0.l;
import v1.d;

/* compiled from: TextFieldKeyInput.kt */
final class TextFieldKeyInput$process$2 extends Lambda implements l<b0.l, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ KeyCommand f4557a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextFieldKeyInput f4558b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ref$BooleanRef f4559c;

    /* compiled from: TextFieldKeyInput.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4568a;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            iArr[KeyCommand.COPY.ordinal()] = 1;
            iArr[KeyCommand.PASTE.ordinal()] = 2;
            iArr[KeyCommand.CUT.ordinal()] = 3;
            iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            iArr[KeyCommand.UP.ordinal()] = 10;
            iArr[KeyCommand.DOWN.ordinal()] = 11;
            iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            iArr[KeyCommand.LINE_START.ordinal()] = 14;
            iArr[KeyCommand.LINE_END.ordinal()] = 15;
            iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            iArr[KeyCommand.HOME.ordinal()] = 18;
            iArr[KeyCommand.END.ordinal()] = 19;
            iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            iArr[KeyCommand.TAB.ordinal()] = 27;
            iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            iArr[KeyCommand.DESELECT.ordinal()] = 45;
            iArr[KeyCommand.UNDO.ordinal()] = 46;
            iArr[KeyCommand.REDO.ordinal()] = 47;
            iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            f4568a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldKeyInput$process$2(KeyCommand keyCommand, TextFieldKeyInput textFieldKeyInput, Ref$BooleanRef ref$BooleanRef) {
        super(1);
        this.f4557a = keyCommand;
        this.f4558b = textFieldKeyInput;
        this.f4559c = ref$BooleanRef;
    }

    public final void a(b0.l lVar) {
        TextFieldValue g11;
        TextFieldValue c11;
        p.j(lVar, "$this$commandExecutionContext");
        switch (a.f4568a[this.f4557a.ordinal()]) {
            case 1:
                this.f4558b.g().k(false);
                return;
            case 2:
                this.f4558b.g().L();
                return;
            case 3:
                this.f4558b.g().o();
                return;
            case 4:
                lVar.b(AnonymousClass1.f4560a);
                return;
            case 5:
                lVar.c(AnonymousClass2.f4561a);
                return;
            case 6:
                lVar.D();
                return;
            case 7:
                lVar.L();
                return;
            case 8:
                lVar.I();
                return;
            case 9:
                lVar.F();
                return;
            case 10:
                lVar.S();
                return;
            case 11:
                lVar.B();
                return;
            case 12:
                lVar.e0();
                return;
            case 13:
                lVar.d0();
                return;
            case 14:
                lVar.R();
                return;
            case 15:
                lVar.O();
                return;
            case 16:
                lVar.P();
                return;
            case 17:
                lVar.Q();
                return;
            case 18:
                lVar.N();
                return;
            case 19:
                lVar.M();
                return;
            case 20:
                List<d> a02 = lVar.a0(AnonymousClass3.f4562a);
                if (a02 != null) {
                    this.f4558b.d(a02);
                    return;
                }
                return;
            case 21:
                List<d> a03 = lVar.a0(AnonymousClass4.f4563a);
                if (a03 != null) {
                    this.f4558b.d(a03);
                    return;
                }
                return;
            case 22:
                List<d> a04 = lVar.a0(AnonymousClass5.f4564a);
                if (a04 != null) {
                    this.f4558b.d(a04);
                    return;
                }
                return;
            case 23:
                List<d> a05 = lVar.a0(AnonymousClass6.f4565a);
                if (a05 != null) {
                    this.f4558b.d(a05);
                    return;
                }
                return;
            case 24:
                List<d> a06 = lVar.a0(AnonymousClass7.f4566a);
                if (a06 != null) {
                    this.f4558b.d(a06);
                    return;
                }
                return;
            case 25:
                List<d> a07 = lVar.a0(AnonymousClass8.f4567a);
                if (a07 != null) {
                    this.f4558b.d(a07);
                    return;
                }
                return;
            case 26:
                if (!this.f4558b.h()) {
                    this.f4558b.e(new v1.a("\n", 1));
                    return;
                } else {
                    this.f4559c.f25661a = false;
                    return;
                }
            case 27:
                if (!this.f4558b.h()) {
                    this.f4558b.e(new v1.a("\t", 1));
                    return;
                } else {
                    this.f4559c.f25661a = false;
                    return;
                }
            case 28:
                lVar.T();
                return;
            case 29:
                ((b0.l) lVar.C()).U();
                return;
            case 30:
                ((b0.l) lVar.K()).U();
                return;
            case 31:
                ((b0.l) lVar.D()).U();
                return;
            case 32:
                ((b0.l) lVar.L()).U();
                return;
            case 33:
                ((b0.l) lVar.I()).U();
                return;
            case 34:
                ((b0.l) lVar.F()).U();
                return;
            case 35:
                ((b0.l) lVar.R()).U();
                return;
            case 36:
                ((b0.l) lVar.O()).U();
                return;
            case 37:
                ((b0.l) lVar.P()).U();
                return;
            case 38:
                ((b0.l) lVar.Q()).U();
                return;
            case 39:
                ((b0.l) lVar.S()).U();
                return;
            case 40:
                ((b0.l) lVar.B()).U();
                return;
            case 41:
                lVar.e0().U();
                return;
            case 42:
                lVar.d0().U();
                return;
            case 43:
                ((b0.l) lVar.N()).U();
                return;
            case 44:
                ((b0.l) lVar.M()).U();
                return;
            case 45:
                lVar.d();
                return;
            case 46:
                w i11 = this.f4558b.i();
                if (i11 != null) {
                    i11.b(lVar.b0());
                }
                w i12 = this.f4558b.i();
                if (i12 != null && (g11 = i12.g()) != null) {
                    this.f4558b.j.invoke(g11);
                    return;
                }
                return;
            case 47:
                w i13 = this.f4558b.i();
                if (i13 != null && (c11 = i13.c()) != null) {
                    this.f4558b.j.invoke(c11);
                    return;
                }
                return;
            case 48:
                b.b();
                return;
            default:
                return;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((b0.l) obj);
        return k.f22762a;
    }
}
