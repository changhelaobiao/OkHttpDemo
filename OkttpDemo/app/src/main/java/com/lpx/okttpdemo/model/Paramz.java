package com.lpx.okttpdemo.model;

import java.util.List;

/**
 * Created by liaopeixin on 2016/6/15.
 */
public class Paramz {

    private List<Feed> feeds;

    public List<Feed> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<Feed> feeds) {
        this.feeds = feeds;
    }

    @Override
    public String toString() {
        return "Paramz{" +
                "feeds=" + feeds +
                '}';
    }
}
