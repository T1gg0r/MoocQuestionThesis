package de.uni_hannover.hci.data;

import android.provider.BaseColumns;

public final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static abstract class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "data";
        public static final String COLUMN_NAME_NUMBER_ID = "number";
        public static final String COLUMN_NAME_Q3 = "q3";
        public static final String COLUMN_NAME_Q4 = "q4";
        
    }
}
