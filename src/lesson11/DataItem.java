package lesson11;

class DataItem { // (could have more data)
	private int iData; // data item (key)
	private String value;

	// --------------------------------------------------------------
	public DataItem(int ii, String v) // constructor
	{
		iData = ii;
		value = v;
	}

	// --------------------------------------------------------------
	public int getKey() {
		return iData;
	}

	public String getValue() {
		return value;
	}
	// --------------------------------------------------------------
} // end class DataItem
	////////////////////////////////////////////////////////////////
