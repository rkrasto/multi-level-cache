package model;

import lombok.AllArgsConstructor;
import  lombok.Getter;

import  java.util.List;

@AllArgsConstructor
@Getter
public class StatsResponse {
    private final Double avgReadTime;
    private final Double angWriteTime;
    private final List<Double> usages;
}