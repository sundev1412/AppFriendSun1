package DiT.sundev.KSU;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }    // constructor

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        Register Controller
        TextView textView = getView().findViewById(R.id.txtRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ทำงานในนี้
//                Replace Fragment
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment, new RegisterFragment()).addToBackStack(null).commit();   //คำสั่งรีเพจเฟกมเน


            }
        });



    }  // Main Method

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }  //วาดเลยเอาร์ไปยังสกรีน

}  // Main Class
