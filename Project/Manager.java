package softserve.javacore.project;

import java.util.Comparator;

public class Manager {
	private String name;
	private BisnecRegion region;

	public Manager(String name, BisnecRegion region) {
		this.name = name;
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public BisnecRegion getRegion() {
		return region;
	}

	public static class RegionComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Manager) o2).region.toString().compareTo(((Manager) o1).region.toString());
		}
	}

	static RegionComparator regionComparator = new RegionComparator();

	public static Comparator getRegionComparator() {
		return regionComparator;
	}

}
