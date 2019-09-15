package designpatterns.structural.bridge.demo;

import java.util.List;

public class HtmlFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append("<html>");
		builder.append("<title>");
		builder.append(header);
		builder.append("</title>");
		builder.append("<body>");
		builder.append("<ol>");
		for (Detail detail : details) {
			builder.append("<li>");
			builder.append(detail.getLabel());
			builder.append(detail.getValue());
			builder.append("</li>");
		}
		builder.append("</ol>");
		builder.append("</body>");
		builder.append("</html>");
		return builder.toString();
	}

}
