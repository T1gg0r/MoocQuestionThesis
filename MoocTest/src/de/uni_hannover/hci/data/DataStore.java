package de.uni_hannover.hci.data;

public class DataStore {

	private static String id = null;
	private static String q3 = null;
	private static String q4 = null;
	private static String q5 = null;
	private static String q6 = null;

	public static void setData(DataTypes type, String data) {

		if (type == DataTypes.ID && id == null) id = data;
		else if (type == DataTypes.Q3 && q3 == null) q3 = data;
		else if (type == DataTypes.Q4 && q4 == null) q4 = data;
		else if (type == DataTypes.Q5 && q5 == null) q5 = data;
		else if (type == DataTypes.Q6 && q6 == null) q6 = data;

	}

	public static String getData(DataTypes type) {
		
		if (type == DataTypes.ID && id != null) return id;
		else if (type == DataTypes.Q3 && q3 != null) return q3;
		else if (type == DataTypes.Q4 && q4 != null) return q4;
		else if (type == DataTypes.Q5 && q5 != null) return q5;
		else if (type == DataTypes.Q6 && q6 != null) return q6;
		else return "";
	}

	public static void deleteData(DataTypes type) {
		if (type == DataTypes.ID && id != null) id = null;
		else if (type == DataTypes.Q3 && q3 != null) q3 = null;
		else if (type == DataTypes.Q4 && q4 != null) q4 = null;
		else if (type == DataTypes.Q5 && q5 != null) q5 = null;
		else if (type == DataTypes.Q6 && q6 != null) q6 = null;
	}

	public static void printData() {
		System.out.println(id + ";" + q3 + ";" + q4 + ";" + q5 + ";" + q6);
	}

}
