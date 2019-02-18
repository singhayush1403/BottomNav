package com.example.bottomnav;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nightonke.boommenu.BoomButtons.TextInsideCircleButton;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;


public class music extends Fragment {

View view;
    public music() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);
        BoomMenuButton boomMenuButton= (BoomMenuButton) view.findViewById(R.id.bmb);

        TextOutsideCircleButton.Builder build = new TextOutsideCircleButton.Builder()
                .normalImageRes(R.drawable.ic_home_black_24dp).highlightedColor(R.color.blue)
                .normalText("Home");
        boomMenuButton.addBuilder(build);


        TextOutsideCircleButton.Builder builderss = new TextOutsideCircleButton.Builder()
                .normalImageRes(R.drawable.ic_videogame_asset_black_24dp).highlightedColor(R.color.red)
                .normalText("Gamezone");
        boomMenuButton.addBuilder(builderss);

        TextOutsideCircleButton.Builder b = new TextOutsideCircleButton.Builder()
                .normalImageRes(R.drawable.ic_insert_photo_black_24dp).highlightedColor(R.color.brown)
                .normalText("Photos");
        boomMenuButton.addBuilder(b);
        TextOutsideCircleButton.Builder bu = new TextOutsideCircleButton.Builder()
                .normalImageRes(R.drawable.ic_map_black_24dp).highlightedColor(R.color.firebrick)
                .normalText("Maps");
        boomMenuButton.addBuilder(bu);
        TextOutsideCircleButton.Builder bui = new TextOutsideCircleButton.Builder()
                .normalImageRes(R.drawable.ic_description_black_24dp).highlightedColor(R.color.mediumvioletred)
                .normalText("EPC Blog");
        boomMenuButton.addBuilder(bui);
        TextOutsideCircleButton.Builder buil = new TextOutsideCircleButton.Builder()
                .normalImageRes(R.drawable.ic_description_black_24dp).highlightedColor(R.color.pink)
                .normalText("HPC Blog");
        boomMenuButton.addBuilder(buil);

        TextOutsideCircleButton.Builder builde = new TextOutsideCircleButton.Builder()
                .normalImageRes(R.drawable.ic_monetization_on_black_24dp).highlightedColor(R.color.orange)
                .normalText("Sponsors");
        boomMenuButton.addBuilder(builde);
        TextOutsideCircleButton.Builder buildersss = new TextOutsideCircleButton.Builder()
                .normalImageRes(R.drawable.ic_developer_mode_black_24dp).highlightedColor(R.color.colorPrimaryDark)
                .normalText("Developers");
        boomMenuButton.addBuilder(buildersss);
        TextOutsideCircleButton.Builder builders = new TextOutsideCircleButton.Builder()
                .normalImageRes(R.drawable.ic_contacts_black_24dp).highlightedColor(R.color.yellow)
                .normalText("Contacts");
        boomMenuButton.addBuilder(builders);
        return view;
    }





    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
