package marieetraphael.utils;

public class Anchor {
	String href;
	String label;
	
	private Anchor() {
		super();
	}
	
	public static Anchor of(String href, String label) {
		Anchor instance = new Anchor();
		instance.href = href;
		instance.label = label;
		return instance;
	}

	public String getHref() {
		return href;
	}

	public String getLabel() {
		return label;
	}
}
