package com.github.lizardev.xquery.saxon.support.trace;


import javax.annotation.Nullable;

public interface TraceExtensionProvider {

    @Nullable TraceExtension getTraceExtension();
}
