package com.low.design.patterns.strategy.activity2;

import java.util.ArrayList;
import java.util.List;

// Client

public class Main {

    public static void main(String[] args) {

        List<String> fileList = new ArrayList<>();
        fileList.add("Sample1.pptx");
        fileList.add("Sample2.pptx");

        Compressor compressor =  new Compressor();
        compressor.setCompressionStrategy(new ZipCompressionStrategy());

        compressor.createArchive(fileList);


    }

}
