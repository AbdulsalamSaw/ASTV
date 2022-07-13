package com.ssgosoft.astv.Model;

public class MovieModel {
    private  String name;
    private  String path;
    public MovieModel(String name,String path)
    {
        this.name=name;
        this.path=path;

    }
    public String getNameMovie()
    {
        return  name;

    }
    public String getPathMovie()
    {
        return  path;
    }
}
