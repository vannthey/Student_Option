package com.example.student.dashboard.dashboard_score.Adapter_score;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.R;

import java.util.List;

public class Adapter_Freshman_S1_Score extends RecyclerView.Adapter<Adapter_Freshman_S1_Score.ViewHolder> {

    private final List<String> Subject_S1, Rank_S1, Grade_S1, Total_S1;

    public Adapter_Freshman_S1_Score(List<String> subject_S1, List<String> rank_S1, List<String> grade_S1, List<String> total_S1) {
        Subject_S1 = subject_S1;
        Rank_S1 = rank_S1;
        Grade_S1 = grade_S1;
        Total_S1 = total_S1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_cardview_score_semester, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String Subject = Subject_S1.get(position);
        String Rank = Rank_S1.get(position);
        String Grade = Grade_S1.get(position);
        String Total = Total_S1.get(position);

        holder.txtSubject_S1.setText(Subject);
        holder.txtRank_S1.setText(Rank);
        holder.txtGrade_S1.setText(Grade);
        holder.txtTotal_S1.setText(Total);
    }

    @Override
    public int getItemCount() {
        return Subject_S1.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtSubject_S1, txtRank_S1, txtGrade_S1, txtTotal_S1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtSubject_S1 = itemView.findViewById(R.id.subject_score_semester);
            txtRank_S1 = itemView.findViewById(R.id.rank_score_semester);
            txtGrade_S1 = itemView.findViewById(R.id.grade_score_semester);
            txtTotal_S1 = itemView.findViewById(R.id.total_score_semester);
        }
    }
}
