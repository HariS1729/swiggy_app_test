package r;

import java.util.Collection;
import kotlin.jvm.internal.p;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory0;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory1;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory2;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory3;
import org.jetbrains.kotlin.diagnostics.Errors;
import org.jetbrains.kotlin.diagnostics.PositioningStrategies;
import org.jetbrains.kotlin.diagnostics.Severity;
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression;
import org.jetbrains.kotlin.psi.KtExpression;
import org.jetbrains.kotlin.types.KotlinType;

/* compiled from: ComposeErrors.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f16406a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final DiagnosticFactory0<PsiElement> f16407b;

    /* renamed from: c  reason: collision with root package name */
    public static final DiagnosticFactory0<PsiElement> f16408c;

    /* renamed from: d  reason: collision with root package name */
    public static final DiagnosticFactory0<KtCallableReferenceExpression> f16409d;

    /* renamed from: e  reason: collision with root package name */
    public static final DiagnosticFactory0<PsiElement> f16410e;

    /* renamed from: f  reason: collision with root package name */
    public static final DiagnosticFactory0<PsiElement> f16411f;

    /* renamed from: g  reason: collision with root package name */
    public static final DiagnosticFactory0<PsiElement> f16412g;

    /* renamed from: h  reason: collision with root package name */
    public static final DiagnosticFactory0<PsiElement> f16413h;

    /* renamed from: i  reason: collision with root package name */
    public static final DiagnosticFactory0<PsiElement> f16414i;
    public static final DiagnosticFactory2<PsiElement, DeclarationDescriptor, DeclarationDescriptor> j;
    public static final DiagnosticFactory3<PsiElement, ValueParameterDescriptor, ValueParameterDescriptor, CallableDescriptor> k;

    /* renamed from: l  reason: collision with root package name */
    public static final DiagnosticFactory0<PsiElement> f16415l;

    /* renamed from: m  reason: collision with root package name */
    public static DiagnosticFactory1<PsiElement, Collection<DeclarationDescriptor>> f16416m;
    public static final DiagnosticFactory0<PsiElement> n;

    /* renamed from: o  reason: collision with root package name */
    public static final DiagnosticFactory2<KtExpression, KotlinType, KotlinType> f16417o;

    static {
        DiagnosticFactory0<PsiElement> create = DiagnosticFactory0.create(Severity.ERROR);
        p.i(create, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        f16407b = create;
        DiagnosticFactory0<PsiElement> create2 = DiagnosticFactory0.create(Severity.ERROR);
        p.i(create2, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        f16408c = create2;
        DiagnosticFactory0<KtCallableReferenceExpression> create3 = DiagnosticFactory0.create(Severity.ERROR);
        p.i(create3, "create<KtCallableReferen… Severity.ERROR\n        )");
        f16409d = create3;
        DiagnosticFactory0<PsiElement> create4 = DiagnosticFactory0.create(Severity.ERROR);
        p.i(create4, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        f16410e = create4;
        DiagnosticFactory0<PsiElement> create5 = DiagnosticFactory0.create(Severity.ERROR);
        p.i(create5, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        f16411f = create5;
        DiagnosticFactory0<PsiElement> create6 = DiagnosticFactory0.create(Severity.ERROR);
        p.i(create6, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        f16412g = create6;
        DiagnosticFactory0<PsiElement> create7 = DiagnosticFactory0.create(Severity.ERROR);
        p.i(create7, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        f16413h = create7;
        DiagnosticFactory0<PsiElement> create8 = DiagnosticFactory0.create(Severity.ERROR);
        p.i(create8, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        f16414i = create8;
        DiagnosticFactory2<PsiElement, DeclarationDescriptor, DeclarationDescriptor> create9 = DiagnosticFactory2.create(Severity.ERROR);
        p.i(create9, "create<PsiElement, Decla… Severity.ERROR\n        )");
        j = create9;
        DiagnosticFactory3<PsiElement, ValueParameterDescriptor, ValueParameterDescriptor, CallableDescriptor> create10 = DiagnosticFactory3.create(Severity.ERROR);
        p.i(create10, "create<\n            PsiE… Severity.ERROR\n        )");
        k = create10;
        DiagnosticFactory0<PsiElement> create11 = DiagnosticFactory0.create(Severity.ERROR);
        p.i(create11, "create<PsiElement>(\n        Severity.ERROR\n    )");
        f16415l = create11;
        DiagnosticFactory1<PsiElement, Collection<DeclarationDescriptor>> create12 = DiagnosticFactory1.create(Severity.ERROR, PositioningStrategies.DECLARATION_SIGNATURE_OR_DEFAULT);
        p.i(create12, "create(\n            Seve…TURE_OR_DEFAULT\n        )");
        f16416m = create12;
        DiagnosticFactory0<PsiElement> create13 = DiagnosticFactory0.create(Severity.ERROR);
        p.i(create13, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        n = create13;
        DiagnosticFactory2<KtExpression, KotlinType, KotlinType> create14 = DiagnosticFactory2.create(Severity.ERROR);
        p.i(create14, "create<KtExpression, Kot… Severity.ERROR\n        )");
        f16417o = create14;
        Errors.Initializer.initializeFactoryNamesAndDefaultErrorMessages(d.class, new c());
    }

    private d() {
    }
}
