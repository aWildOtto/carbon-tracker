package com.example.ottot.carbontracker.UI;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.example.ottot.carbontracker.R;
import com.example.ottot.carbontracker.data.DataPack;

/**
 * Created by ottot on 4/2/2017.
 *
 *  SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreference(getBaseContext());
 **** = getPrefs.get<Type>("<key>",<defaultValue>);
 * TODO: get setting from pref,
 * TODO: for language, change resource directory in the welcome screen(User is reminded to restart the app to see change)
 * TODO: for unit, save Unit setting into DataPack, change the unit shown accordingly
 *
 */

public class preferencesSetting extends PreferenceFragment {

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);


            setUpAboutPage();
        }



        private void setUpAboutPage() {
            Preference about = findPreference("about");
            about.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                @Override
                public boolean onPreferenceClick(Preference preference) {
                    Intent goToAbout = about_page.makeIntent(getActivity());
                    startActivity(goToAbout);
                    return false;
                }
            });
        }


}
