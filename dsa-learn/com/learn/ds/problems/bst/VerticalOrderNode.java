package com.learn.ds.problems.bst;

public class VerticalOrderNode extends Node{
private Integer hd;

public Integer getHd() {
	return hd;
}

public void setHd(Integer hd) {
	this.hd = hd;
}

@Override
public String toString() {
	return "VerticalOrderNode [hd=" + hd + " data ="+getData()+"]";
}

}
