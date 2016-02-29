package interfacedesign.ligo.michael.ligoapp.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;
import interfacedesign.ligo.michael.ligoapp.R;

/**
 * Created by Mike on 2/29/16.
 */
public class FAQActivity extends ActionBarActivity {

    @Bind(R.id.toolbar)
    Toolbar mainToolbar;


    @Override
    public  void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        ButterKnife.bind(this);

    }
}
