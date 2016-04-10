package marieetraphael.utils;

import java.util.ArrayList;
import java.util.List;

public class AnchorList {
	List<Anchor> list;
	
	private AnchorList() {
		super();
	}
	
	public static AnchorList of() {
		AnchorList instance = new AnchorList();
		instance.list = new ArrayList<Anchor>();
		return instance; 
	}

	public void add(String href, String label) {
		this.list.add(Anchor.of(href, label));
	}
	
	public List<Anchor> getList() {
		return list;
	}
}
