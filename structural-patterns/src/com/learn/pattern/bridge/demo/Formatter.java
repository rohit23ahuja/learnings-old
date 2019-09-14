package com.learn.pattern.bridge.demo;

import java.util.List;

public interface Formatter {
	String format(String header, List<Detail> details);
}
