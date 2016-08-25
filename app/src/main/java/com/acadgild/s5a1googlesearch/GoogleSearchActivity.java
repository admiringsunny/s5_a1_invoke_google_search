package com.acadgild.s5a1googlesearch;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GoogleSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_search);
    }

    public void webSearch(View view){
        EditText srchStrEditTxt = (EditText) findViewById(R.id.search_string);
        String searchStr = srchStrEditTxt.getText().toString() ;


        if (!searchStr.equals("")){
            Intent openContactSIntent = new Intent(Intent.ACTION_WEB_SEARCH);
            openContactSIntent.putExtra(SearchManager.QUERY, searchStr);
            startActivity(openContactSIntent);
        }
        else
            srchStrEditTxt.setError(getResources().getText(R.string.empty_edit_text_error));
    }
}
