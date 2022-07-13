package com.ssgosoft.astv.Model;

public class ChannelModel {
    private  String name;
    private  String path;
    public  ChannelModel(String name,String path)
    {
        this.name = name;
        this.path=path;
    }
    public String getNameChannel()
    {
        return name;
    }
    public String getPathChannel()
    {
        return  path;
    }
}
