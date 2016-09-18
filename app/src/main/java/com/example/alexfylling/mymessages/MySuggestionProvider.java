package com.example.alexfylling.mymessages;

import android.content.SearchRecentSuggestionsProvider;
import android.util.Log;

/**
 * Created by alexfylling on 16.09.2016.
 */

public class MySuggestionProvider extends SearchRecentSuggestionsProvider{
    public static final String AUTHORITY = "com.example.alexfylling.mymessages.com.example.alexfylling.mymessages.MySuggestionProvider";
    public static final int MODE = DATABASE_MODE_QUERIES;  // Configures database to record recent queries

    public MySuggestionProvider() {
        Log.i("Search","com.example.alexfylling.mymessages.MySuggestionProvider");
        setupSuggestions(AUTHORITY,MODE);
    }
}

