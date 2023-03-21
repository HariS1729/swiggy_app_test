package androidx.compose.foundation.text;

import a0.c;
import a0.j;
import android.view.KeyEvent;
import d1.d;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: KeyMapping.kt */
public final class KeyMappingKt {

    /* renamed from: a  reason: collision with root package name */
    private static final c f4463a = new b(a(KeyMappingKt$defaultKeyMapping$1.f4466a));

    /* compiled from: KeyMapping.kt */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<d1.b, Boolean> f4464a;

        a(l<? super d1.b, Boolean> lVar) {
            this.f4464a = lVar;
        }

        public KeyCommand a(KeyEvent keyEvent) {
            p.j(keyEvent, "event");
            if (!this.f4464a.invoke(d1.b.a(keyEvent)).booleanValue() || !d.e(keyEvent)) {
                if (this.f4464a.invoke(d1.b.a(keyEvent)).booleanValue()) {
                    long a11 = d.a(keyEvent);
                    j jVar = j.f838a;
                    if (d1.a.l(a11, jVar.d()) ? true : d1.a.l(a11, jVar.m())) {
                        return KeyCommand.COPY;
                    }
                    if (d1.a.l(a11, jVar.t())) {
                        return KeyCommand.PASTE;
                    }
                    if (d1.a.l(a11, jVar.u())) {
                        return KeyCommand.CUT;
                    }
                    if (d1.a.l(a11, jVar.a())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (d1.a.l(a11, jVar.v())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                } else if (d.d(keyEvent)) {
                    return null;
                } else {
                    if (d.e(keyEvent)) {
                        long a12 = d.a(keyEvent);
                        j jVar2 = j.f838a;
                        if (d1.a.l(a12, jVar2.h())) {
                            return KeyCommand.SELECT_LEFT_CHAR;
                        }
                        if (d1.a.l(a12, jVar2.i())) {
                            return KeyCommand.SELECT_RIGHT_CHAR;
                        }
                        if (d1.a.l(a12, jVar2.j())) {
                            return KeyCommand.SELECT_UP;
                        }
                        if (d1.a.l(a12, jVar2.g())) {
                            return KeyCommand.SELECT_DOWN;
                        }
                        if (d1.a.l(a12, jVar2.q())) {
                            return KeyCommand.SELECT_PAGE_UP;
                        }
                        if (d1.a.l(a12, jVar2.p())) {
                            return KeyCommand.SELECT_PAGE_DOWN;
                        }
                        if (d1.a.l(a12, jVar2.o())) {
                            return KeyCommand.SELECT_LINE_START;
                        }
                        if (d1.a.l(a12, jVar2.n())) {
                            return KeyCommand.SELECT_LINE_END;
                        }
                        if (d1.a.l(a12, jVar2.m())) {
                            return KeyCommand.PASTE;
                        }
                        return null;
                    }
                    long a13 = d.a(keyEvent);
                    j jVar3 = j.f838a;
                    if (d1.a.l(a13, jVar3.h())) {
                        return KeyCommand.LEFT_CHAR;
                    }
                    if (d1.a.l(a13, jVar3.i())) {
                        return KeyCommand.RIGHT_CHAR;
                    }
                    if (d1.a.l(a13, jVar3.j())) {
                        return KeyCommand.UP;
                    }
                    if (d1.a.l(a13, jVar3.g())) {
                        return KeyCommand.DOWN;
                    }
                    if (d1.a.l(a13, jVar3.q())) {
                        return KeyCommand.PAGE_UP;
                    }
                    if (d1.a.l(a13, jVar3.p())) {
                        return KeyCommand.PAGE_DOWN;
                    }
                    if (d1.a.l(a13, jVar3.o())) {
                        return KeyCommand.LINE_START;
                    }
                    if (d1.a.l(a13, jVar3.n())) {
                        return KeyCommand.LINE_END;
                    }
                    if (d1.a.l(a13, jVar3.k())) {
                        return KeyCommand.NEW_LINE;
                    }
                    if (d1.a.l(a13, jVar3.c())) {
                        return KeyCommand.DELETE_PREV_CHAR;
                    }
                    if (d1.a.l(a13, jVar3.f())) {
                        return KeyCommand.DELETE_NEXT_CHAR;
                    }
                    if (d1.a.l(a13, jVar3.r())) {
                        return KeyCommand.PASTE;
                    }
                    if (d1.a.l(a13, jVar3.e())) {
                        return KeyCommand.CUT;
                    }
                    if (d1.a.l(a13, jVar3.s())) {
                        return KeyCommand.TAB;
                    }
                    return null;
                }
            } else if (d1.a.l(d.a(keyEvent), j.f838a.v())) {
                return KeyCommand.REDO;
            } else {
                return null;
            }
        }
    }

    /* compiled from: KeyMapping.kt */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f4465a;

        b(c cVar) {
            this.f4465a = cVar;
        }

        public KeyCommand a(KeyEvent keyEvent) {
            p.j(keyEvent, "event");
            KeyCommand keyCommand = null;
            if (d.e(keyEvent) && d.d(keyEvent)) {
                long a11 = d.a(keyEvent);
                j jVar = j.f838a;
                if (d1.a.l(a11, jVar.h())) {
                    keyCommand = KeyCommand.SELECT_LEFT_WORD;
                } else if (d1.a.l(a11, jVar.i())) {
                    keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                } else if (d1.a.l(a11, jVar.j())) {
                    keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                } else if (d1.a.l(a11, jVar.g())) {
                    keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                }
            } else if (d.d(keyEvent)) {
                long a12 = d.a(keyEvent);
                j jVar2 = j.f838a;
                if (d1.a.l(a12, jVar2.h())) {
                    keyCommand = KeyCommand.LEFT_WORD;
                } else if (d1.a.l(a12, jVar2.i())) {
                    keyCommand = KeyCommand.RIGHT_WORD;
                } else if (d1.a.l(a12, jVar2.j())) {
                    keyCommand = KeyCommand.PREV_PARAGRAPH;
                } else if (d1.a.l(a12, jVar2.g())) {
                    keyCommand = KeyCommand.NEXT_PARAGRAPH;
                } else if (d1.a.l(a12, jVar2.l())) {
                    keyCommand = KeyCommand.DELETE_PREV_CHAR;
                } else if (d1.a.l(a12, jVar2.f())) {
                    keyCommand = KeyCommand.DELETE_NEXT_WORD;
                } else if (d1.a.l(a12, jVar2.c())) {
                    keyCommand = KeyCommand.DELETE_PREV_WORD;
                } else if (d1.a.l(a12, jVar2.b())) {
                    keyCommand = KeyCommand.DESELECT;
                }
            } else if (d.e(keyEvent)) {
                long a13 = d.a(keyEvent);
                j jVar3 = j.f838a;
                if (d1.a.l(a13, jVar3.o())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (d1.a.l(a13, jVar3.n())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            }
            return keyCommand == null ? this.f4465a.a(keyEvent) : keyCommand;
        }
    }

    public static final c a(l<? super d1.b, Boolean> lVar) {
        p.j(lVar, "shortcutModifier");
        return new a(lVar);
    }

    public static final c b() {
        return f4463a;
    }
}
