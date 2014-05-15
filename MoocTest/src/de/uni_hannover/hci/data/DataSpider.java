package de.uni_hannover.hci.data;

import de.uni_hannover.hci.data.FeedReaderContract.FeedEntry;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

public class DataSpider {

	FeedReaderDbHelper mDbHelper = new FeedReaderDbHelper(null);
	// Gets the data repository in write mode
	SQLiteDatabase dbw = mDbHelper.getWritableDatabase();
	SQLiteDatabase dbr = mDbHelper.getReadableDatabase();
	private  long rowId;

	public void insertData(String id) {
		// Create a new map of values, where column names are the keys
		ContentValues values = new ContentValues();
		values.put(FeedEntry.COLUMN_NAME_NUMBER_ID, id);

		// Insert the new row, returning the primary key value of the new row
		new insertDataTask().execute(values);
	}

	private class insertDataTask extends AsyncTask<ContentValues, Void, Void> {
		protected Void doInBackground(ContentValues... values) {
			ContentValues value = values[0];
			rowId = dbw.insert(FeedEntry.TABLE_NAME, null, value);
			return null;
		}

		protected void onProgressUpdate(Integer... progress) {
			
		}

		protected void onPostExecute(Long result) {
			
		}

	}

	public void updateData(String colum, String content) {
		// New value for one column
		ContentValues values = new ContentValues();
		values.put(colum, content);

		// Which row to update, based on the ID
		String selection = FeedEntry.COLUMN_NAME_NUMBER_ID + " LIKE ?";
		String[] selectionArgs = { String.valueOf(rowId) };

		int count = dbr.update(FeedReaderDbHelper.FeedEntry.TABLE_NAME, values,
				selection, selectionArgs);
	}
}
