package com.FourSqure.adapter;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.FourSqure.R;
import com.FourSqure.main_activity.RecyclerItemClickListener;
import com.FourSqure.model.Venues;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karan Pitroda on 29/12/2018.
 */

public class VanueAdapter extends RecyclerView.Adapter<VanueAdapter.EmployeeViewHolder> implements Filterable {

    private List<Venues> contactList;
    private List<Venues> contactListFiltered;
    private RecyclerItemClickListener recyclerItemClickListener;

    public VanueAdapter(ArrayList<Venues> dataList , RecyclerItemClickListener recyclerItemClickListener) {
        this.contactList = dataList;
        this.contactListFiltered = dataList;
        this.recyclerItemClickListener = recyclerItemClickListener;
    }


    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_view_row, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.txtNoticeTitle.setText(contactListFiltered.get(position).getName());

        String Add = "";
        for (int i = 0; i < contactListFiltered.get(position).getLocationObj().getFormattedAddArray().size(); i++) {
            Add += contactListFiltered.get(position).getLocationObj().getFormattedAddArray().get(i) + ", ";

        }
        Add = Add.substring(0, Add.length() - 2);


        holder.txtNoticeBrief.setText(Add);
        holder.txtNoticeFilePath.setText("Distance : "+contactListFiltered.get(position).getLocationObj().getDistance());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerItemClickListener.onItemClick(contactListFiltered.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactListFiltered.size();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder {

        TextView txtNoticeTitle, txtNoticeBrief, txtNoticeFilePath;

        EmployeeViewHolder(View itemView) {
            super(itemView);
            txtNoticeTitle =  itemView.findViewById(R.id.txt_notice_title);
            txtNoticeBrief =  itemView.findViewById(R.id.txt_notice_brief);
            txtNoticeFilePath =  itemView.findViewById(R.id.txt_notice_file_path);

        }
    }
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    contactListFiltered = contactList;
                } else {
                    List<Venues> filteredList = new ArrayList<>();
                    for (Venues row : contactList) {

                        if (row.getName().toLowerCase().contains(charString)) {

                            filteredList.add(row);
                        }
                    }

                    contactListFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = contactListFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                contactListFiltered = (ArrayList<Venues>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

}