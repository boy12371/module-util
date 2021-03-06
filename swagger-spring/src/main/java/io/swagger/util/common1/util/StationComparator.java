package io.swagger.util.common1.util;

import java.util.Comparator;

public class StationComparator implements Comparator<Station> {

	public int compare(Station o1, Station o2) {
		int index1 = Integer.parseInt(o1.getIndex());
		int index2 = Integer.parseInt(o2.getIndex());
		if (index1 > index2) {
			return 1;
		} else if (index1 < index2) {
			return -1;
		}
		return 0;
	}

}
