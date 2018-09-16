package yza366.amayzheng.com.newlumo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SymptomsFragment extends Fragment {

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_symptoms, container, false);
        TextView t = view.findViewById(R.id.id_symptomsText);
        t.setText("Symptoms of Depression:\n\n" +
                "- Changes in mood\n" +
                "       o Sadness, numbness, irritably, anger\n" +
                "       o Men with anger\n" +
                "       o Women with sadness and numbness\n" +
                "       o Energy goes down, don’t feel like doing stuff\n" +
                "- Appetite goes down\n" +
                "       o Either eat a lot or no eating\n" +
                "- Sleep\n" +
                "       o Hard time sleeping or sleeping all the time\n" +
                "- No sexual desire\n" +
                "- Lack of concentration\n" +
                "- Decision-making\n" +
                "       o Becomes more difficult and irrational\n" +
                "- Social contact\n" +
                "       o Impulse of depression is to isolate yourself\n" +
                "- Thoughts\n" +
                "       o Start thinking negative thoughts\n" +
                "- Hygiene\n" +
                "       o Possible days without a shower\n");

        return view;
        //return inflater.inflate(R.layout.fragment_symptoms, container, false);
    }
}
