package comparators;

import java.util.Comparator;

import comparables.Table;

public class TableComparatorByColor implements Comparator<Table>{
	@Override
	public int compare(Table o1, Table o2) {
		return o1.getColor().compareTo(o2.getColor());
	}
	
}
