package com.hillel.lesson13.homework;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task2Class1 {
    private List list;
    private Set set;
    private Map map;

    public Task2Class1(List list, Set set, Map map) {
        this.list = list;
        this.set = set;
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Task2Class1{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
