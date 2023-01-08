package com.low.design.patterns.strategy.activity2;

import java.util.List;

// Context

public class Compressor {

    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(List<String> fileList) {
        strategy.compressFiles(fileList);
    }

}
