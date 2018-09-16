package yza366.amayzheng.com.newlumo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MeditateFragment extends Fragment {

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_meditate, container, false);
        TextView t = view.findViewById(R.id.id_meditateText);
        t.setText("Meditation is a great way to reduce stress and improve \n" +
                " self awareness while reducing stress and negative thinking. \n" +
                "One of the main goals of meditating is to let ourselves be \n" +
                "freed of pressure and anxiety. \n" +
                "In meditation, you will find peace and bliss. \n" +
                "This is more easily done in peaceful environments. \n\n" +
                "In this VR meditation experience, you will be guided to a waterfall to meditate. \n");

        return view;
        //return inflater.inflate(R.layout.fragment_symptoms, container, false);
    }
}
