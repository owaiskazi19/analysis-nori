package org.opensearch.plugin.analysis.nori;

import org.opensearch.sdk.BaseExtension;
import org.opensearch.sdk.ExtensionsRunner;

import java.io.IOException;

public class AnalysisNoriExtension extends BaseExtension {

    private static final String EXTENSION_SETTINGS_PATH = "/nori-extension.yml";
    public AnalysisNoriExtension() {
        super(EXTENSION_SETTINGS_PATH);
    }

    public static void main(String[] args) throws IOException {
        // Execute this extension by instantiating it and passing to ExtensionsRunner
        ExtensionsRunner.run(new AnalysisNoriExtension());
    }
}
