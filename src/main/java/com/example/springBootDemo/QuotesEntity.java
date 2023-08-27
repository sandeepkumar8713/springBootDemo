package com.example.springBootDemo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record QuotesEntity(List<Quote> quotes) { }
