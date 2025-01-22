package com.reto.literatura.service;

public interface IDataConvertion {
    <T> T convertData(String json, Class<T> clase);
}
