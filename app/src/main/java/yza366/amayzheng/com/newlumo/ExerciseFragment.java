package yza366.amayzheng.com.newlumo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ExerciseFragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_exercise, container, false);
        TextView t = view.findViewById(R.id.id_exerciseText);
        t.setText("Exercise is important. People who are depressed \n" +
                "generally eat less, and exercise less. \n" +
                "Being active helps your body produce endorphins, \n" +
                "which are receptors in your brain that reduce your perception of pain. \n\n" +
                "In this VR mode, you will train with a boxing master in Ayutthaya, Thailand. \n");

        return view;
        //return inflater.inflate(R.layout.fragment_symptoms, container, false);
    }
}
