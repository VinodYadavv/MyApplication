package virgosys.com.myapplication;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import timber.log.Timber;

/**
 * Provides "welcome" screen customizable from web administration. Often contains banners with sales or best products.
 */
public class BannersFragment extends Fragment {

    private ProgressDialog progressDialog;

    // content related fields.
    private RecyclerView bannersRecycler;


    /**
     * Indicates if user data should be loaded from server or from memory.
     */
    private boolean mAlreadyLoaded = false;

    /**
     * Holds reference for empty view. Show to user when no data loaded.
     */
    private View emptyContent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Timber.d("%s - OnCreateView", this.getClass().getSimpleName());

        View view = inflater.inflate(R.layout.fragment_banners, container, false);

        progressDialog = Utils.generateProgressDialog(getActivity(), false);



        return view;
    }

    /**
     * Prepares views and listeners associated with content.
     *
     * @param view       fragment root view.
     * @param freshStart indicates when everything should be recreated.
     */



    /**
     * Prepares views and listeners associated with empty content. Visible only when no content loads.
     *
     * @param view fragment root view.
     */

    /**
     * Endless content loader. Should be used after views inflated.
     *
     */




    @Override
    public void onDestroyView() {
        if (bannersRecycler != null) bannersRecycler.clearOnScrollListeners();
        super.onDestroyView();
    }
}
