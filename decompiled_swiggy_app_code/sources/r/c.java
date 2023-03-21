package r;

import org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages;
import org.jetbrains.kotlin.diagnostics.rendering.DiagnosticFactoryToRendererMap;
import org.jetbrains.kotlin.diagnostics.rendering.Renderers;

/* compiled from: ComposeErrorMessages.kt */
public final class c implements DefaultErrorMessages.Extension {

    /* renamed from: a  reason: collision with root package name */
    private final DiagnosticFactoryToRendererMap f16405a;

    public c() {
        DiagnosticFactoryToRendererMap diagnosticFactoryToRendererMap = new DiagnosticFactoryToRendererMap("Compose");
        this.f16405a = diagnosticFactoryToRendererMap;
        diagnosticFactoryToRendererMap.put(d.f16407b, "@Composable invocations can only happen from the context of a @Composable function");
        diagnosticFactoryToRendererMap.put(d.f16408c, "Functions which invoke @Composable functions must be marked with the @Composable annotation");
        diagnosticFactoryToRendererMap.put(d.f16409d, "Function References of @Composable functions are not currently supported");
        diagnosticFactoryToRendererMap.put(d.j, "Composable calls are not allowed inside the {0} parameter of {1}", Renderers.NAME, Renderers.COMPACT);
        diagnosticFactoryToRendererMap.put(d.k, "Parameter {0} cannot be inlined inside of lambda argument {1} of {2} without also being annotated with @DisallowComposableCalls", Renderers.NAME, Renderers.NAME, Renderers.NAME);
        diagnosticFactoryToRendererMap.put(d.f16415l, "Composables marked with @ReadOnlyComposable can only call other @ReadOnlyComposable composables");
        diagnosticFactoryToRendererMap.put(d.f16410e, "Composable properties are not able to have backing fields");
        diagnosticFactoryToRendererMap.put(d.f16416m, "Conflicting overloads: {0}", Renderers.commaSeparated(Renderers.FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS));
        diagnosticFactoryToRendererMap.put(d.f16411f, "Composable properties are not able to have backing fields");
        diagnosticFactoryToRendererMap.put(d.f16412g, "Composable properties are not able to have backing fields");
        diagnosticFactoryToRendererMap.put(d.f16413h, "Abstract Composable functions cannot have parameters with default values");
        diagnosticFactoryToRendererMap.put(d.f16414i, "Composable main functions are not currently supported");
        diagnosticFactoryToRendererMap.put(d.n, "Try catch is not supported around composable function invocations.");
        diagnosticFactoryToRendererMap.put(d.f16417o, "Type inference failed. Expected type mismatch: inferred type is {1} but {0} was expected", Renderers.RENDER_TYPE_WITH_ANNOTATIONS, Renderers.RENDER_TYPE_WITH_ANNOTATIONS);
    }
}
