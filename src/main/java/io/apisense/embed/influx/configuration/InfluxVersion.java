package io.apisense.embed.influx.configuration;

import de.flapdoodle.embed.process.distribution.IVersion;

public enum InfluxVersion implements IVersion {
    PRODUCTION("1.7.6", "releases"),
    V1_7_6("1.7.6", "releases"),
    V1_3_5("1.3.5", "releases"),
    NIGHTLY("nightly", "nightlies"),
    V2_0_0_ALPHA("2.0.0-alpha.21","releases", "_");

    public final String dlPath;
    public final String directory;
    public final String beforeVersionDlPathSeparator;

    InfluxVersion(String dlPath, String directory, String beforeVersionDlPathSeparator) {
        this.dlPath = dlPath;
        this.directory = directory;
        this.beforeVersionDlPathSeparator = beforeVersionDlPathSeparator;
    }

    InfluxVersion(String dlPath, String directory) {
        this(dlPath, directory, "-");
    }

    @Override
    public String asInDownloadPath() {
        return dlPath;
    }
}
