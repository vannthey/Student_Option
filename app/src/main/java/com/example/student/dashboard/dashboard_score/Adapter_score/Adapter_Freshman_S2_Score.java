package com.example.student.dashboard.dashboard_score.Adapter_score;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.R;

import java.util.List;

public class Adapter_Freshman_S2_Score extends RecyclerView.Adapter<Adapter_Freshman_S2_Score.ViewHolder> {
    private List<String> Subject_S2,Rank_S2,Grade_S2,Total_S2;

    public Adapter_Freshman_S2_Score(Context context,List<String> subject_S2, List<String> rank_S2, List<String> grade_S2, List<String> total_S2) {
        Subject_S2 = subject_S2;
        Rank_S2 = rank_S2;
        Grade_S2 = grade_S2;
        Total_S2 = total_S2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_cardview_score_semester,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       String Subject=Subject_S2.get(position);
       String Rank = Rank_S2.get(position);
       String Grade = Grade_S2.get(position);
       String Total = Total_S2.get(position);

       holder.txtSubject.setText(Subject);
       holder.txtRank.setText(Rank);
       holder.txtGrade.setText(Grade);
       holder.txtTotal.setText(Total);
    }

    @Override
    public int getItemCount() {
        return Subject_S2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtSubject,txtRank,txtGrade,txtTotal;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtSubject=itemView.findViewById(R.id.subject_score_semester);
            txtRank=itemView.findViewById(R.id.rank_score_semester);
            txtGrade=itemView.findViewById(R.id.grade_score_semester);
            txtTotal=itemView.findViewById(R.id.total_score_semester);
        }
    }
}
