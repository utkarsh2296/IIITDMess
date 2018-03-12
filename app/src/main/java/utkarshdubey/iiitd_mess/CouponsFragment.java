package utkarshdubey.iiitd_mess;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CouponsFragment extends Fragment {

    TextView breakfast;
    TextView lunch;
    TextView snacks;
    TextView dinner;



    public CouponsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coupons, container, false);
        // Inflate the layout for this fragment
        breakfast=view.findViewById(R.id.coupons_breakfast);
        lunch=view.findViewById(R.id.coupons_lunch);
        snacks=view.findViewById(R.id.coupons_snacks);
        dinner=view.findViewById(R.id.coupons_dinner);


        return view;

    }

}
