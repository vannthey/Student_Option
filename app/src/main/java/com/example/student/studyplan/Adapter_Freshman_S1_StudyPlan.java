package com.example.student.studyplan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.student.R;



import java.util.List;

public class Adapter_Freshman_S1_StudyPlan extends RecyclerView.Adapter<Adapter_Freshman_S1_StudyPlan.ViewHolder> {
    Context context;
    List <String> subject,hour,no,credit;

    public Adapter_Freshman_S1_StudyPlan(Context context, List<String> subject, List<String> hour, List<String> no, List<String> credit) {
        this.context = context;
        this.subject = subject;
        this.hour = hour;
        this.no = no;
        this.credit = credit;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_studyplan,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String Subject_s1 = subject.get(position);
        String Credit_s1 = credit.get(position);
        String Hour_s1 = hour.get(position);
        String No_s1 = no.get(position);

        holder.No_s1.setText(No_s1);
        holder.Subject_s1.setText(Subject_s1);
        holder.Hour_s1.setText(Hour_s1);
        holder.Credit_s1.setText(Credit_s1);


    }

    @Override
    public int getItemCount() {
        return subject.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Subject_s1,Credit_s1,Hour_s1,No_s1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            No_s1 = itemView.findViewById(R.id.no_studyPlan);
            Subject_s1 = itemView.findViewById(R.id.subject_studyPlan);
            Credit_s1 = itemView.findViewById(R.id.credit_studyPlan);
            Hour_s1 = itemView.findViewById(R.id.hour_studyPlan);
        }
    }
}
