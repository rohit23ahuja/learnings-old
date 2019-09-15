package designpatterns.structural.bridge.demo;

import java.util.List;

public abstract class Printer {
	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}

	abstract protected String getHeader();

	abstract protected List<Detail> getDetails();
}
