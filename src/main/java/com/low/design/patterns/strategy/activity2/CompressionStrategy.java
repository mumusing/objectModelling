package com.low.design.patterns.strategy.activity2;

import java.util.List;

//Define strategy

public interface CompressionStrategy {

    void compressFiles(List<String> fileList);

}
