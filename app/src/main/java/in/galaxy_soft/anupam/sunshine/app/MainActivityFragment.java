package in.galaxy_soft.anupam.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_main, container, false);
        String[] fakeData = {
                "Today - Sunny - 36/21",
                "Tue - Cloudy - 35/22",
                "Wed - Mostly Cloudy - 34/22",
                "Thurs - Rainy - 31/20",
                "Fri - Partially Cloudy - 30/21",
                "Sat - Sunny - 32/21",
                "Sun - Sunny - 33/22"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(fakeData) );
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
        );
        ListView listview = (ListView) rootview.findViewById(R.id.listview_forecast);
        listview.setAdapter(mForecastAdapter);
        return rootview;
    }
}
